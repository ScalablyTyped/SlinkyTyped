package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  /**
    * These key-value pairs define parameters for the connection:    HOST - The host URI: either the fully qualified domain name (FQDN) or the IPv4 address of the database host.    PORT - The port number, between 1024 and 65535, of the port on which the database host is listening for database connections.    USER_NAME - The name under which to log in to the database. The value string for USER_NAME is "USERNAME".    PASSWORD - A password, if one is used, for the user name.    ENCRYPTED_PASSWORD - When you enable connection password protection by setting ConnectionPasswordEncryption in the Data Catalog encryption settings, this field stores the encrypted password.    JDBC_DRIVER_JAR_URI - The Amazon Simple Storage Service (Amazon S3) path of the JAR file that contains the JDBC driver to use.    JDBC_DRIVER_CLASS_NAME - The class name of the JDBC driver to use.    JDBC_ENGINE - The name of the JDBC engine to use.    JDBC_ENGINE_VERSION - The version of the JDBC engine to use.    CONFIG_FILES - (Reserved for future use.)    INSTANCE_ID - The instance ID to use.    JDBC_CONNECTION_URL - The URL for the JDBC connection.    JDBC_ENFORCE_SSL - A Boolean string (true, false) specifying whether Secure Sockets Layer (SSL) with hostname matching is enforced for the JDBC connection on the client. The default is false.    CUSTOM_JDBC_CERT - An Amazon S3 location specifying the customer's root certificate. AWS Glue uses this root certificate to validate the customer’s certificate when connecting to the customer database. AWS Glue only handles X.509 certificates. The certificate provided must be DER-encoded and supplied in Base64 encoding PEM format.    SKIP_CUSTOM_JDBC_CERT_VALIDATION - By default, this is false. AWS Glue validates the Signature algorithm and Subject Public Key Algorithm for the customer certificate. The only permitted algorithms for the Signature algorithm are SHA256withRSA, SHA384withRSA or SHA512withRSA. For the Subject Public Key Algorithm, the key length must be at least 2048. You can set the value of this property to true to skip AWS Glue’s validation of the customer certificate.    CUSTOM_JDBC_CERT_STRING - A custom JDBC certificate string which is used for domain match or distinguished name match to prevent a man-in-the-middle attack. In Oracle database, this is used as the SSL_SERVER_CERT_DN; in Microsoft SQL Server, this is used as the hostNameInCertificate.  
    */
  var ConnectionProperties: js.UndefOr[typingsSlinky.awsSdk.glueMod.ConnectionProperties] = js.native
  /**
    * The type of the connection. Currently, only JDBC is supported; SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[typingsSlinky.awsSdk.glueMod.ConnectionType] = js.native
  /**
    * The time that this connection definition was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  /**
    * The description of the connection.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    * The user, group, or role that last updated this connection definition.
    */
  var LastUpdatedBy: js.UndefOr[NameString] = js.native
  /**
    * The last time that this connection definition was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  var MatchCriteria: js.UndefOr[typingsSlinky.awsSdk.glueMod.MatchCriteria] = js.native
  /**
    * The name of the connection definition.
    */
  var Name: js.UndefOr[NameString] = js.native
  /**
    * A map of physical connection requirements, such as virtual private cloud (VPC) and SecurityGroup, that are needed to make this connection successfully.
    */
  var PhysicalConnectionRequirements: js.UndefOr[typingsSlinky.awsSdk.glueMod.PhysicalConnectionRequirements] = js.native
}

object Connection {
  @scala.inline
  def apply(): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connection]
  }
  @scala.inline
  implicit class ConnectionOps[Self <: Connection] (val x: Self) extends AnyVal {
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
    def withoutConnectionProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withConnectionType(value: ConnectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
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
    def withLastUpdatedBy(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedBy")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedTime")(js.undefined)
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
    def withName(value: NameString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
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

