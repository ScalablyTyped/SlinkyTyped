package typingsSlinky.reactTouch.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactTouch.mod.HoldableConfig
import typingsSlinky.reactTouch.mod.HoldableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Holdable {
  
  @JSImport("react-touch", "Holdable")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactTouch.mod.Holdable] {
    
    @scala.inline
    def config(value: HoldableConfig): this.type = set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onHoldComplete(value: () => Unit): this.type = set("onHoldComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def onHoldProgress(value: () => Unit): this.type = set("onHoldProgress", js.Any.fromFunction0(value))
    
    @scala.inline
    def onMouseDown(value: () => Unit): this.type = set("onMouseDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def onTouchStart(value: () => Unit): this.type = set("onTouchStart", js.Any.fromFunction0(value))
  }
  
  implicit def make(companion: Holdable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HoldableProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
