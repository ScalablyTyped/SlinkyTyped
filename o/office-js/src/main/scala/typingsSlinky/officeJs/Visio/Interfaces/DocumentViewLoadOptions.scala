package typingsSlinky.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the DocumentView class.
  *
  * [Api set:  1.1]
  */
@js.native
trait DocumentViewLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
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

object DocumentViewLoadOptions {
  @scala.inline
  def apply(): DocumentViewLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentViewLoadOptions]
  }
  @scala.inline
  implicit class DocumentViewLoadOptionsOps[Self <: DocumentViewLoadOptions] (val x: Self) extends AnyVal {
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

