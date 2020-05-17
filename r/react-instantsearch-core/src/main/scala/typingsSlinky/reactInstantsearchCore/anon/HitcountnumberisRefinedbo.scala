package typingsSlinky.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-instantsearch-core.react-instantsearch-core.Hit<{  count  :number,   isRefined  :boolean,   label  :string,   value  :std.Array<string>}> */
@js.native
trait HitcountnumberisRefinedbo extends js.Object {
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: typingsSlinky.reactInstantsearchCore.mod.HighlightResult[Value] = js.native
  var count: Double = js.native
  var isRefined: Boolean = js.native
  var label: String = js.native
  var objectID: String = js.native
  var value: js.Array[String] = js.native
}

object HitcountnumberisRefinedbo {
  @scala.inline
  def apply(
    _highlightResult: typingsSlinky.reactInstantsearchCore.mod.HighlightResult[Value],
    count: Double,
    isRefined: Boolean,
    label: String,
    objectID: String,
    value: js.Array[String]
  ): HitcountnumberisRefinedbo = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitcountnumberisRefinedbo]
  }
  @scala.inline
  implicit class HitcountnumberisRefinedboOps[Self <: HitcountnumberisRefinedbo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_highlightResult(value: typingsSlinky.reactInstantsearchCore.mod.HighlightResult[Value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_highlightResult")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

