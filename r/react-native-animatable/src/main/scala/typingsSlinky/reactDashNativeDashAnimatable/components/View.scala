package typingsSlinky.reactDashNativeDashAnimatable.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewProperties
import typingsSlinky.reactDashNative.reactDashNativeMod.ViewStyle
import typingsSlinky.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.AnimatableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object View
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-native-animatable", "View")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AnimatableProperties[ViewStyle] with ViewProperties
}

