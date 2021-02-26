package typingsSlinky.blueprintjsCore.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.formGroupMod.IFormGroupProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormGroup {
  
  @JSImport("@blueprintjs/core", "FormGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.FormGroup] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def helperText(value: ReactElement): this.type = set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def helperTextReactElement(value: ReactElement): this.type = set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelFor(value: String): this.type = set("labelFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelInfo(value: ReactElement): this.type = set("labelInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelInfoReactElement(value: ReactElement): this.type = set("labelInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FormGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IFormGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
