package typingsSlinky.qrcodeDotReact.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.qrcodeDotReact.qrcodeDotReactMod.CanvasQRCodeProps
import typingsSlinky.qrcodeDotReact.qrcodeDotReactMod.SvgQRCodeProps
import typingsSlinky.qrcodeDotReact.qrcodeDotReactMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(<union>))) was not a @ScalaJSDefined trait */
object QrcodeDotReact
  extends ExternalComponentWithAttributesWithRefType[tag.type, ^] {
  @JSImport("qrcode.react", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CanvasQRCodeProps | SvgQRCodeProps
}

