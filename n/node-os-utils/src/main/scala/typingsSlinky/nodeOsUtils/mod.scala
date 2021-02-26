package typingsSlinky.nodeOsUtils

import typingsSlinky.nodeOsUtils.cpuMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-os-utils", "cpu")
  @js.native
  val cpu: default = js.native
  
  @JSImport("node-os-utils", "drive")
  @js.native
  val drive: typingsSlinky.nodeOsUtils.driveMod.default = js.native
  
  @JSImport("node-os-utils", "exec")
  @js.native
  def exec(command: String): js.Function0[js.Promise[String]] = js.native
  
  @JSImport("node-os-utils", "isNotSupported")
  @js.native
  def isNotSupported(res: js.Any): Boolean = js.native
  
  @JSImport("node-os-utils", "mem")
  @js.native
  val mem: typingsSlinky.nodeOsUtils.memMod.default = js.native
  
  @JSImport("node-os-utils", "netstat")
  @js.native
  val netstat: typingsSlinky.nodeOsUtils.netstatMod.default = js.native
  
  @JSImport("node-os-utils", "openfiles")
  @js.native
  val openfiles: typingsSlinky.nodeOsUtils.openfilesMod.default = js.native
  
  object options {
    
    @JSImport("node-os-utils", "options")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-os-utils", "options.INTERVAL")
    @js.native
    def INTERVAL: Double = js.native
    @scala.inline
    def INTERVAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERVAL")(x.asInstanceOf[js.Any])
    
    @JSImport("node-os-utils", "options.NOT_SUPPORTED_VALUE")
    @js.native
    def NOT_SUPPORTED_VALUE: String = js.native
    @scala.inline
    def NOT_SUPPORTED_VALUE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_SUPPORTED_VALUE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-os-utils", "os")
  @js.native
  val os: typingsSlinky.nodeOsUtils.osMod.default = js.native
  
  @JSImport("node-os-utils", "oscmd")
  @js.native
  val oscmd: typingsSlinky.nodeOsUtils.oscmdMod.default = js.native
  
  @JSImport("node-os-utils", "proc")
  @js.native
  val proc: typingsSlinky.nodeOsUtils.procMod.default = js.native
  
  @JSImport("node-os-utils", "users")
  @js.native
  val users: typingsSlinky.nodeOsUtils.usersMod.default = js.native
  
  @JSImport("node-os-utils", "wrapExec")
  @js.native
  def wrapExec(command: String): js.Function0[js.Function0[js.Promise[String]]] = js.native
}
