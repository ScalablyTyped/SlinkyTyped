package typingsSlinky.googleapis.v1beta3Mod.datastoreV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message that can hold any of the supported value types and associated
  * metadata.
  */
@js.native
trait SchemaValue extends js.Object {
  /**
    * An array value. Cannot contain another array value. A `Value` instance
    * that sets field `array_value` must not set fields `meaning` or
    * `exclude_from_indexes`.
    */
  var arrayValue: js.UndefOr[SchemaArrayValue] = js.native
  /**
    * A blob value. May have at most 1,000,000 bytes. When
    * `exclude_from_indexes` is false, may have at most 1500 bytes. In JSON
    * requests, must be base64-encoded.
    */
  var blobValue: js.UndefOr[String] = js.native
  /**
    * A boolean value.
    */
  var booleanValue: js.UndefOr[Boolean] = js.native
  /**
    * A double value.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * An entity value.  - May have no key. - May have a key with an incomplete
    * key path. - May have a reserved/read-only key.
    */
  var entityValue: js.UndefOr[SchemaEntity] = js.native
  /**
    * If the value should be excluded from all indexes including those defined
    * explicitly.
    */
  var excludeFromIndexes: js.UndefOr[Boolean] = js.native
  /**
    * A geo point value representing a point on the surface of Earth.
    */
  var geoPointValue: js.UndefOr[SchemaLatLng] = js.native
  /**
    * An integer value.
    */
  var integerValue: js.UndefOr[String] = js.native
  /**
    * A key value.
    */
  var keyValue: js.UndefOr[SchemaKey] = js.native
  /**
    * The `meaning` field should only be populated for backwards compatibility.
    */
  var meaning: js.UndefOr[Double] = js.native
  /**
    * A null value.
    */
  var nullValue: js.UndefOr[String] = js.native
  /**
    * A UTF-8 encoded string value. When `exclude_from_indexes` is false (it is
    * indexed) , may have at most 1500 bytes. Otherwise, may be set to at least
    * 1,000,000 bytes.
    */
  var stringValue: js.UndefOr[String] = js.native
  /**
    * A timestamp value. When stored in the Datastore, precise only to
    * microseconds; any additional precision is rounded down.
    */
  var timestampValue: js.UndefOr[String] = js.native
}

object SchemaValue {
  @scala.inline
  def apply(): SchemaValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaValue]
  }
  @scala.inline
  implicit class SchemaValueOps[Self <: SchemaValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayValue(value: SchemaArrayValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValue")(js.undefined)
        ret
    }
    @scala.inline
    def withBlobValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlobValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blobValue")(js.undefined)
        ret
    }
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
    def withDoubleValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityValue(value: SchemaEntity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityValue")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeFromIndexes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeFromIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeFromIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withGeoPointValue(value: SchemaLatLng): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoPointValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGeoPointValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("geoPointValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyValue(value: SchemaKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMeaning(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meaning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMeaning: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meaning")(js.undefined)
        ret
    }
    @scala.inline
    def withNullValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
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
  }
  
}

