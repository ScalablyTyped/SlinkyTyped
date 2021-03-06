package typingsSlinky.jupyterlabExtensionmanager.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SearchBar {
  
  @scala.inline
  def apply(disabled: Boolean, placeholder: String, settings: ISettings): Default[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar] = {
    val __props = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar](js.Array(this.component, __props.asInstanceOf[IProperties]))
  }
  
  @JSImport("@jupyterlab/extensionmanager", "SearchBar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IProperties): Default[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar] = new Default[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar](js.Array(this.component, p.asInstanceOf[js.Any]))
}
