package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBucketInventoryConfigurationOutput extends js.Object {
  /**
    * Specifies the inventory configuration.
    */
  var InventoryConfiguration: js.UndefOr[typingsSlinky.awsSdk.s3Mod.InventoryConfiguration] = js.native
}

object GetBucketInventoryConfigurationOutput {
  @scala.inline
  def apply(): GetBucketInventoryConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBucketInventoryConfigurationOutput]
  }
  @scala.inline
  implicit class GetBucketInventoryConfigurationOutputOps[Self <: GetBucketInventoryConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInventoryConfiguration(value: InventoryConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInventoryConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InventoryConfiguration")(js.undefined)
        ret
    }
  }
  
}

