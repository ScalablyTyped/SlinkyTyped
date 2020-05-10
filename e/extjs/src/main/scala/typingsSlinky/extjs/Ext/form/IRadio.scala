package typingsSlinky.extjs.Ext.form

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRadio
  extends typingsSlinky.extjs.Ext.form.field.ICheckbox {
  /** [Method] If this radio is part of a group it will return the selected value
  		* @returns String
  		*/
  var getGroupValue: js.UndefOr[js.Function0[String]] = js.native
  /** [Property] (Boolean) */
  var isRadio: js.UndefOr[Boolean] = js.native
  /** [Method] Method to manage awareness of when components are removed from their respective Container firing a removed event  */
  @JSName("onRemoved")
  var onRemoved_IRadio: js.UndefOr[js.Function0[Unit]] = js.native
}

object IRadio {
  @scala.inline
  def apply(): IRadio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRadio]
  }
  @scala.inline
  implicit class IRadioOps[Self <: IRadio] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetGroupValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetGroupValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGroupValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRadio(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRadio")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRadio: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRadio")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRemoved(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRemoved")(js.undefined)
        ret
    }
  }
  
}

