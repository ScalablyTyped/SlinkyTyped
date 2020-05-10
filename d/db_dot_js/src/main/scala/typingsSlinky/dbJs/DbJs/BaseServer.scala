package typingsSlinky.dbJs.DbJs

import org.scalajs.dom.raw.IDBDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseServer extends js.Object {
  def close(): Unit = js.native
  def getIndexedDB(): IDBDatabase = js.native
}

object BaseServer {
  @scala.inline
  def apply(close: () => Unit, getIndexedDB: () => IDBDatabase): BaseServer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getIndexedDB = js.Any.fromFunction0(getIndexedDB))
    __obj.asInstanceOf[BaseServer]
  }
  @scala.inline
  implicit class BaseServerOps[Self <: BaseServer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClose(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("close")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetIndexedDB(value: () => IDBDatabase): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndexedDB")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

