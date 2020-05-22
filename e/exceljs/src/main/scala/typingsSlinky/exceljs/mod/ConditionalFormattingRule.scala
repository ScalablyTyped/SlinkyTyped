package typingsSlinky.exceljs.mod

import typingsSlinky.exceljs.anon.PartialColor
import typingsSlinky.exceljs.anon.PartialStyle
import typingsSlinky.exceljs.exceljsStrings.aboveAverage
import typingsSlinky.exceljs.exceljsStrings.auto
import typingsSlinky.exceljs.exceljsStrings.cellIs
import typingsSlinky.exceljs.exceljsStrings.colorScale
import typingsSlinky.exceljs.exceljsStrings.containsText
import typingsSlinky.exceljs.exceljsStrings.context
import typingsSlinky.exceljs.exceljsStrings.dataBar
import typingsSlinky.exceljs.exceljsStrings.expression
import typingsSlinky.exceljs.exceljsStrings.iconSet
import typingsSlinky.exceljs.exceljsStrings.leftToRight
import typingsSlinky.exceljs.exceljsStrings.middle
import typingsSlinky.exceljs.exceljsStrings.none_
import typingsSlinky.exceljs.exceljsStrings.rightToLeft
import typingsSlinky.exceljs.exceljsStrings.timePeriod
import typingsSlinky.exceljs.exceljsStrings.top10
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def ExpressionRuleType(priority: Double, `type`: expression, formulae: js.Array[_] = null, style: PartialStyle = null): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (formulae != null) __obj.updateDynamic("formulae")(formulae.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def TimePeriodRuleType(
    priority: Double,
    `type`: timePeriod,
    style: PartialStyle = null,
    timePeriod: TimePeriodTypes = null
  ): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (timePeriod != null) __obj.updateDynamic("timePeriod")(timePeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def ColorScaleRuleType(
    priority: Double,
    `type`: colorScale,
    cfvo: js.Array[Cvfo] = null,
    color: PartialColor = null,
    style: PartialStyle = null
  ): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cfvo != null) __obj.updateDynamic("cfvo")(cfvo.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def CellIsRuleType(
    priority: Double,
    `type`: cellIs,
    formulae: js.Array[_] = null,
    operator: CellIsOperators = null,
    style: PartialStyle = null
  ): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (formulae != null) __obj.updateDynamic("formulae")(formulae.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def ContainsTextRuleType(
    priority: Double,
    `type`: containsText,
    operator: ContainsTextOperators = null,
    style: PartialStyle = null,
    text: String = null
  ): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (operator != null) __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def AboveAverageRuleType(aboveAverage: Boolean, priority: Double, `type`: aboveAverage, style: PartialStyle = null): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(aboveAverage = aboveAverage.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def Top10RuleType(
    bottom: Boolean,
    percent: Boolean,
    priority: Double,
    rank: Double,
    `type`: top10,
    style: PartialStyle = null
  ): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def IconSetRuleType(
    priority: Double,
    `type`: iconSet,
    cfvo: js.Array[Cvfo] = null,
    custom: js.UndefOr[Boolean] = js.undefined,
    iconSet: IconSetTypes = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    style: PartialStyle = null
  ): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cfvo != null) __obj.updateDynamic("cfvo")(cfvo.asInstanceOf[js.Any])
    if (!js.isUndefined(custom)) __obj.updateDynamic("custom")(custom.get.asInstanceOf[js.Any])
    if (iconSet != null) __obj.updateDynamic("iconSet")(iconSet.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
  @scala.inline
  def DataBarRuleType(
    priority: Double,
    `type`: dataBar,
    axisPosition: auto | middle | none_ = null,
    border: js.UndefOr[Boolean] = js.undefined,
    cfvo: js.Array[Cvfo] = null,
    direction: context | leftToRight | rightToLeft = null,
    gradient: js.UndefOr[Boolean] = js.undefined,
    maxLength: js.UndefOr[Double] = js.undefined,
    minLength: js.UndefOr[Double] = js.undefined,
    negativeBarBorderColorSameAsPositive: js.UndefOr[Boolean] = js.undefined,
    negativeBarColorSameAsPositive: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    style: PartialStyle = null
  ): ConditionalFormattingRule = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (axisPosition != null) __obj.updateDynamic("axisPosition")(axisPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(border)) __obj.updateDynamic("border")(border.get.asInstanceOf[js.Any])
    if (cfvo != null) __obj.updateDynamic("cfvo")(cfvo.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (!js.isUndefined(gradient)) __obj.updateDynamic("gradient")(gradient.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxLength)) __obj.updateDynamic("maxLength")(maxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minLength)) __obj.updateDynamic("minLength")(minLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negativeBarBorderColorSameAsPositive)) __obj.updateDynamic("negativeBarBorderColorSameAsPositive")(negativeBarBorderColorSameAsPositive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(negativeBarColorSameAsPositive)) __obj.updateDynamic("negativeBarColorSameAsPositive")(negativeBarColorSameAsPositive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingRule]
  }
}

