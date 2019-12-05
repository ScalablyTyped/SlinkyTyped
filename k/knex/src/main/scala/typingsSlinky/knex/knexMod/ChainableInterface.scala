package typingsSlinky.knex.knexMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.NodeJS.WritableStream
import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Chainable interface
//
@js.native
trait ChainableInterface[T] extends Promise[T] {
  def asCallback(callback: js.Function): this.type = js.native
  def connection(connection: js.Any): this.type = js.native
  def debug(enabled: Boolean): this.type = js.native
  def options(options: StringDictionary[js.Any]): this.type = js.native
  def pipe[T /* <: WritableStream */](writable: T): PassThrough = js.native
  def pipe[T /* <: WritableStream */](writable: T, options: StringDictionary[js.Any]): PassThrough = js.native
  def stream(): PassThrough = js.native
  def stream(handler: js.Function1[/* readable */ PassThrough, _]): js.Promise[_] = js.native
  def stream(options: StringDictionary[js.Any]): PassThrough = js.native
  def stream(options: StringDictionary[js.Any], handler: js.Function1[/* readable */ PassThrough, _]): js.Promise[_] = js.native
  def toQuery(): String = js.native
  def transacting(trx: Transaction[_, _]): this.type = js.native
}

