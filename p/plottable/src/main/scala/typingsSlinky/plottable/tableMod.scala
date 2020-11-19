package typingsSlinky.plottable

import typingsSlinky.plottable.componentContainerMod.ComponentContainer
import typingsSlinky.plottable.componentMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("plottable/build/src/components/table", JSImport.Namespace)
@js.native
object tableMod extends js.Object {
  
  @js.native
  /**
    * A Table combines Components in the form of a grid. A
    * common case is combining a y-axis, x-axis, and the plotted data via
    * ```typescript
    * new Table([[yAxis, plot],
    *            [null,  xAxis]]);
    * ```
    *
    * @constructor
    * @param {(Component|null|undefined)[][]} [rows=[]] A 2-D array of Components to be added to the Table.
    *   null can be used if a cell is empty.
    */
  class Table () extends ComponentContainer {
    def this(rows: js.Array[js.Array[js.UndefOr[Component | Null]]]) = this()
    
    var _calculatedLayout: js.Any = js.native
    
    var _columnPadding: js.Any = js.native
    
    var _columnWeights: js.Any = js.native
    
    /* private */ def _determineGuarantees(offeredWidths: js.Any, offeredHeights: js.Any, isFinalOffer: js.Any): js.Any = js.native
    
    /* private */ def _iterateLayout(availableWidth: js.Any, availableHeight: js.Any, isFinalOffer: js.Any): js.Any = js.native
    
    var _nCols: js.Any = js.native
    
    var _nRows: js.Any = js.native
    
    /* private */ def _padTableToSize(nRows: js.Any, nCols: js.Any): js.Any = js.native
    
    var _rowPadding: js.Any = js.native
    
    var _rowWeights: js.Any = js.native
    
    var _rows: js.Any = js.native
    
    /**
      * Adds a Component in the specified row and column position.
      *
      * For example, instead of calling `new Table([[a, b], [null, c]])`, you
      * could call
      * var table = new Plottable.Components.Table();
      * table.add(a, 0, 0);
      * table.add(b, 0, 1);
      * table.add(c, 1, 1);
      *
      * @param {Component} component The Component to be added.
      * @param {number} row
      * @param {number} col
      * @returns {Table} The calling Table.
      */
    def add(component: Component, row: Double, col: Double): this.type = js.native
    
    /**
      * Gets the padding to the left and right of each column in pixels.
      */
    def columnPadding(): Double = js.native
    /**
      * Sets the padding to the left and right of each column in pixels.
      *
      * @param {number} columnPadding
      * @returns {Table} The calling Table.
      */
    def columnPadding(columnPadding: Double): this.type = js.native
    
    /**
      * Gets the weight of the specified column.
      *
      * @param {number} index
      */
    def columnWeight(index: Double): Double = js.native
    /**
      * Sets the weight of the specified column.
      * Space is allocated to columns based on their weight. Columns with higher weights receive proportionally more space.
      *
      * Please see `rowWeight` docs for an example.
      *
      * @param {number} index
      * @param {number} weight
      * @returns {Table} The calling Table.
      */
    def columnWeight(index: Double, weight: Double): this.type = js.native
    
    /**
      * Returns the Component at the specified row and column index.
      *
      * @param {number} rowIndex
      * @param {number} columnIndex
      * @returns {Component} The Component at the specified position, or null if no Component is there.
      */
    def componentAt(rowIndex: Double, columnIndex: Double): Component = js.native
    
    /**
      * Gets the padding above and below each row in pixels.
      */
    def rowPadding(): Double = js.native
    /**
      * Sets the padding above and below each row in pixels.
      *
      * @param {number} rowPadding
      * @returns {Table} The calling Table.
      */
    def rowPadding(rowPadding: Double): this.type = js.native
    
    /**
      * Gets the weight of the specified row.
      *
      * @param {number} index
      */
    def rowWeight(index: Double): Double = js.native
    /**
      * Sets the weight of the specified row.
      * Space is allocated to rows based on their weight. Rows with higher weights receive proportionally more space.
      *
      * A common case would be to have one row take up 2/3rds of the space,
      * and the other row take up 1/3rd.
      *
      * Example:
      *
      * ```JavaScript
      * plot = new Plottable.Component.Table([
      *  [row1],
      *  [row2]
      * ]);
      *
      * // assign twice as much space to the first row
      * plot
      *  .rowWeight(0, 2)
      *  .rowWeight(1, 1)
      * ```
      *
      * @param {number} index
      * @param {number} weight
      * @returns {Table} The calling Table.
      */
    def rowWeight(index: Double, weight: Double): this.type = js.native
  }
  /* static members */
  @js.native
  object Table extends js.Object {
    
    /* private */ def _calcComponentWeights(setWeights: js.Any, componentGroups: js.Any, fixityAccessor: js.Any): js.Any = js.native
    
    /* private */ def _calcProportionalSpace(weights: js.Any, freeSpace: js.Any): js.Any = js.native
    
    /* private */ def _fixedSpace(componentGroup: js.Any, fixityAccessor: js.Any): js.Any = js.native
  }
}
