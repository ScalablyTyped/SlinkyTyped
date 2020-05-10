package typingsSlinky.awsSdkClientSqsNode.typesBatchResultErrorEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchResultErrorEntry extends js.Object {
  /**
    * <p>An error code representing why the action failed on this entry.</p>
    */
  var Code: String = js.native
  /**
    * <p>The <code>Id</code> of an entry in a batch request.</p>
    */
  var Id: String = js.native
  /**
    * <p>A message explaining why the action failed on this entry.</p>
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * <p>Specifies whether the error happened due to the producer.</p>
    */
  var SenderFault: Boolean = js.native
}

object BatchResultErrorEntry {
  @scala.inline
  def apply(Code: String, Id: String, SenderFault: Boolean): BatchResultErrorEntry = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], SenderFault = SenderFault.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResultErrorEntry]
  }
  @scala.inline
  implicit class BatchResultErrorEntryOps[Self <: BatchResultErrorEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSenderFault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SenderFault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

