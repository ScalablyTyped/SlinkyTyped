package typingsSlinky.reactElemental.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactElemental.mod.LoadingBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoadingBar {
  
  @JSImport("react-elemental", "LoadingBar")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactElemental.mod.LoadingBar] {
    
    @scala.inline
    def color(value: String): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: Double): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def thickness(value: Double): this.type = set("thickness", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LoadingBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LoadingBar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
