package typingsSlinky.googleapis.gmailV1Mod.gmailV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaModifyMessageRequest extends js.Object {
  /**
    * A list of IDs of labels to add to this message.
    */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list IDs of labels to remove from this message.
    */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.native
}

object SchemaModifyMessageRequest {
  @scala.inline
  def apply(): SchemaModifyMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModifyMessageRequest]
  }
  @scala.inline
  implicit class SchemaModifyMessageRequestOps[Self <: SchemaModifyMessageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddLabelIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLabelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddLabelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addLabelIds")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveLabelIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabelIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRemoveLabelIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeLabelIds")(js.undefined)
        ret
    }
  }
  
}

