package typingsSlinky.dbJs.DbJs

import org.scalajs.dom.raw.IDBDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("close", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndexedDB(value: () => IDBDatabase): Self = this.set("getIndexedDB", js.Any.fromFunction0(value))
  }
}
