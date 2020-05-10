package typingsSlinky.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The definition of a property within an object.
  */
@js.native
trait SchemaPropertyDefinition extends js.Object {
  var booleanPropertyOptions: js.UndefOr[SchemaBooleanPropertyOptions] = js.native
  var datePropertyOptions: js.UndefOr[SchemaDatePropertyOptions] = js.native
  /**
    * Options that determine how the property is displayed in the Cloud Search
    * results page if it is specified to be displayed in the object&#39;s
    * display options .
    */
  var displayOptions: js.UndefOr[SchemaPropertyDisplayOptions] = js.native
  var doublePropertyOptions: js.UndefOr[SchemaDoublePropertyOptions] = js.native
  var enumPropertyOptions: js.UndefOr[SchemaEnumPropertyOptions] = js.native
  var htmlPropertyOptions: js.UndefOr[SchemaHtmlPropertyOptions] = js.native
  var integerPropertyOptions: js.UndefOr[SchemaIntegerPropertyOptions] = js.native
  /**
    * Indicates that the property can be used for generating facets. Cannot be
    * true for properties whose type is object. IsReturnable must be true to
    * set this option. Only supported for Boolean, Enum, and Text properties.
    */
  var isFacetable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that multiple values are allowed for the property. For example,
    * a document only has one description but can have multiple comments.
    * Cannot be true for properties whose type is a boolean. If set to false,
    * properties that contain more than one value will cause the indexing
    * request for that item to be rejected.
    */
  var isRepeatable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the property identifies data that should be returned in
    * search results via the Query API. If set to *true*, indicates that Query
    * API users can use matching property fields in results. However, storing
    * fields requires more space allocation and uses more bandwidth for search
    * queries, which impacts performance over large datasets. Set to *true*
    * here only if the field is needed for search results. Cannot be true for
    * properties whose type is an object.
    */
  var isReturnable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates that the property can be used for sorting. Cannot be true for
    * properties that are repeatable. Cannot be true for properties whose type
    * is object or user identifier. IsReturnable must be true to set this
    * option. Only supported for Boolean, Date, Double, Integer, and Timestamp
    * properties.
    */
  var isSortable: js.UndefOr[Boolean] = js.native
  /**
    * The name of the property. Item indexing requests sent to the Indexing API
    * should set the property name equal to this value. For example, if name is
    * *subject_line*, then indexing requests for document items with subject
    * fields should set the name for that field equal to *subject_line*. Use
    * the name as the identifier for the object property. Once registered as a
    * property for an object, you cannot re-use this name for another property
    * within that object. The name must start with a letter and can only
    * contain letters (A-Z, a-z) or numbers (0-9). The maximum length is 256
    * characters.
    */
  var name: js.UndefOr[String] = js.native
  var objectPropertyOptions: js.UndefOr[SchemaObjectPropertyOptions] = js.native
  var textPropertyOptions: js.UndefOr[SchemaTextPropertyOptions] = js.native
  var timestampPropertyOptions: js.UndefOr[SchemaTimestampPropertyOptions] = js.native
}

object SchemaPropertyDefinition {
  @scala.inline
  def apply(): SchemaPropertyDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyDefinition]
  }
  @scala.inline
  implicit class SchemaPropertyDefinitionOps[Self <: SchemaPropertyDefinition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleanPropertyOptions(value: SchemaBooleanPropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanPropertyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanPropertyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanPropertyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDatePropertyOptions(value: SchemaDatePropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePropertyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatePropertyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datePropertyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayOptions(value: SchemaPropertyDisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withDoublePropertyOptions(value: SchemaDoublePropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doublePropertyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoublePropertyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doublePropertyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEnumPropertyOptions(value: SchemaEnumPropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumPropertyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnumPropertyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enumPropertyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlPropertyOptions(value: SchemaHtmlPropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlPropertyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlPropertyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlPropertyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerPropertyOptions(value: SchemaIntegerPropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerPropertyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerPropertyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerPropertyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFacetable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFacetable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFacetable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFacetable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRepeatable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRepeatable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRepeatable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRepeatable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsReturnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReturnable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsReturnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReturnable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSortable")(js.undefined)
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
    def withObjectPropertyOptions(value: SchemaObjectPropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPropertyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectPropertyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectPropertyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTextPropertyOptions(value: SchemaTextPropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPropertyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextPropertyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textPropertyOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestampPropertyOptions(value: SchemaTimestampPropertyOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampPropertyOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestampPropertyOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestampPropertyOptions")(js.undefined)
        ret
    }
  }
  
}

