package typingsSlinky.awsSdk.guarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDetectorRequest extends js.Object {
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.ClientToken] = js.native
  /**
    * A boolean value that specifies whether the detector is to be enabled.
    */
  var Enable: Boolean = js.native
  /**
    * A enum value that specifies how frequently customer got Finding updates published.
    */
  var FindingPublishingFrequency: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.native
  /**
    * The tags to be added to a new detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}

object CreateDetectorRequest {
  @scala.inline
  def apply(Enable: Boolean): CreateDetectorRequest = {
    val __obj = js.Dynamic.literal(Enable = Enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorRequest]
  }
  @scala.inline
  implicit class CreateDetectorRequestOps[Self <: CreateDetectorRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientToken(value: ClientToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientToken")(js.undefined)
        ret
    }
    @scala.inline
    def withFindingPublishingFrequency(value: FindingPublishingFrequency): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingPublishingFrequency")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFindingPublishingFrequency: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FindingPublishingFrequency")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

