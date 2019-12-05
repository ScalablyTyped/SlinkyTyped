package typingsSlinky.reactDashImageDashFallback.components

import org.scalajs.dom.raw.HTMLImageElement
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.react.reactMod.DetailedHTMLProps
import typingsSlinky.react.reactMod.ImgHTMLAttributes
import typingsSlinky.reactDashImageDashFallback.reactDashImageDashFallbackMod.ReactImageFallbackProps
import typingsSlinky.reactDashImageDashFallback.reactDashImageDashFallbackMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<intersection>))) was not a @ScalaJSDefined trait */
object ReactDashImageDashFallback
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-image-fallback", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ReactImageFallbackProps with (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
}

