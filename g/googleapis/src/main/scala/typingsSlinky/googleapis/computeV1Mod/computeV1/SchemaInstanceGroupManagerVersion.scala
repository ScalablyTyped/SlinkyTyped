package typingsSlinky.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupManagerVersion extends js.Object {
  var instanceTemplate: js.UndefOr[String] = js.native
  /**
    * Name of the version. Unique among all versions in the scope of this
    * managed instance group.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Specifies the intended number of instances to be created from the
    * instanceTemplate. The final number of instances created from the template
    * will be equal to:   - If expressed as a fixed number, the minimum of
    * either targetSize.fixed or instanceGroupManager.targetSize is used.  - if
    * expressed as a percent, the targetSize would be (targetSize.percent/100 *
    * InstanceGroupManager.targetSize) If there is a remainder, the number is
    * rounded up.  If unset, this version will update any remaining instances
    * not updated by another version. Read Starting a canary update for more
    * information.
    */
  var targetSize: js.UndefOr[SchemaFixedOrPercent] = js.native
}

object SchemaInstanceGroupManagerVersion {
  @scala.inline
  def apply(): SchemaInstanceGroupManagerVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceGroupManagerVersion]
  }
  @scala.inline
  implicit class SchemaInstanceGroupManagerVersionOps[Self <: SchemaInstanceGroupManagerVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstanceTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetSize(value: SchemaFixedOrPercent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetSize")(js.undefined)
        ret
    }
  }
  
}

