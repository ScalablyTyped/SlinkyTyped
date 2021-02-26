package typingsSlinky.antd.anon

import slinky.core.ReactComponentClass
import typingsSlinky.antd.generatePickerMod.PickerProps
import typingsSlinky.rcPicker.pickerMod.PickerDateProps
import typingsSlinky.rcPicker.pickerMod.PickerTimeProps
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatePicker[DateType] extends StObject {
  
  var DatePicker: ReactComponentClass[PickerProps[DateType]] = js.native
  
  var MonthPicker: ReactComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ]
  ] = js.native
  
  var QuarterPicker: ReactComponentClass[
    Pick[
      (Pick[
        PickerTimeProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ]
  ] = js.native
  
  var TimePicker: ReactComponentClass[
    Pick[
      (Pick[
        PickerTimeProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ]
  ] = js.native
  
  var WeekPicker: ReactComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ]
  ] = js.native
  
  var YearPicker: ReactComponentClass[
    Pick[
      (Pick[
        PickerDateProps[DateType], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
      ]) with Bordered, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ]
  ] = js.native
}
object DatePicker {
  
  @scala.inline
  def apply[DateType](
    DatePicker: ReactComponentClass[PickerProps[DateType]],
    MonthPicker: ReactComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ]
    ],
    QuarterPicker: ReactComponentClass[
      Pick[
        (Pick[
          PickerTimeProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ]
    ],
    TimePicker: ReactComponentClass[
      Pick[
        (Pick[
          PickerTimeProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ]
    ],
    WeekPicker: ReactComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ]
    ],
    YearPicker: ReactComponentClass[
      Pick[
        (Pick[
          PickerDateProps[DateType], 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
        ]) with Bordered, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ]
    ]
  ): DatePicker[DateType] = {
    val __obj = js.Dynamic.literal(DatePicker = DatePicker.asInstanceOf[js.Any], MonthPicker = MonthPicker.asInstanceOf[js.Any], QuarterPicker = QuarterPicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePicker[DateType]]
  }
  
  @scala.inline
  implicit class DatePickerMutableBuilder[Self <: DatePicker[_], DateType] (val x: Self with DatePicker[DateType]) extends AnyVal {
    
    @scala.inline
    def setDatePicker(value: ReactComponentClass[PickerProps[DateType]]): Self = StObject.set(x, "DatePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonthPicker(
      value: ReactComponentClass[
          Pick[
            (Pick[
              PickerDateProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "MonthPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuarterPicker(
      value: ReactComponentClass[
          Pick[
            (Pick[
              PickerTimeProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "QuarterPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePicker(
      value: ReactComponentClass[
          Pick[
            (Pick[
              PickerTimeProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 109 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "TimePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekPicker(
      value: ReactComponentClass[
          Pick[
            (Pick[
              PickerDateProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "WeekPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearPicker(
      value: ReactComponentClass[
          Pick[
            (Pick[
              PickerDateProps[DateType], 
              /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
            ]) with Bordered, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "YearPicker", value.asInstanceOf[js.Any])
  }
}
