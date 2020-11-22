package typingsSlinky.jackrabbit.mod.jackrabbit

import typingsSlinky.jackrabbit.anon.Amqp
import typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JackRabbit extends EventEmitter {
  
  def close(callback: js.Function1[/* e */ js.Error, _]): Unit = js.native
  
  def default(): Exchange = js.native
  
  def direct(): Exchange = js.native
  def direct(name: String): Exchange = js.native
  
  def fanout(): Exchange = js.native
  def fanout(name: String): Exchange = js.native
  
  def getInternals(): Amqp = js.native
  
  def topic(): Exchange = js.native
  def topic(name: String): Exchange = js.native
}
