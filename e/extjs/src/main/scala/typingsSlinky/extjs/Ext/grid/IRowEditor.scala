package typingsSlinky.extjs.Ext.grid

import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.form.IBasic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRowEditor
  extends typingsSlinky.extjs.Ext.form.IPanel {
  /** [Method] Lie to the CQ system about our nesting structure  */
  @JSName("getRefItems")
  var getRefItems_IRowEditor: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Loads an Ext data Model into this form internally just calls Ext form Basic loadRecord See also trackResetOnLoad
  		* @param record Object
  		* @returns Ext.form.Basic The Ext.form.Basic attached to this FormPanel
  		*/
  @JSName("loadRecord")
  var loadRecord_IRowEditor: js.UndefOr[js.Function1[/* record */ js.UndefOr[js.Any], IBasic]] = js.native
  /** [Method] Start editing the specified grid at the specified position
  		* @param record Ext.data.Model The Store data record which backs the row to be edited.
  		* @param columnHeader Ext.data.Model The Column object defining the column to be edited.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel], Unit]
  ] = js.native
}

object IRowEditor {
  @scala.inline
  def apply(): IRowEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowEditor]
  }
  @scala.inline
  implicit class IRowEditorOps[Self <: IRowEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRefItems(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRefItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRefItems")(js.undefined)
        ret
    }
    @scala.inline
    def withLoadRecord(value: /* record */ js.UndefOr[js.Any] => IBasic): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecord")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoadRecord: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadRecord")(js.undefined)
        ret
    }
    @scala.inline
    def withStartEdit(value: (/* record */ js.UndefOr[IModel], /* columnHeader */ js.UndefOr[IModel]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEdit")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStartEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startEdit")(js.undefined)
        ret
    }
  }
  
}

