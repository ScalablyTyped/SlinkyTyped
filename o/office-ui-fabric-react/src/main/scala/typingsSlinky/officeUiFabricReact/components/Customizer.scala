package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.uifabricUtilities.anon.ReadonlyICustomizerContex
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.customizationsMod.ISettings
import typingsSlinky.uifabricUtilities.customizationsMod.ISettingsFunction
import typingsSlinky.uifabricUtilities.customizerContextMod.ICustomizerContext
import typingsSlinky.uifabricUtilities.customizerTypesMod.ICustomizerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Customizer {
  
  @JSImport("office-ui-fabric-react", "Customizer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.Customizer] {
    
    @scala.inline
    def componentRef(value: IRefObject[_]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentRefFunction1(value: /* ref */ _ | Null => Unit): this.type = set("componentRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def componentRefRefObject(value: ReactRef[_]): this.type = set("componentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def contextTransform(value: /* context */ ReadonlyICustomizerContex => ICustomizerContext): this.type = set("contextTransform", js.Any.fromFunction1(value))
    
    @scala.inline
    def scopedSettings(value: ISettings | ISettingsFunction): this.type = set("scopedSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scopedSettingsFunction1(value: /* settings */ ISettings => ISettings): this.type = set("scopedSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def settings(value: ISettings | ISettingsFunction): this.type = set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def settingsFunction1(value: /* settings */ ISettings => ISettings): this.type = set("settings", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: Customizer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ICustomizerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
