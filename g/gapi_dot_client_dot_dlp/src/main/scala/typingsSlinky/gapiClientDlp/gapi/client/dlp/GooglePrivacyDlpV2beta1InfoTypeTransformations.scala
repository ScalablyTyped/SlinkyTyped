package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1InfoTypeTransformations extends js.Object {
  /**
    * Transformation for each info type. Cannot specify more than one
    * for a given info type. [required]
    */
  var transformations: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1InfoTypeTransformation]] = js.native
}

object GooglePrivacyDlpV2beta1InfoTypeTransformations {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1InfoTypeTransformations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1InfoTypeTransformations]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1InfoTypeTransformationsOps[Self <: GooglePrivacyDlpV2beta1InfoTypeTransformations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransformations(value: js.Array[GooglePrivacyDlpV2beta1InfoTypeTransformation]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransformations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformations")(js.undefined)
        ret
    }
  }
  
}

