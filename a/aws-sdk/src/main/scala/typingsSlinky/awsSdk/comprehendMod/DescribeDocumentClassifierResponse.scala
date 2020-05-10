package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentClassifierResponse extends js.Object {
  /**
    * An object that contains the properties associated with a document classifier.
    */
  var DocumentClassifierProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.DocumentClassifierProperties] = js.native
}

object DescribeDocumentClassifierResponse {
  @scala.inline
  def apply(): DescribeDocumentClassifierResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentClassifierResponse]
  }
  @scala.inline
  implicit class DescribeDocumentClassifierResponseOps[Self <: DescribeDocumentClassifierResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentClassifierProperties(value: DocumentClassifierProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassifierProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentClassifierProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassifierProperties")(js.undefined)
        ret
    }
  }
  
}

