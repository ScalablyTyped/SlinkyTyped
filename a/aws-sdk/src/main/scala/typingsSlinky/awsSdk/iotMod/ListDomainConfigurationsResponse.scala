package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDomainConfigurationsResponse extends js.Object {
  /**
    * A list of objects that contain summary information about the user's domain configurations.
    */
  var domainConfigurations: js.UndefOr[DomainConfigurations] = js.native
  /**
    * The marker for the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
}

object ListDomainConfigurationsResponse {
  @scala.inline
  def apply(): ListDomainConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainConfigurationsResponse]
  }
  @scala.inline
  implicit class ListDomainConfigurationsResponseOps[Self <: ListDomainConfigurationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainConfigurations(value: DomainConfigurations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainConfigurations")(js.undefined)
        ret
    }
    @scala.inline
    def withNextMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMarker")(js.undefined)
        ret
    }
  }
  
}

