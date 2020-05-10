package typingsSlinky.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Popup Window Properties.
  */
@js.native
trait SchemaPopupWindowProperties extends js.Object {
  /**
    * Popup dimension for a creative. This is a read-only field. Applicable to
    * the following creative types: all RICH_MEDIA and all VPAID
    */
  var dimension: js.UndefOr[SchemaSize] = js.native
  /**
    * Upper-left corner coordinates of the popup window. Applicable if
    * positionType is COORDINATES.
    */
  var offset: js.UndefOr[SchemaOffsetPosition] = js.native
  /**
    * Popup window position either centered or at specific coordinate.
    */
  var positionType: js.UndefOr[String] = js.native
  /**
    * Whether to display the browser address bar.
    */
  var showAddressBar: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display the browser menu bar.
    */
  var showMenuBar: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display the browser scroll bar.
    */
  var showScrollBar: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display the browser status bar.
    */
  var showStatusBar: js.UndefOr[Boolean] = js.native
  /**
    * Whether to display the browser tool bar.
    */
  var showToolBar: js.UndefOr[Boolean] = js.native
  /**
    * Title of popup window.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaPopupWindowProperties {
  @scala.inline
  def apply(): SchemaPopupWindowProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopupWindowProperties]
  }
  @scala.inline
  implicit class SchemaPopupWindowPropertiesOps[Self <: SchemaPopupWindowProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDimension(value: SchemaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDimension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimension")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: SchemaOffsetPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPositionType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPositionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAddressBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAddressBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAddressBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAddressBar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMenuBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenuBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMenuBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMenuBar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowScrollBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowScrollBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showScrollBar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowStatusBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStatusBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowStatusBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showStatusBar")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToolBar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToolBar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToolBar")(js.undefined)
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

