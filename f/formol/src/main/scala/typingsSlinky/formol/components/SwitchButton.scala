package typingsSlinky.formol.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.formol.anon.Dictk
import typingsSlinky.formol.mod.SwitchButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SwitchButton {
  
  @JSImport("formol", "SwitchButton")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def i18n(value: Dictk): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftLabel(value: ReactElement): this.type = set("leftLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftLabelReactElement(value: ReactElement): this.type = set("leftLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightLabel(value: ReactElement): this.type = set("rightLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightLabelReactElement(value: ReactElement): this.type = set("rightLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SwitchButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SwitchButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
