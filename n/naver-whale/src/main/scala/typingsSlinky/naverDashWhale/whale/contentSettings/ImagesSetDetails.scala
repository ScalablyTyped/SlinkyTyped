package typingsSlinky.naverDashWhale.whale.contentSettings

import typingsSlinky.naverDashWhale.naverDashWhaleStrings.allow
import typingsSlinky.naverDashWhale.naverDashWhaleStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesSetDetails
  extends typingsSlinky.chrome.chrome.contentSettings.SetDetails {
  @JSName("setting")
  var setting_ImagesSetDetails: allow | block
}

object ImagesSetDetails {
  @scala.inline
  def apply(
    primaryPattern: String,
    setting: allow | block,
    resourceIdentifier: typingsSlinky.chrome.chrome.contentSettings.ResourceIdentifier = null,
    scope: typingsSlinky.chrome.chrome.contentSettings.ScopeEnum = null,
    secondaryPattern: String = null
  ): ImagesSetDetails = {
    val __obj = js.Dynamic.literal(primaryPattern = primaryPattern.asInstanceOf[js.Any], setting = setting.asInstanceOf[js.Any])
    if (resourceIdentifier != null) __obj.updateDynamic("resourceIdentifier")(resourceIdentifier.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (secondaryPattern != null) __obj.updateDynamic("secondaryPattern")(secondaryPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagesSetDetails]
  }
}

