package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSchemaSchema
  extends /**
	 * Option for JSONPDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * This is the property (xpath) in the data source where the child records of a record are located. Used in XML binding.
  	 */
  var childDataProperty: js.UndefOr[String] = js.native
  /**
  	 * A list of field definitions specifying the schema of the data source. Field objects description: {name, [type], [xpath]}
  	 * returnType="array"
  	 */
  var fields: js.UndefOr[DataSchemaSchemaFields] = js.native
  /**
  	 * This is the property in the resulting object where actual resulting records will be put. (So the result will not be array but an object if this is defined), after the potential data source transformation
  	 */
  var outputResultsName: js.UndefOr[String] = js.native
  /**
  	 * This is the property (path) in the data source where the records are located.
  	 */
  var searchField: js.UndefOr[String] = js.native
}

object DataSchemaSchema {
  @scala.inline
  def apply(): DataSchemaSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSchemaSchema]
  }
  @scala.inline
  implicit class DataSchemaSchemaOps[Self <: DataSchemaSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildDataProperty(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDataProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildDataProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childDataProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withFields(value: DataSchemaSchemaFields): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withOutputResultsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputResultsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutputResultsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputResultsName")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchField")(js.undefined)
        ret
    }
  }
  
}

