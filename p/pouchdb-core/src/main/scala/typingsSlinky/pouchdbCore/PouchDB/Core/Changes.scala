package typingsSlinky.pouchdbCore.PouchDB.Core

import typingsSlinky.pouchdbCore.EventEmitter
import typingsSlinky.pouchdbCore.pouchdbCoreStrings.change
import typingsSlinky.pouchdbCore.pouchdbCoreStrings.complete
import typingsSlinky.pouchdbCore.pouchdbCoreStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Changes[Content /* <: js.Object */]
  extends js.Promise[ChangesResponse[Content]]
     with EventEmitter {
  
  def cancel(): Unit = js.native
  
  @JSName("on")
  def on_change(event: change, listener: js.Function1[/* value */ ChangesResponseChange[Content], _]): this.type = js.native
  @JSName("on")
  def on_complete(event: complete, listener: js.Function1[/* value */ ChangesResponse[Content], _]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* value */ js.Any, _]): this.type = js.native
}
