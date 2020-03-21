package typingsSlinky.aliOss

import typingsSlinky.aliOss.mod.LifecycleRule
import typingsSlinky.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRules extends js.Object {
  var res: NormalSuccessResponse
  var rules: js.Array[LifecycleRule]
}

object AnonRules {
  @scala.inline
  def apply(res: NormalSuccessResponse, rules: js.Array[LifecycleRule]): AnonRules = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRules]
  }
}

