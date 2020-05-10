package typingsSlinky.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FacetResult extends js.Object {
  /**
    * The key for the facet values. This is the same as the DocumentAttributeKey provided in the query.
    */
  var DocumentAttributeKey: js.UndefOr[typingsSlinky.awsSdk.kendraMod.DocumentAttributeKey] = js.native
  /**
    * An array of key/value pairs, where the key is the value of the attribute and the count is the number of documents that share the key value.
    */
  var DocumentAttributeValueCountPairs: js.UndefOr[DocumentAttributeValueCountPairList] = js.native
}

object FacetResult {
  @scala.inline
  def apply(): FacetResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FacetResult]
  }
  @scala.inline
  implicit class FacetResultOps[Self <: FacetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDocumentAttributeKey(value: DocumentAttributeKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributeKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentAttributeKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributeKey")(js.undefined)
        ret
    }
    @scala.inline
    def withDocumentAttributeValueCountPairs(value: DocumentAttributeValueCountPairList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributeValueCountPairs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDocumentAttributeValueCountPairs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DocumentAttributeValueCountPairs")(js.undefined)
        ret
    }
  }
  
}

