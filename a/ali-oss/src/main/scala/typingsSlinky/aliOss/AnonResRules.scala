package typingsSlinky.aliOss

import typingsSlinky.aliOss.mod.CORSRule
import typingsSlinky.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResRules extends js.Object {
  var res: NormalSuccessResponse
  var rules: js.Array[CORSRule]
}

object AnonResRules {
  @scala.inline
  def apply(res: NormalSuccessResponse, rules: js.Array[CORSRule]): AnonResRules = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResRules]
  }
}

