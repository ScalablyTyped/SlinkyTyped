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

trait AnonMonthPicker[DateType] extends js.Object {
  var MonthPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ]
  ]
  var RangePicker: ReactComponentClass[RangePickerProps[DateType]]
  var TimePicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
    ]
  ]
  var WeekPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ]
  ]
  var YearPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
    ]
  ]
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
}

