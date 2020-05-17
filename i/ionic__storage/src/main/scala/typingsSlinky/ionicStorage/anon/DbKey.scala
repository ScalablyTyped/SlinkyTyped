package typingsSlinky.ionicStorage.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DbKey extends js.Object {
  var dbKey: String = js.native
  var driverOrder: js.Array[String] = js.native
  var name: String = js.native
  var storeName: String = js.native
}

object DbKey {
  @scala.inline
  def apply(dbKey: String, driverOrder: js.Array[String], name: String, storeName: String): DbKey = {
    val __obj = js.Dynamic.literal(dbKey = dbKey.asInstanceOf[js.Any], driverOrder = driverOrder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], storeName = storeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DbKey]
  }
  @scala.inline
  implicit class DbKeyOps[Self <: DbKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDriverOrder(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("driverOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStoreName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storeName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

