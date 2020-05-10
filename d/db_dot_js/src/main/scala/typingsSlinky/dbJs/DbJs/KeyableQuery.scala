package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyableQuery[T] extends js.Object {
  def keys(): KeysQuery[T] = js.native
}

object KeyableQuery {
  @scala.inline
  def apply[T](keys: () => KeysQuery[T]): KeyableQuery[T] = {
    val __obj = js.Dynamic.literal(keys = js.Any.fromFunction0(keys))
    __obj.asInstanceOf[KeyableQuery[T]]
  }
  @scala.inline
  implicit class KeyableQueryOps[Self[t] <: KeyableQuery[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKeys(value: () => KeysQuery[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

