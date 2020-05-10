package typingsSlinky.pouchdbLiveFind.PouchDB

import typingsSlinky.pouchdbLiveFind.PouchDB.LiveFind.LiveFeed
import typingsSlinky.pouchdbLiveFind.PouchDB.LiveFind.RequestDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database[Content /* <: js.Object */] extends js.Object {
  def liveFind(requestDef: RequestDef[Content]): LiveFeed[Content] = js.native
}

object Database {
  @scala.inline
  def apply[Content](liveFind: RequestDef[Content] => LiveFeed[Content]): Database[Content] = {
    val __obj = js.Dynamic.literal(liveFind = js.Any.fromFunction1(liveFind))
    __obj.asInstanceOf[Database[Content]]
  }
  @scala.inline
  implicit class DatabaseOps[Self[content] <: Database[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withLiveFind(value: RequestDef[Content] => LiveFeed[Content]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("liveFind")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

