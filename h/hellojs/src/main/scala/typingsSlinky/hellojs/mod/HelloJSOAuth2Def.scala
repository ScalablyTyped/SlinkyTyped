package typingsSlinky.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HelloJSOAuth2Def extends HelloJSOAuthDef {
  var grant: js.UndefOr[String] = js.native
  var response_type: js.UndefOr[HelloJSTokenResponseType] = js.native
}

object HelloJSOAuth2Def {
  @scala.inline
  def apply(version: String | Double): HelloJSOAuth2Def = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSOAuth2Def]
  }
  @scala.inline
  implicit class HelloJSOAuth2DefOps[Self <: HelloJSOAuth2Def] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGrant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGrant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grant")(js.undefined)
        ret
    }
    @scala.inline
    def withResponse_type(value: HelloJSTokenResponseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponse_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("response_type")(js.undefined)
        ret
    }
  }
  
}

