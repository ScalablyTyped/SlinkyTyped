package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.primereact.rippleMod.RippleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ripple {
  
  @JSImport("primereact/ripple", "Ripple")
  @js.native
  object component extends js.Object
  
  def withProps(p: RippleProps): Default[tag.type, typingsSlinky.primereact.primereactRippleMod.Ripple] = new Default[tag.type, typingsSlinky.primereact.primereactRippleMod.Ripple](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Ripple.type): Default[tag.type, typingsSlinky.primereact.primereactRippleMod.Ripple] = new Default[tag.type, typingsSlinky.primereact.primereactRippleMod.Ripple](js.Array(this.component, js.Dictionary.empty))()
}
