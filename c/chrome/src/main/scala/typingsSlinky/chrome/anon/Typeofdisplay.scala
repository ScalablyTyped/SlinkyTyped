package typingsSlinky.chrome.anon

import typingsSlinky.chrome.chrome.events.Event
import typingsSlinky.chrome.chrome.system.display.Bounds
import typingsSlinky.chrome.chrome.system.display.DisplayInfo
import typingsSlinky.chrome.chrome.system.display.DisplayInfoFlags
import typingsSlinky.chrome.chrome.system.display.DisplayLayout
import typingsSlinky.chrome.chrome.system.display.DisplayPropertiesInfo
import typingsSlinky.chrome.chrome.system.display.Insets
import typingsSlinky.chrome.chrome.system.display.MirrorModeInfo
import typingsSlinky.chrome.chrome.system.display.MirrorModeInfoMixed
import typingsSlinky.chrome.chrome.system.display.TouchCalibrationPairs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofdisplay extends StObject {
  
  val DisplayPosition: BOTTOM = js.native
  
  val MirrorMode: MIXED = js.native
  
  def clearTouchCalibration(id: String): Unit = js.native
  
  def completeCustomTouchCalibration(pairs: TouchCalibrationPairs, bounds: Bounds): Unit = js.native
  
  def enableUnifiedDesktop(enabled: Boolean): Unit = js.native
  
  def getDisplayLayout(callback: js.Function1[/* layouts */ js.Array[DisplayLayout], Unit]): Unit = js.native
  
  def getInfo(callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
  def getInfo(flags: DisplayInfoFlags, callback: js.Function1[/* info */ js.Array[DisplayInfo], Unit]): Unit = js.native
  
  val onDisplayChanged: Event[js.Function0[Unit]] = js.native
  
  def overscanCalibrationAdjust(id: String, delta: Insets): Unit = js.native
  
  def overscanCalibrationComplete(id: String): Unit = js.native
  
  def overscanCalibrationReset(id: String): Unit = js.native
  
  def overscanCalibrationStart(id: String): Unit = js.native
  
  def setDisplayLayout(layouts: js.Array[DisplayLayout]): Unit = js.native
  def setDisplayLayout(layouts: js.Array[DisplayLayout], callback: js.Function0[Unit]): Unit = js.native
  
  def setDisplayProperties(id: String, info: DisplayPropertiesInfo): Unit = js.native
  def setDisplayProperties(id: String, info: DisplayPropertiesInfo, callback: js.Function0[Unit]): Unit = js.native
  
  def setMirrorMode(info: MirrorModeInfoMixed, callback: js.Function0[Unit]): Unit = js.native
  def setMirrorMode(info: MirrorModeInfo, callback: js.Function0[Unit]): Unit = js.native
  
  def showNativeTouchCalibration(id: String, callback: js.Function1[/* success */ Boolean, Unit]): Unit = js.native
  
  def startCustomTouchCalibration(id: String): Unit = js.native
}
