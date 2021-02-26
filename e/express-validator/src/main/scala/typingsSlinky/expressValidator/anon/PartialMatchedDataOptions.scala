package typingsSlinky.expressValidator.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<express-validator.express-validator/src/matched-data.MatchedDataOptions> */
@js.native
trait PartialMatchedDataOptions extends StObject {
  
  var includeOptionals: js.UndefOr[Boolean] = js.native
  
  var locations: js.UndefOr[js.Array[typingsSlinky.expressValidator.baseMod.Location]] = js.native
  
  var onlyValidData: js.UndefOr[Boolean] = js.native
}
object PartialMatchedDataOptions {
  
  @scala.inline
  def apply(): PartialMatchedDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMatchedDataOptions]
  }
  
  @scala.inline
  implicit class PartialMatchedDataOptionsMutableBuilder[Self <: PartialMatchedDataOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeOptionals(value: Boolean): Self = StObject.set(x, "includeOptionals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeOptionalsUndefined: Self = StObject.set(x, "includeOptionals", js.undefined)
    
    @scala.inline
    def setLocations(value: js.Array[typingsSlinky.expressValidator.baseMod.Location]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: typingsSlinky.expressValidator.baseMod.Location*): Self = StObject.set(x, "locations", js.Array(value :_*))
    
    @scala.inline
    def setOnlyValidData(value: Boolean): Self = StObject.set(x, "onlyValidData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyValidDataUndefined: Self = StObject.set(x, "onlyValidData", js.undefined)
  }
}
