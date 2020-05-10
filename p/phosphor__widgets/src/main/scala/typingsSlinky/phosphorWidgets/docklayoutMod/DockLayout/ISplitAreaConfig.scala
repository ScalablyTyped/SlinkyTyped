package typingsSlinky.phosphorWidgets.docklayoutMod.DockLayout

import typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.`split-area`
import typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.horizontal
import typingsSlinky.phosphorWidgets.phosphorWidgetsStrings.vertical
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A layout config object for a split area.
  */
@js.native
trait ISplitAreaConfig extends AreaConfig {
  /**
    * The children in the split area.
    */
  var children: js.Array[AreaConfig] = js.native
  /**
    * The orientation of the split area.
    */
  var orientation: horizontal | vertical = js.native
  /**
    * The relative sizes of the children.
    */
  var sizes: js.Array[Double] = js.native
  /**
    * The discriminated type of the config object.
    */
  var `type`: `split-area` = js.native
}

object ISplitAreaConfig {
  @scala.inline
  def apply(
    children: js.Array[AreaConfig],
    orientation: horizontal | vertical,
    sizes: js.Array[Double],
    `type`: `split-area`
  ): ISplitAreaConfig = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISplitAreaConfig]
  }
  @scala.inline
  implicit class ISplitAreaConfigOps[Self <: ISplitAreaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: js.Array[AreaConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrientation(value: horizontal | vertical): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizes(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: `split-area`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

