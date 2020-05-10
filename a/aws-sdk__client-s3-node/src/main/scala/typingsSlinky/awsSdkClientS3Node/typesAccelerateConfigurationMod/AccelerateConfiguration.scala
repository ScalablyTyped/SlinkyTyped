package typingsSlinky.awsSdkClientS3Node.typesAccelerateConfigurationMod

import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Enabled
import typingsSlinky.awsSdkClientS3Node.awsSdkClientS3NodeStrings.Suspended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccelerateConfiguration extends js.Object {
  /**
    * <p>The accelerate configuration of the bucket.</p>
    */
  var Status: js.UndefOr[Enabled | Suspended | String] = js.native
}

object AccelerateConfiguration {
  @scala.inline
  def apply(): AccelerateConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerateConfiguration]
  }
  @scala.inline
  implicit class AccelerateConfigurationOps[Self <: AccelerateConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStatus(value: Enabled | Suspended | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

