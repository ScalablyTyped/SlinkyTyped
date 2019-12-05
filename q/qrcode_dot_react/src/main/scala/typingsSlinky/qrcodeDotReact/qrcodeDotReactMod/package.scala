package typingsSlinky.qrcodeDotReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object qrcodeDotReactMod {
  import org.scalajs.dom.raw.HTMLCanvasElement
  import org.scalajs.dom.raw.SVGSVGElement
  import slinky.core.ReactComponentClass
  import typingsSlinky.qrcodeDotReact.Anon_Canvas
  import typingsSlinky.qrcodeDotReact.Anon_RenderAs
  import typingsSlinky.react.reactMod.CanvasHTMLAttributes
  import typingsSlinky.react.reactMod.SVGProps

  type CanvasQRCodeProps = BaseQRCodeProps with Anon_Canvas with CanvasHTMLAttributes[HTMLCanvasElement]
  type QRCode = ReactComponentClass[CanvasQRCodeProps | SvgQRCodeProps]
  type SvgQRCodeProps = BaseQRCodeProps with Anon_RenderAs with SVGProps[SVGSVGElement]
}
