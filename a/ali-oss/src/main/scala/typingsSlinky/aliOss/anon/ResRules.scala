package typingsSlinky.aliOss.anon

import typingsSlinky.aliOss.mod.CORSRule
import typingsSlinky.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResRules extends js.Object {
  var res: NormalSuccessResponse
  var rules: js.Array[CORSRule]
}

object ResRules {
  @scala.inline
  def apply(res: NormalSuccessResponse, rules: js.Array[CORSRule]): ResRules = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResRules]
  }
}

