package typingsSlinky.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the InkAnalysisWord object, for use in "inkAnalysisWord.set({ ... })". */
@js.native
trait InkAnalysisWordUpdateData extends js.Object {
  /**
    *
    * Reference to the parent InkAnalysisLine.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var line: js.UndefOr[InkAnalysisLineUpdateData] = js.native
}

object InkAnalysisWordUpdateData {
  @scala.inline
  def apply(): InkAnalysisWordUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkAnalysisWordUpdateData]
  }
  @scala.inline
  implicit class InkAnalysisWordUpdateDataOps[Self <: InkAnalysisWordUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLine(value: InkAnalysisLineUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(js.undefined)
        ret
    }
  }
  
}

