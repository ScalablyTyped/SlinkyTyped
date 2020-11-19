package typingsSlinky.blueimpLoadImage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AspectRatio = scala.Double
  
  type Exif = org.scalablytyped.runtime.NumberDictionary[scala.Double | java.lang.String | js.Array[java.lang.String]]
  
  type Iptc = org.scalablytyped.runtime.NumberDictionary[scala.Double | java.lang.String | js.Array[java.lang.String]]
  
  type LoadImageCallback = js.Function2[
    /* eventOrImage */ org.scalajs.dom.raw.Event | org.scalajs.dom.raw.HTMLCanvasElement | org.scalajs.dom.raw.HTMLImageElement, 
    /* data */ js.UndefOr[typingsSlinky.blueimpLoadImage.mod.MetaData], 
    scala.Unit
  ]
  
  type LoadImageOptions = typingsSlinky.blueimpLoadImage.mod.BasicOptions with typingsSlinky.blueimpLoadImage.mod.CanvasOptions with typingsSlinky.blueimpLoadImage.mod.CropOptions with typingsSlinky.blueimpLoadImage.mod.MetaOptions
  
  type Orientation = scala.Double | scala.Boolean
  
  type ParseMetaDataCallback = js.Function1[/* data */ typingsSlinky.blueimpLoadImage.mod.ImageHead, scala.Unit]
}
