package typingsSlinky.extjs.Ext.grid.column

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.IElement
import typingsSlinky.extjs.Ext.grid.header.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumn extends IContainer {
  /** [Method] private Inform the header container about the resize
  		* @param width Object
  		* @param height Object
  		* @param oldWidth Object
  		* @param oldHeight Object
  		*/
  @JSName("afterComponentLayout")
  var afterComponentLayout_IColumn: js.UndefOr[
    js.Function4[
      /* width */ js.UndefOr[js.Any], 
      /* height */ js.UndefOr[js.Any], 
      /* oldWidth */ js.UndefOr[js.Any], 
      /* oldHeight */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var align: js.UndefOr[String] = js.native
  /** [Method] Sizes this Column to fit the max content width
  		* @param The Ext.grid.column.Column/Number header (or index of header) to auto size.
  		*/
  var autoSize: js.UndefOr[js.Function1[/* The */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (Object[]) */
  var columns: js.UndefOr[Array] = js.native
  /** [Config Option] (String) */
  var dataIndex: js.UndefOr[String] = js.native
  /** [Method] When defined this will take precedence over the renderer config  */
  var defaultRenderer: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Function) */
  var editRenderer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object/String) */
  var editor: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var emptyCellText: js.UndefOr[String] = js.native
  /** [Config Option] (Object/String) */
  var field: js.UndefOr[js.Any] = js.native
  /** [Method] Retrieves the editing field for editing associated with this header
  		* @param record Object The Model instance being edited.
  		* @param defaultField Object An object representing a default field to be created
  		* @returns any field
  		*/
  var getEditor: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any], _]
  ] = js.native
  /** [Method] Returns the index of this column only if this column is a base level Column
  		* @returns Number
  		*/
  var getIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Method] Returns the parameter to sort upon when sorting this header
  		* @returns String
  		*/
  var getSortParam: js.UndefOr[js.Function0[String]] = js.native
  /** [Method] Returns the index of this column in the list of visible columns only if this column is a base level Column
  		* @returns Number
  		*/
  var getVisibleIndex: js.UndefOr[js.Function0[Double]] = js.native
  /** [Config Option] (Boolean) */
  var groupable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var header: js.UndefOr[String] = js.native
  /** [Method] Hides this Component setting it to invisible using the configured hideMode
  		* @param fromOwner Object
  		* @returns Ext.Component this
  		*/
  @JSName("hide")
  var hide_IColumn: js.UndefOr[js.Function1[/* fromOwner */ js.UndefOr[js.Any], IComponent]] = js.native
  /** [Config Option] (Boolean) */
  var hideable: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isColumn: js.UndefOr[Boolean] = js.native
  /** [Property] (Boolean) */
  var isHeader: js.UndefOr[Boolean] = js.native
  /** [Method] Determines whether the UI should be allowed to offer an option to hide this column  */
  var isHideable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Determines whether the UI should be allowed to offer an option to lock or unlock this column  */
  var isLockable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var lockable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var locked: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var menuDisabled: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var menuText: js.UndefOr[String] = js.native
  /** [Config Option] (Function/String) */
  var renderer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  @JSName("resizable")
  var resizable_IColumn: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Sets the form field to be used for editing
  		* @param field Object An object representing a field to be created. If no xtype is specified a 'textfield' is assumed.
  		*/
  var setEditor: js.UndefOr[js.Function1[/* field */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Sets the header text for this Column
  		* @param text String The header to display on this Column.
  		*/
  var setText: js.UndefOr[js.Function1[/* text */ js.UndefOr[String], Unit]] = js.native
  /** [Method] Shows this Component rendering it first if autoRender or floating are true
  		* @param fromOwner Object
  		* @param fromChild Object
  		* @returns Ext.Component this
  		*/
  @JSName("show")
  var show_IColumn: js.UndefOr[
    js.Function2[/* fromOwner */ js.UndefOr[js.Any], /* fromChild */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Config Option] (String) */
  var tdCls: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var textEl: js.UndefOr[IElement] = js.native
  /** [Config Option] (String) */
  var tooltip: js.UndefOr[String] = js.native
  /** [Config Option] (String) */
  var tooltipType: js.UndefOr[String] = js.native
  /** [Property] (Ext.Element) */
  var triggerEl: js.UndefOr[IElement] = js.native
}

object IColumn {
  @scala.inline
  def apply(): IColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColumn]
  }
  @scala.inline
  implicit class IColumnOps[Self <: IColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterComponentLayout(
      value: (/* width */ js.UndefOr[js.Any], /* height */ js.UndefOr[js.Any], /* oldWidth */ js.UndefOr[js.Any], /* oldHeight */ js.UndefOr[js.Any]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComponentLayout")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAfterComponentLayout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterComponentLayout")(js.undefined)
        ret
    }
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSize(value: /* The */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutoSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSize")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.undefined)
        ret
    }
    @scala.inline
    def withDataIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultRenderer(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRenderer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDefaultRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withEditRenderer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRenderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withEditor(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editor")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyCellText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCellText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyCellText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyCellText")(js.undefined)
        ret
    }
    @scala.inline
    def withField(value: js.Any): Self = {
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
    def withGetEditor(value: (/* record */ js.UndefOr[js.Any], /* defaultField */ js.UndefOr[js.Any]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withGetIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSortParam(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortParam")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSortParam: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSortParam")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVisibleIndex(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleIndex")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetVisibleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupable")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withHide(value: /* fromOwner */ js.UndefOr[js.Any] => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hide")(js.undefined)
        ret
    }
    @scala.inline
    def withHideable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsColumn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withIsHideable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHideable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsHideable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isHideable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLockable(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLockable")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsLockable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLockable")(js.undefined)
        ret
    }
    @scala.inline
    def withLockable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockable")(js.undefined)
        ret
    }
    @scala.inline
    def withLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locked")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withMenuText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMenuText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("menuText")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withResizable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withSetEditor(value: /* field */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEditor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetEditor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setEditor")(js.undefined)
        ret
    }
    @scala.inline
    def withSetText(value: /* text */ js.UndefOr[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSetText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setText")(js.undefined)
        ret
    }
    @scala.inline
    def withShow(value: (/* fromOwner */ js.UndefOr[js.Any], /* fromChild */ js.UndefOr[js.Any]) => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("show")(js.undefined)
        ret
    }
    @scala.inline
    def withTdCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTdCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tdCls")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textEl")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltip(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(js.undefined)
        ret
    }
    @scala.inline
    def withTooltipType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTooltipType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tooltipType")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggerEl(value: IElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggerEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggerEl")(js.undefined)
        ret
    }
  }
  
}

