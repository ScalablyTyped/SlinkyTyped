package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCredentials extends js.Object {
  /**
    * A temporary password that authorizes the user name returned by DbUser to log on to the database DbName. 
    */
  var DbPassword: js.UndefOr[SensitiveString] = js.native
  /**
    * A database user name that is authorized to log on to the database DbName using the password DbPassword. If the specified DbUser exists in the database, the new user name has the same database privileges as the the user named in DbUser. By default, the user is added to PUBLIC. If the DbGroups parameter is specifed, DbUser is added to the listed groups for any sessions created using these credentials.
    */
  var DbUser: js.UndefOr[String] = js.native
  /**
    * The date and time the password in DbPassword expires.
    */
  var Expiration: js.UndefOr[js.Date] = js.native
}

object ClusterCredentials {
  @scala.inline
  def apply(): ClusterCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterCredentials]
  }
  @scala.inline
  implicit class ClusterCredentialsOps[Self <: ClusterCredentials] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbPassword(value: SensitiveString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbPassword")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbPassword: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbPassword")(js.undefined)
        ret
    }
    @scala.inline
    def withDbUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbUser")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Expiration")(js.undefined)
        ret
    }
  }
  
}

