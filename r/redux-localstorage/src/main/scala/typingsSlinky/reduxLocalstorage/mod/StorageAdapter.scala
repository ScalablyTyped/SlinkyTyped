package typingsSlinky.reduxLocalstorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageAdapter[A] extends js.Object {
  var `0`: A = js.native
  def del(key: String, callback: AdapterCallback): Unit = js.native
  def get(key: String, callback: AdapterCallback): Unit = js.native
  def put(key: String, value: js.Any, callback: AdapterCallback): Unit = js.native
}

object StorageAdapter {
  @scala.inline
  def apply[A](
    `0`: A,
    del: (String, AdapterCallback) => Unit,
    get: (String, AdapterCallback) => Unit,
    put: (String, js.Any, AdapterCallback) => Unit
  ): StorageAdapter[A] = {
    val __obj = js.Dynamic.literal(del = js.Any.fromFunction2(del), get = js.Any.fromFunction2(get), put = js.Any.fromFunction3(put))
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorageAdapter[A]]
  }
  @scala.inline
  implicit class StorageAdapterOps[Self[a] <: StorageAdapter[a], A] (val x: Self[A]) extends AnyVal {
    @scala.inline
    def duplicate: Self[A] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[A]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[A] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[A] with Other]
    @scala.inline
    def with0(value: A): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDel(value: (String, AdapterCallback) => Unit): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("del")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGet(value: (String, AdapterCallback) => Unit): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPut(value: (String, js.Any, AdapterCallback) => Unit): Self[A] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("put")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

