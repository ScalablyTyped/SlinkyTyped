package typingsSlinky.reactDashSvg.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.reactDashSvg.reactDashSvgMod.WrapperType
import typingsSlinky.reactDashSvg.reactDashSvgMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object ReactDashSvg
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-svg", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = typingsSlinky.reactDashSvg.reactDashSvgMod.Props with (DetailedHTMLProps[HTMLAttributes[WrapperType], WrapperType])
}

