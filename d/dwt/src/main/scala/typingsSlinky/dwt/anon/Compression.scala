package typingsSlinky.dwt.anon

import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTTIFFCompressionType
import typingsSlinky.dwt.webTwainAcquireMod.TiffTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Compression extends StObject {
  
  var compression: js.UndefOr[EnumDWTTIFFCompressionType | Double] = js.native
  
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * Specify Tiff custom tags.
    */
  var tiffTags: js.UndefOr[js.Array[TiffTag]] = js.native
}
object Compression {
  
  @scala.inline
  def apply(): Compression = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Compression]
  }
  
  @scala.inline
  implicit class CompressionMutableBuilder[Self <: Compression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompression(value: EnumDWTTIFFCompressionType | Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setTiffTags(value: js.Array[TiffTag]): Self = StObject.set(x, "tiffTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiffTagsUndefined: Self = StObject.set(x, "tiffTags", js.undefined)
    
    @scala.inline
    def setTiffTagsVarargs(value: TiffTag*): Self = StObject.set(x, "tiffTags", js.Array(value :_*))
  }
}
