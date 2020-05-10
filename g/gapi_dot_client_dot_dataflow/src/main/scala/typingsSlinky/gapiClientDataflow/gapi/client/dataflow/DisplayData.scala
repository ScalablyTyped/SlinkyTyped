package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisplayData extends js.Object {
  /** Contains value if the data is of a boolean type. */
  var boolValue: js.UndefOr[Boolean] = js.native
  /** Contains value if the data is of duration type. */
  var durationValue: js.UndefOr[String] = js.native
  /** Contains value if the data is of float type. */
  var floatValue: js.UndefOr[Double] = js.native
  /** Contains value if the data is of int64 type. */
  var int64Value: js.UndefOr[String] = js.native
  /** Contains value if the data is of java class type. */
  var javaClassValue: js.UndefOr[String] = js.native
  /**
    * The key identifying the display data.
    * This is intended to be used as a label for the display data
    * when viewed in a dax monitoring system.
    */
  var key: js.UndefOr[String] = js.native
  /** An optional label to display in a dax UI for the element. */
  var label: js.UndefOr[String] = js.native
  /**
    * The namespace for the key. This is usually a class name or programming
    * language namespace (i.e. python module) which defines the display data.
    * This allows a dax monitoring system to specially handle the data
    * and perform custom rendering.
    */
  var namespace: js.UndefOr[String] = js.native
  /**
    * A possible additional shorter value to display.
    * For example a java_class_name_value of com.mypackage.MyDoFn
    * will be stored with MyDoFn as the short_str_value and
    * com.mypackage.MyDoFn as the java_class_name value.
    * short_str_value can be displayed and java_class_name_value
    * will be displayed as a tooltip.
    */
  var shortStrValue: js.UndefOr[String] = js.native
  /** Contains value if the data is of string type. */
  var strValue: js.UndefOr[String] = js.native
  /** Contains value if the data is of timestamp type. */
  var timestampValue: js.UndefOr[String] = js.native
  /** An optional full URL. */
  var url: js.UndefOr[String] = js.native
}

object DisplayData {
  @scala.inline
  def apply(): DisplayData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayData]
  }
  @scala.inline
  implicit class DisplayDataOps[Self <: DisplayData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDurationValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDurationValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("durationValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFloatValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFloatValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("floatValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInt64Value(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInt64Value: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("int64Value")(js.undefined)
        ret
    }
    @scala.inline
    def withJavaClassValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaClassValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJavaClassValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("javaClassValue")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(js.undefined)
        ret
    }
    @scala.inline
    def withShortStrValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortStrValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortStrValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortStrValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStrValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampValue")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

