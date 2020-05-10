package typingsSlinky.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportTerminologyRequest extends js.Object {
  /**
    * The description of the custom terminology being imported.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.translateMod.Description] = js.native
  /**
    * The encryption key for the custom terminology being imported.
    */
  var EncryptionKey: js.UndefOr[typingsSlinky.awsSdk.translateMod.EncryptionKey] = js.native
  /**
    * The merge strategy of the custom terminology being imported. Currently, only the OVERWRITE merge strategy is supported. In this case, the imported terminology will overwrite an existing terminology of the same name.
    */
  var MergeStrategy: typingsSlinky.awsSdk.translateMod.MergeStrategy = js.native
  /**
    * The name of the custom terminology being imported.
    */
  var Name: ResourceName = js.native
  /**
    * The terminology data for the custom terminology being imported.
    */
  var TerminologyData: typingsSlinky.awsSdk.translateMod.TerminologyData = js.native
}

object ImportTerminologyRequest {
  @scala.inline
  def apply(MergeStrategy: MergeStrategy, Name: ResourceName, TerminologyData: TerminologyData): ImportTerminologyRequest = {
    val __obj = js.Dynamic.literal(MergeStrategy = MergeStrategy.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TerminologyData = TerminologyData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportTerminologyRequest]
  }
  @scala.inline
  implicit class ImportTerminologyRequestOps[Self <: ImportTerminologyRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMergeStrategy(value: MergeStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MergeStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminologyData(value: TerminologyData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TerminologyData")(value.asInstanceOf[js.Any])
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
  }
  
}

