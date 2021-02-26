package typingsSlinky.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DimensionValues extends StObject {
  
  /**
    * The names of the metadata types that you can use to filter and group your results. For example, AZ returns a list of Availability Zones.
    */
  var Key: js.UndefOr[Dimension] = js.native
  
  /**
    * The match options that you can use to filter your results. MatchOptions is only applicable for actions related to Cost Category. The default values for MatchOptions are EQUALS and CASE_SENSITIVE.
    */
  var MatchOptions: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.MatchOptions] = js.native
  
  /**
    * The metadata values that you can use to filter and group your results. You can use GetDimensionValues to find specific values.
    */
  var Values: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Values] = js.native
}
object DimensionValues {
  
  @scala.inline
  def apply(): DimensionValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValues]
  }
  
  @scala.inline
  implicit class DimensionValuesMutableBuilder[Self <: DimensionValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Dimension): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setMatchOptions(value: MatchOptions): Self = StObject.set(x, "MatchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchOptionsUndefined: Self = StObject.set(x, "MatchOptions", js.undefined)
    
    @scala.inline
    def setMatchOptionsVarargs(value: MatchOption*): Self = StObject.set(x, "MatchOptions", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
