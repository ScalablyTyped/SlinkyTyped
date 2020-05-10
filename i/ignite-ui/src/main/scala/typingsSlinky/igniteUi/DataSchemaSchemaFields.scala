package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSchemaSchemaFields
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * ParamType="function" optional="true" formatter function which accepts three parameters: val - value of the field; record - data source record; field - field definition; and return the formatted string. Formatter function is used when filtering by all fields.
  	 */
  var formatter: js.UndefOr[js.Any] = js.native
  /**
  	 * This option is applicable only for fields with fieldDataType="object". Reference to a function (string or function) that can be used for complex data extraction from the data records, whose return value will be used for all data operations associated with this field.
  	 */
  var mapper: js.UndefOr[String | js.Function] = js.native
  /**
  	 * Name of the field
  	 */
  var name: js.UndefOr[String] = js.native
  /**
  	 * data type of the fieldstring
  	 * number
  	 * bool
  	 * date
  	 * time
  	 * object
  	 *
  	 *
  	 * Valid values:
  	 * "time"
  	 */
  var `type`: js.UndefOr[String | Double | Boolean | js.Date | js.Object] = js.native
  /**
  	 * The XPath expression to map the node to the field
  	 */
  var xpath: js.UndefOr[String] = js.native
}

object DataSchemaSchemaFields {
  @scala.inline
  def apply(): DataSchemaSchemaFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSchemaSchemaFields]
  }
  @scala.inline
  implicit class DataSchemaSchemaFieldsOps[Self <: DataSchemaSchemaFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatter")(js.undefined)
        ret
    }
    @scala.inline
    def withMapper(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapper")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String | Double | Boolean | js.Date | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withXpath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXpath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xpath")(js.undefined)
        ret
    }
  }
  
}

