package typingsSlinky.reactImgix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def Background: slinky.core.ReactComponentClass[
    typingsSlinky.react.mod.PropsWithChildren[typingsSlinky.reactImgix.mod.BackgroundProps]
  ] = typingsSlinky.reactImgix.mod.^.asInstanceOf[js.Dynamic].selectDynamic("Background").asInstanceOf[slinky.core.ReactComponentClass[
    typingsSlinky.react.mod.PropsWithChildren[typingsSlinky.reactImgix.mod.BackgroundProps]
  ]]
  
  type Imgix = slinky.core.ReactComponentClass[typingsSlinky.reactImgix.mod.SharedImigixAndSourceProps]
  
  type ImgixHTMLAttributes = typingsSlinky.react.mod.ImgHTMLAttributes[org.scalajs.dom.raw.HTMLImageElement] | typingsSlinky.react.mod.SourceHTMLAttributes[org.scalajs.dom.raw.HTMLSourceElement] | (typingsSlinky.std.Record[java.lang.String, java.lang.String])
  
  type ImgixParamType = java.lang.String | scala.Double | scala.Boolean
  
  type ImigixParams = typingsSlinky.reactImgix.mod.AdjustmentParams with typingsSlinky.reactImgix.mod.AutomaticParams with typingsSlinky.reactImgix.mod.BlendingParams with typingsSlinky.reactImgix.mod.BorderAndPaddingParams with typingsSlinky.reactImgix.mod.ColorPaletteParams with typingsSlinky.reactImgix.mod.FaceDetectionParams with typingsSlinky.reactImgix.mod.FillParams with typingsSlinky.reactImgix.mod.FocalPointCropParams with typingsSlinky.reactImgix.mod.FormatParams with typingsSlinky.reactImgix.mod.MaskImageParams with typingsSlinky.reactImgix.mod.NoiseReductionParams with typingsSlinky.reactImgix.mod.PDFParams with typingsSlinky.reactImgix.mod.PixelDensityParams with typingsSlinky.reactImgix.mod.RotationParams with typingsSlinky.reactImgix.mod.SizeParams with typingsSlinky.reactImgix.mod.StylizeParams with typingsSlinky.reactImgix.mod.TextParams with typingsSlinky.reactImgix.mod.TrimParams with typingsSlinky.reactImgix.mod.TypesettingEndpointParams with typingsSlinky.reactImgix.mod.WatermarkParams
  
  @scala.inline
  def buildURL(src: java.lang.String): java.lang.String = typingsSlinky.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def buildURL(
    src: java.lang.String,
    imgixParams: js.UndefOr[scala.Nothing],
    options: typingsSlinky.reactImgix.mod.SharedImigixAndSourceProps
  ): java.lang.String = (typingsSlinky.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def buildURL(src: java.lang.String, imgixParams: typingsSlinky.reactImgix.mod.ImigixParams): java.lang.String = (typingsSlinky.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def buildURL(
    src: java.lang.String,
    imgixParams: typingsSlinky.reactImgix.mod.ImigixParams,
    options: typingsSlinky.reactImgix.mod.SharedImigixAndSourceProps
  ): java.lang.String = (typingsSlinky.reactImgix.mod.^.asInstanceOf[js.Dynamic].applyDynamic("buildURL")(src.asInstanceOf[js.Any], imgixParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
