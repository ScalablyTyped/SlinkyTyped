package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectLockConfiguration extends js.Object {
  /**
    * Indicates whether this bucket has an Object Lock configuration enabled.
    */
  var ObjectLockEnabled: js.UndefOr[typingsSlinky.awsSdk.s3Mod.ObjectLockEnabled] = js.native
  /**
    * The Object Lock rule in place for the specified object.
    */
  var Rule: js.UndefOr[ObjectLockRule] = js.native
}

object ObjectLockConfiguration {
  @scala.inline
  def apply(): ObjectLockConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectLockConfiguration]
  }
  @scala.inline
  implicit class ObjectLockConfigurationOps[Self <: ObjectLockConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withObjectLockEnabled(value: ObjectLockEnabled): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectLockEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectLockEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRule(value: ObjectLockRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Rule")(js.undefined)
        ret
    }
  }
  
}

