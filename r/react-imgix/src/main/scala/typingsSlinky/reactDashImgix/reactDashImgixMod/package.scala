package typingsSlinky.reactDashImgix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashImgixMod {
  import org.scalajs.dom.raw.HTMLImageElement
  import org.scalajs.dom.raw.HTMLSourceElement
  import slinky.core.ReactComponentClass
  import typingsSlinky.react.reactMod.ImgHTMLAttributes
  import typingsSlinky.react.reactMod.SourceHTMLAttributes

  type Imgix = ReactComponentClass[SharedImigixAndSourceProps]
  type ImgixHTMLAttributes = ImgHTMLAttributes[HTMLImageElement] | SourceHTMLAttributes[HTMLSourceElement]
  type ImgixParamType = String | Double | Boolean
  type ImigixParams = AdjustmentParams with AutomaticParams with BlendingParams with BorderAndPaddingParams with ColorPaletteParams with FaceDetectionParams with FillParams with FocalPointCropParams with FormatParams with MaskImageParams with NoiseReductionParams with PDFParams with PixelDensityParams with RotationParams with SizeParams with StylizeParams with TextParams with TrimParams with TypesettingEndpointParams with WatermarkParams
}
