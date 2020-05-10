package typingsSlinky.ioredis.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Redis
  extends EventEmitter
     with Commander
     with Commands {
  var Promise: PromiseConstructor = js.native
  var status: String = js.native
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  def disconnect(): Unit = js.native
  def duplicate(): Redis = js.native
  def send_command(command: String, args: ValueType*): js.Promise[_] = js.native
}

