package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAttributeValueCountPair extends js.Object {
  /**
    * The number of documents in the response that have the attribute value for the key.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The value of the attribute. For example, "HR."
    */
  var DocumentAttributeValue: js.UndefOr[typingsSlinky.awsSdk.kendraMod.DocumentAttributeValue] = js.native
}

object DocumentAttributeValueCountPair {
  @scala.inline
  def apply(): DocumentAttributeValueCountPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentAttributeValueCountPair]
  }
  @scala.inline
  implicit class DocumentAttributeValueCountPairOps[Self <: DocumentAttributeValueCountPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentAttributeValue(value: DocumentAttributeValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributeValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentAttributeValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributeValue")(js.undefined)
        ret
    }
  }
  
}

