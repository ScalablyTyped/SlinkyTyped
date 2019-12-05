package typingsSlinky.atJimpTypes

import typingsSlinky.atJimpBmp.atJimpBmpMod.Bmp
import typingsSlinky.atJimpGif.atJimpGifMod.Gif
import typingsSlinky.atJimpJpeg.atJimpJpegMod.Jpeg
import typingsSlinky.atJimpPng.atJimpPngMod.PNG
import typingsSlinky.atJimpTiff.atJimpTiffMod.Tiff
import typingsSlinky.atJimpTypes.atJimpTypesMod.BmpRet
import typingsSlinky.atJimpTypes.atJimpTypesMod.GifRet
import typingsSlinky.atJimpTypes.atJimpTypesMod.JpegRet
import typingsSlinky.atJimpTypes.atJimpTypesMod.PngRet
import typingsSlinky.atJimpTypes.atJimpTypesMod.TiffRet
import typingsSlinky.atJimpTypes.atJimpTypesMod.Types
import typingsSlinky.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jimp/types", JSImport.Namespace)
@js.native
object atJimpTypesMod extends js.Object {
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

