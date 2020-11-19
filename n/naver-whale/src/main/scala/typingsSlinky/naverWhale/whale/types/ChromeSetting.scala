package typingsSlinky.naverWhale.whale.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChromeSetting extends js.Object {
  
  /**
    * Clears the setting, restoring any default value.
    * @param details Which setting to clear.
    * @param callback Optional. Called at the completion of the clear operation.
    */
  def clear(details: typingsSlinky.chrome.chrome.types.ChromeSettingClearDetails): Unit = js.native
  def clear(details: typingsSlinky.chrome.chrome.types.ChromeSettingClearDetails, callback: js.Function): Unit = js.native
  
  /**
    * Gets the value of a setting.
    * @param details Which setting to consider.
    */
  def get(details: typingsSlinky.chrome.chrome.types.ChromeSettingGetDetails): Unit = js.native
  def get(
    details: typingsSlinky.chrome.chrome.types.ChromeSettingGetDetails,
    callback: typingsSlinky.chrome.chrome.types.DetailsCallback
  ): Unit = js.native
  
  /** Fired after the setting changes. */
  var onChange: typingsSlinky.chrome.chrome.types.ChromeSettingChangedEvent = js.native
  
  /**
    * Sets the value of a setting.
    * @param details Which setting to change.
    * @param callback Optional. Called at the completion of the set operation.
    */
  def set(details: typingsSlinky.chrome.chrome.types.ChromeSettingSetDetails): Unit = js.native
  def set(details: typingsSlinky.chrome.chrome.types.ChromeSettingSetDetails, callback: js.Function): Unit = js.native
}
