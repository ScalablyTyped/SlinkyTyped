package typingsSlinky.extjs.Ext.panel

import typingsSlinky.extjs.Ext.data.IStore
import typingsSlinky.extjs.Ext.selection.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.extjs.Ext.IClass because Already inherited
- typingsSlinky.extjs.Ext.IBase because Already inherited
- typingsSlinky.extjs.Ext.grid.locking.ILockable because var conflicts: alias, alternateClassName, callOverridden, callParent, callSuper, config, extend, getInitialConfig, inheritableStatics, initConfig, mixins, requires, self, singleton, statics, uses. Inlined lockedGridConfig, lockedViewConfig, normalGridConfig, normalViewConfig, scrollDelta, subGridXType, syncRowHeight, syncRowHeights */ @js.native
trait ITable extends IPanel {
  /** [Method] Invoked after the Panel is Collapsed  */
  @JSName("afterCollapse")
  var afterCollapse_ITable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Invoked after the Panel is Expanded  */
  @JSName("afterExpand")
  var afterExpand_ITable: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var allowDeselect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var columnLines: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.grid.column.Column[]/Object) */
  var columns: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var deferRowRender: js.UndefOr[Boolean] = js.native
  /** [Method] This method is obsolete in 4 1  */
  var determineScrollbars: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Boolean) */
  var disableSelection: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String) */
  var emptyText: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var enableColumnHide: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableColumnMove: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableColumnResize: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var enableLocking: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.grid.feature.Feature[]/Object[]/Ext.enums.Feature[]) */
  var features: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var forceFit: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the selection model being used and creates it via the configuration if it has not been created already
  		* @returns Ext.selection.Model selModel
  		*/
  var getSelectionModel: js.UndefOr[js.Function0[IModel]] = js.native
  /** [Method] Returns the store associated with this Panel
  		* @returns Ext.data.Store The store
  		*/
  var getStore: js.UndefOr[js.Function0[IStore]] = js.native
  /** [Method] Gets the view for this panel
  		* @returns Ext.view.Table
  		*/
  var getView: js.UndefOr[js.Function0[this.type]] = js.native
  /** [Property] (Boolean) */
  var hasView: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var hideHeaders: js.UndefOr[Boolean] = js.native
  /** [Method] This method is obsolete in 4 1  */
  var invalidateScroller: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var lockedGridConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var lockedViewConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var multiSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Object) */
  var normalGridConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var normalViewConfig: js.UndefOr[js.Any] = js.native
  /** [Property] (Boolean) */
  var optimizedColumnMove: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var rowLines: js.UndefOr[Boolean] = js.native
  /** [Config Option] (String/Boolean) */
  var scroll: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Number) */
  var scrollDelta: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var sealedColumns: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.selection.Model/Object) */
  var selModel: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var selType: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var simpleSelect: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var sortableColumns: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Store) */
  var store: js.UndefOr[IStore] = js.native
  /** [Config Option] (String) */
  var subGridXType: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var syncRowHeight: js.UndefOr[Boolean] = js.native
  /** [Method] Synchronizes the row heights between the locked and non locked portion of the grid for each row  */
  var syncRowHeights: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Config Option] (Object) */
  var verticalScroller: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Ext.view.Table) */
  var view: js.UndefOr[typingsSlinky.extjs.Ext.view.ITable] = js.native
  /** [Config Option] (Object) */
  var viewConfig: js.UndefOr[js.Any] = js.native
  /** [Config Option] (String) */
  var viewType: js.UndefOr[String] = js.native
}

object ITable {
  @scala.inline
  def apply(): ITable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITable]
  }
  @scala.inline
  implicit class ITableOps[Self <: ITable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAfterCollapse(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCollapse")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterExpand(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterExpand")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAfterExpand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterExpand")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowDeselect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowDeselect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowDeselect")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnLines")(js.undefined)
        ret
    }
    @scala.inline
    def withColumns(value: js.Any): Self = {
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
    def withDeferRowRender(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRowRender")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeferRowRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deferRowRender")(js.undefined)
        ret
    }
    @scala.inline
    def withDetermineScrollbars(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("determineScrollbars")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDetermineScrollbars: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("determineScrollbars")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyText")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnHide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnHide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnHide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnHide")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnMove")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableColumnResize(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableColumnResize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableColumnResize")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableLocking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLocking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableLocking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableLocking")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withForceFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceFit")(js.undefined)
        ret
    }
    @scala.inline
    def withGetSelectionModel(value: () => IModel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionModel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetSelectionModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSelectionModel")(js.undefined)
        ret
    }
    @scala.inline
    def withGetStore(value: () => IStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getStore")(js.undefined)
        ret
    }
    @scala.inline
    def withGetView(value: () => ITable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getView")(js.undefined)
        ret
    }
    @scala.inline
    def withHasView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasView")(js.undefined)
        ret
    }
    @scala.inline
    def withHideHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidateScroller(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateScroller")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInvalidateScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidateScroller")(js.undefined)
        ret
    }
    @scala.inline
    def withLockedGridConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedGridConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockedGridConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedGridConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withLockedViewConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedViewConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLockedViewConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lockedViewConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalGridConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalGridConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalGridConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalGridConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalViewConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalViewConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalViewConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalViewConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimizedColumnMove(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizedColumnMove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimizedColumnMove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimizedColumnMove")(js.undefined)
        ret
    }
    @scala.inline
    def withRowLines(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowLines")(js.undefined)
        ret
    }
    @scala.inline
    def withScroll(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollDelta(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withSealedColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sealedColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSealedColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sealedColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withSelModel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selModel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelModel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selModel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selType")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSortableColumns(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortableColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortableColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortableColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withStore(value: IStore): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store")(js.undefined)
        ret
    }
    @scala.inline
    def withSubGridXType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGridXType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubGridXType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subGridXType")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncRowHeight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSyncRowHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withSyncRowHeights(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeights")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutSyncRowHeights: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncRowHeights")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalScroller(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScroller")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalScroller: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalScroller")(js.undefined)
        ret
    }
    @scala.inline
    def withView(value: typingsSlinky.extjs.Ext.view.ITable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("view")(js.undefined)
        ret
    }
    @scala.inline
    def withViewConfig(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withViewType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewType")(js.undefined)
        ret
    }
  }
  
}

