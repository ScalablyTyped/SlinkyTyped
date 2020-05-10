package typingsSlinky.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single field of a message type.
  */
@js.native
trait SchemaField extends js.Object {
  /**
    * The field cardinality.
    */
  var cardinality: js.UndefOr[String] = js.native
  /**
    * The string value of the default value of this field. Proto2 syntax only.
    */
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The field JSON name.
    */
  var jsonName: js.UndefOr[String] = js.native
  /**
    * The field type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The field name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The field number.
    */
  var number: js.UndefOr[Double] = js.native
  /**
    * The index of the field type in Type.oneofs, for message or enumeration
    * types. The first type has index 1; zero means the type is not in the
    * list.
    */
  var oneofIndex: js.UndefOr[Double] = js.native
  /**
    * The protocol buffer options.
    */
  var options: js.UndefOr[js.Array[SchemaOption]] = js.native
  /**
    * Whether to use alternative packed wire representation.
    */
  var packed: js.UndefOr[Boolean] = js.native
  /**
    * The field type URL, without the scheme, for message or enumeration types.
    * Example: &quot;type.googleapis.com/google.protobuf.Timestamp&quot;.
    */
  var typeUrl: js.UndefOr[String] = js.native
}

object SchemaField {
  @scala.inline
  def apply(): SchemaField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaField]
  }
  @scala.inline
  implicit class SchemaFieldOps[Self <: SchemaField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardinality(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinality")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardinality: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardinality")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
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
    def withJsonName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsonName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsonName")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
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
    def withNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withOneofIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneofIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneofIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withOptions(value: js.Array[SchemaOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
    @scala.inline
    def withPacked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPacked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packed")(js.undefined)
        ret
    }
    @scala.inline
    def withTypeUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTypeUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("typeUrl")(js.undefined)
        ret
    }
  }
  
}

