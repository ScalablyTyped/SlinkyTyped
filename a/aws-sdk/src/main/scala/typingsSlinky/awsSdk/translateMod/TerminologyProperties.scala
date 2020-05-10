package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminologyProperties extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the custom terminology. 
    */
  var Arn: js.UndefOr[TerminologyArn] = js.native
  /**
    * The time at which the custom terminology was created, based on the timestamp.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The description of the custom terminology properties.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.translateMod.Description] = js.native
  /**
    * The encryption key for the custom terminology.
    */
  var EncryptionKey: js.UndefOr[typingsSlinky.awsSdk.translateMod.EncryptionKey] = js.native
  /**
    * The time at which the custom terminology was last update, based on the timestamp.
    */
  var LastUpdatedAt: js.UndefOr[js.Date] = js.native
  /**
    * The name of the custom terminology.
    */
  var Name: js.UndefOr[ResourceName] = js.native
  /**
    * The size of the file used when importing a custom terminology.
    */
  var SizeBytes: js.UndefOr[Integer] = js.native
  /**
    * The language code for the source text of the translation request for which the custom terminology is being used.
    */
  var SourceLanguageCode: js.UndefOr[LanguageCodeString] = js.native
  /**
    * The language codes for the target languages available with the custom terminology file. All possible target languages are returned in array.
    */
  var TargetLanguageCodes: js.UndefOr[LanguageCodeStringList] = js.native
  /**
    * The number of terms included in the custom terminology.
    */
  var TermCount: js.UndefOr[Integer] = js.native
}

object TerminologyProperties {
  @scala.inline
  def apply(): TerminologyProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminologyProperties]
  }
  @scala.inline
  implicit class TerminologyPropertiesOps[Self <: TerminologyProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: TerminologyArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKey(value: EncryptionKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EncryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdatedAt(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedAt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdatedAt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastUpdatedAt")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeBytes(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withSourceLanguageCode(value: LanguageCodeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLanguageCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourceLanguageCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourceLanguageCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetLanguageCodes(value: LanguageCodeStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLanguageCodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetLanguageCodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TargetLanguageCodes")(js.undefined)
        ret
    }
    @scala.inline
    def withTermCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TermCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TermCount")(js.undefined)
        ret
    }
  }
  
}

