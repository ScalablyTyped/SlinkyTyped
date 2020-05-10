package typingsSlinky.googleapis.safebrowsingV4Mod.safebrowsingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A match when checking a threat entry in the Safe Browsing threat lists.
  */
@js.native
trait SchemaThreatMatch extends js.Object {
  /**
    * The cache lifetime for the returned match. Clients must not cache this
    * response for more than this duration to avoid false positives.
    */
  var cacheDuration: js.UndefOr[String] = js.native
  /**
    * The platform type matching this threat.
    */
  var platformType: js.UndefOr[String] = js.native
  /**
    * The threat matching this threat.
    */
  var threat: js.UndefOr[SchemaThreatEntry] = js.native
  /**
    * Optional metadata associated with this threat.
    */
  var threatEntryMetadata: js.UndefOr[SchemaThreatEntryMetadata] = js.native
  /**
    * The threat entry type matching this threat.
    */
  var threatEntryType: js.UndefOr[String] = js.native
  /**
    * The threat type matching this threat.
    */
  var threatType: js.UndefOr[String] = js.native
}

object SchemaThreatMatch {
  @scala.inline
  def apply(): SchemaThreatMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaThreatMatch]
  }
  @scala.inline
  implicit class SchemaThreatMatchOps[Self <: SchemaThreatMatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCacheDuration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withPlatformType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlatformType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformType")(js.undefined)
        ret
    }
    @scala.inline
    def withThreat(value: SchemaThreatEntry): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threat")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatEntryMetadata(value: SchemaThreatEntryMetadata): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntryMetadata")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatEntryMetadata: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntryMetadata")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatEntryType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntryType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatEntryType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatEntryType")(js.undefined)
        ret
    }
    @scala.inline
    def withThreatType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreatType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threatType")(js.undefined)
        ret
    }
  }
  
}

