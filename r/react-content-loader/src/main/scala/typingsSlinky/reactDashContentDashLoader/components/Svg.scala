package typingsSlinky.reactDashContentDashLoader.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashContentDashLoader.distNativeSvgMod.RequiredIContentLoaderProps
import typingsSlinky.reactDashContentDashLoader.distNativeSvgMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashContentDashLoader), Name(distNativeSvgMod), Name(RequiredIContentLoaderProps))) was not a @ScalaJSDefined trait */
object Svg
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-content-loader/dist/native/Svg", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = RequiredIContentLoaderProps
}

