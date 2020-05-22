package typingsSlinky.octokitAuthToken.mod

import typingsSlinky.octokitAuthToken.typesMod.Authentication
import typingsSlinky.octokitAuthToken.typesMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types extends js.Object {
  var Authentication: typingsSlinky.octokitAuthToken.typesMod.Authentication
  var StrategyOptions: Token
}

object Types {
  @scala.inline
  def apply(Authentication: Authentication, StrategyOptions: Token): Types = {
    val __obj = js.Dynamic.literal(Authentication = Authentication.asInstanceOf[js.Any], StrategyOptions = StrategyOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types]
  }
}

