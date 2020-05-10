package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVirtualServicesOutput extends js.Object {
  /**
    * The nextToken value to include in a future ListVirtualServices
    request. When the results of a ListVirtualServices request exceed
    limit, you can use this value to retrieve the next page of results. This
    value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of existing virtual services for the specified service mesh.
    */
  var virtualServices: VirtualServiceList = js.native
}

object ListVirtualServicesOutput {
  @scala.inline
  def apply(virtualServices: VirtualServiceList): ListVirtualServicesOutput = {
    val __obj = js.Dynamic.literal(virtualServices = virtualServices.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualServicesOutput]
  }
  @scala.inline
  implicit class ListVirtualServicesOutputOps[Self <: ListVirtualServicesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVirtualServices(value: VirtualServiceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("virtualServices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

