package typingsSlinky.rabbitJs.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rabbit.js", "Context")
@js.native
class Context () extends EventEmitter {
  
  def close(callback: js.Function): js.Any = js.native
  
  def socket[T](`type`: String): T = js.native
  def socket[T](`type`: String, options: SocketOptions): T = js.native
}
