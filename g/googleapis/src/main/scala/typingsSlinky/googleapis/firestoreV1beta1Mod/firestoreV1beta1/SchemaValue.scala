package typingsSlinky.googleapis.firestoreV1beta1Mod.firestoreV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A message that can hold any of the supported value types.
  */
@js.native
trait SchemaValue extends js.Object {
  /**
    * An array value.  Cannot directly contain another array value, though can
    * contain an map which contains another array.
    */
  var arrayValue: js.UndefOr[SchemaArrayValue] = js.native
  /**
    * A boolean value.
    */
  var booleanValue: js.UndefOr[Boolean] = js.native
  /**
    * A bytes value.  Must not exceed 1 MiB - 89 bytes. Only the first 1,500
    * bytes are considered by queries.
    */
  var bytesValue: js.UndefOr[String] = js.native
  /**
    * A double value.
    */
  var doubleValue: js.UndefOr[Double] = js.native
  /**
    * A geo point value representing a point on the surface of Earth.
    */
  var geoPointValue: js.UndefOr[SchemaLatLng] = js.native
  /**
    * An integer value.
    */
  var integerValue: js.UndefOr[String] = js.native
  /**
    * A map value.
    */
  var mapValue: js.UndefOr[SchemaMapValue] = js.native
  /**
    * A null value.
    */
  var nullValue: js.UndefOr[String] = js.native
  /**
    * A reference to a document. For example:
    * `projects/{project_id}/databases/{database_id}/documents/{document_path}`.
    */
  var referenceValue: js.UndefOr[String] = js.native
  /**
    * A string value.  The string, represented as UTF-8, must not exceed 1 MiB
    * - 89 bytes. Only the first 1,500 bytes of the UTF-8 representation are
    * considered by queries.
    */
  var stringValue: js.UndefOr[String] = js.native
  /**
    * A timestamp value.  Precise only to microseconds. When stored, any
    * additional precision is rounded down.
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
    def withBytesValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBytesValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesValue")(js.undefined)
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
    def withMapValue(value: SchemaMapValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapValue")(js.undefined)
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
    def withReferenceValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferenceValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referenceValue")(js.undefined)
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

