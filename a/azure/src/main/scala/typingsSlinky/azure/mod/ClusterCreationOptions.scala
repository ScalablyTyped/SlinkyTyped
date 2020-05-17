package typingsSlinky.azure.mod

import typingsSlinky.azure.anon.Database
import typingsSlinky.azure.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCreationOptions extends js.Object {
  var additionalStorageAccounts: js.UndefOr[js.Array[Key]] = js.native
  var defaultStorageAccountKey: String = js.native
  var defaultStorageAccountName: String = js.native
  var defaultStorageContainer: String = js.native
  var hiveMetastore: js.UndefOr[Database] = js.native
  var location: String = js.native
  var name: String = js.native
  var nodes: Double = js.native
  var oozieMetastore: js.UndefOr[Database] = js.native
  var password: String = js.native
  var user: String = js.native
}

object ClusterCreationOptions {
  @scala.inline
  def apply(
    defaultStorageAccountKey: String,
    defaultStorageAccountName: String,
    defaultStorageContainer: String,
    location: String,
    name: String,
    nodes: Double,
    password: String,
    user: String
  ): ClusterCreationOptions = {
    val __obj = js.Dynamic.literal(defaultStorageAccountKey = defaultStorageAccountKey.asInstanceOf[js.Any], defaultStorageAccountName = defaultStorageAccountName.asInstanceOf[js.Any], defaultStorageContainer = defaultStorageContainer.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterCreationOptions]
  }
  @scala.inline
  implicit class ClusterCreationOptionsOps[Self <: ClusterCreationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultStorageAccountKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStorageAccountKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultStorageAccountName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStorageAccountName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultStorageContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultStorageContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNodes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPassword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAdditionalStorageAccounts(value: js.Array[Key]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalStorageAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalStorageAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalStorageAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withHiveMetastore(value: Database): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiveMetastore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHiveMetastore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hiveMetastore")(js.undefined)
        ret
    }
    @scala.inline
    def withOozieMetastore(value: Database): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oozieMetastore")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOozieMetastore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oozieMetastore")(js.undefined)
        ret
    }
  }
  
}

