package typingsSlinky.luminoDatagrid

import typingsSlinky.luminoDatagrid.cellrendererMod.CellRenderer.CellConfig
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typingsSlinky.luminoDatagrid.datamodelMod.DataModel.Metadata
import typingsSlinky.luminoDatagrid.graphicscontextMod.GraphicsContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cellrendererMod {
  
  @JSImport("@lumino/datagrid/lib/cellrenderer", "CellRenderer")
  @js.native
  abstract class CellRenderer () extends StObject {
    
    /**
      * Paint the content for a cell.
      *
      * @param gc - The graphics context to use for drawing.
      *
      * @param config - The configuration data for the cell.
      *
      * #### Notes
      * The grid will save/restore the `gc` state before/after invoking
      * the renderer.
      *
      * For performance, the cell content is efficiently clipped to the
      * width of the column, but *the height is not clipped*. If height
      * clipping is needed, the renderer must set up its own clip rect.
      *
      * The renderer **must not** draw outside the cell bounding height.
      */
    def paint(gc: GraphicsContext, config: CellConfig): Unit = js.native
  }
  object CellRenderer {
    
    /**
      * Resolve a config option for a cell renderer.
      *
      * @param option - The config option to resolve.
      *
      * @param config - The cell config object.
      *
      * @returns The resolved value for the option.
      */
    @JSImport("@lumino/datagrid/lib/cellrenderer", "CellRenderer.resolveOption")
    @js.native
    def resolveOption[T](option: ConfigOption[T], config: CellConfig): T = js.native
    
    /**
      * An object which holds the configuration data for a cell.
      */
    @js.native
    trait CellConfig extends StObject {
      
      /**
        * The column index of the cell.
        */
      val column: Double = js.native
      
      /**
        * The height of the cell rectangle, in viewport pixels.
        */
      val height: Double = js.native
      
      /**
        * The metadata for the cell.
        */
      val metadata: Metadata = js.native
      
      /**
        * The region for the cell.
        */
      val region: CellRegion = js.native
      
      /**
        * The row index of the cell.
        */
      val row: Double = js.native
      
      /**
        * The value for the cell.
        */
      val value: js.Any = js.native
      
      /**
        * The width of the cell rectangle, in viewport pixels.
        */
      val width: Double = js.native
      
      /**
        * The X position of the cell rectangle, in viewport coordinates.
        */
      val x: Double = js.native
      
      /**
        * The Y position of the cell rectangle, in viewport coordinates.
        */
      val y: Double = js.native
    }
    object CellConfig {
      
      @scala.inline
      def apply(
        column: Double,
        height: Double,
        metadata: Metadata,
        region: CellRegion,
        row: Double,
        value: js.Any,
        width: Double,
        x: Double,
        y: Double
      ): CellConfig = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
        __obj.asInstanceOf[CellConfig]
      }
      
      @scala.inline
      implicit class CellConfigMutableBuilder[Self <: CellConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMetadata(value: Metadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegion(value: CellRegion): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * A type alias for a cell renderer config function.
      *
      * This type is used to compute a value from a cell config object.
      */
    type ConfigFunc[T] = js.Function1[/* config */ CellConfig, T]
    
    /**
      * A type alias for a cell renderer config option.
      *
      * A config option can be a static value or a config function.
      */
    type ConfigOption[T] = T | ConfigFunc[T]
  }
}
