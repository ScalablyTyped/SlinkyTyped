package typingsSlinky.googleapis.spannerV1Mod.spannerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Type` indicates the type of a Cloud Spanner value, as might be stored in a
  * table cell or returned from an SQL query.
  */
@js.native
trait SchemaType extends js.Object {
  /**
    * If code == ARRAY, then `array_element_type` is the type of the array
    * elements.
    */
  var arrayElementType: js.UndefOr[SchemaType] = js.native
  /**
    * Required. The TypeCode for this type.
    */
  var code: js.UndefOr[String] = js.native
  /**
    * If code == STRUCT, then `struct_type` provides type information for the
    * struct&#39;s fields.
    */
  var structType: js.UndefOr[SchemaStructType] = js.native
}

object SchemaType {
  @scala.inline
  def apply(): SchemaType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaType]
  }
  @scala.inline
  implicit class SchemaTypeOps[Self <: SchemaType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayElementType(value: SchemaType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayElementType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayElementType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayElementType")(js.undefined)
        ret
    }
    @scala.inline
    def withCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("code")(js.undefined)
        ret
    }
    @scala.inline
    def withStructType(value: SchemaStructType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStructType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("structType")(js.undefined)
        ret
    }
  }
  
}

