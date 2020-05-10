package typingsSlinky.connectMongodbSession.mod.connectMongodbSession

import typingsSlinky.mongodb.mod.MongoClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionInfo extends js.Object {
  var collection: String = js.native
  var connectionOptions: js.UndefOr[MongoClientOptions] = js.native
  var databaseName: js.UndefOr[String] = js.native
  var expires: js.UndefOr[Double] = js.native
  var idField: js.UndefOr[String] = js.native
  var uri: String = js.native
}

object ConnectionInfo {
  @scala.inline
  def apply(collection: String, uri: String): ConnectionInfo = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfo]
  }
  @scala.inline
  implicit class ConnectionInfoOps[Self <: ConnectionInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionOptions(value: MongoClientOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withExpires(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpires: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expires")(js.undefined)
        ret
    }
    @scala.inline
    def withIdField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idField")(js.undefined)
        ret
    }
  }
  
}

