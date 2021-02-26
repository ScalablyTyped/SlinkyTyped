package typingsSlinky.layuiSrc.layui

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Util extends StObject {
  
  def countdown(
    endtime: js.Date,
    serverTime: js.Date,
    callback: js.Function3[/* date */ js.Any, /* serverTime */ Double | js.Date, /* timer */ js.Any, Unit]
  ): Unit = js.native
  def countdown(
    endtime: js.Date,
    serverTime: Double,
    callback: js.Function3[/* date */ js.Any, /* serverTime */ Double | js.Date, /* timer */ js.Any, Unit]
  ): Unit = js.native
  def countdown(
    endtime: Double,
    serverTime: js.Date,
    callback: js.Function3[/* date */ js.Any, /* serverTime */ Double | js.Date, /* timer */ js.Any, Unit]
  ): Unit = js.native
  def countdown(
    endtime: Double,
    serverTime: Double,
    callback: js.Function3[/* date */ js.Any, /* serverTime */ Double | js.Date, /* timer */ js.Any, Unit]
  ): Unit = js.native
  
  def digit(num: Double, length: Double): js.Any = js.native
  
  def escape(str: String): String = js.native
  
  def event(attr: String, obj: StringDictionary[js.Function0[Unit]]): js.Any = js.native
  
  def fixbar(option: UtilBarOption): Unit = js.native
  
  def timeAgo(time: js.Date, onlyDate: Boolean): js.Any = js.native
  def timeAgo(time: Double, onlyDate: Boolean): js.Any = js.native
  
  def toDateString(time: js.Date, format: String): js.Any = js.native
  def toDateString(time: Double, format: String): js.Any = js.native
}
