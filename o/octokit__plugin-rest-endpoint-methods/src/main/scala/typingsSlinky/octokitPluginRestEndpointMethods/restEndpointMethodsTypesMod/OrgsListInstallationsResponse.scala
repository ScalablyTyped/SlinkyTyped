package typingsSlinky.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgsListInstallationsResponse extends js.Object {
  var installations: js.Array[OrgsListInstallationsResponseInstallationsItem] = js.native
  var total_count: Double = js.native
}

object OrgsListInstallationsResponse {
  @scala.inline
  def apply(installations: js.Array[OrgsListInstallationsResponseInstallationsItem], total_count: Double): OrgsListInstallationsResponse = {
    val __obj = js.Dynamic.literal(installations = installations.asInstanceOf[js.Any], total_count = total_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsListInstallationsResponse]
  }
  @scala.inline
  implicit class OrgsListInstallationsResponseOps[Self <: OrgsListInstallationsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallations(value: js.Array[OrgsListInstallationsResponseInstallationsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal_count(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total_count")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

