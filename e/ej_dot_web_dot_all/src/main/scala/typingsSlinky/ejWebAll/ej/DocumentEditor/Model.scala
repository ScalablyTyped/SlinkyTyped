package typingsSlinky.ejWebAll.ej.DocumentEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Gets or sets an object that indicates initialization of importing and exporting documents in document editor.
    */
  var importExportSettings: js.UndefOr[ImportExportSettings] = js.native
  /** Triggers when the document changes.
    */
  var onDocumentChange: js.UndefOr[js.Function1[/* e */ OnDocumentChangeEventArgs, Unit]] = js.native
  /** Triggers when the hyperlink is clicked.
    */
  var onRequestNavigate: js.UndefOr[js.Function1[/* e */ OnRequestNavigateEventArgs, Unit]] = js.native
  /** Triggers when the selection changes.
    */
  var onSelectionChange: js.UndefOr[js.Function1[/* e */ OnSelectionChangeEventArgs, Unit]] = js.native
  /** Triggers when the zoom factor changes.
    */
  var onZoomFactorChange: js.UndefOr[js.Function1[/* e */ OnZoomFactorChangeEventArgs, Unit]] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImportExportSettings(value: ImportExportSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importExportSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportExportSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importExportSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDocumentChange(value: /* e */ OnDocumentChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDocumentChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDocumentChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDocumentChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRequestNavigate(value: /* e */ OnRequestNavigateEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestNavigate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnRequestNavigate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRequestNavigate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelectionChange(value: /* e */ OnSelectionChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSelectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnZoomFactorChange(value: /* e */ OnZoomFactorChangeEventArgs => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomFactorChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnZoomFactorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onZoomFactorChange")(js.undefined)
        ret
    }
  }
  
}

