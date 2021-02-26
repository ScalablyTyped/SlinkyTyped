package typingsSlinky.jupyterlabStatusbar

import typingsSlinky.jupyterlabApputils.mod.VDomModel
import typingsSlinky.jupyterlabApputils.mod.VDomRenderer
import typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model
import typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryUsageMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults/memoryUsage", "MemoryUsage")
  @js.native
  /**
    * Construct a new memory usage status item.
    */
  class MemoryUsage () extends VDomRenderer[Model]
  object MemoryUsage {
    
    /**
      * A VDomModel for the memory usage status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults/memoryUsage", "MemoryUsage.Model")
    @js.native
    class Model protected () extends VDomModel {
      /**
        * Construct a new memory usage model.
        *
        * @param options: the options for creating the model.
        */
      def this(options: IOptions) = this()
      
      var _currentMemory: js.Any = js.native
      
      var _memoryLimit: js.Any = js.native
      
      var _metricsAvailable: js.Any = js.native
      
      var _poll: js.Any = js.native
      
      var _units: js.Any = js.native
      
      /**
        * Given the results of the metrics request, update model values.
        */
      var _updateMetricsValues: js.Any = js.native
      
      var _warn: js.Any = js.native
      
      /**
        * The current memory usage/
        */
      def currentMemory: Double = js.native
      
      /**
        * The current memory limit, or null if not specified.
        */
      def memoryLimit: Double | Null = js.native
      
      /**
        * Whether the metrics server extension is available.
        */
      def metricsAvailable: Boolean = js.native
      
      /**
        * The units for memory usages and limits.
        */
      def units: MemoryUnit = js.native
      
      /**
        * The warning for memory usage.
        */
      def usageWarning: Boolean = js.native
    }
    /**
      * A namespace for Model statics.
      */
    object Model {
      
      /**
        * Options for creating a MemoryUsage model.
        */
      @js.native
      trait IOptions extends StObject {
        
        /**
          * The refresh rate (in ms) for querying the server.
          */
        var refreshRate: Double = js.native
      }
      object IOptions {
        
        @scala.inline
        def apply(refreshRate: Double): IOptions = {
          val __obj = js.Dynamic.literal(refreshRate = refreshRate.asInstanceOf[js.Any])
          __obj.asInstanceOf[IOptions]
        }
        
        @scala.inline
        implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setRefreshRate(value: Double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
        }
      }
    }
    
    /**
      * The type of unit used for reporting memory usage.
      */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.B
      - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB
      - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB
      - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB
      - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB
      - typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB
    */
    trait MemoryUnit extends StObject
    object MemoryUnit {
      
      @scala.inline
      def B: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.B = "B".asInstanceOf[typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.B]
      
      @scala.inline
      def GB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB = "GB".asInstanceOf[typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.GB]
      
      @scala.inline
      def KB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB = "KB".asInstanceOf[typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.KB]
      
      @scala.inline
      def MB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB = "MB".asInstanceOf[typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.MB]
      
      @scala.inline
      def PB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB = "PB".asInstanceOf[typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.PB]
      
      @scala.inline
      def TB: typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB = "TB".asInstanceOf[typingsSlinky.jupyterlabStatusbar.jupyterlabStatusbarStrings.TB]
    }
  }
}
