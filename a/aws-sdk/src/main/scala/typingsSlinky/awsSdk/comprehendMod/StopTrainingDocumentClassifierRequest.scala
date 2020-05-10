package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTrainingDocumentClassifierRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier currently being trained.
    */
  var DocumentClassifierArn: typingsSlinky.awsSdk.comprehendMod.DocumentClassifierArn = js.native
}

object StopTrainingDocumentClassifierRequest {
  @scala.inline
  def apply(DocumentClassifierArn: DocumentClassifierArn): StopTrainingDocumentClassifierRequest = {
    val __obj = js.Dynamic.literal(DocumentClassifierArn = DocumentClassifierArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTrainingDocumentClassifierRequest]
  }
  @scala.inline
  implicit class StopTrainingDocumentClassifierRequestOps[Self <: StopTrainingDocumentClassifierRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentClassifierArn(value: DocumentClassifierArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassifierArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

