package typingsSlinky.azureArmResource.resourceModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourcesMoveInfo extends js.Object {
  /**
    * The IDs of the resources.
    */
  var resources: js.UndefOr[js.Array[String]] = js.native
  /**
    * The target resource group.
    */
  var targetResourceGroup: js.UndefOr[String] = js.native
}

object ResourcesMoveInfo {
  @scala.inline
  def apply(): ResourcesMoveInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourcesMoveInfo]
  }
  @scala.inline
  implicit class ResourcesMoveInfoOps[Self <: ResourcesMoveInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResources(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetResourceGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResourceGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetResourceGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetResourceGroup")(js.undefined)
        ret
    }
  }
  
}

