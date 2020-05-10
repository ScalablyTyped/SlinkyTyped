package typingsSlinky.naverWhale.whale.browsingData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SettingsCallback extends js.Object {
  /** All of the types will be present in the result, with values of true if they are permitted to be removed (e.g., by enterprise policy) and false if not. */
  var dataRemovalPermitted: typingsSlinky.chrome.chrome.browsingData.DataTypeSet = js.native
  /** All of the types will be present in the result, with values of true if they are both selected to be removed and permitted to be removed, otherwise false. */
  var dataToRemove: typingsSlinky.chrome.chrome.browsingData.DataTypeSet = js.native
  var options: typingsSlinky.chrome.chrome.browsingData.RemovalOptions = js.native
}

object SettingsCallback {
  @scala.inline
  def apply(
    dataRemovalPermitted: typingsSlinky.chrome.chrome.browsingData.DataTypeSet,
    dataToRemove: typingsSlinky.chrome.chrome.browsingData.DataTypeSet,
    options: typingsSlinky.chrome.chrome.browsingData.RemovalOptions
  ): SettingsCallback = {
    val __obj = js.Dynamic.literal(dataRemovalPermitted = dataRemovalPermitted.asInstanceOf[js.Any], dataToRemove = dataToRemove.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SettingsCallback]
  }
  @scala.inline
  implicit class SettingsCallbackOps[Self <: SettingsCallback] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataRemovalPermitted(value: typingsSlinky.chrome.chrome.browsingData.DataTypeSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataRemovalPermitted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataToRemove(value: typingsSlinky.chrome.chrome.browsingData.DataTypeSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: typingsSlinky.chrome.chrome.browsingData.RemovalOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

