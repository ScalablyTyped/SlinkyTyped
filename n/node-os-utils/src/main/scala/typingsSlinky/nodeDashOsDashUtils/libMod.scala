package typingsSlinky.nodeDashOsDashUtils

import typingsSlinky.nodeDashOsDashUtils.libCpuMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-os-utils/lib", JSImport.Namespace)
@js.native
object libMod extends js.Object {
  val cpu: default = js.native
  val drive: typingsSlinky.nodeDashOsDashUtils.libDriveMod.default = js.native
  val mem: typingsSlinky.nodeDashOsDashUtils.libMemMod.default = js.native
  val netstat: typingsSlinky.nodeDashOsDashUtils.libNetstatMod.default = js.native
  val openfiles: typingsSlinky.nodeDashOsDashUtils.libOpenfilesMod.default = js.native
  val os: typingsSlinky.nodeDashOsDashUtils.libOsMod.default = js.native
  val oscmd: typingsSlinky.nodeDashOsDashUtils.libOscmdMod.default = js.native
  val proc: typingsSlinky.nodeDashOsDashUtils.libProcMod.default = js.native
  val users: typingsSlinky.nodeDashOsDashUtils.libUsersMod.default = js.native
  def exec(command: String): js.Function0[js.Promise[String]] = js.native
  @js.native
  object options extends js.Object {
    var INTERVAL: Double = js.native
    var NOT_SUPPORTED_VALUE: String = js.native
  }
  
}

