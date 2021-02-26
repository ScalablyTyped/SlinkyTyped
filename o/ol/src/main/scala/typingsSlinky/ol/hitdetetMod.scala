package typingsSlinky.ol

import org.scalajs.dom.raw.ImageData
import typingsSlinky.ol.extentMod.Extent
import typingsSlinky.ol.olFeatureMod.FeatureLike
import typingsSlinky.ol.olMod.Transform
import typingsSlinky.ol.pixelMod.Pixel
import typingsSlinky.ol.sizeMod.Size
import typingsSlinky.ol.styleStyleMod.StyleFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hitdetetMod {
  
  @JSImport("ol/render/canvas/hitdetet", "createHitDetectionImageData")
  @js.native
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: js.UndefOr[scala.Nothing],
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = js.native
  @JSImport("ol/render/canvas/hitdetet", "createHitDetectionImageData")
  @js.native
  def createHitDetectionImageData(
    size: Size,
    transforms: js.Array[Transform],
    features: js.Array[FeatureLike],
    styleFunction: StyleFunction,
    extent: Extent,
    resolution: Double,
    rotation: Double
  ): ImageData = js.native
  
  @JSImport("ol/render/canvas/hitdetet", "hitDetect")
  @js.native
  def hitDetect(pixel: Pixel, features: js.Array[FeatureLike], imageData: ImageData): js.Array[FeatureLike] = js.native
}
