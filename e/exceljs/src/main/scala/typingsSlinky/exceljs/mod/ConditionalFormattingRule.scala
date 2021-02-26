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
import org.scalablytyped.runtime.StObject
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
trait ConditionalFormattingRule extends StObject
object ConditionalFormattingRule {
  
  @scala.inline
  def AboveAverageRuleType(aboveAverage: Boolean, priority: Double, `type`: aboveAverage): typingsSlinky.exceljs.mod.AboveAverageRuleType = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.AboveAverageRuleType]
  }
  
  @scala.inline
  def CellIsRuleType(priority: Double, `type`: cellIs): typingsSlinky.exceljs.mod.CellIsRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.CellIsRuleType]
  }
  
  @scala.inline
  def ColorScaleRuleType(priority: Double, `type`: colorScale): typingsSlinky.exceljs.mod.ColorScaleRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.ColorScaleRuleType]
  }
  
  @scala.inline
  def ContainsTextRuleType(priority: Double, `type`: containsText): typingsSlinky.exceljs.mod.ContainsTextRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.ContainsTextRuleType]
  }
  
  @scala.inline
  def DataBarRuleType(priority: Double, `type`: dataBar): typingsSlinky.exceljs.mod.DataBarRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.DataBarRuleType]
  }
  
  @scala.inline
  def ExpressionRuleType(priority: Double, `type`: expression): typingsSlinky.exceljs.mod.ExpressionRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.ExpressionRuleType]
  }
  
  @scala.inline
  def IconSetRuleType(priority: Double, `type`: iconSet): typingsSlinky.exceljs.mod.IconSetRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.IconSetRuleType]
  }
  
  @scala.inline
  def TimePeriodRuleType(priority: Double, `type`: timePeriod): typingsSlinky.exceljs.mod.TimePeriodRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.TimePeriodRuleType]
  }
  
  @scala.inline
  def Top10RuleType(bottom: Boolean, percent: Boolean, priority: Double, rank: Double, `type`: top10): typingsSlinky.exceljs.mod.Top10RuleType = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.exceljs.mod.Top10RuleType]
  }
}
