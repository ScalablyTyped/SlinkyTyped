package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of columns&#39; values that share the same ldiversity value.
  */
@js.native
trait SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass extends js.Object {
  /**
    * Size of the k-anonymity equivalence class.
    */
  var equivalenceClassSize: js.UndefOr[String] = js.native
  /**
    * Number of distinct sensitive values in this equivalence class.
    */
  var numDistinctSensitiveValues: js.UndefOr[String] = js.native
  /**
    * Quasi-identifier values defining the k-anonymity equivalence class. The
    * order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
  /**
    * Estimated frequencies of top sensitive values.
    */
  var topSensitiveValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]] = js.native
}

object SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LDiversityEquivalenceClassOps[Self <: SchemaGooglePrivacyDlpV2LDiversityEquivalenceClass] (val x: Self) extends AnyVal {
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
    def withQuasiIdsValues(value: js.Array[SchemaGooglePrivacyDlpV2Value]): Self = {
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
    def withTopSensitiveValues(value: js.Array[SchemaGooglePrivacyDlpV2ValueFrequency]): Self = {
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

