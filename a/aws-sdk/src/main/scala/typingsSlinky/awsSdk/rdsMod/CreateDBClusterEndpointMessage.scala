package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier to use for the new endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String = js.native
  /**
    * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: String = js.native
  /**
    * The type of the endpoint. One of: READER, WRITER, ANY.
    */
  var EndpointType: String = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.native
  /**
    * The tags to be assigned to the Amazon RDS resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBClusterEndpointMessage {
  @scala.inline
  def apply(DBClusterEndpointIdentifier: String, DBClusterIdentifier: String, EndpointType: String): CreateDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any], DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any], EndpointType = EndpointType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBClusterEndpointMessage]
  }
  @scala.inline
  implicit class CreateDBClusterEndpointMessageOps[Self <: CreateDBClusterEndpointMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterEndpointIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterEndpointIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDBClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndpointType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExcludedMembers(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludedMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExcludedMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticMembers(value: StringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticMembers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StaticMembers")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

