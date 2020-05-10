package typingsSlinky.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DocumentView object, for use in "documentView.set({ ... })". */
@js.native
trait DocumentViewUpdateData extends js.Object {
  /**
    *
    * Disable Hyperlinks.
    *
    * [Api set:  1.1]
    */
  var disableHyperlinks: js.UndefOr[Boolean] = js.native
  /**
    *
    * Disable Pan.
    *
    * [Api set:  1.1]
    */
  var disablePan: js.UndefOr[Boolean] = js.native
  /**
    *
    * Disable PanZoomWindow.
    *
    * [Api set:  1.1]
    */
  var disablePanZoomWindow: js.UndefOr[Boolean] = js.native
  /**
    *
    * Disable Zoom.
    *
    * [Api set:  1.1]
    */
  var disableZoom: js.UndefOr[Boolean] = js.native
  /**
    *
    * Hide Diagram Boundary.
    *
    * [Api set:  1.1]
    */
  var hideDiagramBoundary: js.UndefOr[Boolean] = js.native
}

object DocumentViewUpdateData {
  @scala.inline
  def apply(): DocumentViewUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewUpdateData]
  }
  @scala.inline
  implicit class DocumentViewUpdateDataOps[Self <: DocumentViewUpdateData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableHyperlinks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHyperlinks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableHyperlinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableHyperlinks")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePan(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePan")(js.undefined)
        ret
    }
    @scala.inline
    def withDisablePanZoomWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePanZoomWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisablePanZoomWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disablePanZoomWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withHideDiagramBoundary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDiagramBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideDiagramBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideDiagramBoundary")(js.undefined)
        ret
    }
  }
  
}

