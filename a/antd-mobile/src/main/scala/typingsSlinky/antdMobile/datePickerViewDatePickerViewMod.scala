package typingsSlinky.antdMobile

import typingsSlinky.antdMobile.anon.AntLocale
import typingsSlinky.antdMobile.anon.Extra
import typingsSlinky.antdMobile.datePickerViewPropsTypeMod.DatePickerProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerViewDatePickerViewMod {
  
  @JSImport("antd-mobile/lib/date-picker-view/date-picker-view", JSImport.Default)
  @js.native
  class default () extends DatePickerView
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/date-picker-view/date-picker-view", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/date-picker-view/date-picker-view", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/date-picker-view/date-picker-view", "default.defaultProps")
    @js.native
    def defaultProps: Extra = js.native
    @scala.inline
    def defaultProps_=(x: Extra): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DatePickerView
    extends Component[DatePickerProps, js.Any, js.Any]
}
