package typingsSlinky.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateUploadRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the uploaded test spec.
    */
  var arn: AmazonResourceName = js.native
  /**
    * The upload's content type (for example, application/x-yaml).
    */
  var contentType: js.UndefOr[ContentType] = js.native
  /**
    * Set to true if the YAML file has changed and must be updated. Otherwise, set to false.
    */
  var editContent: js.UndefOr[Boolean] = js.native
  /**
    * The upload's test spec file name. The name must not contain any forward slashes (/). The test spec file name must end with the .yaml or .yml file extension.
    */
  var name: js.UndefOr[Name] = js.native
}

object UpdateUploadRequest {
  @scala.inline
  def apply(arn: AmazonResourceName): UpdateUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUploadRequest]
  }
  @scala.inline
  implicit class UpdateUploadRequestOps[Self <: UpdateUploadRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: AmazonResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: ContentType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withEditContent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editContent")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

