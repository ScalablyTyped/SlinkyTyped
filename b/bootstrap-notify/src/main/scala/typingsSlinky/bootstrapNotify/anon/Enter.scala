package typingsSlinky.bootstrapNotify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Enter extends js.Object {
  var enter: js.UndefOr[String] = js.native
  var exit: js.UndefOr[String] = js.native
}

object Enter {
  @scala.inline
  def apply(): Enter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enter]
  }
  @scala.inline
  implicit class EnterOps[Self <: Enter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enter")(js.undefined)
        ret
    }
    @scala.inline
    def withExit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exit")(js.undefined)
        ret
    }
  }
  
}

