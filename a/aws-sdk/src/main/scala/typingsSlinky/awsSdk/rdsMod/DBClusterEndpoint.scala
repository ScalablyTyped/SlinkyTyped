package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterEndpoint extends js.Object {
  /**
    * The type associated with a custom endpoint. One of: READER, WRITER, ANY.
    */
  var CustomEndpointType: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the endpoint.
    */
  var DBClusterEndpointArn: js.UndefOr[String] = js.native
  /**
    * The identifier associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: js.UndefOr[String] = js.native
  /**
    * A unique system-generated identifier for an endpoint. It remains the same for the whole life of the endpoint.
    */
  var DBClusterEndpointResourceIdentifier: js.UndefOr[String] = js.native
  /**
    * The DB cluster identifier of the DB cluster associated with the endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The DNS address of the endpoint.
    */
  var Endpoint: js.UndefOr[String] = js.native
  /**
    * The type of the endpoint. One of: READER, WRITER, CUSTOM.
    */
  var EndpointType: js.UndefOr[String] = js.native
  /**
    * List of DB instance identifiers that aren't part of the custom endpoint group. All other eligible instances are reachable through the custom endpoint. Only relevant if the list of static members is empty.
    */
  var ExcludedMembers: js.UndefOr[StringList] = js.native
  /**
    * List of DB instance identifiers that are part of the custom endpoint group.
    */
  var StaticMembers: js.UndefOr[StringList] = js.native
  /**
    * The current status of the endpoint. One of: creating, available, deleting, modifying.
    */
  var Status: js.UndefOr[String] = js.native
}

object DBClusterEndpoint {
  @scala.inline
  def apply(): DBClusterEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterEndpoint]
  }
  @scala.inline
  implicit class DBClusterEndpointOps[Self <: DBClusterEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomEndpointType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomEndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomEndpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterEndpointArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterEndpointArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterEndpointArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterEndpointArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterEndpointIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterEndpointIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterEndpointIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterEndpointIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterEndpointResourceIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterEndpointResourceIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterEndpointResourceIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterEndpointResourceIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEndpointType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointType")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
  }
  
}

