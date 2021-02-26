package typingsSlinky.jimpTiff

import typingsSlinky.jimpTiff.anon.Imagetiff
import typingsSlinky.jimpTiff.anon.ImagetiffDecoderFn
import typingsSlinky.jimpTiff.anon.ImagetiffEncoderFn
import typingsSlinky.jimpTiff.anon.MIMETIFF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jimp/tiff", JSImport.Default)
  @js.native
  def default(): Tiff = js.native
  
  @js.native
  trait Tiff extends StObject {
    
    var constants: MIMETIFF = js.native
    
    var decoders: ImagetiffDecoderFn = js.native
    
    var encoders: ImagetiffEncoderFn = js.native
    
    var mime: Imagetiff = js.native
  }
  object Tiff {
    
    @scala.inline
    def apply(constants: MIMETIFF, decoders: ImagetiffDecoderFn, encoders: ImagetiffEncoderFn, mime: Imagetiff): Tiff = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], decoders = decoders.asInstanceOf[js.Any], encoders = encoders.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tiff]
    }
    
    @scala.inline
    implicit class TiffMutableBuilder[Self <: Tiff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstants(value: MIMETIFF): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecoders(value: ImagetiffDecoderFn): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncoders(value: ImagetiffEncoderFn): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: Imagetiff): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
}
