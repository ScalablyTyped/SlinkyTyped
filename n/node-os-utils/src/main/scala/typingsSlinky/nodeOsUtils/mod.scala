package typingsSlinky.nodeOsUtils

import typingsSlinky.nodeOsUtils.cpuMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-os-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val cpu: default = js.native
  
  val drive: typingsSlinky.nodeOsUtils.driveMod.default = js.native
  
  def exec(command: String): js.Function0[js.Promise[String]] = js.native
  
  def isNotSupported(res: js.Any): Boolean = js.native
  
  val mem: typingsSlinky.nodeOsUtils.memMod.default = js.native
  
  val netstat: typingsSlinky.nodeOsUtils.netstatMod.default = js.native
  
  val openfiles: typingsSlinky.nodeOsUtils.openfilesMod.default = js.native
  
  val os: typingsSlinky.nodeOsUtils.osMod.default = js.native
  
  val oscmd: typingsSlinky.nodeOsUtils.oscmdMod.default = js.native
  
  val proc: typingsSlinky.nodeOsUtils.procMod.default = js.native
  
  val users: typingsSlinky.nodeOsUtils.usersMod.default = js.native
  
  def wrapExec(command: String): js.Function0[js.Function0[js.Promise[String]]] = js.native
  
  @js.native
  object options extends js.Object {
    
    var INTERVAL: Double = js.native
    
    var NOT_SUPPORTED_VALUE: String = js.native
  }
}
