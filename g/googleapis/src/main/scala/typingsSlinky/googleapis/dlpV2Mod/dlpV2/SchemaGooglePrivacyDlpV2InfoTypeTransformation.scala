package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A transformation to apply to text that is identified as a specific
  * info_type.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InfoTypeTransformation extends js.Object {
  /**
    * InfoTypes to apply the transformation to. An empty list will cause this
    * transformation to apply to all findings that correspond to infoTypes that
    * were requested in `InspectConfig`.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.native
  /**
    * Primitive transformation to apply to the infoType. [required]
    */
  var primitiveTransformation: js.UndefOr[SchemaGooglePrivacyDlpV2PrimitiveTransformation] = js.native
}

object SchemaGooglePrivacyDlpV2InfoTypeTransformation {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InfoTypeTransformation]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InfoTypeTransformationOps[Self <: SchemaGooglePrivacyDlpV2InfoTypeTransformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInfoTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("infoTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimitiveTransformation(value: SchemaGooglePrivacyDlpV2PrimitiveTransformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitiveTransformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimitiveTransformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primitiveTransformation")(js.undefined)
        ret
    }
  }
  
}

