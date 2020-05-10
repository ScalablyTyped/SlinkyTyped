package typingsSlinky.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RealmListenerConfiguration extends js.Object {
  var adminUser: User = js.native
  var filterRegex: String = js.native
  var serverUrl: String = js.native
  var sslConfiguration: js.UndefOr[SSLConfiguration] = js.native
}

object RealmListenerConfiguration {
  @scala.inline
  def apply(adminUser: User, filterRegex: String, serverUrl: String): RealmListenerConfiguration = {
    val __obj = js.Dynamic.literal(adminUser = adminUser.asInstanceOf[js.Any], filterRegex = filterRegex.asInstanceOf[js.Any], serverUrl = serverUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmListenerConfiguration]
  }
  @scala.inline
  implicit class RealmListenerConfigurationOps[Self <: RealmListenerConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilterRegex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterRegex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSslConfiguration(value: SSLConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslConfiguration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslConfiguration")(js.undefined)
        ret
    }
  }
  
}

