package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for enum properties, which allow you to define a restricted set of
  * strings to match user queries, set rankings for those string values, and
  * define an operator name to be paired with those strings so that users can
  * narrow results to only items with a specific value. For example, for items
  * in a request tracking system with priority information, you could define
  * *p0* as an allowable enum value and tie this enum to the operator name
  * *priority* so that search users could add *priority:p0* to their query to
  * restrict the set of results to only those items indexed with the value
  * *p0*.
  */
@js.native
trait SchemaEnumPropertyOptions extends StObject {
  
  /**
    * If set, describes how the enum should be used as a search operator.
    */
  var operatorOptions: js.UndefOr[SchemaEnumOperatorOptions] = js.native
  
  /**
    * Used to specify the ordered ranking for the enumeration that determines
    * how the integer values provided in the possible EnumValuePairs are used
    * to rank results. If specified, integer values must be provided for all
    * possible EnumValuePair values given for this property. Can only be used
    * if isRepeatable is false.
    */
  var orderedRanking: js.UndefOr[String] = js.native
  
  /**
    * The list of possible values for the enumeration property. All
    * EnumValuePairs must provide a string value. If you specify an integer
    * value for one EnumValuePair, then all possible EnumValuePairs must
    * provide an integer value. Both the string value and integer value must be
    * unique over all possible values. Once set, possible values cannot be
    * removed or modified. If you supply an ordered ranking and think you might
    * insert additional enum values in the future, leave gaps in the initial
    * integer values to allow adding a value in between previously registered
    * values. The maximum number of elements is 100.
    */
  var possibleValues: js.UndefOr[js.Array[SchemaEnumValuePair]] = js.native
}
object SchemaEnumPropertyOptions {
  
  @scala.inline
  def apply(): SchemaEnumPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnumPropertyOptions]
  }
  
  @scala.inline
  implicit class SchemaEnumPropertyOptionsMutableBuilder[Self <: SchemaEnumPropertyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOperatorOptions(value: SchemaEnumOperatorOptions): Self = StObject.set(x, "operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorOptionsUndefined: Self = StObject.set(x, "operatorOptions", js.undefined)
    
    @scala.inline
    def setOrderedRanking(value: String): Self = StObject.set(x, "orderedRanking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderedRankingUndefined: Self = StObject.set(x, "orderedRanking", js.undefined)
    
    @scala.inline
    def setPossibleValues(value: js.Array[SchemaEnumValuePair]): Self = StObject.set(x, "possibleValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPossibleValuesUndefined: Self = StObject.set(x, "possibleValues", js.undefined)
    
    @scala.inline
    def setPossibleValuesVarargs(value: SchemaEnumValuePair*): Self = StObject.set(x, "possibleValues", js.Array(value :_*))
  }
}
