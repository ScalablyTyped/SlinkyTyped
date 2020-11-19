package typingsSlinky.pg.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import typingsSlinky.pg.pgStrings.drain
import typingsSlinky.pg.pgStrings.end
import typingsSlinky.pg.pgStrings.error
import typingsSlinky.pg.pgStrings.notice
import typingsSlinky.pg.pgStrings.notification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg", "ClientBase")
@js.native
class ClientBase () extends EventEmitter {
  def this(config: String) = this()
  def this(config: ClientConfig) = this()
  
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  // tslint:enable:no-unnecessary-generics
  def copyFrom(queryText: String): Writable = js.native
  
  def copyTo(queryText: String): Readable = js.native
  
  def escapeIdentifier(str: String): String = js.native
  
  def escapeLiteral(str: String): String = js.native
  
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  // tslint:disable-next-line unified-signatures
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_notice(event: notice, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_notification(event: notification, listener: js.Function1[/* message */ Notification, Unit]): this.type = js.native
  
  def pauseDrain(): Unit = js.native
  
  def query[T /* <: Submittable */](queryStream: T): T = js.native
  // tslint:disable:no-unnecessary-generics
  def query[R /* <: js.Array[_] */, I /* <: js.Array[_] */](queryConfig: QueryArrayConfig[I]): js.Promise[QueryArrayResult[R]] = js.native
  def query[R /* <: js.Array[_] */, I /* <: js.Array[_] */](
    queryConfig: QueryArrayConfig[I],
    callback: js.Function2[/* err */ js.Error, /* result */ QueryArrayResult[R], Unit]
  ): Unit = js.native
  def query[R /* <: js.Array[_] */, I /* <: js.Array[_] */](queryConfig: QueryArrayConfig[I], values: I): js.Promise[QueryArrayResult[R]] = js.native
  def query[R /* <: QueryResultRow */, I /* <: js.Array[_] */](queryConfig: QueryConfig[I]): js.Promise[QueryResult[R]] = js.native
  def query[R /* <: QueryResultRow */, I /* <: js.Array[_] */](queryTextOrConfig: String): js.Promise[QueryResult[R]] = js.native
  def query[R /* <: QueryResultRow */, I /* <: js.Array[_] */](
    queryTextOrConfig: String,
    callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[R], Unit]
  ): Unit = js.native
  def query[R /* <: QueryResultRow */, I /* <: js.Array[_] */](queryTextOrConfig: String, values: I): js.Promise[QueryResult[R]] = js.native
  def query[R /* <: QueryResultRow */, I /* <: js.Array[_] */](
    queryTextOrConfig: QueryConfig[I],
    callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[R], Unit]
  ): Unit = js.native
  def query[R /* <: QueryResultRow */, I /* <: js.Array[_] */](queryTextOrConfig: QueryConfig[I], values: I): js.Promise[QueryResult[R]] = js.native
  def query[R /* <: QueryResultRow */, I /* <: js.Array[_] */](
    queryText: String,
    values: js.Array[_],
    callback: js.Function2[/* err */ js.Error, /* result */ QueryResult[R], Unit]
  ): Unit = js.native
  
  def resumeDrain(): Unit = js.native
}
