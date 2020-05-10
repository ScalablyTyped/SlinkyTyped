package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldValue...
  */
@js.native
trait IFieldValue extends js.Object {
  /**
    * Is set to true if the value is a numeric.
    * This parameter is optional. Default is false.
    */
  var qIsNumeric: js.UndefOr[Boolean] = js.native
  /**
    * Numeric value of the field.
    * This parameter is displayed if qIsNumeric is set to true.
    * This parameter is optional.
    */
  var qNumber: js.UndefOr[Double] = js.native
  /**
    * Text related to the field value
    * This parameter is optional.
    */
  var qText: js.UndefOr[String] = js.native
}

object IFieldValue {
  @scala.inline
  def apply(): IFieldValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldValue]
  }
  @scala.inline
  implicit class IFieldValueOps[Self <: IFieldValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQIsNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQIsNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qIsNumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withQNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(js.undefined)
        ret
    }
  }
  
}

