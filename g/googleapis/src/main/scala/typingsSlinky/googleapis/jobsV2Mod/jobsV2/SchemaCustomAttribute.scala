package typingsSlinky.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Custom attribute values that are either filterable or non-filterable.
  */
@js.native
trait SchemaCustomAttribute extends js.Object {
  /**
    * Optional.  If the `filterable` flag is true, custom field values are
    * searchable. If false, values are not searchable.  Default is false.
    */
  var filterable: js.UndefOr[Boolean] = js.native
  /**
    * Optional but at least one of string_values or long_value must be
    * specified.  This field is used to perform number range search. (`EQ`,
    * `GT`, `GE`, `LE`, `LT`) over filterable `long_value`. For `long_value`, a
    * value between Long.MIN and Long.MAX is allowed.
    */
  var longValue: js.UndefOr[String] = js.native
  /**
    * Optional but at least one of string_values or long_value must be
    * specified.  This field is used to perform a string match
    * (`CASE_SENSITIVE_MATCH` or `CASE_INSENSITIVE_MATCH`) search. For
    * filterable `string_values`, a maximum total number of 200 values is
    * allowed, with each `string_value` has a byte size of no more than 255B.
    * For unfilterable `string_values`, the maximum total byte size of
    * unfilterable `string_values` is 50KB.  Empty strings are not allowed.
    */
  var stringValues: js.UndefOr[SchemaStringValues] = js.native
}

object SchemaCustomAttribute {
  @scala.inline
  def apply(): SchemaCustomAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomAttribute]
  }
  @scala.inline
  implicit class SchemaCustomAttributeOps[Self <: SchemaCustomAttribute] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterable")(js.undefined)
        ret
    }
    @scala.inline
    def withLongValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValues(value: SchemaStringValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValues")(js.undefined)
        ret
    }
  }
  
}

