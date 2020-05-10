package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InfoTypeTransformation extends js.Object {
  /**
    * Info types to apply the transformation to. Empty list will match all
    * available info types for this transformation.
    */
  var infoTypes: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoType]] = js.native
  /** Primitive transformation to apply to the info type. [required] */
  var primitiveTransformation: js.UndefOr[GooglePrivacyDlpV2beta1PrimitiveTransformation] = js.native
}

object GooglePrivacyDlpV2beta1InfoTypeTransformation {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InfoTypeTransformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeTransformation]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InfoTypeTransformationOps[Self <: GooglePrivacyDlpV2beta1InfoTypeTransformation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInfoTypes(value: js.Array[GooglePrivacyDlpV2beta1InfoType]): Self = {
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
    def withPrimitiveTransformation(value: GooglePrivacyDlpV2beta1PrimitiveTransformation): Self = {
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

