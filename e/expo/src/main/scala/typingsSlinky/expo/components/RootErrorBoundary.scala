package typingsSlinky.expo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.expo.rootErrorBoundaryMod.Props
import typingsSlinky.expo.rootErrorBoundaryMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RootErrorBoundary {
  
  @JSImport("expo/build/launch/RootErrorBoundary", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RootErrorBoundary.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
