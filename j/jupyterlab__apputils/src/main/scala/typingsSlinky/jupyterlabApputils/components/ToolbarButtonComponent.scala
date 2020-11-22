package typingsSlinky.jupyterlabApputils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.jupyterlabApputils.toolbarMod.ToolbarButtonComponent.IProps
import typingsSlinky.jupyterlabUiComponents.labiconMod.LabIcon.IMaybeResolvable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToolbarButtonComponent {
  
  @JSImport("@jupyterlab/apputils", "ToolbarButtonComponent")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def icon(value: IMaybeResolvable): this.type = set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconClass(value: String): this.type = set("iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iconLabel(value: String): this.type = set("iconLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: () => Unit): this.type = set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def tooltip(value: String): this.type = set("tooltip", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ToolbarButtonComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
