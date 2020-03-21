package typingsSlinky.reactNavigationCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var key: String
  var params: js.UndefOr[js.Object] = js.undefined
  var preserveFocus: Boolean
  var routeName: String
  var `type`: String
}

object AnonParams {
  @scala.inline
  def apply(key: String, preserveFocus: Boolean, routeName: String, `type`: String, params: js.Object = null): AnonParams = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], preserveFocus = preserveFocus.asInstanceOf[js.Any], routeName = routeName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams]
  }
}

