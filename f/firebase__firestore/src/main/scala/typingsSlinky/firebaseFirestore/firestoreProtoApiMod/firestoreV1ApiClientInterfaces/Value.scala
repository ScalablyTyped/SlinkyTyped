package typingsSlinky.firebaseFirestore.firestoreProtoApiMod.firestoreV1ApiClientInterfaces

import typingsSlinky.firebaseFirestore.anon.Nanos
import typingsSlinky.firebaseFirestore.firestoreProtoApiMod.ValueNullValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var arrayValue: js.UndefOr[ArrayValue] = js.native
  var booleanValue: js.UndefOr[Boolean] = js.native
  var bytesValue: js.UndefOr[String | js.typedarray.Uint8Array] = js.native
  var doubleValue: js.UndefOr[Double] = js.native
  var geoPointValue: js.UndefOr[LatLng] = js.native
  var integerValue: js.UndefOr[String] = js.native
  var mapValue: js.UndefOr[MapValue] = js.native
  var nullValue: js.UndefOr[ValueNullValue] = js.native
  var referenceValue: js.UndefOr[String] = js.native
  var stringValue: js.UndefOr[String] = js.native
  var timestampValue: js.UndefOr[String | Nanos] = js.native
}

object Value {
  @scala.inline
  def apply(): Value = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayValue(value: ArrayValue): Self = {
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
    def withBytesValueUint8Array(value: js.typedarray.Uint8Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bytesValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBytesValue(value: String | js.typedarray.Uint8Array): Self = {
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
    def withGeoPointValue(value: LatLng): Self = {
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
    def withMapValue(value: MapValue): Self = {
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
    def withNullValue(value: ValueNullValue): Self = {
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
    def withTimestampValue(value: String | Nanos): Self = {
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

