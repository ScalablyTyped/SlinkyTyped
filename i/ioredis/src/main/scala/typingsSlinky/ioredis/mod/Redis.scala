package typingsSlinky.ioredis.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.PromiseConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redis
  extends EventEmitter
     with Commander
     with Commands {
  
  var Promise: PromiseConstructor = js.native
  
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def disconnect(): Unit = js.native
  
  def duplicate(): Redis = js.native
  
  val options: RedisOptions = js.native
  
  def send_command(command: String, args: ValueType*): js.Promise[_] = js.native
  
  val status: String = js.native
}
