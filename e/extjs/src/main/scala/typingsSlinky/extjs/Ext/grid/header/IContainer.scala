package typingsSlinky.extjs.Ext.grid.header

import typingsSlinky.extjs.Ext.Array
import typingsSlinky.extjs.Ext.grid.column.IColumn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContainer
  extends typingsSlinky.extjs.Ext.container.IContainer {
  /** [Config Option] (Number) */
  var defaultWidth: js.UndefOr[Double] = js.native
  /** [Config Option] (Boolean) */
  var enableColumnHide: js.UndefOr[Boolean] = js.native
  /** [Method] Returns the number of grid columns descended from this HeaderContainer  */
  var getColumnCount: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns an array of menu CheckItems corresponding to all immediate children of the passed Container which have been c
  		* @param headerContainer Object
  		*/
  var getColumnMenu: js.UndefOr[js.Function1[/* headerContainer */ js.UndefOr[js.Any], Unit]] = js.native
  /** [Method] Gets the full width of all columns that are visible  */
  var getFullWidth: js.UndefOr[js.Function0[Unit]] = js.native
  /** [Method] Returns an array of all columns which appear in the grid s View
  		* @param inResult Object
  		* @param hiddenAncestor Object
  		* @returns Array
  		*/
  var getGridColumns: js.UndefOr[
    js.Function2[/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any], Array]
  ] = js.native
  /** [Method] Get a leaf level header by index regardless of what the nesting structure is
  		* @param index Number The column index for which to retrieve the column.
  		*/
  var getHeaderAtIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /** [Method] Returns the index of a leaf level header regardless of what the nesting structure is
  		* @param header Ext.grid.column.Column The header to find the index of
  		* @returns Number The index of the specified column header
  		*/
  var getHeaderIndex: js.UndefOr[js.Function1[/* header */ js.UndefOr[IColumn], Double]] = js.native
  /** [Method] Returns an array of menu items to be placed into the shared menu across all headers in this header container
  		* @returns Array menuItems
  		*/
  var getMenuItems: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns an array of the visible columns in the grid
  		* @returns Array
  		*/
  var getVisibleGridColumns: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] When passed a column index returns the closet visible column to that
  		* @param index Number Position at which to find the closest visible column.
  		*/
  var getVisibleHeaderClosestToIndex: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Unit]] = js.native
  /** [Property] (Boolean) */
  var isGroupHeader: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var `sealed`: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var sortable: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Number) */
  var weight: js.UndefOr[Double] = js.native
}

object IContainer {
  @scala.inline
  def apply(): IContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IContainer]
  }
  @scala.inline
  implicit class IContainerOps[Self <: IContainer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultWidth")(js.undefined)
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
    def withGetColumnCount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnCount")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withGetColumnMenu(value: /* headerContainer */ js.UndefOr[js.Any] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnMenu")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetColumnMenu: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColumnMenu")(js.undefined)
        ret
    }
    @scala.inline
    def withGetFullWidth(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFullWidth")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetFullWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getFullWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withGetGridColumns(value: (/* inResult */ js.UndefOr[js.Any], /* hiddenAncestor */ js.UndefOr[js.Any]) => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGridColumns")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGetGridColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getGridColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeaderAtIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderAtIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetHeaderAtIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderAtIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetHeaderIndex(value: /* header */ js.UndefOr[IColumn] => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetHeaderIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getHeaderIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withGetMenuItems(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuItems")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetMenuItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMenuItems")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVisibleGridColumns(value: () => Array): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleGridColumns")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetVisibleGridColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleGridColumns")(js.undefined)
        ret
    }
    @scala.inline
    def withGetVisibleHeaderClosestToIndex(value: /* index */ js.UndefOr[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleHeaderClosestToIndex")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetVisibleHeaderClosestToIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getVisibleHeaderClosestToIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withIsGroupHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsGroupHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withSealed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sealed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSealed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sealed")(js.undefined)
        ret
    }
    @scala.inline
    def withSortable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withWeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weight")(js.undefined)
        ret
    }
  }
  
}

