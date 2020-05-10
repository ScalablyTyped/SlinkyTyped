package typingsSlinky.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VPC access connector specification.
  */
@js.native
trait SchemaVpcAccessConnector extends js.Object {
  /**
    * Full Serverless VPC Access Connector name e.g.
    * /projects/my-project/locations/us-central1/connectors/c1.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaVpcAccessConnector {
  @scala.inline
  def apply(): SchemaVpcAccessConnector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVpcAccessConnector]
  }
  @scala.inline
  implicit class SchemaVpcAccessConnectorOps[Self <: SchemaVpcAccessConnector] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
  }
  
}

