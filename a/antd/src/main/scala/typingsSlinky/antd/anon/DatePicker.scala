package typingsSlinky.antd.anon

import slinky.core.ReactComponentClass
import typingsSlinky.antd.generatePickerMod.PickerProps
import typingsSlinky.rcPicker.pickerMod.PickerDateProps
import typingsSlinky.rcPicker.pickerMod.PickerTimeProps
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatePicker[DateType] extends js.Object {
  var DatePicker: ReactComponentClass[PickerProps[DateType]]
  var MonthPicker: ReactComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ]) with BorderedLocale, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
    ]
  ]
  var TimePicker: ReactComponentClass[
    Pick[
      (Pick[
        PickerTimeProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
      ]) with BorderedLocale, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
    ]
  ]
  var WeekPicker: ReactComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ]) with BorderedLocale, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
    ]
  ]
  var YearPicker: ReactComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
      ]) with BorderedLocale, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
    ]
  ]
}

object DatePicker {
  @scala.inline
  def apply[DateType](
    DatePicker: ReactComponentClass[PickerProps[DateType]],
    MonthPicker: ReactComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
        ]) with BorderedLocale, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]
    ],
    TimePicker: ReactComponentClass[
      Pick[
        (Pick[
          PickerTimeProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 107 */ js.Any
        ]) with BorderedLocale, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
      ]
    ],
    WeekPicker: ReactComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
        ]) with BorderedLocale, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]
    ],
    YearPicker: ReactComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 98 */ js.Any
        ]) with BorderedLocale, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]
    ]
  ): DatePicker[DateType] = {
    val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], MonthPicker = MonthPicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker[DateType]]
  }
}

