package typingsSlinky.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentClassificationJobResponse extends js.Object {
  /**
    * An object that describes the properties associated with the document classification job.
    */
  var DocumentClassificationJobProperties: js.UndefOr[typingsSlinky.awsSdk.comprehendMod.DocumentClassificationJobProperties] = js.native
}

object DescribeDocumentClassificationJobResponse {
  @scala.inline
  def apply(): DescribeDocumentClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDocumentClassificationJobResponse]
  }
  @scala.inline
  implicit class DescribeDocumentClassificationJobResponseOps[Self <: DescribeDocumentClassificationJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentClassificationJobProperties(value: DocumentClassificationJobProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassificationJobProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentClassificationJobProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentClassificationJobProperties")(js.undefined)
        ret
    }
  }
  
}

