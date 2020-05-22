package typingsSlinky.naverWhale.whale.contentSettings

import typingsSlinky.naverWhale.naverWhaleStrings.allow
import typingsSlinky.naverWhale.naverWhaleStrings.ask
import typingsSlinky.naverWhale.naverWhaleStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PpapiBrokerSetDetails
  extends typingsSlinky.chrome.chrome.contentSettings.SetDetails {
  @JSName("setting")
  var setting_PpapiBrokerSetDetails: allow | block | ask
}

object PpapiBrokerSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block | ask,
    resourceIdentifier: typingsSlinky.chrome.chrome.contentSettings.ResourceIdentifier = null,
    scope: typingsSlinky.chrome.chrome.contentSettings.ScopeEnum = null,
    secondaryPattern: String = null
  ): PpapiBrokerSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PpapiBrokerSetDetails]
  }
}

