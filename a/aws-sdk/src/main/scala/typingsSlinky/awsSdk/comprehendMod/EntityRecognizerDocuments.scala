package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityRecognizerDocuments extends js.Object {
  /**
    *  Specifies the Amazon S3 location where the training documents for an entity recognizer are located. The URI must be in the same region as the API endpoint that you are calling.
    */
  var S3Uri: typingsSlinky.awsSdk.comprehendMod.S3Uri = js.native
}

object EntityRecognizerDocuments {
  @scala.inline
  def apply(S3Uri: S3Uri): EntityRecognizerDocuments = {
    val __obj = js.Dynamic.literal(S3Uri = S3Uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityRecognizerDocuments]
  }
  @scala.inline
  implicit class EntityRecognizerDocumentsOps[Self <: EntityRecognizerDocuments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withS3Uri(value: S3Uri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("S3Uri")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

