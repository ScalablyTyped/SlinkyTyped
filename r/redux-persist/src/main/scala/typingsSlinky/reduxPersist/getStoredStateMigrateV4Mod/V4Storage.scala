package typingsSlinky.reduxPersist.getStoredStateMigrateV4Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait V4Storage extends js.Object {
  var getAllKeys: js.UndefOr[
    js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
  ] = js.native
  var getItem: js.UndefOr[
    js.Function1[
      /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], _], 
      _
    ]
  ] = js.native
  var keys: js.UndefOr[
    js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _], _]
  ] = js.native
}

object V4Storage {
  @scala.inline
  def apply(): V4Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[V4Storage]
  }
  @scala.inline
  implicit class V4StorageOps[Self <: V4Storage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllKeys(value: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetAllKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItem(value: /* cb */ js.Function2[/* err */ js.Any, /* serialized */ js.UndefOr[String | Null], _] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItem")(js.undefined)
        ret
    }
    @scala.inline
    def withKeys(value: /* cb */ js.Function2[/* err */ js.Any, /* allKeys */ js.Array[String], _] => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keys")(js.undefined)
        ret
    }
  }
  
}

