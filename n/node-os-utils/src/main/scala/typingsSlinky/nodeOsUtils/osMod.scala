package typingsSlinky.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object osMod {
  
  @JSImport("node-os-utils/lib/os", JSImport.Default)
  @js.native
  class default () extends Os
  
  @js.native
  trait Os extends StObject {
    
    def arch(): String = js.native
    
    def hostname(): String = js.native
    
    def ip(): String = js.native
    
    def oos(): js.Function0[js.Promise[String]] = js.native
    
    def platform(): Platform = js.native
    
    def `type`(): String = js.native
    
    def uptime(): Double = js.native
  }
  object Os {
    
    @scala.inline
    def apply(
      arch: () => String,
      hostname: () => String,
      ip: () => String,
      oos: () => js.Function0[js.Promise[String]],
      platform: () => Platform,
      `type`: () => String,
      uptime: () => Double
    ): Os = {
      val __obj = js.Dynamic.literal(arch = js.Any.fromFunction0(arch), hostname = js.Any.fromFunction0(hostname), ip = js.Any.fromFunction0(ip), oos = js.Any.fromFunction0(oos), platform = js.Any.fromFunction0(platform), uptime = js.Any.fromFunction0(uptime))
      __obj.updateDynamic("type")(js.Any.fromFunction0(`type`))
      __obj.asInstanceOf[Os]
    }
    
    @scala.inline
    implicit class OsMutableBuilder[Self <: Os] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: () => String): Self = StObject.set(x, "arch", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHostname(value: () => String): Self = StObject.set(x, "hostname", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIp(value: () => String): Self = StObject.set(x, "ip", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOos(value: () => js.Function0[js.Promise[String]]): Self = StObject.set(x, "oos", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlatform(value: () => Platform): Self = StObject.set(x, "platform", js.Any.fromFunction0(value))
      
      @scala.inline
      def setType(value: () => String): Self = StObject.set(x, "type", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUptime(value: () => Double): Self = StObject.set(x, "uptime", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.aix
    - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.android
    - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.darwin
    - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.freebsd
    - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.linux
    - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.openbsd
    - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.sunos
    - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.win32
    - typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.cygwin
  */
  trait Platform extends StObject
  object Platform {
    
    @scala.inline
    def aix: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.aix = "aix".asInstanceOf[typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.aix]
    
    @scala.inline
    def android: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.android = "android".asInstanceOf[typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.android]
    
    @scala.inline
    def cygwin: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.cygwin = "cygwin".asInstanceOf[typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.cygwin]
    
    @scala.inline
    def darwin: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.darwin = "darwin".asInstanceOf[typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.darwin]
    
    @scala.inline
    def freebsd: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.freebsd = "freebsd".asInstanceOf[typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.freebsd]
    
    @scala.inline
    def linux: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.linux = "linux".asInstanceOf[typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.linux]
    
    @scala.inline
    def openbsd: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.openbsd = "openbsd".asInstanceOf[typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.openbsd]
    
    @scala.inline
    def sunos: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.sunos = "sunos".asInstanceOf[typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.sunos]
    
    @scala.inline
    def win32: typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.win32 = "win32".asInstanceOf[typingsSlinky.nodeOsUtils.nodeOsUtilsStrings.win32]
  }
}
