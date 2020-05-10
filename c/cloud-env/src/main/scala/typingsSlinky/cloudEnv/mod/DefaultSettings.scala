package typingsSlinky.cloudEnv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultSettings extends js.Object {
  var APP_NAME: js.UndefOr[String] = js.native
  var HOSTNAME: js.UndefOr[String] = js.native
  var IP: js.UndefOr[String] = js.native
  var MONGODB_DB_HOST: js.UndefOr[String] = js.native
  var MONGODB_DB_PASSWORD: js.UndefOr[String] = js.native
  var MONGODB_DB_PORT: js.UndefOr[Double] = js.native
  var MONGODB_DB_URL: js.UndefOr[String] = js.native
  var MONGODB_DB_USERNAME: js.UndefOr[String] = js.native
  var MYSQL_DB_HOST: js.UndefOr[String] = js.native
  var MYSQL_DB_PASSWORD: js.UndefOr[String] = js.native
  var MYSQL_DB_PORT: js.UndefOr[Double] = js.native
  var MYSQL_DB_URL: js.UndefOr[String] = js.native
  var MYSQL_DB_USERNAME: js.UndefOr[String] = js.native
  var PORT: js.UndefOr[Double] = js.native
  var POSTGRESQL_DB_HOST: js.UndefOr[String] = js.native
  var POSTGRESQL_DB_PASSWORD: js.UndefOr[String] = js.native
  var POSTGRESQL_DB_PORT: js.UndefOr[Double] = js.native
  var POSTGRESQL_DB_URL: js.UndefOr[String] = js.native
  var POSTGRESQL_DB_USERNAME: js.UndefOr[String] = js.native
}

object DefaultSettings {
  @scala.inline
  def apply(): DefaultSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultSettings]
  }
  @scala.inline
  implicit class DefaultSettingsOps[Self <: DefaultSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAPP_NAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APP_NAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAPP_NAME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("APP_NAME")(js.undefined)
        ret
    }
    @scala.inline
    def withHOSTNAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOSTNAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHOSTNAME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HOSTNAME")(js.undefined)
        ret
    }
    @scala.inline
    def withIP(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IP")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIP: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IP")(js.undefined)
        ret
    }
    @scala.inline
    def withMONGODB_DB_HOST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_HOST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMONGODB_DB_HOST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_HOST")(js.undefined)
        ret
    }
    @scala.inline
    def withMONGODB_DB_PASSWORD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_PASSWORD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMONGODB_DB_PASSWORD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_PASSWORD")(js.undefined)
        ret
    }
    @scala.inline
    def withMONGODB_DB_PORT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_PORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMONGODB_DB_PORT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_PORT")(js.undefined)
        ret
    }
    @scala.inline
    def withMONGODB_DB_URL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMONGODB_DB_URL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_URL")(js.undefined)
        ret
    }
    @scala.inline
    def withMONGODB_DB_USERNAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_USERNAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMONGODB_DB_USERNAME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MONGODB_DB_USERNAME")(js.undefined)
        ret
    }
    @scala.inline
    def withMYSQL_DB_HOST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_HOST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMYSQL_DB_HOST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_HOST")(js.undefined)
        ret
    }
    @scala.inline
    def withMYSQL_DB_PASSWORD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_PASSWORD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMYSQL_DB_PASSWORD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_PASSWORD")(js.undefined)
        ret
    }
    @scala.inline
    def withMYSQL_DB_PORT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_PORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMYSQL_DB_PORT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_PORT")(js.undefined)
        ret
    }
    @scala.inline
    def withMYSQL_DB_URL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMYSQL_DB_URL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_URL")(js.undefined)
        ret
    }
    @scala.inline
    def withMYSQL_DB_USERNAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_USERNAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMYSQL_DB_USERNAME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MYSQL_DB_USERNAME")(js.undefined)
        ret
    }
    @scala.inline
    def withPORT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPORT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PORT")(js.undefined)
        ret
    }
    @scala.inline
    def withPOSTGRESQL_DB_HOST(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_HOST")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPOSTGRESQL_DB_HOST: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_HOST")(js.undefined)
        ret
    }
    @scala.inline
    def withPOSTGRESQL_DB_PASSWORD(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_PASSWORD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPOSTGRESQL_DB_PASSWORD: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_PASSWORD")(js.undefined)
        ret
    }
    @scala.inline
    def withPOSTGRESQL_DB_PORT(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_PORT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPOSTGRESQL_DB_PORT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_PORT")(js.undefined)
        ret
    }
    @scala.inline
    def withPOSTGRESQL_DB_URL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_URL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPOSTGRESQL_DB_URL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_URL")(js.undefined)
        ret
    }
    @scala.inline
    def withPOSTGRESQL_DB_USERNAME(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_USERNAME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPOSTGRESQL_DB_USERNAME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("POSTGRESQL_DB_USERNAME")(js.undefined)
        ret
    }
  }
  
}

