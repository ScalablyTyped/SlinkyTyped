package typingsSlinky.reactRouterNative.components

import typingsSlinky.reactRouterNative.mod.BackButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackButton {
  
  @JSImport("react-router-native", "BackButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: BackButtonProps): SharedBuilder_BackButtonProps639958469[typingsSlinky.reactRouterNative.mod.BackButton] = new SharedBuilder_BackButtonProps639958469[typingsSlinky.reactRouterNative.mod.BackButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: BackButton.type): SharedBuilder_BackButtonProps639958469[typingsSlinky.reactRouterNative.mod.BackButton] = new SharedBuilder_BackButtonProps639958469[typingsSlinky.reactRouterNative.mod.BackButton](js.Array(this.component, js.Dictionary.empty))()
}
