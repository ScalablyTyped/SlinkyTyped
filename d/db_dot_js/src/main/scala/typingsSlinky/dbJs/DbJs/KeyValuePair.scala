package typingsSlinky.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KeyValuePair[TKey, TValue] extends js.Object {
  var item: TValue = js.native
  var key: TKey = js.native
}

object KeyValuePair {
  @scala.inline
  def apply[TKey, TValue](item: TValue, key: TKey): KeyValuePair[TKey, TValue] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyValuePair[TKey, TValue]]
  }
  @scala.inline
  implicit class KeyValuePairOps[Self[tkey, tvalue] <: KeyValuePair[tkey, tvalue], TKey, TValue] (val x: Self[TKey, TValue]) extends AnyVal {
    @scala.inline
    def duplicate: Self[TKey, TValue] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[TKey, TValue]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[TKey, TValue]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[TKey, TValue]) with Other]
    @scala.inline
    def withItem(value: TValue): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: TKey): Self[TKey, TValue] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

