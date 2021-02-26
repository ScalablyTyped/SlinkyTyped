package typingsSlinky.reactForm.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactText
import typingsSlinky.reactForm.anon.StyledPropschildrenpropsF
import typingsSlinky.reactForm.mod.FieldApi
import typingsSlinky.reactForm.mod.RenderReturn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StyledRadioGroup {
  
  @JSImport("react-form", "StyledRadioGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactForm.mod.StyledRadioGroup] {
    
    @scala.inline
    def children(value: (js.Function1[/* props */ FieldApi, RenderReturn]) | RenderReturn): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* props */ FieldApi => RenderReturn): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenNull: this.type = set("children", null)
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: scala.Nothing*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def errorBefore(value: Boolean): this.type = set("errorBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def field(value: String | (js.Array[js.Array[ReactText] | ReactText | String])): this.type = set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fieldVarargs(value: (js.Array[ReactText] | ReactText | String)*): this.type = set("field", js.Array(value :_*))
    
    @scala.inline
    def isForm(value: Boolean): this.type = set("isForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def messageBefore(value: Boolean): this.type = set("messageBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def noMessage(value: Boolean): this.type = set("noMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showErrors(value: Boolean): this.type = set("showErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def touchValidation(value: Boolean): this.type = set("touchValidation", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StyledRadioGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StyledPropschildrenpropsF): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
