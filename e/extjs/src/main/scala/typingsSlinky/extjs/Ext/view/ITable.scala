package typingsSlinky.extjs.Ext.view

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.IComponent
import typingsSlinky.extjs.Ext.data.IModel
import typingsSlinky.extjs.Ext.data.IStore
import typingsSlinky.extjs.Ext.grid.column.IColumn
import typingsSlinky.extjs.Ext.grid.feature.IFeature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITable extends IView {
  /** [Method] Adds a CSS Class to a specific row
  		* @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
  		* @param cls String
  		*/
  var addRowCls: js.UndefOr[
    js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Method] Sizes the passed header to fit the max content width
  		* @param header Ext.grid.column.Column/Number The header (or index of header) to auto size.
  		*/
  var autoSizeColumn: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Function which can be overridden which returns the data object passed to this DataView s template to render the whole
  		* @param records Object
  		* @param startIndex Object
  		* @returns Object[] An Array of data objects to be processed by a repeating XTemplate. May also contain named properties.
  		*/
  @JSName("collectData")
  var collectData_ITable: js.UndefOr[
    js.Function2[/* records */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Config Option] (Boolean) */
  var enableTextSelection: js.UndefOr[Boolean] = js.native
  /** [Method] Expands a particular header to fit the max content width
  		* @param header Object
  		*/
  var expandToFit: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Config Option] (String) */
  var firstCls: js.UndefOr[String] = js.native
  /** [Method] Focuses a particular row and brings it into view
  		* @param row HTMLElement/String/Number/Ext.data.Model An HTMLElement template node, index of a template node, the id of a template node or the
  		* @param delay Boolean/Number Delay the focus this number of milliseconds (true for 10 milliseconds). record associated with the node.
  		*/
  var focusRow: js.UndefOr[js.Function2[/* row */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Try to focus this component
  		* @param selectText Object
  		* @param delay Object
  		* @returns Ext.Component The focused Component. Usually this Component. Some Containers may delegate focus to a descendant Component (Windows can do this through their defaultFocus config option.
  		*/
  @JSName("focus")
  var focus_ITable: js.UndefOr[
    js.Function2[/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any], IComponent]
  ] = js.native
  /** [Method] Returns a CSS selector which selects the outermost element s in this view  */
  var getBodySelector: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns a CSS selector which selects a particular column if the desired header is passed or a general cell selector
  		* @param header Ext.grid.column.Column The column for which to return the selector. If omitted, the general cell selector which matches ant cell will be returned.
  		*/
  var getCellSelector: js.UndefOr[js.Function1[/* header */ js.UndefOr[IColumn], Unit]] = js.native
  /** [Method] Returns a CSS selector which selects the element s which define the width of a column
  		* @param header Object
  		*/
  var getColumnSizerSelector: js.UndefOr[js.Function1[/* header */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Returns a CSS selector which selects a row which contains cells  */
  var getDataRowSelector: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Get a reference to a feature
  		* @param id String The id of the feature
  		* @returns Ext.grid.feature.Feature The feature. Undefined if not found
  		*/
  var getFeature: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], IFeature]] = js.native
  /** [Method] Returns a CSS selector which selects items of the view rendered by the rowTpl */
  var getItemSelector: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns a CSS selector which selects the element which contains record nodes  */
  var getNodeContainerSelector: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns the node given the passed Record or index or node
  		* @param nodeInfo HTMLElement/String/Number/Ext.data.Model The node or record
  		* @param dataRow Boolean true to return the data row (not the top level row if wrapped), false to return the top level row.
  		* @returns HTMLElement The node or null if it wasn't found
  		*/
  @JSName("getNode")
  var getNode_ITable: js.UndefOr[
    js.Function2[/* nodeInfo */ js.UndefOr[js.Any], /* dataRow */ js.UndefOr[Boolean], HTMLElement]
  ] = js.native
  /** [Method] Gets the current XY position of the component s underlying element
  		* @param record Object
  		* @param header Object
  		* @returns Number[] The XY position of the element (e.g., [100, 200])
  		*/
  @JSName("getPosition")
  var getPosition_ITable: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Method] Override this function to apply custom CSS classes to rows during rendering
  		* @param record Ext.data.Model The record corresponding to the current row.
  		* @param index Number The row index.
  		* @param rowParams Object DEPRECATED. For row body use the getAdditionalData method of the rowbody feature.
  		* @param store Ext.data.Store The store this grid is bound to
  		* @returns String a CSS class name to add to the row.
  		*/
  var getRowClass: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* index */ js.UndefOr[Double], 
      /* rowParams */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[IStore], 
      String
    ]
  ] = js.native
  /** [Config Option] (String) */
  var lastCls: js.UndefOr[String] = js.native
  /** [Config Option] (Boolean) */
  var markDirty: js.UndefOr[Boolean] = js.native
  /** [Method] Removes a CSS Class from a specific row
  		* @param rowInfo HTMLElement/String/Number/Ext.data.Model An HTMLElement, index or instance of a model representing this row
  		* @param cls String
  		*/
  var removeRowCls: js.UndefOr[
    js.Function2[/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String], Unit]
  ] = js.native
  /** [Config Option] (Boolean) */
  var stripeRows: js.UndefOr[Boolean] = js.native
  /** [Method] Navigates from the passed record by the passed increment which may be ve or ve Skips hidden records
  		* @param startRec Ext.data.Model The Record to start from.
  		* @param distance Number The distance to move from the record. May be +ve or -ve.
  		*/
  var walkRecs: js.UndefOr[
    js.Function2[/* startRec */ js.UndefOr[IModel], /* distance */ js.UndefOr[Double], Unit]
  ] = js.native
  /** [Method] Increments the passed row index by the passed increment which may be ve or ve Skips hidden rows
  		* @param startRow Number The zero-based row index to start from.
  		* @param distance Number The distance to move the row by. May be +ve or -ve.
  		*/
  var walkRows: js.UndefOr[
    js.Function2[/* startRow */ js.UndefOr[Double], /* distance */ js.UndefOr[Double], Unit]
  ] = js.native
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
    def withAddRowCls(value: (/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowCls")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAddRowCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addRowCls")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoSizeColumn(value: /* header */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSizeColumn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAutoSizeColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoSizeColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectData(value: (/* records */ js.UndefOr[js.Any], /* startIndex */ js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectData")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCollectData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectData")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableTextSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTextSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableTextSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableTextSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandToFit(value: /* header */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandToFit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutExpandToFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandToFit")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstCls")(js.undefined)
        ret
    }
    @scala.inline
    def withFocus(value: (/* selectText */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any]) => IComponent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focus")(js.undefined)
        ret
    }
    @scala.inline
    def withFocusRow(value: (/* row */ js.UndefOr[js.Any], /* delay */ js.UndefOr[js.Any]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRow")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutFocusRow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focusRow")(js.undefined)
        ret
    }
    @scala.inline
    def withGetBodySelector(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodySelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetBodySelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBodySelector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetCellSelector(value: /* header */ js.UndefOr[IColumn] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetCellSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCellSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetColumnSizerSelector(value: /* header */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnSizerSelector")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetColumnSizerSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnSizerSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetDataRowSelector(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataRowSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetDataRowSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getDataRowSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFeature(value: /* id */ js.UndefOr[String] => IFeature): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeature")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetFeature: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFeature")(js.undefined)
        ret
    }
    @scala.inline
    def withGetItemSelector(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetItemSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getItemSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNode(value: (/* nodeInfo */ js.UndefOr[js.Any], /* dataRow */ js.UndefOr[Boolean]) => HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNodeContainerSelector(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeContainerSelector")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNodeContainerSelector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNodeContainerSelector")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPosition(value: (/* record */ js.UndefOr[js.Any], /* header */ js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withGetRowClass(
      value: (/* record */ js.UndefOr[IModel], /* index */ js.UndefOr[Double], /* rowParams */ js.UndefOr[js.Any], /* store */ js.UndefOr[IStore]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowClass")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutGetRowClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRowClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLastCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastCls")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkDirty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDirty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withRemoveRowCls(value: (/* rowInfo */ js.UndefOr[js.Any], /* cls */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRowCls")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRemoveRowCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("removeRowCls")(js.undefined)
        ret
    }
    @scala.inline
    def withStripeRows(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripeRows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripeRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripeRows")(js.undefined)
        ret
    }
    @scala.inline
    def withWalkRecs(value: (/* startRec */ js.UndefOr[IModel], /* distance */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkRecs")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWalkRecs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkRecs")(js.undefined)
        ret
    }
    @scala.inline
    def withWalkRows(value: (/* startRow */ js.UndefOr[Double], /* distance */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkRows")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutWalkRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("walkRows")(js.undefined)
        ret
    }
  }
  
}

