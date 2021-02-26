package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.windows.CreateData
import typingsSlinky.chrome.chrome.windows.GetInfo
import typingsSlinky.chrome.chrome.windows.UpdateInfo
import typingsSlinky.chrome.chrome.windows.WindowIdEvent
import typingsSlinky.chrome.chrome.windows.WindowReferenceEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofwindows extends StObject {
  
  var WINDOW_ID_CURRENT: Double = js.native
  
  var WINDOW_ID_NONE: Double = js.native
  
  def create(): Unit = js.native
  def create(callback: js.Function1[/* window */ js.UndefOr[this.type], Unit]): Unit = js.native
  def create(createData: CreateData): Unit = js.native
  def create(createData: CreateData, callback: js.Function1[/* window */ js.UndefOr[this.type], Unit]): Unit = js.native
  
  def get(windowId: Double, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  def get(windowId: Double, getInfo: GetInfo, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  
  def getAll(callback: js.Function1[/* windows */ js.Array[this.type], Unit]): Unit = js.native
  def getAll(getInfo: GetInfo, callback: js.Function1[/* windows */ js.Array[this.type], Unit]): Unit = js.native
  
  def getCurrent(callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  def getCurrent(getInfo: GetInfo, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  
  def getLastFocused(callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  def getLastFocused(getInfo: GetInfo, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
  
  var onCreated: WindowReferenceEvent = js.native
  
  var onFocusChanged: WindowIdEvent = js.native
  
  var onRemoved: WindowIdEvent = js.native
  
  def remove(windowId: Double): Unit = js.native
  def remove(windowId: Double, callback: js.Function): Unit = js.native
  
  def update(windowId: Double, updateInfo: UpdateInfo): Unit = js.native
  def update(windowId: Double, updateInfo: UpdateInfo, callback: js.Function1[/* window */ this.type, Unit]): Unit = js.native
}
