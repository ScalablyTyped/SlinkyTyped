package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An optional setting on a PivotGroup that defines buckets for the values in
  * the source data column rather than breaking out each individual value. Only
  * one PivotGroup with a group rule may be added for each column in the source
  * data, though on any given column you may add both a PivotGroup that has a
  * rule and a PivotGroup that does not.
  */
@js.native
trait SchemaPivotGroupRule extends StObject {
  
  /**
    * A DateTimeRule.
    */
  var dateTimeRule: js.UndefOr[SchemaDateTimeRule] = js.native
  
  /**
    * A HistogramRule.
    */
  var histogramRule: js.UndefOr[SchemaHistogramRule] = js.native
  
  /**
    * A ManualRule.
    */
  var manualRule: js.UndefOr[SchemaManualRule] = js.native
}
object SchemaPivotGroupRule {
  
  @scala.inline
  def apply(): SchemaPivotGroupRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupRule]
  }
  
  @scala.inline
  implicit class SchemaPivotGroupRuleMutableBuilder[Self <: SchemaPivotGroupRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDateTimeRule(value: SchemaDateTimeRule): Self = StObject.set(x, "dateTimeRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateTimeRuleUndefined: Self = StObject.set(x, "dateTimeRule", js.undefined)
    
    @scala.inline
    def setHistogramRule(value: SchemaHistogramRule): Self = StObject.set(x, "histogramRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramRuleUndefined: Self = StObject.set(x, "histogramRule", js.undefined)
    
    @scala.inline
    def setManualRule(value: SchemaManualRule): Self = StObject.set(x, "manualRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManualRuleUndefined: Self = StObject.set(x, "manualRule", js.undefined)
  }
}
