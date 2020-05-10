package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaLicenseResourceRequirements extends js.Object {
  /**
    * Minimum number of guest cpus required to use the Instance. Enforced at
    * Instance creation and Instance start.
    */
  var minGuestCpuCount: js.UndefOr[Double] = js.native
  /**
    * Minimum memory required to use the Instance. Enforced at Instance
    * creation and Instance start.
    */
  var minMemoryMb: js.UndefOr[Double] = js.native
}

object SchemaLicenseResourceRequirements {
  @scala.inline
  def apply(): SchemaLicenseResourceRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLicenseResourceRequirements]
  }
  @scala.inline
  implicit class SchemaLicenseResourceRequirementsOps[Self <: SchemaLicenseResourceRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMinGuestCpuCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minGuestCpuCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinGuestCpuCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minGuestCpuCount")(js.undefined)
        ret
    }
    @scala.inline
    def withMinMemoryMb(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMemoryMb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinMemoryMb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minMemoryMb")(js.undefined)
        ret
    }
  }
  
}

