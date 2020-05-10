package typingsSlinky.gapiClientSqladmin.gapi.client.sqladmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocationPreference extends js.Object {
  /** The AppEngine application to follow, it must be in the same region as the Cloud SQL instance. */
  var followGaeApplication: js.UndefOr[String] = js.native
  /** This is always sql#locationPreference. */
  var kind: js.UndefOr[String] = js.native
  /** The preferred Compute Engine zone (e.g. us-centra1-a, us-central1-b, etc.). */
  var zone: js.UndefOr[String] = js.native
}

object LocationPreference {
  @scala.inline
  def apply(): LocationPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationPreference]
  }
  @scala.inline
  implicit class LocationPreferenceOps[Self <: LocationPreference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFollowGaeApplication(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followGaeApplication")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowGaeApplication: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followGaeApplication")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

