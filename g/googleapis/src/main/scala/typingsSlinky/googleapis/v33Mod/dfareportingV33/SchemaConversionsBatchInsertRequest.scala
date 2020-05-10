package typingsSlinky.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Insert Conversions Request.
  */
@js.native
trait SchemaConversionsBatchInsertRequest extends js.Object {
  /**
    * The set of conversions to insert.
    */
  var conversions: js.UndefOr[js.Array[SchemaConversion]] = js.native
  /**
    * Describes how encryptedUserId or encryptedUserIdCandidates[] is
    * encrypted. This is a required field if encryptedUserId or
    * encryptedUserIdCandidates[] is used.
    */
  var encryptionInfo: js.UndefOr[SchemaEncryptionInfo] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#conversionsBatchInsertRequest&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaConversionsBatchInsertRequest {
  @scala.inline
  def apply(): SchemaConversionsBatchInsertRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConversionsBatchInsertRequest]
  }
  @scala.inline
  implicit class SchemaConversionsBatchInsertRequestOps[Self <: SchemaConversionsBatchInsertRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConversions(value: js.Array[SchemaConversion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConversions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conversions")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionInfo(value: SchemaEncryptionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionInfo")(js.undefined)
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
  }
  
}

