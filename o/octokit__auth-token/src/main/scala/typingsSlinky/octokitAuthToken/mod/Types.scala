package typingsSlinky.octokitAuthToken.mod

import typingsSlinky.octokitAuthToken.typesMod.Authentication
import typingsSlinky.octokitAuthToken.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Types extends js.Object {
  var Authentication: typingsSlinky.octokitAuthToken.typesMod.Authentication = js.native
  var StrategyOptions: Token = js.native
}

object Types {
  @scala.inline
  def apply(Authentication: Authentication, StrategyOptions: Token): Types = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any], StrategyOptions = StrategyOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthentication(value: Authentication): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Authentication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStrategyOptions(value: Token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StrategyOptions")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

