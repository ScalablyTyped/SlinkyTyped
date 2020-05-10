package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetClusterCredentialsMessage extends js.Object {
  /**
    * Create a database user with the name specified for the user named in DbUser if one does not exist.
    */
  var AutoCreate: js.UndefOr[BooleanOptional] = js.native
  /**
    * The unique identifier of the cluster that contains the database for which your are requesting credentials. This parameter is case sensitive.
    */
  var ClusterIdentifier: String = js.native
  /**
    * A list of the names of existing database groups that the user named in DbUser will join for the current session, in addition to any group memberships for an existing user. If not specified, a new user is added only to PUBLIC. Database group name constraints   Must be 1 to 64 alphanumeric characters or hyphens   Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   First character must be a letter.   Must not contain a colon ( : ) or slash ( / ).    Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.  
    */
  var DbGroups: js.UndefOr[DbGroupList] = js.native
  /**
    * The name of a database that DbUser is authorized to log on to. If DbName is not specified, DbUser can log on to any existing database. Constraints:   Must be 1 to 64 alphanumeric characters or hyphens   Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   First character must be a letter.   Must not contain a colon ( : ) or slash ( / ).    Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.  
    */
  var DbName: js.UndefOr[String] = js.native
  /**
    * The name of a database user. If a user name matching DbUser exists in the database, the temporary user credentials have the same permissions as the existing user. If DbUser doesn't exist in the database and Autocreate is True, a new user is created using the value for DbUser with PUBLIC permissions. If a database user matching the value for DbUser doesn't exist and Autocreate is False, then the command succeeds but the connection attempt will fail because the user doesn't exist in the database. For more information, see CREATE USER in the Amazon Redshift Database Developer Guide.  Constraints:   Must be 1 to 64 alphanumeric characters or hyphens. The user name can't be PUBLIC.   Must contain only lowercase letters, numbers, underscore, plus sign, period (dot), at symbol (@), or hyphen.   First character must be a letter.   Must not contain a colon ( : ) or slash ( / ).    Cannot be a reserved word. A list of reserved words can be found in Reserved Words in the Amazon Redshift Database Developer Guide.  
    */
  var DbUser: String = js.native
  /**
    * The number of seconds until the returned temporary password expires. Constraint: minimum 900, maximum 3600. Default: 900
    */
  var DurationSeconds: js.UndefOr[IntegerOptional] = js.native
}

object GetClusterCredentialsMessage {
  @scala.inline
  def apply(ClusterIdentifier: String, DbUser: String): GetClusterCredentialsMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], DbUser = DbUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterCredentialsMessage]
  }
  @scala.inline
  implicit class GetClusterCredentialsMessageOps[Self <: GetClusterCredentialsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoCreate(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoCreate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withDbGroups(value: DbGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withDbName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DbName")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationSeconds(value: IntegerOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DurationSeconds")(js.undefined)
        ret
    }
  }
  
}

