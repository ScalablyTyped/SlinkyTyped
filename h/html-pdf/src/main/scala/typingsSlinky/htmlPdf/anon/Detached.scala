package typingsSlinky.htmlPdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Detached extends js.Object {
  var detached: js.UndefOr[Boolean] = js.native
}

object Detached {
  @scala.inline
  def apply(): Detached = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Detached]
  }
  @scala.inline
  implicit class DetachedOps[Self <: Detached] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDetached(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDetached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
        ret
    }
  }
  
}

