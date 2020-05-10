package typingsSlinky.dojo.dojox.drawing.tools.TextBlock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/tools/TextBlock.setup.html
  *
  *
  */
@js.native
trait setup extends js.Object {
  /**
    *
    */
  var iconClass: String = js.native
  /**
    *
    */
  var name: String = js.native
  /**
    *
    */
  var tooltip: String = js.native
}

object setup {
  @scala.inline
  def apply(iconClass: String, name: String, tooltip: String): setup = {
    val __obj = js.Dynamic.literal(iconClass = iconClass.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[setup]
  }
  @scala.inline
  implicit class setupOps[Self <: setup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

