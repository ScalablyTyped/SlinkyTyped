package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of all preserved resources.
  */
@js.native
trait SchemaStatefulPolicyPreservedResources extends js.Object {
  /**
    * Disks created on the instances that will be preserved on instance delete,
    * resize down, etc.
    */
  var disks: js.UndefOr[js.Array[SchemaStatefulPolicyPreservedDisk]] = js.native
}

object SchemaStatefulPolicyPreservedResources {
  @scala.inline
  def apply(): SchemaStatefulPolicyPreservedResources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedResources]
  }
  @scala.inline
  implicit class SchemaStatefulPolicyPreservedResourcesOps[Self <: SchemaStatefulPolicyPreservedResources] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisks(value: js.Array[SchemaStatefulPolicyPreservedDisk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disks")(js.undefined)
        ret
    }
  }
  
}

