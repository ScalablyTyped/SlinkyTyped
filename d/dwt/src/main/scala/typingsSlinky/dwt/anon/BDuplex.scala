package typingsSlinky.dwt.anon

import typingsSlinky.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPixelType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BDuplex extends StObject {
  
  /**
    * Whether to enable duplex scan.
    */
  var bDuplex: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether to enable document feader.
    */
  var bFeeder: js.UndefOr[Boolean] = js.native
  
  /**
    * "ignore" (default) or "fail".
    */
  var exception: js.UndefOr[String] = js.native
  
  /**
    * Specify the pixel type.
    */
  var pixelType: js.UndefOr[EnumDWTPixelType | Double] = js.native
  
  /**
    * Specify the resolution.
    */
  var resolution: js.UndefOr[Double] = js.native
}
object BDuplex {
  
  @scala.inline
  def apply(): BDuplex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BDuplex]
  }
  
  @scala.inline
  implicit class BDuplexMutableBuilder[Self <: BDuplex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBDuplex(value: Boolean): Self = StObject.set(x, "bDuplex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBDuplexUndefined: Self = StObject.set(x, "bDuplex", js.undefined)
    
    @scala.inline
    def setBFeeder(value: Boolean): Self = StObject.set(x, "bFeeder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBFeederUndefined: Self = StObject.set(x, "bFeeder", js.undefined)
    
    @scala.inline
    def setException(value: String): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setPixelType(value: EnumDWTPixelType | Double): Self = StObject.set(x, "pixelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelTypeUndefined: Self = StObject.set(x, "pixelType", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
