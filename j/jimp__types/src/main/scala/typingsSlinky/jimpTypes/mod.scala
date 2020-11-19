package typingsSlinky.jimpTypes

import typingsSlinky.jimpBmp.mod.Bmp
import typingsSlinky.jimpGif.mod.Gif
import typingsSlinky.jimpJpeg.mod.Jpeg
import typingsSlinky.jimpPng.mod.PNG
import typingsSlinky.jimpTiff.mod.Tiff
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jimp/types", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Types = js.native
  
  type BmpRet = ReturnType[js.Function0[Bmp]]
  
  type GifRet = ReturnType[js.Function0[Gif]]
  
  type JpegRet = ReturnType[js.Function0[Jpeg]]
  
  type PngRet = ReturnType[js.Function0[PNG]]
  
  type TiffRet = ReturnType[js.Function0[Tiff]]
  
  /**
    * This is made union and not intersection to avoid issues with
    * `IllformedPlugin` and `WellFormedPlugin` when using typings with Jimp
    * generic
    *
    * In reality, this should be an intersection but our type data isn't
    * clever enough to figure out what's a class and what's not/etc
    */
  type Types = JpegRet | PngRet | BmpRet | TiffRet | GifRet
}
