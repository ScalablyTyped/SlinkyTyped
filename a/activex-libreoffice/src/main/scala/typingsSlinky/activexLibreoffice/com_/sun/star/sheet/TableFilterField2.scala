package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single condition in a filter descriptor.
  *
  * This struct has the {@link FilterOperator2} constants group as member, whereas the {@link TableFilterField} struct uses the FilterOperator enum.
  * @see SheetFilterDescriptor
  * @since OOo 3.2
  */
@js.native
trait TableFilterField2 extends js.Object {
  /** specifies how the condition is connected to the previous condition. */
  var Connection: FilterConnection = js.native
  /** specifies which field (column) is used for the condition. */
  var Field: Double = js.native
  /** selects whether the {@link TableFilterField2.NumericValue} or the {@link TableFilterField2.StringValue} is used. */
  var IsNumeric: Boolean = js.native
  /** specifies a numeric value for the condition. */
  var NumericValue: Double = js.native
  /** specifies the type of the condition as defined in {@link FilterOperator2} . */
  var Operator: Double = js.native
  /** specifies a string value for the condition. */
  var StringValue: String = js.native
}

object TableFilterField2 {
  @scala.inline
  def apply(
    Connection: FilterConnection,
    Field: Double,
    IsNumeric: Boolean,
    NumericValue: Double,
    Operator: Double,
    StringValue: String
  ): TableFilterField2 = {
    val __obj = js.Dynamic.literal(Connection = Connection.asInstanceOf[js.Any], Field = Field.asInstanceOf[js.Any], IsNumeric = IsNumeric.asInstanceOf[js.Any], NumericValue = NumericValue.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableFilterField2]
  }
  @scala.inline
  implicit class TableFilterField2Ops[Self <: TableFilterField2] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnection(value: FilterConnection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumericValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NumericValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOperator(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Operator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StringValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

