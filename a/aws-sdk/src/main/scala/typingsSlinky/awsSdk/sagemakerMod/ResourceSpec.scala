package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceSpec extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the environment.
    */
  var EnvironmentArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.EnvironmentArn] = js.native
  /**
    * The instance type.
    */
  var InstanceType: js.UndefOr[AppInstanceType] = js.native
}

object ResourceSpec {
  @scala.inline
  def apply(): ResourceSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceSpec]
  }
  @scala.inline
  implicit class ResourceSpecOps[Self <: ResourceSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironmentArn(value: EnvironmentArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EnvironmentArn")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceType(value: AppInstanceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceType")(js.undefined)
        ret
    }
  }
  
}

