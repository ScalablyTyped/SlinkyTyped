package typingsSlinky.antd

import slinky.core.ReactComponentClass
import typingsSlinky.antd.generatePickerMod.InjectDefaultProps
import typingsSlinky.antd.generatePickerMod.RangePickerProps
import typingsSlinky.rcPicker.pickerMod.PickerDateProps
import typingsSlinky.rcPicker.pickerMod.PickerTimeProps
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMonthPicker[DateType] extends js.Object {
  var MonthPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ]
  ] = js.native
  var RangePicker: ReactComponentClass[RangePickerProps[DateType]] = js.native
  var TimePicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
    ]
  ] = js.native
  var WeekPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ]
  ] = js.native
  var YearPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ]
  ] = js.native
}

object AnonMonthPicker {
  @scala.inline
  def apply[DateType](
    MonthPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ]
    ],
    RangePicker: ReactComponentClass[RangePickerProps[DateType]],
    TimePicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerTimeProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
      ]
    ],
    WeekPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ]
    ],
    YearPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ]
    ]
  ): AnonMonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMonthPicker[DateType]]
  }
  @scala.inline
  implicit class AnonMonthPickerOps[Self[datetype] <: AnonMonthPicker[datetype], DateType] (val x: Self[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self[DateType] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[DateType]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[DateType] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[DateType] with Other]
    @scala.inline
    def withMonthPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
          ]
        ]
    ): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRangePicker(value: ReactComponentClass[RangePickerProps[DateType]]): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RangePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimePicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerTimeProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
          ]
        ]
    ): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
          ]
        ]
    ): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WeekPicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
          ]
        ]
    ): Self[DateType] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("YearPicker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

