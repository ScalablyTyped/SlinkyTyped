package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration for a StoredInfoType.
  */
@js.native
trait SchemaGooglePrivacyDlpV2StoredInfoTypeConfig extends js.Object {
  /**
    * Description of the StoredInfoType (max 256 characters).
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Display name of the StoredInfoType (max 256 characters).
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * StoredInfoType where findings are defined by a dictionary of phrases.
    */
  var largeCustomDictionary: js.UndefOr[SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig] = js.native
}

object SchemaGooglePrivacyDlpV2StoredInfoTypeConfig {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2StoredInfoTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2StoredInfoTypeConfig]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2StoredInfoTypeConfigOps[Self <: SchemaGooglePrivacyDlpV2StoredInfoTypeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLargeCustomDictionary(value: SchemaGooglePrivacyDlpV2LargeCustomDictionaryConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeCustomDictionary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargeCustomDictionary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largeCustomDictionary")(js.undefined)
        ret
    }
  }
  
}

