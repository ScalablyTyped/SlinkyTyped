package typingsSlinky.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of preserved resources.
  */
@js.native
trait SchemaStatefulPolicyPreservedState extends js.Object {
  /**
    * Disks created on the instances that will be preserved on instance delete,
    * resize down, etc. This map is keyed with the device names of the disks.
    */
  var disks: js.UndefOr[StringDictionary[SchemaStatefulPolicyPreservedStateDiskDevice]] = js.native
}

object SchemaStatefulPolicyPreservedState {
  @scala.inline
  def apply(): SchemaStatefulPolicyPreservedState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedState]
  }
  @scala.inline
  implicit class SchemaStatefulPolicyPreservedStateOps[Self <: SchemaStatefulPolicyPreservedState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisks(value: StringDictionary[SchemaStatefulPolicyPreservedStateDiskDevice]): Self = {
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

