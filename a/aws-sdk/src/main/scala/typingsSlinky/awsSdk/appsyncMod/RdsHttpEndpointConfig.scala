package typingsSlinky.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RdsHttpEndpointConfig extends js.Object {
  /**
    * AWS Region for RDS HTTP endpoint.
    */
  var awsRegion: js.UndefOr[String] = js.native
  /**
    * AWS secret store ARN for database credentials.
    */
  var awsSecretStoreArn: js.UndefOr[String] = js.native
  /**
    * Logical database name.
    */
  var databaseName: js.UndefOr[String] = js.native
  /**
    * Amazon RDS cluster identifier.
    */
  var dbClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * Logical schema name.
    */
  var schema: js.UndefOr[String] = js.native
}

object RdsHttpEndpointConfig {
  @scala.inline
  def apply(): RdsHttpEndpointConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsHttpEndpointConfig]
  }
  @scala.inline
  implicit class RdsHttpEndpointConfigOps[Self <: RdsHttpEndpointConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAwsRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withAwsSecretStoreArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsSecretStoreArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsSecretStoreArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsSecretStoreArn")(js.undefined)
        ret
    }
    @scala.inline
    def withDatabaseName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabaseName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("databaseName")(js.undefined)
        ret
    }
    @scala.inline
    def withDbClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbClusterIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withSchema(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(js.undefined)
        ret
    }
  }
  
}

