package typingsSlinky.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KiiThingFields
  extends /**
  * custom fields.
  */
/* name */ StringDictionary[js.Any] {
  /**
    * firmware version given by thing vendor.
    */
  var _firmwareVersion: js.UndefOr[String] = js.native
  /**
    * lot identifier given by thing vendor.
    */
  var _lot: js.UndefOr[String] = js.native
  /**
    * arbitrary number field.
    */
  var _numberField1: js.UndefOr[Double] = js.native
  /**
    * arbitrary number field.
    */
  var _numberField2: js.UndefOr[Double] = js.native
  /**
    * arbitrary number field.
    */
  var _numberField3: js.UndefOr[Double] = js.native
  /**
    * arbitrary number field.
    */
  var _numberField4: js.UndefOr[Double] = js.native
  /**
    * arbitrary number field.
    */
  var _numberField5: js.UndefOr[Double] = js.native
  /**
    * thing password given by thing vendor.
    */
  var _password: String = js.native
  /**
    * product name given by thing vendor.
    */
  var _productName: js.UndefOr[String] = js.native
  /**
    * arbitrary string field.
    */
  var _stringField1: js.UndefOr[String] = js.native
  /**
    * arbitrary string field.
    */
  var _stringField2: js.UndefOr[String] = js.native
  /**
    * arbitrary string field.
    */
  var _stringField3: js.UndefOr[String] = js.native
  /**
    * arbitrary string field.
    */
  var _stringField4: js.UndefOr[String] = js.native
  /**
    * arbitrary string field.
    */
  var _stringField5: js.UndefOr[String] = js.native
  /**
    * thing type given by thing vendor.
    */
  var _thingType: js.UndefOr[String] = js.native
  /**
    * vendor identifier given by thing vendor.
    */
  var _vendor: js.UndefOr[String] = js.native
  /**
    * thing identifier given by thing vendor.
    */
  var _vendorThingID: String = js.native
}

object KiiThingFields {
  @scala.inline
  def apply(_password: String, _vendorThingID: String): KiiThingFields = {
    val __obj = js.Dynamic.literal(_password = _password.asInstanceOf[js.Any], _vendorThingID = _vendorThingID.asInstanceOf[js.Any])
    __obj.asInstanceOf[KiiThingFields]
  }
  @scala.inline
  implicit class KiiThingFieldsOps[Self <: KiiThingFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_password(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_password")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_vendorThingID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vendorThingID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_firmwareVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_firmwareVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_firmwareVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_firmwareVersion")(js.undefined)
        ret
    }
    @scala.inline
    def with_lot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_lot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_lot")(js.undefined)
        ret
    }
    @scala.inline
    def with_numberField1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_numberField1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField1")(js.undefined)
        ret
    }
    @scala.inline
    def with_numberField2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_numberField2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField2")(js.undefined)
        ret
    }
    @scala.inline
    def with_numberField3(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_numberField3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField3")(js.undefined)
        ret
    }
    @scala.inline
    def with_numberField4(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_numberField4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField4")(js.undefined)
        ret
    }
    @scala.inline
    def with_numberField5(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_numberField5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_numberField5")(js.undefined)
        ret
    }
    @scala.inline
    def with_productName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_productName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_productName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_productName")(js.undefined)
        ret
    }
    @scala.inline
    def with_stringField1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_stringField1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField1")(js.undefined)
        ret
    }
    @scala.inline
    def with_stringField2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_stringField2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField2")(js.undefined)
        ret
    }
    @scala.inline
    def with_stringField3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_stringField3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField3")(js.undefined)
        ret
    }
    @scala.inline
    def with_stringField4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_stringField4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField4")(js.undefined)
        ret
    }
    @scala.inline
    def with_stringField5(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_stringField5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_stringField5")(js.undefined)
        ret
    }
    @scala.inline
    def with_thingType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_thingType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_thingType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_thingType")(js.undefined)
        ret
    }
    @scala.inline
    def with_vendor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vendor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_vendor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_vendor")(js.undefined)
        ret
    }
  }
  
}

