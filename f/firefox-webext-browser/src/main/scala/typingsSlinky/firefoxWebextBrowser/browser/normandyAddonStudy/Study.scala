package typingsSlinky.firefoxWebextBrowser.browser.normandyAddonStudy

import typingsSlinky.firefoxWebextBrowser.browser.extensionTypes.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* normandyAddonStudy types */
@js.native
trait Study extends js.Object {
  /** The state of the study. */
  var active: Boolean = js.native
  /** The ID of the extension installed by the study. */
  var addonId: String = js.native
  /** The URL of the XPI that was downloaded and installed by the study. */
  var addonUrl: String = js.native
  /** The version of the extension installed by the study. */
  var addonVersion: String = js.native
  /** The study branch in which the user is enrolled. */
  var branch: String = js.native
  /** The record ID for the extension in Normandy server's database. */
  var extensionApiId: Double = js.native
  /** A hash of the extension XPI file. */
  var extensionHash: String = js.native
  /** The algorithm used to hash the extension XPI file. */
  var extensionHashAlgorithm: String = js.native
  /** The ID of the recipe for the study. */
  var recipeId: Double = js.native
  /** A slug to identify the study. */
  var slug: String = js.native
  /** The end date for the study. */
  var studyEndDate: Date = js.native
  /** The start date for the study. */
  var studyStartDate: Date = js.native
  /** The description presented on about:studies. */
  var userFacingDescription: String = js.native
  /** The name presented on about:studies. */
  var userFacingName: String = js.native
}

object Study {
  @scala.inline
  def apply(
    active: Boolean,
    addonId: String,
    addonUrl: String,
    addonVersion: String,
    branch: String,
    extensionApiId: Double,
    extensionHash: String,
    extensionHashAlgorithm: String,
    recipeId: Double,
    slug: String,
    studyEndDate: Date,
    studyStartDate: Date,
    userFacingDescription: String,
    userFacingName: String
  ): Study = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addonId = addonId.asInstanceOf[js.Any], addonUrl = addonUrl.asInstanceOf[js.Any], addonVersion = addonVersion.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], extensionApiId = extensionApiId.asInstanceOf[js.Any], extensionHash = extensionHash.asInstanceOf[js.Any], extensionHashAlgorithm = extensionHashAlgorithm.asInstanceOf[js.Any], recipeId = recipeId.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], studyEndDate = studyEndDate.asInstanceOf[js.Any], studyStartDate = studyStartDate.asInstanceOf[js.Any], userFacingDescription = userFacingDescription.asInstanceOf[js.Any], userFacingName = userFacingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Study]
  }
  @scala.inline
  implicit class StudyOps[Self <: Study] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddonId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddonUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddonVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addonVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBranch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("branch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionApiId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionApiId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtensionHashAlgorithm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensionHashAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecipeId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlug(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStudyEndDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studyEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStudyStartDate(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("studyStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserFacingDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFacingDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserFacingName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFacingName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

