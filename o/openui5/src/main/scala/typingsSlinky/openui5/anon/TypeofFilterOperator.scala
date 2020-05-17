package typingsSlinky.openui5.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofFilterOperator extends js.Object {
  /**
    * FilterOperator between.When used on strings, the BT operator might not behave intuitively. For
    * example,when filtering a list of Names with BT "A", "B", all Names starting with "A" will beincluded
    * as well as the name "B" itself, but no other name starting with "B".
    */
  var BT: js.Any = js.native
  /**
    * FilterOperator contains
    */
  var Contains: js.Any = js.native
  /**
    * FilterOperator equals
    */
  var EQ: js.Any = js.native
  /**
    * FilterOperator ends with
    */
  var EndsWith: js.Any = js.native
  /**
    * FilterOperator greater or equals
    */
  var GE: js.Any = js.native
  /**
    * FilterOperator greater than
    */
  var GT: js.Any = js.native
  /**
    * FilterOperator less or equals
    */
  var LE: js.Any = js.native
  /**
    * FilterOperator less than
    */
  var LT: js.Any = js.native
  /**
    * FilterOperator not equals
    */
  var NE: js.Any = js.native
  /**
    * FilterOperator starts with
    */
  var StartsWith: js.Any = js.native
}

object TypeofFilterOperator {
  @scala.inline
  def apply(
    BT: js.Any,
    Contains: js.Any,
    EQ: js.Any,
    EndsWith: js.Any,
    GE: js.Any,
    GT: js.Any,
    LE: js.Any,
    LT: js.Any,
    NE: js.Any,
    StartsWith: js.Any
  ): TypeofFilterOperator = {
    val __obj = js.Dynamic.literal(BT = BT.asInstanceOf[js.Any], Contains = Contains.asInstanceOf[js.Any], EQ = EQ.asInstanceOf[js.Any], EndsWith = EndsWith.asInstanceOf[js.Any], GE = GE.asInstanceOf[js.Any], GT = GT.asInstanceOf[js.Any], LE = LE.asInstanceOf[js.Any], LT = LT.asInstanceOf[js.Any], NE = NE.asInstanceOf[js.Any], StartsWith = StartsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofFilterOperator]
  }
  @scala.inline
  implicit class TypeofFilterOperatorOps[Self <: TypeofFilterOperator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBT(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contains")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEQ(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EQ")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndsWith(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndsWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGE(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGT(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLE(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLT(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNE(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartsWith(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartsWith")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

