package typingsSlinky.phosphorWidgets.docklayoutMod.DockLayout

import typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.`tab-area`
import typingsSlinky.phosphorWidgets.widgetMod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout config object for a tab area.
  */
@js.native
trait ITabAreaConfig extends AreaConfig {
  /**
    * The index of the selected tab.
    */
  var currentIndex: Double = js.native
  /**
    * The discriminated type of the config object.
    */
  var `type`: `tab-area` = js.native
  /**
    * The widgets contained in the tab area.
    */
  var widgets: js.Array[Widget] = js.native
}

object ITabAreaConfig {
  @scala.inline
  def apply(currentIndex: Double, `type`: `tab-area`, widgets: js.Array[Widget]): ITabAreaConfig = {
    val __obj = js.Dynamic.literal(currentIndex = currentIndex.asInstanceOf[js.Any], widgets = widgets.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITabAreaConfig]
  }
  @scala.inline
  implicit class ITabAreaConfigOps[Self <: ITabAreaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `tab-area`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidgets(value: js.Array[Widget]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widgets")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

