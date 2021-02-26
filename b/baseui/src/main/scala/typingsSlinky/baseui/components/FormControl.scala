package typingsSlinky.baseui.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.formControlMod.FormControlOverrides
import typingsSlinky.baseui.formControlMod.FormControlProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormControl {
  
  @JSImport("baseui/form-control", "FormControl")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.baseui.formControlMod.FormControl] {
    
    @scala.inline
    def caption(value: ReactElement): this.type = set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def captionReactElement(value: ReactElement): this.type = set("caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def error(value: Boolean | ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorReactElement(value: ReactElement): this.type = set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def htmlFor(value: String): this.type = set("htmlFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def labelReactElement(value: ReactElement): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: FormControlOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positive(value: ReactElement): this.type = set("positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positiveReactElement(value: ReactElement): this.type = set("positive", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FormControl.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FormControlProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
