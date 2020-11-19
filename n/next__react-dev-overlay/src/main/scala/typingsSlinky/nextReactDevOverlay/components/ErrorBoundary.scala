package typingsSlinky.nextReactDevOverlay.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.nextReactDevOverlay.errorBoundaryMod.ErrorBoundaryProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ErrorBoundary {
  
  @JSImport("@next/react-dev-overlay/lib/internal/ErrorBoundary", "ErrorBoundary")
  @js.native
  object component extends js.Object
  
  def withProps(p: ErrorBoundaryProps): Default[tag.type, typingsSlinky.nextReactDevOverlay.errorBoundaryMod.ErrorBoundary] = new Default[tag.type, typingsSlinky.nextReactDevOverlay.errorBoundaryMod.ErrorBoundary](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(onError: (js.Error, js.UndefOr[String]) => Unit): Default[tag.type, typingsSlinky.nextReactDevOverlay.errorBoundaryMod.ErrorBoundary] = {
    val __props = js.Dynamic.literal(onError = js.Any.fromFunction2(onError))
    new Default[tag.type, typingsSlinky.nextReactDevOverlay.errorBoundaryMod.ErrorBoundary](js.Array(this.component, __props.asInstanceOf[ErrorBoundaryProps]))
  }
}
