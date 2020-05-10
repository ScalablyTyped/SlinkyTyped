package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaApkListing extends js.Object {
  /**
    * The language code, in BCP 47 format (eg &quot;en-US&quot;).
    */
  var language: js.UndefOr[String] = js.native
  /**
    * Describe what&#39;s new in your APK.
    */
  var recentChanges: js.UndefOr[String] = js.native
}

object SchemaApkListing {
  @scala.inline
  def apply(): SchemaApkListing = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaApkListing]
  }
  @scala.inline
  implicit class SchemaApkListingOps[Self <: SchemaApkListing] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withRecentChanges(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecentChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recentChanges")(js.undefined)
        ret
    }
  }
  
}

