package typingsSlinky.forgeApis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAdsRegion extends StObject {
  
  var xAdsRegion: js.UndefOr[String] = js.native
}
object XAdsRegion {
  
  @scala.inline
  def apply(): XAdsRegion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XAdsRegion]
  }
  
  @scala.inline
  implicit class XAdsRegionMutableBuilder[Self <: XAdsRegion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setXAdsRegion(value: String): Self = StObject.set(x, "xAdsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAdsRegionUndefined: Self = StObject.set(x, "xAdsRegion", js.undefined)
  }
}
