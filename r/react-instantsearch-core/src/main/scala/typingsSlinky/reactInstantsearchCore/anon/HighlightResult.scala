package typingsSlinky.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightResult[TDoc] extends js.Object {
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TDoc] = js.native
  var objectID: String = js.native
}

object HighlightResult {
  @scala.inline
  def apply[TDoc](_highlightResult: typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TDoc], objectID: String): HighlightResult[TDoc] = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResult[TDoc]]
  }
  @scala.inline
  implicit class HighlightResultOps[Self[tdoc] <: HighlightResult[tdoc], TDoc] (val x: Self[TDoc]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TDoc] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TDoc]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[TDoc] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[TDoc] with Other]
    @scala.inline
    def with_highlightResult(value: typingsSlinky.reactInstantsearchCore.mod.HighlightResult[TDoc]): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_highlightResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectID(value: String): Self[TDoc] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectID")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

