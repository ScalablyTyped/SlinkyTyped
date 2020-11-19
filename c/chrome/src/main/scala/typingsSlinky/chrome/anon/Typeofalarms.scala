package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.alarms.Alarm
import typingsSlinky.chrome.chrome.alarms.AlarmCreateInfo
import typingsSlinky.chrome.chrome.alarms.AlarmEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofalarms extends js.Object {
  
  def clear(): Unit = js.native
  def clear(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def clear(name: js.UndefOr[scala.Nothing], callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def clear(name: String): Unit = js.native
  def clear(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
  def create(alarmInfo: AlarmCreateInfo): Unit = js.native
  def create(name: String, alarmInfo: AlarmCreateInfo): Unit = js.native
  
  def get(callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  def get(name: String, callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  
  def getAll(callback: js.Function1[/* alarms */ js.Array[Alarm], Unit]): Unit = js.native
  
  var onAlarm: AlarmEvent = js.native
}
