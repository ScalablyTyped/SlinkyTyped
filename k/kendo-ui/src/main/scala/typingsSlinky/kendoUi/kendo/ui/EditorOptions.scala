package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorOptions extends js.Object {
  var change: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.native
  var deserialization: js.UndefOr[EditorDeserialization] = js.native
  var domain: js.UndefOr[String] = js.native
  var encoded: js.UndefOr[Boolean] = js.native
  var execute: js.UndefOr[js.Function1[/* e */ EditorExecuteEvent, Unit]] = js.native
  var fileBrowser: js.UndefOr[EditorFileBrowser] = js.native
  var imageBrowser: js.UndefOr[EditorImageBrowser] = js.native
  var immutables: js.UndefOr[Boolean | EditorImmutables] = js.native
  var keydown: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.native
  var keyup: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.native
  var messages: js.UndefOr[EditorMessages] = js.native
  var name: js.UndefOr[String] = js.native
  var paste: js.UndefOr[js.Function1[/* e */ EditorPasteEvent, Unit]] = js.native
  var pasteCleanup: js.UndefOr[EditorPasteCleanup] = js.native
  var pdf: js.UndefOr[EditorPdf] = js.native
  var pdfExport: js.UndefOr[js.Function1[/* e */ EditorPdfExportEvent, Unit]] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var resizable: js.UndefOr[Boolean | EditorResizable] = js.native
  var select: js.UndefOr[js.Function1[/* e */ EditorEvent, Unit]] = js.native
  var serialization: js.UndefOr[EditorSerialization] = js.native
  var stylesheets: js.UndefOr[js.Any] = js.native
  var tools: js.UndefOr[js.Array[EditorTool | String]] = js.native
}

object EditorOptions {
  @scala.inline
  def apply(): EditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorOptions]
  }
  @scala.inline
  implicit class EditorOptionsOps[Self <: EditorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChange(value: /* e */ EditorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("change")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserialization(value: EditorDeserialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeserialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialization")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoded")(js.undefined)
        ret
    }
    @scala.inline
    def withExecute(value: /* e */ EditorExecuteEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExecute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("execute")(js.undefined)
        ret
    }
    @scala.inline
    def withFileBrowser(value: EditorFileBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withImageBrowser(value: EditorImageBrowser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBrowser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageBrowser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageBrowser")(js.undefined)
        ret
    }
    @scala.inline
    def withImmutables(value: Boolean | EditorImmutables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmutables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immutables")(js.undefined)
        ret
    }
    @scala.inline
    def withKeydown(value: /* e */ EditorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keydown")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyup(value: /* e */ EditorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyup")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: EditorMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPaste(value: /* e */ EditorPasteEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPaste: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paste")(js.undefined)
        ret
    }
    @scala.inline
    def withPasteCleanup(value: EditorPasteCleanup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteCleanup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPasteCleanup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pasteCleanup")(js.undefined)
        ret
    }
    @scala.inline
    def withPdf(value: EditorPdf): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPdf: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.undefined)
        ret
    }
    @scala.inline
    def withPdfExport(value: /* e */ EditorPdfExportEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfExport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPdfExport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdfExport")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean | EditorResizable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelect(value: /* e */ EditorEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("select")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialization(value: EditorSerialization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSerialization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialization")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheets")(js.undefined)
        ret
    }
    @scala.inline
    def withTools(value: js.Array[EditorTool | String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(js.undefined)
        ret
    }
  }
  
}

