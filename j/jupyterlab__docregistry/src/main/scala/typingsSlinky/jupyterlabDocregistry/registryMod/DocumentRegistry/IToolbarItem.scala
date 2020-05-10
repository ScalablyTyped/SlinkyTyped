package typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry

import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The item to be added to document toolbar.
  */
@js.native
trait IToolbarItem extends js.Object {
  var name: String = js.native
  var widget: Widget = js.native
}

object IToolbarItem {
  @scala.inline
  def apply(name: String, widget: Widget): IToolbarItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], widget = widget.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToolbarItem]
  }
  @scala.inline
  implicit class IToolbarItemOps[Self <: IToolbarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidget(value: Widget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widget")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

