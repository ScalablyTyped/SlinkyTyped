package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldFilterOpEnum extends js.Object {
  var ARRAY_CONTAINS: FieldFilterOp = js.native
  var ARRAY_CONTAINS_ANY: FieldFilterOp = js.native
  var EQUAL: FieldFilterOp = js.native
  var GREATER_THAN: FieldFilterOp = js.native
  var GREATER_THAN_OR_EQUAL: FieldFilterOp = js.native
  var IN: FieldFilterOp = js.native
  var LESS_THAN: FieldFilterOp = js.native
  var LESS_THAN_OR_EQUAL: FieldFilterOp = js.native
  var OPERATOR_UNSPECIFIED: FieldFilterOp = js.native
  def values(): js.Array[FieldFilterOp] = js.native
}

object IFieldFilterOpEnum {
  @scala.inline
  def apply(
    ARRAY_CONTAINS: FieldFilterOp,
    ARRAY_CONTAINS_ANY: FieldFilterOp,
    EQUAL: FieldFilterOp,
    GREATER_THAN: FieldFilterOp,
    GREATER_THAN_OR_EQUAL: FieldFilterOp,
    IN: FieldFilterOp,
    LESS_THAN: FieldFilterOp,
    LESS_THAN_OR_EQUAL: FieldFilterOp,
    OPERATOR_UNSPECIFIED: FieldFilterOp,
    values: () => js.Array[FieldFilterOp]
  ): IFieldFilterOpEnum = {
    val __obj = js.Dynamic.literal(ARRAY_CONTAINS = ARRAY_CONTAINS.asInstanceOf[js.Any], ARRAY_CONTAINS_ANY = ARRAY_CONTAINS_ANY.asInstanceOf[js.Any], EQUAL = EQUAL.asInstanceOf[js.Any], GREATER_THAN = GREATER_THAN.asInstanceOf[js.Any], GREATER_THAN_OR_EQUAL = GREATER_THAN_OR_EQUAL.asInstanceOf[js.Any], IN = IN.asInstanceOf[js.Any], LESS_THAN = LESS_THAN.asInstanceOf[js.Any], LESS_THAN_OR_EQUAL = LESS_THAN_OR_EQUAL.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IFieldFilterOpEnum]
  }
  @scala.inline
  implicit class IFieldFilterOpEnumOps[Self <: IFieldFilterOpEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withARRAY_CONTAINS(value: FieldFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARRAY_CONTAINS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withARRAY_CONTAINS_ANY(value: FieldFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ARRAY_CONTAINS_ANY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEQUAL(value: FieldFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EQUAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGREATER_THAN(value: FieldFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGREATER_THAN_OR_EQUAL(value: FieldFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN_OR_EQUAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIN(value: FieldFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLESS_THAN(value: FieldFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLESS_THAN_OR_EQUAL(value: FieldFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN_OR_EQUAL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPERATOR_UNSPECIFIED(value: FieldFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPERATOR_UNSPECIFIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[FieldFilterOp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

