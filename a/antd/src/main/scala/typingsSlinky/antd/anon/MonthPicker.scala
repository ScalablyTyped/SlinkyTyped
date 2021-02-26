package typingsSlinky.antd.anon

import slinky.core.ReactComponentClass
import typingsSlinky.antd.generatePickerMod.InjectDefaultProps
import typingsSlinky.antd.generatePickerMod.RangePickerProps
import typingsSlinky.rcPicker.pickerMod.PickerDateProps
import typingsSlinky.rcPicker.pickerMod.PickerTimeProps
import typingsSlinky.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonthPicker[DateType] extends StObject {
  
  var MonthPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ]
  ] = js.native
  
  var QuarterPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ]
  ] = js.native
  
  var RangePicker: ReactComponentClass[RangePickerProps[DateType]] = js.native
  
  var TimePicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerTimeProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
    ]
  ] = js.native
  
  var WeekPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ]
  ] = js.native
  
  var YearPicker: ReactComponentClass[
    Pick[
      InjectDefaultProps[PickerDateProps[DateType]], 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
    ]
  ] = js.native
}
object MonthPicker {
  
  @scala.inline
  def apply[DateType](
    MonthPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ]
    ],
    QuarterPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerTimeProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ]
    ],
    RangePicker: ReactComponentClass[RangePickerProps[DateType]],
    TimePicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerTimeProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
      ]
    ],
    WeekPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ]
    ],
    YearPicker: ReactComponentClass[
      Pick[
        InjectDefaultProps[PickerDateProps[DateType]], 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
      ]
    ]
  ): MonthPicker[DateType] = {
    val __obj = js.Dynamic.literal(MonthPicker = MonthPicker.asInstanceOf[js.Any], QuarterPicker = QuarterPicker.asInstanceOf[js.Any], RangePicker = RangePicker.asInstanceOf[js.Any], TimePicker = TimePicker.asInstanceOf[js.Any], WeekPicker = WeekPicker.asInstanceOf[js.Any], YearPicker = YearPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonthPicker[DateType]]
  }
  
  @scala.inline
  implicit class MonthPickerMutableBuilder[Self <: MonthPicker[_], DateType] (val x: Self with MonthPicker[DateType]) extends AnyVal {
    
    @scala.inline
    def setMonthPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "MonthPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuarterPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerTimeProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "QuarterPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangePicker(value: ReactComponentClass[RangePickerProps[DateType]]): Self = StObject.set(x, "RangePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimePicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerTimeProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 111 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "TimePicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "WeekPicker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearPicker(
      value: ReactComponentClass[
          Pick[
            InjectDefaultProps[PickerDateProps[DateType]], 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 102 */ js.Any
          ]
        ]
    ): Self = StObject.set(x, "YearPicker", value.asInstanceOf[js.Any])
  }
}
