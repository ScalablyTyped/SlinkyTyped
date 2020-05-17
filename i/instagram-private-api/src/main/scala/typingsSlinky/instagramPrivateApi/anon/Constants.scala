package typingsSlinky.instagramPrivateApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Constants extends js.Object {
  var constants: js.Any = js.native
  var cookies: js.Any = js.native
}

object Constants {
  @scala.inline
  def apply(constants: js.Any, cookies: js.Any): Constants = {
    val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], cookies = cookies.asInstanceOf[js.Any])
    __obj.asInstanceOf[Constants]
  }
  @scala.inline
  implicit class ConstantsOps[Self <: Constants] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstants(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookies(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookies")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

