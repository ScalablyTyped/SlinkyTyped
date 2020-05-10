package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextElement describes the content of a range of indices in the text
  * content of a Shape or TableCell.
  */
@js.native
trait SchemaTextElement extends js.Object {
  /**
    * A TextElement representing a spot in the text that is dynamically
    * replaced with content that can change over time.
    */
  var autoText: js.UndefOr[SchemaAutoText] = js.native
  /**
    * The zero-based end index of this text element, exclusive, in Unicode code
    * units.
    */
  var endIndex: js.UndefOr[Double] = js.native
  /**
    * A marker representing the beginning of a new paragraph.  The
    * `start_index` and `end_index` of this TextElement represent the range of
    * the paragraph. Other TextElements with an index range contained inside
    * this paragraph&#39;s range are considered to be part of this paragraph.
    * The range of indices of two separate paragraphs will never overlap.
    */
  var paragraphMarker: js.UndefOr[SchemaParagraphMarker] = js.native
  /**
    * The zero-based start index of this text element, in Unicode code units.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * A TextElement representing a run of text where all of the characters in
    * the run have the same TextStyle.  The `start_index` and `end_index` of
    * TextRuns will always be fully contained in the index range of a single
    * `paragraph_marker` TextElement. In other words, a TextRun will never span
    * multiple paragraphs.
    */
  var textRun: js.UndefOr[SchemaTextRun] = js.native
}

object SchemaTextElement {
  @scala.inline
  def apply(): SchemaTextElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTextElement]
  }
  @scala.inline
  implicit class SchemaTextElementOps[Self <: SchemaTextElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoText(value: SchemaAutoText): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoText")(js.undefined)
        ret
    }
    @scala.inline
    def withEndIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraphMarker(value: SchemaParagraphMarker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraphMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraphMarker")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRun(value: SchemaTextRun): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRun")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRun: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRun")(js.undefined)
        ret
    }
  }
  
}

