package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single field in a sort descriptor.
  * @deprecated Deprecated
  */
@js.native
trait SortField extends js.Object {
  /** index of the field in the table; 0-based. */
  var Field: Double = js.native
  /** type of contents in the field. */
  var FieldType: SortFieldType = js.native
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var SortAscending: Boolean = js.native
}

object SortField {
  @scala.inline
  def apply(Field: Double, FieldType: SortFieldType, SortAscending: Boolean): SortField = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
  @scala.inline
  implicit class SortFieldOps[Self <: SortField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldType(value: SortFieldType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FieldType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortAscending(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SortAscending")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

