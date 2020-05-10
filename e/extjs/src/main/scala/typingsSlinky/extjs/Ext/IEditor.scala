package typingsSlinky.extjs.Ext

import typingsSlinky.extjs.Ext.form.field.IField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditor
  extends typingsSlinky.extjs.Ext.container.IContainer {
  /** [Method] private
  		* @param ct Object
  		* @param position Object
  		*/
  @JSName("afterRender")
  var afterRender_IEditor: js.UndefOr[
    js.Function2[/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Config Option] (String) */
  var alignment: js.UndefOr[java.lang.String] = js.native
  /** [Config Option] (Boolean) */
  var allowBlur: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean/Object) */
  var autoSize: js.UndefOr[js.Any] = js.native
  /** [Method] Cancels the editing process and hides the editor without persisting any changes
  		* @param remainVisible Boolean Override the default behavior and keep the editor visible after cancel
  		*/
  var cancelEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var cancelOnEsc: js.UndefOr[Boolean] = js.native
  /** [Method] Ends the editing process persists the changed value to the underlying field and hides the editor
  		* @param remainVisible Boolean Override the default behavior and keep the editor visible after edit
  		*/
  var completeEdit: js.UndefOr[js.Function1[/* remainVisible */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var completeOnEnter: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.form.field.Field) */
  var field: js.UndefOr[IField] = js.native
  /** [Method] Gets the data value of the editor
  		* @returns Object The data value
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.native
  /** [Config Option] (Boolean) */
  var hideEl: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var ignoreNoChange: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number[]) */
  var offsets: js.UndefOr[Array] = js.native
  /** [Method] private */
  @JSName("onHide")
  var onHide_IEditor: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] private */
  @JSName("onShow")
  var onShow_IEditor: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (String/HTMLElement/Ext.Element) */
  var parentEl: js.UndefOr[js.Any] = js.native
  /** [Method] Realigns the editor to the bound field based on the current alignment config value
  		* @param autoSize Boolean True to size the field to the dimensions of the bound element.
  		*/
  var realign: js.UndefOr[js.Function1[/* autoSize */ js.UndefOr[Boolean], Unit]] = js.native
  /** [Config Option] (Boolean) */
  var revertInvalid: js.UndefOr[Boolean] = js.native
  /** [Method] Sets the data value of the editor
  		* @param value Object Any valid value supported by the underlying field
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Starts the editing process and shows the editor
  		* @param el String/HTMLElement/Ext.Element The element to edit
  		* @param value String A value to initialize the editor with. If a value is not provided, it defaults to the innerHTML of el.
  		*/
  var startEdit: js.UndefOr[
    js.Function2[/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var swallowKeys: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var updateEl: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var value: js.UndefOr[js.Any] = js.native
}

object IEditor {
  @scala.inline
  def apply(): IEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditor]
  }
  @scala.inline
  implicit class IEditorOps[Self <: IEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterRender(value: (/* ct */ js.UndefOr[js.Any], /* position */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAfterRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRender")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignment(value: java.lang.String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowBlur(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBlur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowBlur")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSize(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelEdit(value: /* remainVisible */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancelEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelOnEsc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelOnEsc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelOnEsc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelOnEsc")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteEdit(value: /* remainVisible */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeEdit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompleteEdit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeEdit")(js.undefined)
        ret
    }
    @scala.inline
    def withCompleteOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompleteOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("completeOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: IField): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withGetValue(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEl")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreNoChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNoChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreNoChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreNoChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsets(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsets")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHide(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHide")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
    @scala.inline
    def withParentEl(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(js.undefined)
        ret
    }
    @scala.inline
    def withRealign(value: /* autoSize */ js.UndefOr[Boolean] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realign")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRealign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("realign")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertInvalid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertInvalid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertInvalid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertInvalid")(js.undefined)
        ret
    }
    @scala.inline
    def withSetValue(value: /* value */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStartEdit(value: (/* el */ js.UndefOr[js.Any], /* value */ js.UndefOr[java.lang.String]) => Unit): Self = {
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
    @scala.inline
    def withSwallowKeys(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swallowKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwallowKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swallowKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateEl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateEl")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

