package typingsSlinky.gapiClientDlp.gapi.client.dlp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GooglePrivacyDlpV2beta1LDiversityEquivalenceClass extends js.Object {
  /** Size of the k-anonymity equivalence class. */
  var equivalenceClassSize: js.UndefOr[String] = js.native
  /** Number of distinct sensitive values in this equivalence class. */
  var numDistinctSensitiveValues: js.UndefOr[String] = js.native
  /**
    * Quasi-identifier values defining the k-anonymity equivalence
    * class. The order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1Value]] = js.native
  /** Estimated frequencies of top sensitive values. */
  var topSensitiveValues: js.UndefOr[js.Array[GooglePrivacyDlpV2beta1ValueFrequency]] = js.native
}

object GooglePrivacyDlpV2beta1LDiversityEquivalenceClass {
  @scala.inline
  def apply(): GooglePrivacyDlpV2beta1LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GooglePrivacyDlpV2beta1LDiversityEquivalenceClass]
  }
  @scala.inline
  implicit class GooglePrivacyDlpV2beta1LDiversityEquivalenceClassOps[Self <: GooglePrivacyDlpV2beta1LDiversityEquivalenceClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEquivalenceClassSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalenceClassSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEquivalenceClassSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equivalenceClassSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNumDistinctSensitiveValues(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDistinctSensitiveValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumDistinctSensitiveValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numDistinctSensitiveValues")(js.undefined)
        ret
    }
    @scala.inline
    def withQuasiIdsValues(value: js.Array[GooglePrivacyDlpV2beta1Value]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quasiIdsValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuasiIdsValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quasiIdsValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTopSensitiveValues(value: js.Array[GooglePrivacyDlpV2beta1ValueFrequency]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topSensitiveValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopSensitiveValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topSensitiveValues")(js.undefined)
        ret
    }
  }
  
}

