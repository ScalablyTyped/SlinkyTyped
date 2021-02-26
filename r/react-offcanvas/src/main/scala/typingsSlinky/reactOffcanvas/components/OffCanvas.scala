package typingsSlinky.reactOffcanvas.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactOffcanvas.mod.OffCanvasProps
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.left
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.overlay
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.parallax
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.push
import typingsSlinky.reactOffcanvas.reactOffcanvasStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OffCanvas {
  
  @JSImport("react-offcanvas", "OffCanvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOffcanvas.mod.OffCanvas] {
    
    @scala.inline
    def effect(value: push | overlay | parallax): this.type = set("effect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def isMenuOpened(value: Boolean): this.type = set("isMenuOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: left | right): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: OffCanvas.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OffCanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
