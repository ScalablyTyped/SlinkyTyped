package typingsSlinky.antdMobile

import typingsSlinky.antdMobile.anon.AntLocale
import typingsSlinky.antdMobile.anon.TimePickerPickerPrefixCls
import typingsSlinky.antdMobile.calendarPropsTypeMod.CalendarProps
import typingsSlinky.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calendarMod {
  
  @JSImport("antd-mobile/lib/calendar", JSImport.Default)
  @js.native
  class default () extends Calendar
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/calendar", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/calendar", "default.contextTypes")
    @js.native
    def contextTypes: AntLocale = js.native
    @scala.inline
    def contextTypes_=(x: AntLocale): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/calendar", "default.defaultProps")
    @js.native
    def defaultProps: TimePickerPickerPrefixCls = js.native
    @scala.inline
    def defaultProps_=(x: TimePickerPickerPrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Calendar
    extends Component[CalendarProps, js.Any, js.Any]
}
