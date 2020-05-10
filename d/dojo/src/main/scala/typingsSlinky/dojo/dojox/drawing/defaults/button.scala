package typingsSlinky.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.button.html
  *
  *
  */
@js.native
trait button extends js.Object {
  /**
    *
    */
  var down: js.Object = js.native
  /**
    *
    */
  var icon: js.Object = js.native
  /**
    *
    */
  var norm: js.Object = js.native
  /**
    *
    */
  var over: js.Object = js.native
  /**
    *
    */
  var selected: js.Object = js.native
}

object button {
  @scala.inline
  def apply(down: js.Object, icon: js.Object, norm: js.Object, over: js.Object, selected: js.Object): button = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], norm = norm.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[button]
  }
  @scala.inline
  implicit class buttonOps[Self <: button] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDown(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("down")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNorm(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("norm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOver(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelected(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

