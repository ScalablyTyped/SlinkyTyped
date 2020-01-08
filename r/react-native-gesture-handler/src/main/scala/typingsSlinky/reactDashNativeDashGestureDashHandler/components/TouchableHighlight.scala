package typingsSlinky.reactDashNativeDashGestureDashHandler.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.TouchableHighlightProperties
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ContainedTouchableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<union>))) was not a @ScalaJSDefined trait */
object TouchableHighlight
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TouchableHighlight
    ] {
  @JSImport("react-native-gesture-handler", "TouchableHighlight")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TouchableHighlightProperties | ContainedTouchableProperties
}

