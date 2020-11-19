package typingsSlinky.expo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.expo.rootErrorBoundaryWebMod.Props
import typingsSlinky.expo.rootErrorBoundaryWebMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RootErrorBoundaryDotweb {
  
  @JSImport("expo/build/launch/RootErrorBoundary.web", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RootErrorBoundaryDotweb.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}
