package typingsSlinky.baseui.components

import org.scalajs.dom.raw.Node
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.SnackbarElementOverridesT
import typingsSlinky.baseui.snackbarMod.DurationT
import typingsSlinky.baseui.snackbarMod.PlacementT
import typingsSlinky.baseui.snackbarMod.SnackbarProviderPropsT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SnackbarProvider {
  
  @JSImport("baseui/snackbar", "SnackbarProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultDuration(value: DurationT): this.type = set("defaultDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: SnackbarElementOverridesT): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: PlacementT): this.type = set("placement", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SnackbarProviderPropsT): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: SnackbarProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
