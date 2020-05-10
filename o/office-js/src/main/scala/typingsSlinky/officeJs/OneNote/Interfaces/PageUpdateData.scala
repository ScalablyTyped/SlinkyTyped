package typingsSlinky.officeJs.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the Page object, for use in "page.set({ ... })". */
@js.native
trait PageUpdateData extends js.Object {
  /**
    *
    * Text interpretation for the ink on the page. Returns null if there is no ink analysis information. Read only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var inkAnalysisOrNull: js.UndefOr[InkAnalysisUpdateData] = js.native
  /**
    *
    * Gets or sets the indentation level of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pageLevel: js.UndefOr[Double] = js.native
  /**
    *
    * Gets or sets the title of the page.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var title: js.UndefOr[String] = js.native
}

object PageUpdateData {
  @scala.inline
  def apply(): PageUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageUpdateData]
  }
  @scala.inline
  implicit class PageUpdateDataOps[Self <: PageUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInkAnalysisOrNull(value: InkAnalysisUpdateData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkAnalysisOrNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInkAnalysisOrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inkAnalysisOrNull")(js.undefined)
        ret
    }
    @scala.inline
    def withPageLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

