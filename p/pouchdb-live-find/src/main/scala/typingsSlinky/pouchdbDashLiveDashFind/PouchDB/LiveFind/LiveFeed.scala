package typingsSlinky.pouchdbDashLiveDashFind.PouchDB.LiveFind

import typingsSlinky.pouchdbDashCore.EventEmitter
import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.cancelled
import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.error
import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.ready
import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.update_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LiveFeed[Content /* <: js.Object */] extends EventEmitter {
  // stops the query and removes all listeners
  def cancel(): Unit = js.native
  def `catch`(callbackFailure: js.Function0[_]): Unit = js.native
  @JSName("on")
  def on_cancelled(event: cancelled, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_update(event: update_, listener: js.Function2[/* event */ UpdateEvent, /* list */ js.Any, Unit]): this.type = js.native
  // updates the pagination and sorting of the aggregate list and immediately returns the updated list. Available options are sort, skip, and limit.
  def paginate(options: PaginateOptions[Content]): js.Array[js.Any] = js.native
  // a convenience function to sort any list in place by the sort order you provided. (This will mutate the Array.)
  def sort(list: js.Array[js.Any]): js.Array[js.Any] = js.native
  def `then`(callbackSuccess: js.Function0[_]): Unit = js.native
}

