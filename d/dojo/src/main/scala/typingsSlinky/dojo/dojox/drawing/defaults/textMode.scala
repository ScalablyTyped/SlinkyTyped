package typingsSlinky.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.textMode.html
  *
  * These styles apply to the containing
  * text box (edit mode), and not the text itself
  *
  */
@js.native
trait textMode extends js.Object {
  /**
    *
    */
  var create: js.Object = js.native
  /**
    *
    */
  var edit: js.Object = js.native
}

object textMode {
  @scala.inline
  def apply(create: js.Object, edit: js.Object): textMode = {
    val __obj = js.Dynamic.literal(create = create.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any])
    __obj.asInstanceOf[textMode]
  }
  @scala.inline
  implicit class textModeOps[Self <: textMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreate(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEdit(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edit")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

