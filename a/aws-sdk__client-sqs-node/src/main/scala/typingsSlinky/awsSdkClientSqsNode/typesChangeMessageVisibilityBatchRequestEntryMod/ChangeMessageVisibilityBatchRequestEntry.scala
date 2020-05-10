package typingsSlinky.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchRequestEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeMessageVisibilityBatchRequestEntry extends js.Object {
  /**
    * <p>An identifier for this particular receipt handle used to communicate the result.</p> <note> <p>The <code>Id</code>s of a batch request need to be unique within a request</p> </note>
    */
  var Id: String = js.native
  /**
    * <p>A receipt handle.</p>
    */
  var ReceiptHandle: String = js.native
  /**
    * <p>The new value (in seconds) for the message's visibility timeout.</p>
    */
  var VisibilityTimeout: js.UndefOr[Double] = js.native
}

object ChangeMessageVisibilityBatchRequestEntry {
  @scala.inline
  def apply(Id: String, ReceiptHandle: String): ChangeMessageVisibilityBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
  }
  @scala.inline
  implicit class ChangeMessageVisibilityBatchRequestEntryOps[Self <: ChangeMessageVisibilityBatchRequestEntry] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withVisibilityTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibilityTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibilityTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibilityTimeout")(js.undefined)
        ret
    }
  }
  
}

