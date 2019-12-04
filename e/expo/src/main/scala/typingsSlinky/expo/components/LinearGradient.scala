package typingsSlinky.expo.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(expoDashLinearDashGradient), Name(buildLinearGradientMod), Name(Props))) was not a @ScalaJSDefined trait */
object LinearGradient
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.expo.buildGlobalsDotWebMod.LinearGradient] {
  @JSImport("expo/build/globals.web", "LinearGradient")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = typingsSlinky.expoDashLinearDashGradient.buildLinearGradientMod.Props
}

