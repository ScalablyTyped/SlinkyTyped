package typingsSlinky.pg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg", "Client")
@js.native
class Client () extends ClientBase {
  def this(config: String) = this()
  def this(config: ClientConfig) = this()
  
  def end(): js.Promise[Unit] = js.native
  def end(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
