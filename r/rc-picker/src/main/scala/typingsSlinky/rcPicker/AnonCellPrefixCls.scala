package typingsSlinky.rcPicker

import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.NullableDateType
import typingsSlinky.rcPicker.interfaceMod.RangeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCellPrefixCls[DateType] extends js.Object {
  var cellPrefixCls: String = js.native
  var generateConfig: GenerateConfig[DateType] = js.native
  var hoverRangedValue: js.UndefOr[RangeValue[DateType]] = js.native
  var rangedValue: js.UndefOr[RangeValue[DateType]] = js.native
  var today: js.UndefOr[NullableDateType[DateType]] = js.native
  var value: js.UndefOr[NullableDateType[DateType]] = js.native
  def isInView(date: DateType): Boolean = js.native
  def isSameCell(current: NullableDateType[DateType], target: NullableDateType[DateType]): Boolean = js.native
  def offsetCell(date: DateType, offset: Double): DateType = js.native
}

object AnonCellPrefixCls {
  @scala.inline
  def apply[DateType](
    cellPrefixCls: String,
    generateConfig: GenerateConfig[DateType],
    isInView: DateType => Boolean,
    isSameCell: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean,
    offsetCell: (DateType, Double) => DateType
  ): AnonCellPrefixCls[DateType] = {
    val __obj = js.Dynamic.literal(cellPrefixCls = cellPrefixCls.asInstanceOf[js.Any], generateConfig = generateConfig.asInstanceOf[js.Any], isInView = js.Any.fromFunction1(isInView), isSameCell = js.Any.fromFunction2(isSameCell), offsetCell = js.Any.fromFunction2(offsetCell))
    __obj.asInstanceOf[AnonCellPrefixCls[DateType]]
  }
  @scala.inline
  implicit class AnonCellPrefixClsOps[Self[datetype] <: AnonCellPrefixCls[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withCellPrefixCls(value: String): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cellPrefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGenerateConfig(value: GenerateConfig[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("generateConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsInView(value: DateType => Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInView")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsSameCell(value: (NullableDateType[DateType], NullableDateType[DateType]) => Boolean): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOffsetCell(value: (DateType, Double) => DateType): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetCell")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHoverRangedValue(value: RangeValue[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRangedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverRangedValue: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRangedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverRangedValueNull: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverRangedValue")(null)
        ret
    }
    @scala.inline
    def withRangedValue(value: RangeValue[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangedValue: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedValue")(js.undefined)
        ret
    }
    @scala.inline
    def withRangedValueNull: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangedValue")(null)
        ret
    }
    @scala.inline
    def withToday(value: NullableDateType[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToday: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayNull: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(null)
        ret
    }
    @scala.inline
    def withValue(value: NullableDateType[DateType]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withValueNull: Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

