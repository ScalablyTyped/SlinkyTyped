package typingsSlinky.reactEditext.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactEditext.mod.EdiTextProps
import typingsSlinky.reactEditext.mod.EdiTextType
import typingsSlinky.reactEditext.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactEditext {
  
  @scala.inline
  def apply(onSave: /* repeated */ String => js.Any, `type`: EdiTextType, value: String): Builder = {
    val __props = js.Dynamic.literal(onSave = js.Any.fromFunction1(onSave), value = value.asInstanceOf[js.Any])
    __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[EdiTextProps]))
  }
  
  @JSImport("react-editext", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def cancelButtonClassName(value: String): this.type = set("cancelButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def cancelButtonContent(value: js.Any): this.type = set("cancelButtonContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editButtonClassName(value: String): this.type = set("editButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def editButtonContent(value: js.Any): this.type = set("editButtonContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hideIcons(value: Boolean): this.type = set("hideIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hint(value: ReactElement): this.type = set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def hintReactElement(value: ReactElement): this.type = set("hint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: js.Object): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCancel(value: /* repeated */ js.Any => _): this.type = set("onCancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def onValidationFail(value: /* repeated */ String => _): this.type = set("onValidationFail", js.Any.fromFunction1(value))
    
    @scala.inline
    def saveButtonClassName(value: String): this.type = set("saveButtonClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def saveButtonContent(value: js.Any): this.type = set("saveButtonContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validation(value: /* repeated */ String => Boolean): this.type = set("validation", js.Any.fromFunction1(value))
    
    @scala.inline
    def validationMessage(value: String): this.type = set("validationMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewProps(value: js.Object): this.type = set("viewProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EdiTextProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
