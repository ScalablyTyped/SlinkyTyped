package typingsSlinky.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait zIndex extends js.Object {
  var appBar: Double = js.native
  var dialog: Double = js.native
  var dialogOverlay: Double = js.native
  var drawer: Double = js.native
  var drawerOverlay: Double = js.native
  var layer: Double = js.native
  var menu: Double = js.native
  var popover: Double = js.native
  var snackbar: Double = js.native
  var tooltip: Double = js.native
}

object zIndex {
  @scala.inline
  def apply(
    appBar: Double,
    dialog: Double,
    dialogOverlay: Double,
    drawer: Double,
    drawerOverlay: Double,
    layer: Double,
    menu: Double,
    popover: Double,
    snackbar: Double,
    tooltip: Double
  ): zIndex = {
    val __obj = js.Dynamic.literal(appBar = appBar.asInstanceOf[js.Any], dialog = dialog.asInstanceOf[js.Any], dialogOverlay = dialogOverlay.asInstanceOf[js.Any], drawer = drawer.asInstanceOf[js.Any], drawerOverlay = drawerOverlay.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], menu = menu.asInstanceOf[js.Any], popover = popover.asInstanceOf[js.Any], snackbar = snackbar.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[zIndex]
  }
  @scala.inline
  implicit class zIndexOps[Self <: zIndex] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppBar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appBar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialog(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialog")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDialogOverlay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dialogOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDrawerOverlay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("drawerOverlay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLayer(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMenu(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPopover(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnackbar(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snackbar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

