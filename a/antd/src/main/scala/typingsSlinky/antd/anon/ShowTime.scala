package typingsSlinky.antd.anon

import typingsSlinky.rcPicker.timePanelMod.SharedTimeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowTime[DateType] extends StObject {
  
  var showTime: SharedTimeProps[DateType] = js.native
}
object ShowTime {
  
  @scala.inline
  def apply[DateType](showTime: SharedTimeProps[DateType]): ShowTime[DateType] = {
    val __obj = js.Dynamic.literal(showTime = showTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowTime[DateType]]
  }
  
  @scala.inline
  implicit class ShowTimeMutableBuilder[Self <: ShowTime[_], DateType] (val x: Self with ShowTime[DateType]) extends AnyVal {
    
    @scala.inline
    def setShowTime(value: SharedTimeProps[DateType]): Self = StObject.set(x, "showTime", value.asInstanceOf[js.Any])
  }
}
