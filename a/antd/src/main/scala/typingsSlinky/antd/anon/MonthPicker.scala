package typingsSlinky.antd.anon

import slinky.core.ReactComponentClass
import typingsSlinky.antd.generatePickerMod.InjectDefaultProps
import typingsSlinky.antd.generatePickerMod.RangePickerProps
import typingsSlinky.rcPicker.pickerMod.PickerDateProps
import typingsSlinky.rcPicker.pickerMod.PickerTimeProps
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonthPicker[DateType] extends js.Object {
  var MonthPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
    ]
  ]
  var RangePicker: ReactComponentClass[RangePickerProps[DateType]]
  var TimePicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 110 */ js.Any
    ]
  ]
  var WeekPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
    ]
  ]
  var YearPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
    ]
  ]
}

object MonthPicker {
  @scala.inline
  def apply[DateType](
    MonthPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
      ]
    ],
    RangePicker: ReactComponentClass[RangePickerProps[DateType]],
    TimePicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerTimeProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 110 */ js.Any
      ]
    ],
    WeekPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
      ]
    ],
    YearPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
      ]
    ]
  ): MonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthPicker[DateType]]
  }
  @scala.inline
  implicit class MonthPickerOps[Self <: MonthPicker[_], DateType] (val x: Self with MonthPicker[DateType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMonthPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
          ]
        ]
    ): Self = this.set("MonthPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setRangePicker(value: ReactComponentClass[RangePickerProps[DateType]]): Self = this.set("RangePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimePicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerTimeProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 110 */ js.Any
          ]
        ]
    ): Self = this.set("TimePicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setWeekPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
          ]
        ]
    ): Self = this.set("WeekPicker", value.asInstanceOf[js.Any])
    @scala.inline
    def setYearPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 101 */ js.Any
          ]
        ]
    ): Self = this.set("YearPicker", value.asInstanceOf[js.Any])
  }
  
}

