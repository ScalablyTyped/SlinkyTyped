package typingsSlinky.jimpJpeg

import typingsSlinky.jimpCore.etcMod.ImageCallback
import typingsSlinky.jimpJpeg.anon.Imagejpeg
import typingsSlinky.jimpJpeg.anon.ImagejpegDecoderFn
import typingsSlinky.jimpJpeg.anon.ImagejpegEncoderFn
import typingsSlinky.jimpJpeg.anon.MIMEJPEG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/jpeg", JSImport.Default)
  @js.native
  def default(): Jpeg = js.native
  
  @js.native
  trait Jpeg extends StObject {
    
    var `class`: JpegClass = js.native
    
    var constants: MIMEJPEG = js.native
    
    var decoders: ImagejpegDecoderFn = js.native
    
    var encoders: ImagejpegEncoderFn = js.native
    
    var mime: Imagejpeg = js.native
  }
  object Jpeg {
    
    @scala.inline
    def apply(
      `class`: JpegClass,
      constants: MIMEJPEG,
      decoders: ImagejpegDecoderFn,
      encoders: ImagejpegEncoderFn,
      mime: Imagejpeg
    ): Jpeg = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Jpeg]
    }
    
    @scala.inline
    implicit class JpegMutableBuilder[Self <: Jpeg] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: JpegClass): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstants(value: MIMEJPEG): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoders(value: ImagejpegDecoderFn): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoders(value: ImagejpegEncoderFn): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: Imagejpeg): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JpegClass extends StObject {
    
    var _quality: Double = js.native
    
    def quality(n: Double): this.type = js.native
    def quality(n: Double, cb: ImageCallback[this.type]): this.type = js.native
  }
}
