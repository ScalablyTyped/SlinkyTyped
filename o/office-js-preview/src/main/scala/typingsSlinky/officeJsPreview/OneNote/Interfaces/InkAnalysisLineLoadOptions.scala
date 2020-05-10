package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents ink analysis data for an identified text line formed by ink strokes.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait InkAnalysisLineLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the ID of the InkAnalysisLine object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * Reference to the parent InkAnalysisParagraph.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var paragraph: js.UndefOr[InkAnalysisParagraphLoadOptions] = js.native
  /**
    *
    * Gets the ink analysis words in this ink analysis line.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var words: js.UndefOr[InkAnalysisWordCollectionLoadOptions] = js.native
}

object InkAnalysisLineLoadOptions {
  @scala.inline
  def apply(): InkAnalysisLineLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisLineLoadOptions]
  }
  @scala.inline
  implicit class InkAnalysisLineLoadOptionsOps[Self <: InkAnalysisLineLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withParagraph(value: InkAnalysisParagraphLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParagraph: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paragraph")(js.undefined)
        ret
    }
    @scala.inline
    def withWords(value: InkAnalysisWordCollectionLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("words")(js.undefined)
        ret
    }
  }
  
}

