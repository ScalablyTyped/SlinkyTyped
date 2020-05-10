package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The set of columns&#39; values that share the same ldiversity value
  */
@js.native
trait SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass extends js.Object {
  /**
    * Size of the equivalence class, for example number of rows with the above
    * set of values.
    */
  var equivalenceClassSize: js.UndefOr[String] = js.native
  /**
    * Set of values defining the equivalence class. One value per
    * quasi-identifier column in the original KAnonymity metric message. The
    * order is always the same as the original request.
    */
  var quasiIdsValues: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2Value]] = js.native
}

object SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClassOps[Self <: SchemaGooglePrivacyDlpV2KAnonymityEquivalenceClass] (val x: Self) extends AnyVal {
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
  }
  
}

