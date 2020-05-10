package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseInput extends js.Object {
  /**
    * Creates a set of default permissions on the table for principals. 
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.native
  /**
    * A description of the database.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The location of the database (for example, an HDFS path). 
    */
  var LocationUri: js.UndefOr[URI] = js.native
  /**
    * The name of the database. For Hive compatibility, this is folded to lowercase when it is stored.
    */
  var Name: NameString = js.native
  /**
    * These key-value pairs define parameters and properties of the database. These key-value pairs define parameters and properties of the database.
    */
  var Parameters: js.UndefOr[ParametersMap] = js.native
}

object DatabaseInput {
  @scala.inline
  def apply(Name: NameString): DatabaseInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseInput]
  }
  @scala.inline
  implicit class DatabaseInputOps[Self <: DatabaseInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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
    def withDescription(value: DescriptionString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withLocationUri(value: URI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocationUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocationUri")(js.undefined)
        ret
    }
    @scala.inline
    def withParameters(value: ParametersMap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Parameters")(js.undefined)
        ret
    }
  }
  
}

