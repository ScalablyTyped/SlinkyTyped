package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TermsAndConditions extends Entity {
  /**
    * Administrator-supplied explanation of the terms and conditions, typically describing what it means to accept the terms
    * and conditions set out in the T&amp;C policy. This is shown to the user on prompts to accept the T&amp;C policy.
    */
  var acceptanceStatement: js.UndefOr[String] = js.native
  // The list of acceptance statuses for this T&amp;C policy.
  var acceptanceStatuses: js.UndefOr[js.Array[TermsAndConditionsAcceptanceStatus]] = js.native
  // The list of assignments for this T&amp;C policy.
  var assignments: js.UndefOr[js.Array[TermsAndConditionsAssignment]] = js.native
  /**
    * Administrator-supplied body text of the terms and conditions, typically the terms themselves. This is shown to the user
    * on prompts to accept the T&amp;C policy.
    */
  var bodyText: js.UndefOr[String] = js.native
  // DateTime the object was created.
  var createdDateTime: js.UndefOr[String] = js.native
  // Administrator-supplied description of the T&amp;C policy.
  var description: js.UndefOr[String] = js.native
  // Administrator-supplied name for the T&amp;C policy.
  var displayName: js.UndefOr[String] = js.native
  // DateTime the object was last modified.
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  /**
    * Administrator-supplied title of the terms and conditions. This is shown to the user on prompts to accept the T&amp;C
    * policy.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Integer indicating the current version of the terms. Incremented when an administrator makes a change to the terms and
    * wishes to require users to re-accept the modified T&amp;C policy.
    */
  var version: js.UndefOr[Double] = js.native
}

object TermsAndConditions {
  @scala.inline
  def apply(): TermsAndConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TermsAndConditions]
  }
  @scala.inline
  implicit class TermsAndConditionsOps[Self <: TermsAndConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcceptanceStatement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptanceStatement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptanceStatement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptanceStatement")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptanceStatuses(value: js.Array[TermsAndConditionsAcceptanceStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptanceStatuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptanceStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptanceStatuses")(js.undefined)
        ret
    }
    @scala.inline
    def withAssignments(value: js.Array[TermsAndConditionsAssignment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssignments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignments")(js.undefined)
        ret
    }
    @scala.inline
    def withBodyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyText")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

