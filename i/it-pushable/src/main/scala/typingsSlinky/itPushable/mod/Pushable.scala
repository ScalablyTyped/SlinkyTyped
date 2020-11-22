package typingsSlinky.itPushable.mod

import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pushable[T] extends AsyncIterable[T] {
  
  def end(): this.type = js.native
  def end(err: js.Error): this.type = js.native
  
  def push(value: T): this.type = js.native
}
