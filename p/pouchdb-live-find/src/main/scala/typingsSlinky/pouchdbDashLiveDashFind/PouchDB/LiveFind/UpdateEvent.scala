package typingsSlinky.pouchdbDashLiveDashFind.PouchDB.LiveFind

import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.ADD
import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.REMOVE
import typingsSlinky.pouchdbDashLiveDashFind.pouchdbDashLiveDashFindStrings.UPDATE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEvent extends js.Object {
  var action: REMOVE | ADD | UPDATE
  var doc: js.Any
  var id: js.Any
  var rev: js.Any
}

object UpdateEvent {
  @scala.inline
  def apply(action: REMOVE | ADD | UPDATE, doc: js.Any, id: js.Any, rev: js.Any): UpdateEvent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], doc = doc.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEvent]
  }
}

