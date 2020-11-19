package typingsSlinky.foreverMonitor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forever-monitor", "kill")
@js.native
object kill extends js.Object {
  
  def apply(pid: Double): Unit = js.native
  def apply(
    pid: Double,
    killTree: js.UndefOr[scala.Nothing],
    signal: js.UndefOr[scala.Nothing],
    callback: js.Function0[_]
  ): Unit = js.native
  def apply(pid: Double, killTree: js.UndefOr[scala.Nothing], signal: String): Unit = js.native
  def apply(pid: Double, killTree: js.UndefOr[scala.Nothing], signal: String, callback: js.Function0[_]): Unit = js.native
  def apply(pid: Double, killTree: Boolean): Unit = js.native
  def apply(pid: Double, killTree: Boolean, signal: js.UndefOr[scala.Nothing], callback: js.Function0[_]): Unit = js.native
  def apply(pid: Double, killTree: Boolean, signal: String): Unit = js.native
  def apply(pid: Double, killTree: Boolean, signal: String, callback: js.Function0[_]): Unit = js.native
}
