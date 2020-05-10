package typingsSlinky.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.selected.html
  *
  * Selected style of all shapes
  * styles not shown will used from
  * norm
  *
  */
@js.native
trait selected extends js.Object {
  /**
    *
    */
  var color: String = js.native
  /**
    *
    */
  var width: Double = js.native
}

object selected {
  @scala.inline
  def apply(color: String, width: Double): selected = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[selected]
  }
  @scala.inline
  implicit class selectedOps[Self <: selected] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

