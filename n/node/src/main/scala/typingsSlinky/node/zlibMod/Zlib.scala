package typingsSlinky.node.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Zlib extends js.Object {
  
  /** @deprecated Use bytesWritten instead. */
  val bytesRead: Double = js.native
  
  val bytesWritten: Double = js.native
  
  def close(): Unit = js.native
  def close(callback: js.Function0[Unit]): Unit = js.native
  
  def flush(): Unit = js.native
  def flush(kind: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): Unit = js.native
  def flush(kind: js.Function0[Unit]): Unit = js.native
  def flush(kind: js.Function0[Unit], callback: js.Function0[Unit]): Unit = js.native
  def flush(kind: Double): Unit = js.native
  def flush(kind: Double, callback: js.Function0[Unit]): Unit = js.native
  
  var shell: js.UndefOr[Boolean | String] = js.native
}
