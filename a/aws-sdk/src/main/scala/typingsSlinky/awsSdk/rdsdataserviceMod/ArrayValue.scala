package typingsSlinky.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayValue extends js.Object {
  /**
    * An array of arrays.
    */
  var arrayValues: js.UndefOr[ArrayOfArray] = js.native
  /**
    * An array of Boolean values.
    */
  var booleanValues: js.UndefOr[BooleanArray] = js.native
  /**
    * An array of integers.
    */
  var doubleValues: js.UndefOr[DoubleArray] = js.native
  /**
    * An array of floating point numbers.
    */
  var longValues: js.UndefOr[LongArray] = js.native
  /**
    * An array of strings.
    */
  var stringValues: js.UndefOr[StringArray] = js.native
}

object ArrayValue {
  @scala.inline
  def apply(): ArrayValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArrayValue]
  }
  @scala.inline
  implicit class ArrayValueOps[Self <: ArrayValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrayValues(value: ArrayOfArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrayValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayValues")(js.undefined)
        ret
    }
    @scala.inline
    def withBooleanValues(value: BooleanArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanValues")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValues(value: DoubleArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValues")(js.undefined)
        ret
    }
    @scala.inline
    def withLongValues(value: LongArray): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longValues")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValues(value: StringArray): Self = {
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

