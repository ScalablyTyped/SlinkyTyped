package typingsSlinky.awsLambda

import typingsSlinky.awsLambda.awsLambdaStrings.applicationSlashvndDotamazonawsDotcardDotgeneric
import typingsSlinky.awsLambda.lexMod.LexGenericAttachment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonContentType extends js.Object {
  var contentType: applicationSlashvndDotamazonawsDotcardDotgeneric = js.native
  var genericAttachments: js.Array[LexGenericAttachment] = js.native
  var version: Double = js.native
}

object AnonContentType {
  @scala.inline
  def apply(
    contentType: applicationSlashvndDotamazonawsDotcardDotgeneric,
    genericAttachments: js.Array[LexGenericAttachment],
    version: Double
  ): AnonContentType = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], genericAttachments = genericAttachments.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentType]
  }
  @scala.inline
  implicit class AnonContentTypeOps[Self <: AnonContentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: applicationSlashvndDotamazonawsDotcardDotgeneric): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenericAttachments(value: js.Array[LexGenericAttachment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genericAttachments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

