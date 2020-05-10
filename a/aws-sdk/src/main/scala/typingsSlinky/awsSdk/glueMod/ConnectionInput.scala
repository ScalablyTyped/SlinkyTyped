package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionInput extends js.Object {
  /**
    * These key-value pairs define parameters for the connection.
    */
  var ConnectionProperties: typingsSlinky.awsSdk.glueMod.ConnectionProperties = js.native
  /**
    * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
    */
  var ConnectionType: typingsSlinky.awsSdk.glueMod.ConnectionType = js.native
  /**
    * The description of the connection.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  var MatchCriteria: js.UndefOr[typingsSlinky.awsSdk.glueMod.MatchCriteria] = js.native
  /**
    * The name of the connection.
    */
  var Name: NameString = js.native
  /**
    * A map of physical connection requirements, such as virtual private cloud (VPC) and SecurityGroup, that are needed to successfully make this connection.
    */
  var PhysicalConnectionRequirements: js.UndefOr[typingsSlinky.awsSdk.glueMod.PhysicalConnectionRequirements] = js.native
}

object ConnectionInput {
  @scala.inline
  def apply(ConnectionProperties: ConnectionProperties, ConnectionType: ConnectionType, Name: NameString): ConnectionInput = {
    val __obj = js.Dynamic.literal(ConnectionProperties = ConnectionProperties.asInstanceOf[js.Any], ConnectionType = ConnectionType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInput]
  }
  @scala.inline
  implicit class ConnectionInputOps[Self <: ConnectionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionProperties(value: ConnectionProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionType(value: ConnectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
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
    def withMatchCriteria(value: MatchCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchCriteria")(js.undefined)
        ret
    }
    @scala.inline
    def withPhysicalConnectionRequirements(value: PhysicalConnectionRequirements): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalConnectionRequirements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPhysicalConnectionRequirements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhysicalConnectionRequirements")(js.undefined)
        ret
    }
  }
  
}

