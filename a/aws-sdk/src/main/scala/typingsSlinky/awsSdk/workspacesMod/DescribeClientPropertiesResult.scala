package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeClientPropertiesResult extends js.Object {
  /**
    * Information about the specified Amazon WorkSpaces clients.
    */
  var ClientPropertiesList: js.UndefOr[typingsSlinky.awsSdk.workspacesMod.ClientPropertiesList] = js.native
}

object DescribeClientPropertiesResult {
  @scala.inline
  def apply(): DescribeClientPropertiesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeClientPropertiesResult]
  }
  @scala.inline
  implicit class DescribeClientPropertiesResultOps[Self <: DescribeClientPropertiesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientPropertiesList(value: ClientPropertiesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientPropertiesList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientPropertiesList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClientPropertiesList")(js.undefined)
        ret
    }
  }
  
}

