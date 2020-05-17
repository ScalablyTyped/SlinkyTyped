package typingsSlinky.emberObject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Until extends js.Object {
  var id: js.UndefOr[String] = js.native
  var until: js.UndefOr[String] = js.native
}

object Until {
  @scala.inline
  def apply(): Until = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Until]
  }
  @scala.inline
  implicit class UntilOps[Self <: Until] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withUntil(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUntil: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("until")(js.undefined)
        ret
    }
  }
  
}

