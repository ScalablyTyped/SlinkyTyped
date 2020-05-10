package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDocumentClassifierResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that identifies the document classifier.
    */
  var DocumentClassifierArn: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.DocumentClassifierArn] = js.native
}

object CreateDocumentClassifierResponse {
  @scala.inline
  def apply(): CreateDocumentClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDocumentClassifierResponse]
  }
  @scala.inline
  implicit class CreateDocumentClassifierResponseOps[Self <: CreateDocumentClassifierResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withoutDocumentClassifierArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassifierArn")(js.undefined)
        ret
    }
  }
  
}

