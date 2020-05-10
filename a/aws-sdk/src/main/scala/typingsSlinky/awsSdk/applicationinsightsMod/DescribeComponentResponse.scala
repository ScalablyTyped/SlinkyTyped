package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComponentResponse extends js.Object {
  var ApplicationComponent: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ApplicationComponent] = js.native
  /**
    * The list of resource ARNs that belong to the component.
    */
  var ResourceList: js.UndefOr[typingsSlinky.awsSdk.applicationinsightsMod.ResourceList] = js.native
}

object DescribeComponentResponse {
  @scala.inline
  def apply(): DescribeComponentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentResponse]
  }
  @scala.inline
  implicit class DescribeComponentResponseOps[Self <: DescribeComponentResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationComponent(value: ApplicationComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationComponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicationComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ApplicationComponent")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceList(value: ResourceList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceList")(js.undefined)
        ret
    }
  }
  
}

