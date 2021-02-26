package typingsSlinky.nodeOsUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oscmdMod {
  
  @JSImport("node-os-utils/lib/oscmd", JSImport.Default)
  @js.native
  class default () extends OsCmd
  
  @js.native
  trait OsCmd extends StObject {
    
    def diskUsage(): js.Promise[String] = js.native
    
    def ifconfig(): js.Promise[String] = js.native
    
    def openPorts(): js.Promise[String] = js.native
    
    def processesUsers(): js.Promise[String] = js.native
    
    def topCpu(): js.Function0[js.Promise[String]] = js.native
    
    def topMem(): js.Promise[String] = js.native
    
    def vmstats(): js.Promise[String] = js.native
    
    def who(): js.Promise[String] = js.native
    
    def whoami(): js.Promise[String] = js.native
  }
  object OsCmd {
    
    @scala.inline
    def apply(
      diskUsage: () => js.Promise[String],
      ifconfig: () => js.Promise[String],
      openPorts: () => js.Promise[String],
      processesUsers: () => js.Promise[String],
      topCpu: () => js.Function0[js.Promise[String]],
      topMem: () => js.Promise[String],
      vmstats: () => js.Promise[String],
      who: () => js.Promise[String],
      whoami: () => js.Promise[String]
    ): OsCmd = {
      val __obj = js.Dynamic.literal(diskUsage = js.Any.fromFunction0(diskUsage), ifconfig = js.Any.fromFunction0(ifconfig), openPorts = js.Any.fromFunction0(openPorts), processesUsers = js.Any.fromFunction0(processesUsers), topCpu = js.Any.fromFunction0(topCpu), topMem = js.Any.fromFunction0(topMem), vmstats = js.Any.fromFunction0(vmstats), who = js.Any.fromFunction0(who), whoami = js.Any.fromFunction0(whoami))
      __obj.asInstanceOf[OsCmd]
    }
    
    @scala.inline
    implicit class OsCmdMutableBuilder[Self <: OsCmd] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiskUsage(value: () => js.Promise[String]): Self = StObject.set(x, "diskUsage", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIfconfig(value: () => js.Promise[String]): Self = StObject.set(x, "ifconfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOpenPorts(value: () => js.Promise[String]): Self = StObject.set(x, "openPorts", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProcessesUsers(value: () => js.Promise[String]): Self = StObject.set(x, "processesUsers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTopCpu(value: () => js.Function0[js.Promise[String]]): Self = StObject.set(x, "topCpu", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTopMem(value: () => js.Promise[String]): Self = StObject.set(x, "topMem", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVmstats(value: () => js.Promise[String]): Self = StObject.set(x, "vmstats", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWho(value: () => js.Promise[String]): Self = StObject.set(x, "who", js.Any.fromFunction0(value))
      
      @scala.inline
      def setWhoami(value: () => js.Promise[String]): Self = StObject.set(x, "whoami", js.Any.fromFunction0(value))
    }
  }
}
