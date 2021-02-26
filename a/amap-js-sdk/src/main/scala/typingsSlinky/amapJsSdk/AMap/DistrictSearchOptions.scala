package typingsSlinky.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistrictSearchOptions extends StObject {
  
  var extensions: js.UndefOr[String] = js.native
  
  var level: String = js.native
  
  var showbiz: js.UndefOr[Boolean] = js.native
  
  var subdistrict: js.UndefOr[Double] = js.native
}
object DistrictSearchOptions {
  
  @scala.inline
  def apply(level: String): DistrictSearchOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictSearchOptions]
  }
  
  @scala.inline
  implicit class DistrictSearchOptionsMutableBuilder[Self <: DistrictSearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowbiz(value: Boolean): Self = StObject.set(x, "showbiz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowbizUndefined: Self = StObject.set(x, "showbiz", js.undefined)
    
    @scala.inline
    def setSubdistrict(value: Double): Self = StObject.set(x, "subdistrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdistrictUndefined: Self = StObject.set(x, "subdistrict", js.undefined)
  }
}
