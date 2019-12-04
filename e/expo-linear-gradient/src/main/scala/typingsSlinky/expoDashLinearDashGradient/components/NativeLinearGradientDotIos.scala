package typingsSlinky.expoDashLinearDashGradient.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.expoDashLinearDashGradient.buildNativeLinearGradientDotIosMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(expoDashLinearDashGradient), Name(buildNativeLinearGradientDotIosMod), Name(Props))) was not a @ScalaJSDefined trait */
object NativeLinearGradientDotIos
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("expo-linear-gradient/build/NativeLinearGradient.ios", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = typingsSlinky.expoDashLinearDashGradient.buildNativeLinearGradientDotIosMod.Props
}

