package typingsSlinky.reactNativeFlipCard.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeFlipCard.mod.BackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Back {
  @JSImport("react-native-flip-card", "Back")
  @js.native
  object component extends js.Object
  
  def withProps(p: BackProps): Default[tag.type, typingsSlinky.reactNativeFlipCard.mod.Back] = new Default[tag.type, typingsSlinky.reactNativeFlipCard.mod.Back](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    chilren: js.Array[ReactElement],
    flipHorizontal: Boolean,
    flipVertical: Boolean,
    perspective: Double
  ): Default[tag.type, typingsSlinky.reactNativeFlipCard.mod.Back] = {
    val __props = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any], flipHorizontal = flipHorizontal.asInstanceOf[js.Any], flipVertical = flipVertical.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNativeFlipCard.mod.Back](js.Array(this.component, __props.asInstanceOf[BackProps]))
  }
}

