package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RotateIngestEndpointCredentialsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) assigned to the Channel.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * A short text description of the Channel.
    */
  var Description: js.UndefOr[string] = js.native
  var HlsIngest: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.HlsIngest] = js.native
  /**
    * The ID of the Channel.
    */
  var Id: js.UndefOr[string] = js.native
  var Tags: js.UndefOr[typingsSlinky.awsSdk.mediapackageMod.Tags] = js.native
}

object RotateIngestEndpointCredentialsResponse {
  @scala.inline
  def apply(): RotateIngestEndpointCredentialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RotateIngestEndpointCredentialsResponse]
  }
  @scala.inline
  implicit class RotateIngestEndpointCredentialsResponseOps[Self <: RotateIngestEndpointCredentialsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withHlsIngest(value: HlsIngest): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsIngest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHlsIngest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HlsIngest")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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

