package typingsSlinky.pg.mod

import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.pg.pgStrings.end
import typingsSlinky.pg.pgStrings.error
import typingsSlinky.pg.pgStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg", "Query")
@js.native
class Query[R /* <: QueryResultRow */, I /* <: js.Array[_] */] ()
  extends EventEmitter
     with Submittable {
  def this(queryTextOrConfig: String) = this()
  def this(queryTextOrConfig: QueryConfig[I]) = this()
  def this(queryTextOrConfig: js.UndefOr[scala.Nothing], values: I) = this()
  def this(queryTextOrConfig: String, values: I) = this()
  def this(queryTextOrConfig: QueryConfig[I], values: I) = this()
  
  @JSName("on")
  def on_end(event: end, listener: js.Function1[/* result */ ResultBuilder[R], Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_row(event: row, listener: js.Function2[/* row */ R, /* result */ js.UndefOr[ResultBuilder[R]], Unit]): this.type = js.native
}
