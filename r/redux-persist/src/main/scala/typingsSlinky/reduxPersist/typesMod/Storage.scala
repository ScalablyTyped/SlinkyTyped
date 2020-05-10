package typingsSlinky.reduxPersist.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Storage extends js.Object {
  def getItem(key: String, args: js.Any*): js.Any = js.native
  def removeItem(key: String, args: js.Any*): js.Any = js.native
  def setItem(key: String, value: js.Any, args: js.Any*): js.Any = js.native
}

object Storage {
  @scala.inline
  def apply(
    getItem: (String, /* repeated */ js.Any) => js.Any,
    removeItem: (String, /* repeated */ js.Any) => js.Any,
    setItem: (String, js.Any, /* repeated */ js.Any) => js.Any
  ): Storage = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction2(getItem), removeItem = js.Any.fromFunction2(removeItem), setItem = js.Any.fromFunction3(setItem))
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetItem(value: (String, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRemoveItem(value: (String, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeItem")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetItem(value: (String, js.Any, /* repeated */ js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setItem")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

