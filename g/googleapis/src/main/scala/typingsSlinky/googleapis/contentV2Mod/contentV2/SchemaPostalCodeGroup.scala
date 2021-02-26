package typingsSlinky.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPostalCodeGroup extends StObject {
  
  /**
    * The CLDR territory code of the country the postal code group applies to.
    * Required.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The name of the postal code group, referred to in headers. Required.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * A range of postal codes. Required.
    */
  var postalCodeRanges: js.UndefOr[js.Array[SchemaPostalCodeRange]] = js.native
}
object SchemaPostalCodeGroup {
  
  @scala.inline
  def apply(): SchemaPostalCodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPostalCodeGroup]
  }
  
  @scala.inline
  implicit class SchemaPostalCodeGroupMutableBuilder[Self <: SchemaPostalCodeGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPostalCodeRanges(value: js.Array[SchemaPostalCodeRange]): Self = StObject.set(x, "postalCodeRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeRangesUndefined: Self = StObject.set(x, "postalCodeRanges", js.undefined)
    
    @scala.inline
    def setPostalCodeRangesVarargs(value: SchemaPostalCodeRange*): Self = StObject.set(x, "postalCodeRanges", js.Array(value :_*))
  }
}
