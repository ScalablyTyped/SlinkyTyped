package typingsSlinky.awsSdk.lakeformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataLakeSettings extends js.Object {
  /**
    * A list of up to three principal permissions entries for default create database permissions.
    */
  var CreateDatabaseDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.native
  /**
    * A list of up to three principal permissions entries for default create table permissions.
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.native
  /**
    * A list of AWS Lake Formation principals.
    */
  var DataLakeAdmins: js.UndefOr[DataLakePrincipalList] = js.native
}

object DataLakeSettings {
  @scala.inline
  def apply(): DataLakeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLakeSettings]
  }
  @scala.inline
  implicit class DataLakeSettingsOps[Self <: DataLakeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateDatabaseDefaultPermissions(value: PrincipalPermissionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDatabaseDefaultPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateDatabaseDefaultPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateDatabaseDefaultPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTableDefaultPermissions(value: PrincipalPermissionsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTableDefaultPermissions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTableDefaultPermissions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreateTableDefaultPermissions")(js.undefined)
        ret
    }
    @scala.inline
    def withDataLakeAdmins(value: DataLakePrincipalList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataLakeAdmins")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataLakeAdmins: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DataLakeAdmins")(js.undefined)
        ret
    }
  }
  
}

