package typingsSlinky.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSecurityConfigurationsOutput extends js.Object {
  /**
    * A pagination token that indicates the next set of results to retrieve. Include the marker in the next ListSecurityConfiguration call to retrieve the next page of results, if required.
    */
  var Marker: js.UndefOr[typingsSlinky.awsSdk.emrMod.Marker] = js.native
  /**
    * The creation date and time, and name, of each security configuration.
    */
  var SecurityConfigurations: js.UndefOr[SecurityConfigurationList] = js.native
}

object ListSecurityConfigurationsOutput {
  @scala.inline
  def apply(): ListSecurityConfigurationsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSecurityConfigurationsOutput]
  }
  @scala.inline
  implicit class ListSecurityConfigurationsOutputOps[Self <: ListSecurityConfigurationsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMarker(value: Marker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityConfigurations(value: SecurityConfigurationList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfigurations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityConfigurations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityConfigurations")(js.undefined)
        ret
    }
  }
  
}

