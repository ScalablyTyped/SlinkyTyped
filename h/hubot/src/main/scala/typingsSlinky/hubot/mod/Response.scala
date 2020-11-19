package typingsSlinky.hubot.mod

import typingsSlinky.scopedHttpClient.mod.Options
import typingsSlinky.scopedHttpClient.mod.ScopedClient
import typingsSlinky.std.RegExpMatchArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hubot", "Response")
@js.native
class Response[A /* <: Adapter */, M /* <: Message */] protected () extends js.Object {
  def this(robot: Robot[A], message: Message, `match`: RegExpMatchArray) = this()
  
  def emote(strings: String*): Unit = js.native
  
  var envelope: Envelope = js.native
  
  def finish(): Unit = js.native
  
  def http(url: String): ScopedClient = js.native
  def http(url: String, options: Options): ScopedClient = js.native
  
  def locked(strings: String*): Unit = js.native
  
  var `match`: RegExpMatchArray = js.native
  
  var message: Message = js.native
  
  def play(strings: String*): Unit = js.native
  
  def random[T](items: js.Array[T]): T = js.native
  
  def reply(strings: String*): Unit = js.native
  
  def send(strings: String*): Unit = js.native
  
  def topic(strings: String*): Unit = js.native
}
