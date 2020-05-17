package typingsSlinky.matchSorter.anon

import typingsSlinky.matchSorter.mod.KeyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key[T] extends js.Object {
  var key: KeyOptions[T] = js.native
}

object Key {
  @scala.inline
  def apply[T](key: KeyOptions[T]): Key[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[T]]
  }
  @scala.inline
  implicit class KeyOps[Self[t] <: Key[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withKeyFunction1(value: T => String | js.Array[String]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKey(value: KeyOptions[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

