package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A typed name-value pair for structured data.  The type of the value should
  * be the same as the registered type for the `name` property in the object
  * definition of `objectType`.
  */
@js.native
trait SchemaNamedProperty extends js.Object {
  var booleanValue: js.UndefOr[Boolean] = js.native
  var dateValues: js.UndefOr[SchemaDateValues] = js.native
  var doubleValues: js.UndefOr[SchemaDoubleValues] = js.native
  var enumValues: js.UndefOr[SchemaEnumValues] = js.native
  var htmlValues: js.UndefOr[SchemaHtmlValues] = js.native
  var integerValues: js.UndefOr[SchemaIntegerValues] = js.native
  /**
    * The name of the property.  This name should correspond to the name of the
    * property that was registered for object definition in the schema. The
    * maximum allowable length for this property is 256 characters.
    */
  var name: js.UndefOr[String] = js.native
  var objectValues: js.UndefOr[SchemaObjectValues] = js.native
  var textValues: js.UndefOr[SchemaTextValues] = js.native
  var timestampValues: js.UndefOr[SchemaTimestampValues] = js.native
}

object SchemaNamedProperty {
  @scala.inline
  def apply(): SchemaNamedProperty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNamedProperty]
  }
  @scala.inline
  implicit class SchemaNamedPropertyOps[Self <: SchemaNamedProperty] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleanValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDateValues(value: SchemaDateValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValues(value: SchemaDoubleValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValues")(js.undefined)
        ret
    }
    @scala.inline
    def withEnumValues(value: SchemaEnumValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumValues")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlValues(value: SchemaHtmlValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlValues")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerValues(value: SchemaIntegerValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerValues")(js.undefined)
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
    def withObjectValues(value: SchemaObjectValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTextValues(value: SchemaTextValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampValues(value: SchemaTimestampValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampValues")(js.undefined)
        ret
    }
  }
  
}

