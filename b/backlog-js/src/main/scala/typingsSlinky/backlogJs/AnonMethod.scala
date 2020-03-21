package typingsSlinky.backlogJs

import org.scalajs.dom.raw.FormData
import typingsSlinky.backlogJs.mod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMethod extends js.Object {
  var method: String
  var params: js.UndefOr[Params | FormData] = js.undefined
  var path: String
}

object AnonMethod {
  @scala.inline
  def apply(method: String, path: String, params: Params | FormData = null): AnonMethod = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMethod]
  }
}

