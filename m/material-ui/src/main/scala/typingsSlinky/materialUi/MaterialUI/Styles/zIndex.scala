package typingsSlinky.materialUi.MaterialUI.Styles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait zIndex extends js.Object {
  var appBar: Double
  var dialog: Double
  var dialogOverlay: Double
  var drawer: Double
  var drawerOverlay: Double
  var layer: Double
  var menu: Double
  var popover: Double
  var snackbar: Double
  var tooltip: Double
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
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppBar(value: Double): Self = this.set("appBar", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialog(value: Double): Self = this.set("dialog", value.asInstanceOf[js.Any])
    @scala.inline
    def setDialogOverlay(value: Double): Self = this.set("dialogOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawer(value: Double): Self = this.set("drawer", value.asInstanceOf[js.Any])
    @scala.inline
    def setDrawerOverlay(value: Double): Self = this.set("drawerOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayer(value: Double): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenu(value: Double): Self = this.set("menu", value.asInstanceOf[js.Any])
    @scala.inline
    def setPopover(value: Double): Self = this.set("popover", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnackbar(value: Double): Self = this.set("snackbar", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: Double): Self = this.set("tooltip", value.asInstanceOf[js.Any])
  }
  
}

