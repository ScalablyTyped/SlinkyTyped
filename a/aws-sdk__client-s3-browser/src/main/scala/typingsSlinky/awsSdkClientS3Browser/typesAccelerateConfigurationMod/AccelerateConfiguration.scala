package typingsSlinky.awsSdkClientS3Browser.typesAccelerateConfigurationMod

import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Enabled
import typingsSlinky.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Suspended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerateConfiguration extends js.Object {
  /**
    * <p>The accelerate configuration of the bucket.</p>
    */
  var Status: js.UndefOr[Enabled | Suspended | String] = js.undefined
}

object AccelerateConfiguration {
  @scala.inline
  def apply(Status: Enabled | Suspended | String = null): AccelerateConfiguration = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerateConfiguration]
  }
}

