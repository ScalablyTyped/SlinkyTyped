package typingsSlinky.expoDashLinearDashGradient.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(expoDashLinearDashGradient), Name(buildNativeLinearGradientDotWebMod), Name(Props))) was not a @ScalaJSDefined trait */
object NativeLinearGradientDotWeb
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.web", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = typingsSlinky.expoDashLinearDashGradient.buildNativeLinearGradientDotWebMod.Props
}

