package typingsSlinky.reactDashNativeDashFlipDashCard.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashFlipDashCard.reactDashNativeDashFlipDashCardMod.FaceProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Face
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashFlipDashCard.reactDashNativeDashFlipDashCardMod.Face
    ] {
  @JSImport("react-native-flip-card", "Face")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    chilren: js.Array[typingsSlinky.react.reactMod._Global_.JSX.Element],
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashNativeDashFlipDashCard.reactDashNativeDashFlipDashCardMod.Face
  ] = {
    val __obj = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = FaceProps
}

