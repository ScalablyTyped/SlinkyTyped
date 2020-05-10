package typingsSlinky.awsSdkClientSqsNode.typesDeleteMessageBatchRequestEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMessageBatchRequestEntry extends js.Object {
  /**
    * <p>An identifier for this particular receipt handle. This is used to communicate the result.</p> <note> <p>The <code>Id</code>s of a batch request need to be unique within a request</p> </note>
    */
  var Id: String = js.native
  /**
    * <p>A receipt handle.</p>
    */
  var ReceiptHandle: String = js.native
}

object DeleteMessageBatchRequestEntry {
  @scala.inline
  def apply(Id: String, ReceiptHandle: String): DeleteMessageBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMessageBatchRequestEntry]
  }
  @scala.inline
  implicit class DeleteMessageBatchRequestEntryOps[Self <: DeleteMessageBatchRequestEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceiptHandle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReceiptHandle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

