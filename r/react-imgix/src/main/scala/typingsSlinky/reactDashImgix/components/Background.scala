package typingsSlinky.reactDashImgix.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.PropsWithChildren
import typingsSlinky.reactDashImgix.reactDashImgixMod.BackgroundProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(react), Name(reactMod), Name(PropsWithChildren))) was not a @ScalaJSDefined trait */
object Background
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("react-imgix", "Background")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = PropsWithChildren[BackgroundProps]
}

