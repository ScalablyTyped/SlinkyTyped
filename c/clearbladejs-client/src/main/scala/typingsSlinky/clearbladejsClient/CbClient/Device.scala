package typingsSlinky.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Device extends js.Object {
  var URI: String = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def columns(callback: CbCallback): Unit = js.native
  def count(query: Query, callback: CbCallback): Unit = js.native
  def create(newDevice: js.Object, callback: CbCallback): Unit = js.native
  def delete(query: Query, callback: CbCallback): Unit = js.native
  def deleteDeviceByName(name: String, callback: CbCallback): Unit = js.native
  def fetch(query: Query, callback: CbCallback): Unit = js.native
  def getDeviceByName(name: String, callback: CbCallback): Unit = js.native
  def update(query: Query, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit = js.native
  def updateDeviceByName(name: String, `object`: js.Object, trigger: Boolean, callback: CbCallback): Unit = js.native
}

object Device {
  @scala.inline
  def apply(
    URI: String,
    columns: CbCallback => Unit,
    count: (Query, CbCallback) => Unit,
    create: (js.Object, CbCallback) => Unit,
    delete: (Query, CbCallback) => Unit,
    deleteDeviceByName: (String, CbCallback) => Unit,
    fetch: (Query, CbCallback) => Unit,
    getDeviceByName: (String, CbCallback) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (Query, js.Object, Boolean, CbCallback) => Unit,
    updateDeviceByName: (String, js.Object, Boolean, CbCallback) => Unit,
    user: APIUser
  ): Device = {
    val __obj = js.Dynamic.literal(URI = URI.asInstanceOf[js.Any], columns = js.Any.fromFunction1(columns), count = js.Any.fromFunction2(count), create = js.Any.fromFunction2(create), delete = js.Any.fromFunction2(delete), deleteDeviceByName = js.Any.fromFunction2(deleteDeviceByName), fetch = js.Any.fromFunction2(fetch), getDeviceByName = js.Any.fromFunction2(getDeviceByName), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction4(update), updateDeviceByName = js.Any.fromFunction4(updateDeviceByName), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Device]
  }
  @scala.inline
  implicit class DeviceOps[Self <: Device] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumns(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCount(value: (Query, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreate(value: (js.Object, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDelete(value: (Query, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withDeleteDeviceByName(value: (String, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteDeviceByName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFetch(value: (Query, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetDeviceByName(value: (String, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDeviceByName")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (Query, js.Object, Boolean, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUpdateDeviceByName(value: (String, js.Object, Boolean, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateDeviceByName")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withUser(value: APIUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

