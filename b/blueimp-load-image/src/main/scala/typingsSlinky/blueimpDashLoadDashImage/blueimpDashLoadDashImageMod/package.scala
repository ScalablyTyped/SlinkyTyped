package typingsSlinky.blueimpDashLoadDashImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object blueimpDashLoadDashImageMod {
  import org.scalablytyped.runtime.NumberDictionary
  import org.scalajs.dom.raw.HTMLCanvasElement
  import org.scalajs.dom.raw.HTMLImageElement

  type AspectRatio = Double
  type Exif = NumberDictionary[Double | String | js.Array[String]]
  type Iptc = NumberDictionary[Double | String | js.Array[String]]
  type LoadImageCallback = js.Function2[
    /* image */ HTMLCanvasElement | HTMLImageElement, 
    /* data */ js.UndefOr[MetaData], 
    Unit
  ]
  type LoadImageOptions = BasicOptions with CanvasOptions with CropOptions with MetaOptions
  type Orientation = Double | Boolean
  type ParseMetaDataCallback = js.Function1[/* data */ ImageHead, Unit]
}
