package typingsSlinky.dispatchr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionName extends js.Object {
  var actionName: js.UndefOr[String] = js.undefined
  var error: js.Error
  var payload: js.UndefOr[js.Any] = js.undefined
}

object ActionName {
  @scala.inline
  def apply(error: js.Error, actionName: String = null, payload: js.Any = null): ActionName = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (actionName != null) __obj.updateDynamic("actionName")(actionName.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionName]
  }
}

