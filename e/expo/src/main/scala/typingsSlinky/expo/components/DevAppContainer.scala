package typingsSlinky.expo.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.expo.devAppContainerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DevAppContainer {
  
  @JSImport("expo/build/environment/DevAppContainer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: DevAppContainer.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
}
