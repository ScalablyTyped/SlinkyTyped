package typingsSlinky.mongodb.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Server")
@js.native
class Server protected () extends EventEmitter {
  def this(host: String, port: scala.Double) = this()
  def this(host: String, port: scala.Double, options: ServerOptions) = this()
  
  def connections(): js.Array[_] = js.native
}
