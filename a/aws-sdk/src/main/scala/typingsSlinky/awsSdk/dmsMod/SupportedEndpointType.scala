package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SupportedEndpointType extends js.Object {
  /**
    * The type of endpoint. Valid values are source and target.
    */
  var EndpointType: js.UndefOr[ReplicationEndpointTypeValue] = js.native
  /**
    * The expanded name for the engine name. For example, if the EngineName parameter is "aurora," this value would be "Amazon Aurora MySQL."
    */
  var EngineDisplayName: js.UndefOr[String] = js.native
  /**
    * The database engine name. Valid values, depending on the EndpointType, include "mysql", "oracle", "postgres", "mariadb", "aurora", "aurora-postgresql", "redshift", "s3", "db2", "azuredb", "sybase", "dynamodb", "mongodb", "kinesis", "kafka", "elasticsearch", "documentdb", and "sqlserver".
    */
  var EngineName: js.UndefOr[String] = js.native
  /**
    * Indicates if Change Data Capture (CDC) is supported.
    */
  var SupportsCDC: js.UndefOr[Boolean] = js.native
}

object SupportedEndpointType {
  @scala.inline
  def apply(): SupportedEndpointType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SupportedEndpointType]
  }
  @scala.inline
  implicit class SupportedEndpointTypeOps[Self <: SupportedEndpointType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointType(value: ReplicationEndpointTypeValue): Self = {
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
    def withEngineDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineDisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineDisplayName")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineName")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportsCDC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsCDC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportsCDC: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SupportsCDC")(js.undefined)
        ret
    }
  }
  
}

