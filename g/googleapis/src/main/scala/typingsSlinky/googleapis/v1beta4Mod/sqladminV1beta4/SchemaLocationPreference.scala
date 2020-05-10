package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Preferred location. This specifies where a Cloud SQL instance should
  * preferably be located, either in a specific Compute Engine zone, or
  * co-located with an App Engine application. Note that if the preferred
  * location is not available, the instance will be located as close as
  * possible within the region. Only one location may be specified.
  */
@js.native
trait SchemaLocationPreference extends js.Object {
  /**
    * The AppEngine application to follow, it must be in the same region as the
    * Cloud SQL instance.
    */
  var followGaeApplication: js.UndefOr[String] = js.native
  /**
    * This is always sql#locationPreference.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The preferred Compute Engine zone (e.g. us-central1-a, us-central1-b,
    * etc.).
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaLocationPreference {
  @scala.inline
  def apply(): SchemaLocationPreference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocationPreference]
  }
  @scala.inline
  implicit class SchemaLocationPreferenceOps[Self <: SchemaLocationPreference] (val x: Self) extends AnyVal {
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

