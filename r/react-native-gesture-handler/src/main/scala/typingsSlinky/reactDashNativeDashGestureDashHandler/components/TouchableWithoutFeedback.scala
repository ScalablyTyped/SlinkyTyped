package typingsSlinky.reactDashNativeDashGestureDashHandler.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.TouchableWithoutFeedbackProperties
import typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.ContainedTouchableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<union>))) was not a @ScalaJSDefined trait */
object TouchableWithoutFeedback
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashGestureDashHandler.reactDashNativeDashGestureDashHandlerMod.TouchableWithoutFeedback
    ] {
  @JSImport("react-native-gesture-handler", "TouchableWithoutFeedback")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = TouchableWithoutFeedbackProperties | ContainedTouchableProperties
}

