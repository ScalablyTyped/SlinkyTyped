package typingsSlinky.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainMapping extends js.Object {
  /** Relative name of the domain serving the application. Example: example.com. */
  var id: js.UndefOr[String] = js.native
  /** Full path to the DomainMapping resource in the API. Example: apps/myapp/domainMapping/example.com.@OutputOnly */
  var name: js.UndefOr[String] = js.native
  /**
    * The resource records required to configure this domain mapping. These records must be added to the domain's DNS configuration in order to serve the
    * application via this domain mapping.@OutputOnly
    */
  var resourceRecords: js.UndefOr[js.Array[ResourceRecord]] = js.native
  /** SSL configuration for this domain. If unconfigured, this domain will not serve with SSL. */
  var sslSettings: js.UndefOr[SslSettings] = js.native
}

object DomainMapping {
  @scala.inline
  def apply(): DomainMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainMapping]
  }
  @scala.inline
  implicit class DomainMappingOps[Self <: DomainMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withResourceRecords(value: js.Array[ResourceRecord]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceRecords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceRecords")(js.undefined)
        ret
    }
    @scala.inline
    def withSslSettings(value: SslSettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSslSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sslSettings")(js.undefined)
        ret
    }
  }
  
}

