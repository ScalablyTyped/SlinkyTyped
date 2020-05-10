package typingsSlinky.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a single version of the app.
  */
@js.native
trait SchemaAppVersion extends js.Object {
  /**
    * True if this version is a production APK.
    */
  var isProduction: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated, use trackId instead.
    */
  var track: js.UndefOr[String] = js.native
  /**
    * Track ids that the app version is published in. Replaces the track field
    * (deprecated), but doesn&#39;t include the production track (see
    * isProduction instead).
    */
  var trackId: js.UndefOr[js.Array[String]] = js.native
  /**
    * Unique increasing identifier for the app version.
    */
  var versionCode: js.UndefOr[Double] = js.native
  /**
    * The string used in the Play store by the app developer to identify the
    * version. The string is not necessarily unique or localized (for example,
    * the string could be &quot;1.4&quot;).
    */
  var versionString: js.UndefOr[String] = js.native
}

object SchemaAppVersion {
  @scala.inline
  def apply(): SchemaAppVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppVersion]
  }
  @scala.inline
  implicit class SchemaAppVersionOps[Self <: SchemaAppVersion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsProduction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsProduction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isProduction")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackId")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionCode")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionString")(js.undefined)
        ret
    }
  }
  
}

