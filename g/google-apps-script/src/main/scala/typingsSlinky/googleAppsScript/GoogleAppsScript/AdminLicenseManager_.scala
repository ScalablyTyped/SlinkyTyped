package typingsSlinky.googleAppsScript.GoogleAppsScript

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Collection.LicenseAssignmentsCollection
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignment
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminLicenseManager.Schema.LicenseAssignmentInsert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminLicenseManager_ extends js.Object {
  var LicenseAssignments: js.UndefOr[LicenseAssignmentsCollection] = js.native
  // Create a new instance of LicenseAssignment
  def newLicenseAssignment(): LicenseAssignment = js.native
  // Create a new instance of LicenseAssignmentInsert
  def newLicenseAssignmentInsert(): LicenseAssignmentInsert = js.native
}

object AdminLicenseManager_ {
  @scala.inline
  def apply(
    newLicenseAssignment: () => LicenseAssignment,
    newLicenseAssignmentInsert: () => LicenseAssignmentInsert
  ): AdminLicenseManager_ = {
    val __obj = js.Dynamic.literal(newLicenseAssignment = js.Any.fromFunction0(newLicenseAssignment), newLicenseAssignmentInsert = js.Any.fromFunction0(newLicenseAssignmentInsert))
    __obj.asInstanceOf[AdminLicenseManager_]
  }
  @scala.inline
  implicit class AdminLicenseManager_Ops[Self <: AdminLicenseManager_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewLicenseAssignment(value: () => LicenseAssignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLicenseAssignment")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNewLicenseAssignmentInsert(value: () => LicenseAssignmentInsert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newLicenseAssignmentInsert")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLicenseAssignments(value: LicenseAssignmentsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseAssignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLicenseAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LicenseAssignments")(js.undefined)
        ret
    }
  }
  
}

