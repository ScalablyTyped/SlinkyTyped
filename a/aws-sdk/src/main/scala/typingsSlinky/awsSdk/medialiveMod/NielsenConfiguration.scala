package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NielsenConfiguration extends js.Object {
  /**
    * Enter the Distributor ID assigned to your organization by Nielsen.
    */
  var DistributorId: js.UndefOr[string] = js.native
  /**
    * Enables Nielsen PCM to ID3 tagging
    */
  var NielsenPcmToId3Tagging: js.UndefOr[NielsenPcmToId3TaggingState] = js.native
}

object NielsenConfiguration {
  @scala.inline
  def apply(): NielsenConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NielsenConfiguration]
  }
  @scala.inline
  implicit class NielsenConfigurationOps[Self <: NielsenConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistributorId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDistributorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DistributorId")(js.undefined)
        ret
    }
    @scala.inline
    def withNielsenPcmToId3Tagging(value: NielsenPcmToId3TaggingState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NielsenPcmToId3Tagging")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNielsenPcmToId3Tagging: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NielsenPcmToId3Tagging")(js.undefined)
        ret
    }
  }
  
}

