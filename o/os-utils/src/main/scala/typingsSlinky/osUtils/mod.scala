package typingsSlinky.osUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("os-utils", "allLoadavg")
  @js.native
  def allLoadavg(): String = js.native
  
  @JSImport("os-utils", "cpuCount")
  @js.native
  def cpuCount(): Double = js.native
  
  @JSImport("os-utils", "cpuFree")
  @js.native
  def cpuFree(callback: js.Function1[/* percentage */ Double, _]): Unit = js.native
  
  @JSImport("os-utils", "cpuUsage")
  @js.native
  def cpuUsage(callback: js.Function1[/* percentage */ Double, _]): Unit = js.native
  
  @JSImport("os-utils", "freeCommand")
  @js.native
  def freeCommand(callback: js.Function1[/* used_mem */ Double, _]): Unit = js.native
  
  @JSImport("os-utils", "freemem")
  @js.native
  def freemem(): Double = js.native
  
  @JSImport("os-utils", "freememPercentage")
  @js.native
  def freememPercentage(): Double = js.native
  
  @JSImport("os-utils", "getProcesses")
  @js.native
  def getProcesses(callback: js.Function1[/* result */ String, _]): Unit = js.native
  @JSImport("os-utils", "getProcesses")
  @js.native
  def getProcesses(nProcess: Double, callback: js.Function1[/* result */ String, _]): Unit = js.native
  
  @JSImport("os-utils", "harddrive")
  @js.native
  def harddrive(callback: js.Function3[/* total */ Double, /* free */ Double, /* used */ Double, _]): Unit = js.native
  
  @JSImport("os-utils", "loadavg")
  @js.native
  def loadavg(): Double = js.native
  @JSImport("os-utils", "loadavg")
  @js.native
  def loadavg(_time: Double): Double = js.native
  
  @JSImport("os-utils", "platform")
  @js.native
  def platform(): Platform_ = js.native
  
  @JSImport("os-utils", "processUptime")
  @js.native
  def processUptime(): Double = js.native
  
  @JSImport("os-utils", "sysUptime")
  @js.native
  def sysUptime(): Double = js.native
  
  @JSImport("os-utils", "totalmem")
  @js.native
  def totalmem(): Double = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.osUtils.osUtilsStrings.aix
    - typingsSlinky.osUtils.osUtilsStrings.android
    - typingsSlinky.osUtils.osUtilsStrings.darwin
    - typingsSlinky.osUtils.osUtilsStrings.freebsd
    - typingsSlinky.osUtils.osUtilsStrings.linux
    - typingsSlinky.osUtils.osUtilsStrings.openbsd
    - typingsSlinky.osUtils.osUtilsStrings.sunos
    - typingsSlinky.osUtils.osUtilsStrings.win32
    - typingsSlinky.osUtils.osUtilsStrings.cygwin
  */
  trait Platform_ extends StObject
  object Platform_ {
    
    @scala.inline
    def aix: typingsSlinky.osUtils.osUtilsStrings.aix = "aix".asInstanceOf[typingsSlinky.osUtils.osUtilsStrings.aix]
    
    @scala.inline
    def android: typingsSlinky.osUtils.osUtilsStrings.android = "android".asInstanceOf[typingsSlinky.osUtils.osUtilsStrings.android]
    
    @scala.inline
    def cygwin: typingsSlinky.osUtils.osUtilsStrings.cygwin = "cygwin".asInstanceOf[typingsSlinky.osUtils.osUtilsStrings.cygwin]
    
    @scala.inline
    def darwin: typingsSlinky.osUtils.osUtilsStrings.darwin = "darwin".asInstanceOf[typingsSlinky.osUtils.osUtilsStrings.darwin]
    
    @scala.inline
    def freebsd: typingsSlinky.osUtils.osUtilsStrings.freebsd = "freebsd".asInstanceOf[typingsSlinky.osUtils.osUtilsStrings.freebsd]
    
    @scala.inline
    def linux: typingsSlinky.osUtils.osUtilsStrings.linux = "linux".asInstanceOf[typingsSlinky.osUtils.osUtilsStrings.linux]
    
    @scala.inline
    def openbsd: typingsSlinky.osUtils.osUtilsStrings.openbsd = "openbsd".asInstanceOf[typingsSlinky.osUtils.osUtilsStrings.openbsd]
    
    @scala.inline
    def sunos: typingsSlinky.osUtils.osUtilsStrings.sunos = "sunos".asInstanceOf[typingsSlinky.osUtils.osUtilsStrings.sunos]
    
    @scala.inline
    def win32: typingsSlinky.osUtils.osUtilsStrings.win32 = "win32".asInstanceOf[typingsSlinky.osUtils.osUtilsStrings.win32]
  }
}
