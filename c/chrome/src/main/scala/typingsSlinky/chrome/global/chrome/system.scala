package typingsSlinky.chrome.global.chrome

import typingsSlinky.chrome.chrome.events.Event
import typingsSlinky.chrome.chrome.system.cpu.CpuInfo
import typingsSlinky.chrome.chrome.system.display.Bounds
import typingsSlinky.chrome.chrome.system.display.DisplayInfo
import typingsSlinky.chrome.chrome.system.display.DisplayInfoFlags
import typingsSlinky.chrome.chrome.system.display.DisplayLayout
import typingsSlinky.chrome.chrome.system.display.DisplayPropertiesInfo
import typingsSlinky.chrome.chrome.system.display.Insets
import typingsSlinky.chrome.chrome.system.display.MirrorModeInfo
import typingsSlinky.chrome.chrome.system.display.MirrorModeInfoMixed
import typingsSlinky.chrome.chrome.system.display.TouchCalibrationPairs
import typingsSlinky.chrome.chrome.system.memory.MemoryInfo
import typingsSlinky.chrome.chrome.system.storage.StorageCapacityInfo
import typingsSlinky.chrome.chrome.system.storage.StorageUnitInfo
import typingsSlinky.chrome.chrome.system.storage.SystemStorageAttachedEvent
import typingsSlinky.chrome.chrome.system.storage.SystemStorageDetachedEvent
import typingsSlinky.chrome.chromeStrings.bottom
import typingsSlinky.chrome.chromeStrings.left
import typingsSlinky.chrome.chromeStrings.mixed
import typingsSlinky.chrome.chromeStrings.normal
import typingsSlinky.chrome.chromeStrings.off
import typingsSlinky.chrome.chromeStrings.right
import typingsSlinky.chrome.chromeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("chrome.system")
@js.native
object system extends js.Object {
  
  ////////////////////
  // System CPU
  ////////////////////
  /**
    * Use the system.cpu API to query CPU metadata.
    * Permissions: "system.cpu"
    * @since Chrome 32.
    */
  @js.native
  object cpu extends js.Object {
    
    def getInfo(callback: js.Function1[/* info */ CpuInfo, Unit]): Unit = js.native
  }
  
  ////////////////////
  // System Display //
  ////////////////////
  /**
    * Use the system.display API to query display metadata.
    * Permissions: 'system.display'
    * @since Chrome 30.
    */
  @js.native
  object display extends js.Object {
    
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
    
    @js.native
    object DisplayPosition extends js.Object {
      
      var BOTTOM: bottom = js.native
      
      var LEFT: left = js.native
      
      var RIGHT: right = js.native
      
      var TOP: top = js.native
    }
    
    @js.native
    object MirrorMode extends js.Object {
      
      var MIXED: mixed = js.native
      
      var NORMAL: normal = js.native
      
      var OFF: off = js.native
    }
  }
  
  ////////////////////
  // System Memory
  ////////////////////
  /**
    * The chrome.system.memory API.
    * Permissions:  "system.memory"
    * @since Chrome 32.
    */
  @js.native
  object memory extends js.Object {
    
    def getInfo(callback: js.Function1[/* info */ MemoryInfo, Unit]): Unit = js.native
  }
  
  ////////////////////
  // System Storage
  ////////////////////
  /**
    * Use the chrome.system.storage API to query storage device information and be notified when a removable storage device is attached and detached.
    * Permissions:  "system.storage"
    * @since Chrome 30.
    */
  @js.native
  object storage extends js.Object {
    
    def ejectDevice(id: String, callback: js.Function1[/* result */ String, Unit]): Unit = js.native
    
    def getAvailableCapacity(id: String, callback: js.Function1[/* info */ StorageCapacityInfo, Unit]): Unit = js.native
    
    def getInfo(callback: js.Function1[/* info */ js.Array[StorageUnitInfo], Unit]): Unit = js.native
    
    var onAttached: SystemStorageAttachedEvent = js.native
    
    var onDetached: SystemStorageDetachedEvent = js.native
  }
}
