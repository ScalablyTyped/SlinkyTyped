package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackInstancesForProvisionedProductOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * List of stack instances.
    */
  var StackInstances: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.StackInstances] = js.native
}

object ListStackInstancesForProvisionedProductOutput {
  @scala.inline
  def apply(): ListStackInstancesForProvisionedProductOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStackInstancesForProvisionedProductOutput]
  }
  @scala.inline
  implicit class ListStackInstancesForProvisionedProductOutputOps[Self <: ListStackInstancesForProvisionedProductOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextPageToken(value: PageToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextPageToken")(js.undefined)
        ret
    }
    @scala.inline
    def withStackInstances(value: StackInstances): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackInstances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackInstances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackInstances")(js.undefined)
        ret
    }
  }
  
}

