package typingsSlinky.pouchdbDashCore.PouchDB.Core

import typingsSlinky.pouchdbDashCore.EventEmitter
import typingsSlinky.pouchdbDashCore.pouchdbDashCoreStrings.change
import typingsSlinky.pouchdbDashCore.pouchdbDashCoreStrings.complete
import typingsSlinky.pouchdbDashCore.pouchdbDashCoreStrings.error
import typingsSlinky.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Changes[Content /* <: js.Object */]
  extends EventEmitter
     with Promise[ChangesResponse[Content]] {
  def cancel(): Unit = js.native
  @JSName("on")
  def on_change(event: change, listener: js.Function1[/* value */ ChangesResponseChange[Content], _]): this.type = js.native
  @JSName("on")
  def on_complete(event: complete, listener: js.Function1[/* value */ ChangesResponse[Content], _]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* value */ js.Any, _]): this.type = js.native
}

