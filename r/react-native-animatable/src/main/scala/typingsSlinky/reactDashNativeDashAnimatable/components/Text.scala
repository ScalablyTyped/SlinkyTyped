package typingsSlinky.reactDashNativeDashAnimatable.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNative.reactDashNativeMod.TextProperties
import typingsSlinky.reactDashNative.reactDashNativeMod.TextStyle
import typingsSlinky.reactDashNativeDashAnimatable.reactDashNativeDashAnimatableMod.AnimatableProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object Text
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-native-animatable", "Text")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = AnimatableProperties[TextStyle] with TextProperties
}

