package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.IBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFieldAncestor extends IBase {
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.native
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[
    js.Function2[/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[
    js.Function2[
      /* field */ js.UndefOr[typingsSlinky.extjs.Ext.form.field.IField], 
      /* valid */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.native
}

object IFieldAncestor {
  @scala.inline
  def apply(): IFieldAncestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldAncestor]
  }
  @scala.inline
  implicit class IFieldAncestorOps[Self <: IFieldAncestor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldDefaults(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldDefaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFieldDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldDefaults")(js.undefined)
        ret
    }
    @scala.inline
    def withInitFieldAncestor(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFieldAncestor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInitFieldAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initFieldAncestor")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldErrorChange(value: (/* field */ js.UndefOr[ILabelable], /* error */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldErrorChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFieldErrorChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldErrorChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldValidityChange(
      value: (/* field */ js.UndefOr[typingsSlinky.extjs.Ext.form.field.IField], /* valid */ js.UndefOr[Boolean]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldValidityChange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnFieldValidityChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldValidityChange")(js.undefined)
        ret
    }
  }
  
}

