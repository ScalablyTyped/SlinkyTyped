package typingsSlinky.delay.mod

import typingsSlinky.delay.anon.Once
import typingsSlinky.delay.delayStrings.abort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	Minimal subset of `AbortSignal` that delay will use if passed.
	This avoids a dependency on dom.d.ts.
	The dom.d.ts `AbortSignal` is compatible with this one.
	*/
@js.native
trait AbortSignal extends js.Object {
  
  val aborted: Boolean = js.native
  
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function0[Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function0[Unit], options: Once): Unit = js.native
  
  @JSName("removeEventListener")
  def removeEventListener_abort(`type`: abort, listener: js.Function0[Unit]): Unit = js.native
}
