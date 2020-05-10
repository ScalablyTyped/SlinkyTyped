package typingsSlinky.googleapis.cloudbillingV1Mod.cloudbillingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates a single service in Google Cloud Platform.
  */
@js.native
trait SchemaService extends js.Object {
  /**
    * The business under which the service is offered. Ex.
    * &quot;businessEntities/GCP&quot;, &quot;businessEntities/Maps&quot;
    */
  var businessEntityName: js.UndefOr[String] = js.native
  /**
    * A human readable display name for this service.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * The resource name for the service. Example:
    * &quot;services/DA34-426B-A397&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The identifier for the service. Example: &quot;DA34-426B-A397&quot;
    */
  var serviceId: js.UndefOr[String] = js.native
}

object SchemaService {
  @scala.inline
  def apply(): SchemaService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaService]
  }
  @scala.inline
  implicit class SchemaServiceOps[Self <: SchemaService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBusinessEntityName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessEntityName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBusinessEntityName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("businessEntityName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
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
    @scala.inline
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceId")(js.undefined)
        ret
    }
  }
  
}

