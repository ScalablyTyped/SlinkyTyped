package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.exceljsStrings.aboveAverage
import typingsSlinky.exceljs.exceljsStrings.cellIs
import typingsSlinky.exceljs.exceljsStrings.colorScale
import typingsSlinky.exceljs.exceljsStrings.containsText
import typingsSlinky.exceljs.exceljsStrings.dataBar
import typingsSlinky.exceljs.exceljsStrings.expression
import typingsSlinky.exceljs.exceljsStrings.iconSet
import typingsSlinky.exceljs.exceljsStrings.timePeriod
import typingsSlinky.exceljs.exceljsStrings.top10
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.exceljs.mod.ExpressionRuleType
  - typingsSlinky.exceljs.mod.CellIsRuleType
  - typingsSlinky.exceljs.mod.Top10RuleType
  - typingsSlinky.exceljs.mod.AboveAverageRuleType
  - typingsSlinky.exceljs.mod.ColorScaleRuleType
  - typingsSlinky.exceljs.mod.IconSetRuleType
  - typingsSlinky.exceljs.mod.ContainsTextRuleType
  - typingsSlinky.exceljs.mod.TimePeriodRuleType
  - typingsSlinky.exceljs.mod.DataBarRuleType
*/
trait ConditionalFormattingRule extends js.Object
object ConditionalFormattingRule {
  
  @scala.inline
  def ExpressionRuleType(priority: Double, `type`: expression): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  
  @scala.inline
  def TimePeriodRuleType(priority: Double, `type`: timePeriod): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  
  @scala.inline
  def ColorScaleRuleType(priority: Double, `type`: colorScale): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  
  @scala.inline
  def CellIsRuleType(priority: Double, `type`: cellIs): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  
  @scala.inline
  def ContainsTextRuleType(priority: Double, `type`: containsText): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  
  @scala.inline
  def AboveAverageRuleType(aboveAverage: Boolean, priority: Double, `type`: aboveAverage): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  
  @scala.inline
  def Top10RuleType(bottom: Boolean, percent: Boolean, priority: Double, rank: Double, `type`: top10): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  
  @scala.inline
  def IconSetRuleType(priority: Double, `type`: iconSet): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  
  @scala.inline
  def DataBarRuleType(priority: Double, `type`: dataBar): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
}
