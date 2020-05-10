package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterContainerInstanceResponse extends js.Object {
  /**
    * The container instance that was deregistered.
    */
  var containerInstance: js.UndefOr[ContainerInstance] = js.native
}

object DeregisterContainerInstanceResponse {
  @scala.inline
  def apply(): DeregisterContainerInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeregisterContainerInstanceResponse]
  }
  @scala.inline
  implicit class DeregisterContainerInstanceResponseOps[Self <: DeregisterContainerInstanceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainerInstance(value: ContainerInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerInstance")(js.undefined)
        ret
    }
  }
  
}

