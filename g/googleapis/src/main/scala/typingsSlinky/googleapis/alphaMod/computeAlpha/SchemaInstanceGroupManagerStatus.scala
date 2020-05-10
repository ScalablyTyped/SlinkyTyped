package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerStatus extends js.Object {
  /**
    * [Output Only] A bit indicating whether the managed instance group is in a
    * stable state. A stable state means that: none of the instances in the
    * managed instance group is currently undergoing any type of change (for
    * example, creation, restart, or deletion); no future changes are scheduled
    * for instances in the managed instance group; and the managed instance
    * group itself is not being modified.
    */
  var isStable: js.UndefOr[Boolean] = js.native
  /**
    * [Output Only] A status of consistency of Instances&#39; versions with
    * their target version specified by version field on Instance Group
    * Manager.
    */
  var versionTarget: js.UndefOr[SchemaInstanceGroupManagerStatusVersionTarget] = js.native
}

object SchemaInstanceGroupManagerStatus {
  @scala.inline
  def apply(): SchemaInstanceGroupManagerStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerStatus]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagerStatusOps[Self <: SchemaInstanceGroupManagerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsStable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStable")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionTarget(value: SchemaInstanceGroupManagerStatusVersionTarget): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTarget")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionTarget")(js.undefined)
        ret
    }
  }
  
}

