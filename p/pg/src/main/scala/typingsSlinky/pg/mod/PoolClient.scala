package typingsSlinky.pg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoolClient extends ClientBase {
  
  def release(): Unit = js.native
  def release(err: Boolean): Unit = js.native
  def release(err: js.Error): Unit = js.native
}
