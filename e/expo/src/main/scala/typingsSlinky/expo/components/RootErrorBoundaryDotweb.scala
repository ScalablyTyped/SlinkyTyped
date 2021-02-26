package typingsSlinky.expo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.expo.rootErrorBoundaryWebMod.Props
import typingsSlinky.expo.rootErrorBoundaryWebMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RootErrorBoundaryDotweb {
  
  @JSImport("expo/build/launch/RootErrorBoundary.web", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RootErrorBoundaryDotweb.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
