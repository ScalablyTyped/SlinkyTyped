package typingsSlinky.jupyterlabExtensionmanager.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.CollapsibleSection.IProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CollapsibleSection {
  
  @scala.inline
  def apply(header: String): Builder = {
    val __props = js.Dynamic.literal(header = header.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IProperties]))
  }
  
  @JSImport("@jupyterlab/extensionmanager", "CollapsibleSection")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.CollapsibleSection] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorMessageNull: this.type = set("errorMessage", null)
    
    @scala.inline
    def forceOpen(value: Boolean): this.type = set("forceOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerElements(value: ReactElement): this.type = set("headerElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerElementsReactElement(value: ReactElement): this.type = set("headerElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onCollapse(value: /* isOpen */ Boolean => Unit): this.type = set("onCollapse", js.Any.fromFunction1(value))
  }
  
  def withProps(p: IProperties): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
