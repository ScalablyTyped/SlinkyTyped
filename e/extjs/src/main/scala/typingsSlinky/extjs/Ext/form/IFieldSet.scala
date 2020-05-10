package typingsSlinky.extjs.Ext.form

import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.container.IContainer
import typingsSlinky.extjs.Ext.panel.ITool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.form.IFieldAncestor because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined fieldDefaults, initFieldAncestor, onFieldErrorChange, onFieldValidityChange */ @js.native
trait IFieldSet extends IContainer {
  /** [Property] (Ext.form.field.Checkbox) */
  var checkboxCmp: js.UndefOr[typingsSlinky.extjs.Ext.form.field.ICheckbox] = js.native
  /** [Config Option] (String) */
  var checkboxName: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var checkboxToggle: js.UndefOr[Boolean] = js.native
  /** [Method] Collapses the fieldset
  		* @returns Ext.form.FieldSet this
  		*/
  var collapse: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Boolean) */
  var collapsed: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var collapsible: js.UndefOr[Boolean] = js.native
  /** [Method] Creates the checkbox component
  		* @returns Ext.Component
  		*/
  var createCheckboxCmp: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Creates the legend title component
  		* @returns Ext.Component
  		*/
  var createTitleCmp: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Creates the toggle button component
  		* @returns Ext.Component
  		*/
  var createToggleCmp: js.UndefOr[js.Function0[IComponent]] = js.native
  /** [Method] Expands the fieldset
  		* @returns Ext.form.FieldSet this
  		*/
  var expand: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Config Option] (Object) */
  var fieldDefaults: js.UndefOr[js.Any] = js.native
  /** [Method] Initializes the FieldAncestor s state this must be called from the initComponent method of any components importing */
  var initFieldAncestor: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Ext.Component) */
  var legend: js.UndefOr[IComponent] = js.native
  /** [Method] Fired when the error message of any field within the container changes
  		* @param field Ext.form.Labelable The sub-field whose active error changed
  		* @param error String The new active error message
  		*/
  var onFieldErrorChange: js.UndefOr[js.Function2[js.UndefOr[ILabelable], js.UndefOr[String], Unit]] = js.native
  /** [Method] Fired when the validity of any field within the container changes
  		* @param field Ext.form.field.Field The sub-field whose validity changed
  		* @param valid Boolean The new validity state
  		*/
  var onFieldValidityChange: js.UndefOr[
    js.Function2[js.UndefOr[typingsSlinky.extjs.Ext.form.field.IField], js.UndefOr[Boolean], Unit]
  ] = js.native
  /** [Method] Sets the title of this fieldset
  		* @param title String The new title.
  		* @returns Ext.form.FieldSet this
  		*/
  var setTitle: js.UndefOr[js.Function1[/* title */ js.UndefOr[String], this.type]] = js.native
  /** [Config Option] (String) */
  var title: js.UndefOr[String] = js.native
  /** [Method] Toggle the fieldset s collapsed state to the opposite of what it is currently  */
  var toggle: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Property] (Ext.panel.Tool) */
  var toggleCmp: js.UndefOr[ITool] = js.native
  /** [Config Option] (Boolean) */
  var toggleOnTitleClick: js.UndefOr[Boolean] = js.native
}

object IFieldSet {
  @scala.inline
  def apply(): IFieldSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldSet]
  }
  @scala.inline
  implicit class IFieldSetOps[Self <: IFieldSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckboxCmp(value: typingsSlinky.extjs.Ext.form.field.ICheckbox): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxCmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxCmp")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxName")(js.undefined)
        ret
    }
    @scala.inline
    def withCheckboxToggle(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxToggle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckboxToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkboxToggle")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: () => IFieldSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsible")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateCheckboxCmp(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCheckboxCmp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreateCheckboxCmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCheckboxCmp")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTitleCmp(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTitleCmp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreateTitleCmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTitleCmp")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateToggleCmp(value: () => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createToggleCmp")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreateToggleCmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createToggleCmp")(js.undefined)
        ret
    }
    @scala.inline
    def withExpand(value: () => IFieldSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.undefined)
        ret
    }
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
    def withLegend(value: IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLegend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("legend")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldErrorChange(value: (js.UndefOr[ILabelable], js.UndefOr[String]) => Unit): Self = {
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
    def withOnFieldValidityChange(value: (js.UndefOr[typingsSlinky.extjs.Ext.form.field.IField], js.UndefOr[Boolean]) => Unit): Self = {
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
    @scala.inline
    def withSetTitle(value: /* title */ js.UndefOr[String] => IFieldSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withToggle(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutToggle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggle")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleCmp(value: ITool): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCmp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleCmp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleCmp")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleOnTitleClick(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnTitleClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToggleOnTitleClick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleOnTitleClick")(js.undefined)
        ret
    }
  }
  
}

