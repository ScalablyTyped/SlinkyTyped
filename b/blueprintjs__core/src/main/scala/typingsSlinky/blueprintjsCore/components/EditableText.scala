package typingsSlinky.blueprintjsCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.editableTextMod.IEditableTextProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditableText {
  
  @JSImport("@blueprintjs/core", "EditableText")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.EditableText] {
    
    @scala.inline
    def alwaysRenderInput(value: Boolean): this.type = set("alwaysRenderInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def confirmOnEnterKey(value: Boolean): this.type = set("confirmOnEnterKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isEditing(value: Boolean): this.type = set("isEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxLines(value: Double): this.type = set("maxLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minLines(value: Double): this.type = set("minLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def multiline(value: Boolean): this.type = set("multiline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: /* value */ String => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onChange(value: /* value */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onConfirm(value: /* value */ String => Unit): this.type = set("onConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def onEdit(value: /* value */ js.UndefOr[String] => Unit): this.type = set("onEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectAllOnFocus(value: Boolean): this.type = set("selectAllOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IEditableTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: EditableText.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
