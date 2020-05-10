package typingsSlinky.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValueChangeRecord[K, V] extends js.Object {
  /**
    * Current value for the key or `null` if removed.
    */
  val currentValue: V | Null = js.native
  /**
    * Current key in the Map.
    */
  val key: K = js.native
  /**
    * Previous value for the key or `null` if added.
    */
  val previousValue: V | Null = js.native
}

object KeyValueChangeRecord {
  @scala.inline
  def apply[K, V](key: K): KeyValueChangeRecord[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValueChangeRecord[K, V]]
  }
  @scala.inline
  implicit class KeyValueChangeRecordOps[Self[k, v] <: KeyValueChangeRecord[k, v], K, V] (val x: Self[K, V]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, V] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, V]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, V]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, V]) with Other]
    @scala.inline
    def withKey(value: K): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentValue(value: V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentValueNull: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentValue")(null)
        ret
    }
    @scala.inline
    def withPreviousValue(value: V): Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousValueNull: Self[K, V] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousValue")(null)
        ret
    }
  }
  
}

