package typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor

import typingsSlinky.phosphorCoreutils.jsonMod.JSONObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A selection style.
  */
@js.native
trait ISelectionStyle extends JSONObject {
  /**
    * A class name added to a selection.
    */
  var className: String = js.native
  /**
    * A color for UI elements.
    */
  var color: String = js.native
  /**
    * A display name added to a selection.
    */
  var displayName: String = js.native
}

object ISelectionStyle {
  @scala.inline
  def apply(className: String, color: String, displayName: String): ISelectionStyle = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectionStyle]
  }
  @scala.inline
  implicit class ISelectionStyleOps[Self <: ISelectionStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

