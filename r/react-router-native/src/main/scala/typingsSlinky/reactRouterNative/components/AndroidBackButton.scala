package typingsSlinky.reactRouterNative.components

import typingsSlinky.reactRouterNative.mod.BackButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object AndroidBackButton {
  @JSImport("react-router-native", "AndroidBackButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: BackButtonProps): SharedBuilder_BackButtonProps639958469[typingsSlinky.reactRouterNative.mod.AndroidBackButton] = new SharedBuilder_BackButtonProps639958469[typingsSlinky.reactRouterNative.mod.AndroidBackButton](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: AndroidBackButton.type): SharedBuilder_BackButtonProps639958469[typingsSlinky.reactRouterNative.mod.AndroidBackButton] = new SharedBuilder_BackButtonProps639958469[typingsSlinky.reactRouterNative.mod.AndroidBackButton](js.Array(this.component, js.Dictionary.empty))()
}

