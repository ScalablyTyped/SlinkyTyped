package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleConfigurationDescription extends js.Object {
  /**
    * An array of lifecycle management policies. Currently, EFS supports a maximum of one policy per file system.
    */
  var LifecyclePolicies: js.UndefOr[typingsSlinky.awsSdk.efsMod.LifecyclePolicies] = js.native
}

object LifecycleConfigurationDescription {
  @scala.inline
  def apply(): LifecycleConfigurationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LifecycleConfigurationDescription]
  }
  @scala.inline
  implicit class LifecycleConfigurationDescriptionOps[Self <: LifecycleConfigurationDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLifecyclePolicies(value: LifecyclePolicies): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecyclePolicies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLifecyclePolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LifecyclePolicies")(js.undefined)
        ret
    }
  }
  
}

