package typingsSlinky.hapiBoom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decorate[Decoration] extends js.Object {
  /**
    * An option with extra properties to set on the error object
    */
  var decorate: js.UndefOr[Decoration] = js.native
}

object Decorate {
  @scala.inline
  def apply[Decoration](): Decorate[Decoration] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Decorate[Decoration]]
  }
  @scala.inline
  implicit class DecorateOps[Self[decoration] <: Decorate[decoration], Decoration] (val x: Self[Decoration]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Decoration] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Decoration]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Decoration] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Decoration] with Other]
    @scala.inline
    def withDecorate(value: Decoration): Self[Decoration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecorate: Self[Decoration] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decorate")(js.undefined)
        ret
    }
  }
  
}

