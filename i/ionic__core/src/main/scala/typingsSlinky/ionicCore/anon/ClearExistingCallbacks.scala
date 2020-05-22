package typingsSlinky.ionicCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClearExistingCallbacks extends js.Object {
  var clearExistingCallbacks: js.UndefOr[Boolean] = js.undefined
  var oneTimeCallback: js.UndefOr[Boolean] = js.undefined
}

object ClearExistingCallbacks {
  @scala.inline
  def apply(
    clearExistingCallbacks: js.UndefOr[Boolean] = js.undefined,
    oneTimeCallback: js.UndefOr[Boolean] = js.undefined
  ): ClearExistingCallbacks = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearExistingCallbacks)) __obj.updateDynamic("clearExistingCallbacks")(clearExistingCallbacks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(oneTimeCallback)) __obj.updateDynamic("oneTimeCallback")(oneTimeCallback.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearExistingCallbacks]
  }
}

