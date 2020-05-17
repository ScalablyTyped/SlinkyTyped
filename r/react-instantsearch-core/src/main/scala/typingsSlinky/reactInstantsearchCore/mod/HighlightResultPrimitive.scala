package typingsSlinky.reactInstantsearchCore.mod

import typingsSlinky.reactInstantsearchCore.reactInstantsearchCoreStrings.full
import typingsSlinky.reactInstantsearchCore.reactInstantsearchCoreStrings.none
import typingsSlinky.reactInstantsearchCore.reactInstantsearchCoreStrings.partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HighlightResultPrimitive
  extends HighlightResultField[js.Any] {
  var fullyHighlighted: js.UndefOr[Boolean] = js.native
  /** full, partial or none depending on how the query terms match */
  var matchLevel: none | partial | full = js.native
  var matchedWords: js.Array[String] = js.native
  /** the value of the facet highlighted (html) */
  var value: String = js.native
}

object HighlightResultPrimitive {
  @scala.inline
  def apply(matchLevel: none | partial | full, matchedWords: js.Array[String], value: String): HighlightResultPrimitive = {
    val __obj = js.Dynamic.literal(matchLevel = matchLevel.asInstanceOf[js.Any], matchedWords = matchedWords.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResultPrimitive]
  }
  @scala.inline
  implicit class HighlightResultPrimitiveOps[Self <: HighlightResultPrimitive] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMatchLevel(value: none | partial | full): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatchedWords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullyHighlighted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullyHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullyHighlighted")(js.undefined)
        ret
    }
  }
  
}

