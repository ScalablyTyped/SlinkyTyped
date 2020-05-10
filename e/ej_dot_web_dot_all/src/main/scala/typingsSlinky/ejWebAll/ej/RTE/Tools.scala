package typingsSlinky.ejWebAll.ej.RTE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tools extends js.Object {
  /** Specifies the alignment tools and the display order of this tool in the RTE toolbar.
    */
  var alignment: js.UndefOr[js.Any] = js.native
  /** Specifies the casing tools and the display order of this tool in the RTE toolbar.
    */
  var casing: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the clear tools and the display order of this tool in the RTE toolbar.
    */
  var clear: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the clipboard tools and the display order of this tool in the RTE toolbar.
    */
  var clipboard: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the customOrderedList tools and the display order of this tool in the RTE toolbar.
    */
  var customOrderedList: js.UndefOr[js.Array[ToolsCustomOrderedList]] = js.native
  /** Specifies the customUnOrderedList tools and the display order of this tool in the RTE toolbar.
    */
  var customUnorderedList: js.UndefOr[js.Array[ToolsCustomUnorderedList]] = js.native
  /** Specifies the doAction tools and the display order of this tool in the RTE toolbar.
    */
  var doAction: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the edit tools and the displays tool in the RTE toolbar.
    */
  var edit: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the effect of tools and the display order of this tool in RTE toolbar.
    */
  var effects: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the font tools and the display order of this tool in the RTE toolbar.
    */
  var font: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the formatStyle tools and the display order of this tool in the RTE toolbar.
    */
  var formatStyle: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the image tools and the display order of this tool in the RTE toolbar.
    */
  var images: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the importExport tools and the display order of this tool in the RTE toolbar.
    */
  var importExport: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the indent tools and the display order of this tool in the RTE toolbar.
    */
  var indenting: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the link tools and the display order of this tool in the RTE toolbar.
    */
  var links: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the list tools and the display order of this tool in the RTE toolbar.
    */
  var lists: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the media tools and the display order of this tool in the RTE toolbar.
    */
  var media: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the print tools and the display order of this tool in the RTE toolbar.
    */
  var print: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the style tools and the display order of this tool in the RTE toolbar.
    */
  var style: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the table tools and the display order of this tool in the RTE toolbar.
    */
  var tables: js.UndefOr[js.Array[_]] = js.native
  /** Specifies the view tools and the display order of this tool in the RTE toolbar.
    */
  var view: js.UndefOr[js.Array[_]] = js.native
}

object Tools {
  @scala.inline
  def apply(): Tools = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tools]
  }
  @scala.inline
  implicit class ToolsOps[Self <: Tools] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withCasing(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("casing")(js.undefined)
        ret
    }
    @scala.inline
    def withClear(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(js.undefined)
        ret
    }
    @scala.inline
    def withClipboard(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClipboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clipboard")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomOrderedList(value: js.Array[ToolsCustomOrderedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOrderedList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomOrderedList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customOrderedList")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomUnorderedList(value: js.Array[ToolsCustomUnorderedList]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUnorderedList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomUnorderedList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUnorderedList")(js.undefined)
        ret
    }
    @scala.inline
    def withDoAction(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doAction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doAction")(js.undefined)
        ret
    }
    @scala.inline
    def withEdit(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(js.undefined)
        ret
    }
    @scala.inline
    def withEffects(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffects: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effects")(js.undefined)
        ret
    }
    @scala.inline
    def withFont(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFont: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("font")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatStyle(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withImages(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(js.undefined)
        ret
    }
    @scala.inline
    def withImportExport(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importExport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importExport")(js.undefined)
        ret
    }
    @scala.inline
    def withIndenting(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indenting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndenting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indenting")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withLists(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lists")(js.undefined)
        ret
    }
    @scala.inline
    def withMedia(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedia: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("media")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withTables(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tables")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
  }
  
}

