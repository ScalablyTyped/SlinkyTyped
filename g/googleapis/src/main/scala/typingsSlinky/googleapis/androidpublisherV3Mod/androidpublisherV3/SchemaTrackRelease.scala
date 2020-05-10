package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTrackRelease extends js.Object {
  var countryTargeting: js.UndefOr[SchemaCountryTargeting] = js.native
  /**
    * The release name, used to identify this release in the Play Console UI.
    * Not required to be unique. This is optional, if not set it will be
    * generated from the version_name in the APKs.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The description of what is new in the app in this release.
    */
  var releaseNotes: js.UndefOr[js.Array[SchemaLocalizedText]] = js.native
  /**
    * The desired status of this release.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Fraction of users who are eligible to receive the release. 0 &lt;
    * fraction &lt; 1. To be set, release status must be &quot;inProgress&quot;
    * or &quot;halted&quot;.
    */
  var userFraction: js.UndefOr[Double] = js.native
  /**
    * A list of all version codes of APKs that will be exposed to the users of
    * this track when this release is rolled out. Note that this list should
    * contain all versions you wish to be active, including those you wish to
    * retain from previous releases.
    */
  var versionCodes: js.UndefOr[js.Array[String]] = js.native
}

object SchemaTrackRelease {
  @scala.inline
  def apply(): SchemaTrackRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrackRelease]
  }
  @scala.inline
  implicit class SchemaTrackReleaseOps[Self <: SchemaTrackRelease] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCountryTargeting(value: SchemaCountryTargeting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryTargeting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCountryTargeting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("countryTargeting")(js.undefined)
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
    def withReleaseNotes(value: js.Array[SchemaLocalizedText]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withUserFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userFraction")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionCodes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCodes")(js.undefined)
        ret
    }
  }
  
}

