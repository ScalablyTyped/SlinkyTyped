package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisParagraph object, for use in "inkAnalysisParagraph.set({ ... })". */
@js.native
trait InkAnalysisParagraphUpdateData extends js.Object {
  /**
    *
    * Reference to the parent InkAnalysisPage.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysis: js.UndefOr[InkAnalysisUpdateData] = js.native
}

object InkAnalysisParagraphUpdateData {
  @scala.inline
  def apply(): InkAnalysisParagraphUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisParagraphUpdateData]
  }
  @scala.inline
  implicit class InkAnalysisParagraphUpdateDataOps[Self <: InkAnalysisParagraphUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInkAnalysis(value: InkAnalysisUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkAnalysis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInkAnalysis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkAnalysis")(js.undefined)
        ret
    }
  }
  
}

