package typingsSlinky.reactDashNativeDashFlipDashCard.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashFlipDashCard.reactDashNativeDashFlipDashCardMod.BackProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Back
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashFlipDashCard.reactDashNativeDashFlipDashCardMod.Back
    ] {
  @JSImport("react-native-flip-card", "Back")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    chilren: js.Array[typingsSlinky.react.reactMod._Global_.JSX.Element],
    flipHorizontal: Boolean,
    flipVertical: Boolean,
    perspective: Double,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashFlipDashCard.reactDashNativeDashFlipDashCardMod.Back
  ] = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any], flipHorizontal = flipHorizontal.asInstanceOf[js.Any], flipVertical = flipVertical.asInstanceOf[js.Any], perspective = perspective.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = BackProps
}

