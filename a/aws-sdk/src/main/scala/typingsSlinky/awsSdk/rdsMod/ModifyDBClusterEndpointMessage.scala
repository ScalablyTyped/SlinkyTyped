package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier of the endpoint to modify. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String = js.native
  /**
    * The type of the endpoint. One of: READER, WRITER, ANY.
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
}

object ModifyDBClusterEndpointMessage {
  @scala.inline
  def apply(DBClusterEndpointIdentifier: String): ModifyDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterEndpointMessage]
  }
  @scala.inline
  implicit class ModifyDBClusterEndpointMessageOps[Self <: ModifyDBClusterEndpointMessage] (val x: Self) extends AnyVal {
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
  }
  
}

