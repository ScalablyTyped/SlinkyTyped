package typingsSlinky.baiduApp.swan

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait verifyOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_verifyOptions: js.UndefOr[js.Function1[/* res */ verifyTask, Unit]] = js.native
}

object verifyOptions {
  @scala.inline
  def apply(): verifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[verifyOptions]
  }
  @scala.inline
  implicit class verifyOptionsOps[Self <: verifyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccess(value: /* res */ verifyTask => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSuccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.undefined)
        ret
    }
  }
  
}

