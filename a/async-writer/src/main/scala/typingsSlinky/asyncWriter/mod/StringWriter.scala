package typingsSlinky.asyncWriter.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async-writer", "StringWriter")
@js.native
class StringWriter protected () extends js.Object {
  def this(events: EventEmitter) = this()
  
  def end(): Unit = js.native
  
  def write(what: String): StringWriter = js.native
}
