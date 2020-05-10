package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`count-or-amount`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`date-and-time`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`global-id`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`location-or-place-name`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`name-or-title`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`ordered-or-ranked`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`percentage-or-ratio`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`small-integer`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`type-or-category`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.`unique-identifier`
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.binary
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.blob
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.coordinate
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.date
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.description
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.double
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.guid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.integer
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.long
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.measurement
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.none
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.oid
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.raster
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.single
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.string
import typingsSlinky.arcgisJsApi.arcgisJsApiStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldProperties extends js.Object {
  /**
    * The display name for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#alias)
    *
    * @default null
    */
  var alias: js.UndefOr[String] = js.native
  /**
    * The default value set for the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#defaultValue)
    *
    * @default undefined
    */
  var defaultValue: js.UndefOr[Double | String | js.Any] = js.native
  /**
    * Contains information describing the purpose of each field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The domain associated with the field. Domains are used to constrain the values allowed in a field. There are two types of domains: [RangeDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) and [CodedValueDomain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#domain)
    *
    * @default null
    */
  var domain: js.UndefOr[DomainProperties] = js.native
  /**
    * Indicates whether the field is editable.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#editable)
    *
    * @default true
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * The field length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#length)
    *
    * @default -1
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#name)
    *
    * @default null
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Indicates if the field can accept `null` values. *Requires ArcGIS Server version 10.1 or greater.*
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#nullable)
    *
    * @default true
    */
  var nullable: js.UndefOr[Boolean] = js.native
  /**
    * The data type of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#type)
    *
    * @default null
    */
  var `type`: js.UndefOr[
    `small-integer` | integer | single | double | long | string | date | oid | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
  ] = js.native
  /**
    * The types of values that can be assigned to a field. See the table below for a list of possible values.
    *
    * | Mode | Description |
    * | ------|------------ |
    * | name-or-title | Text that represents a name, title, label, or keyword for each feature. |
    * | description | Text that provides a longer description of the feature, more than just a name or title. |
    * | type-or-category | Types or categories that group features based on common characteristics. |
    * | count-or-amount | Integers (no decimal) that represent how many or how much there is of a specific attribute. |
    * | percentage-or-ratio | Number values in this field reflect the relationship between different quantities. |
    * | measurement | A number that reflects a characteristic that you can precisely measure. |
    * | unique-identifier | The values in this field are used to positively distinguish one feature or entity from another. |
    * | ordered-or-ranked | The values in this field represent a feature's status in an ordered or ranked list. For example, a feature could be one of the following: `Small, medium, large`, `First, second, third, fourth`, or `Informational, warning, error, failure`.|
    * | binary | Only one of two values are possible for each feature. Some examples include the following: `On or off`, `Yes or no`, `True or false`, or `Inhabited or vacant`. |
    * | location-or-place-name | Values in this field represent a geographic location. Examples of values in such a field include a street address, city name, region, building name (such as A.K. Smiley Public Library), attraction name (such as Alameda County Fairgrounds or Cairngorms National Park), postal code, or country. |
    * | coordinate | These fields store a geographic coordinate value such as x, y, z, latitude, or longitude. |
    * | date-and-time | Values in this field store explicit dates and times or date references such as days of the week, months, or years. |
    * | none | No specified type. |
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Field.html#valueType)
    */
  var valueType: js.UndefOr[
    binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier`
  ] = js.native
}

object FieldProperties {
  @scala.inline
  def apply(): FieldProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldProperties]
  }
  @scala.inline
  implicit class FieldPropertiesOps[Self <: FieldProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlias(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alias")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: Double | String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: DomainProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domain")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
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
    def withNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullable")(js.undefined)
        ret
    }
    @scala.inline
    def withType(
      value: `small-integer` | integer | single | double | long | string | date | oid | typingsSlinky.arcgisJsApi.arcgisJsApiStrings.geometry | blob | raster | guid | `global-id` | xml
    ): Self = {
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
    def withValueType(
      value: binary | coordinate | `count-or-amount` | `date-and-time` | description | `location-or-place-name` | measurement | `name-or-title` | none | `ordered-or-ranked` | `percentage-or-ratio` | `type-or-category` | `unique-identifier`
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
        ret
    }
  }
  
}

