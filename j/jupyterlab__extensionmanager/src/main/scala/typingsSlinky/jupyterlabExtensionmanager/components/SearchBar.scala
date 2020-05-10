package typingsSlinky.jupyterlabExtensionmanager.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.jupyterlabExtensionmanager.widgetMod.SearchBar.IProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBar {
  @JSImport("@jupyterlab/extensionmanager", "SearchBar")
  @js.native
  object component extends js.Object
  
  def withProps(p: IProperties): Default[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar] = new Default[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(placeholder: String): Default[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar] = {
    val __props = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.jupyterlabExtensionmanager.mod.SearchBar](js.Array(this.component, __props.asInstanceOf[IProperties]))
  }
}

