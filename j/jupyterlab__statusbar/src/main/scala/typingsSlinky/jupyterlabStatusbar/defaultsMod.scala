package typingsSlinky.jupyterlabStatusbar

import typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object defaultsMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "KernelStatus")
  @js.native
  class KernelStatus protected ()
    extends typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
  }
  object KernelStatus {
    
    /**
      * A VDomModel for the kernel status indicator.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "KernelStatus.Model")
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus.Model
  }
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "LineCol")
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  class LineCol ()
    extends typingsSlinky.jupyterlabStatusbar.lineColMod.LineCol
  object LineCol {
    
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "LineCol.Model")
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabStatusbar.lineColMod.LineCol.Model
  }
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "MemoryUsage")
  @js.native
  /**
    * Construct a new memory usage status item.
    */
  class MemoryUsage ()
    extends typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage
  object MemoryUsage {
    
    /**
      * A VDomModel for the memory usage status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "MemoryUsage.Model")
    @js.native
    class Model protected ()
      extends typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model {
      /**
        * Construct a new memory usage model.
        *
        * @param options: the options for creating the model.
        */
      def this(options: typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage.Model.IOptions) = this()
    }
    /**
      * A namespace for Model statics.
      */
    object Model
  }
  
  @JSImport("@jupyterlab/statusbar/lib/defaults", "RunningSessions")
  @js.native
  class RunningSessions protected ()
    extends typingsSlinky.jupyterlabStatusbar.runningSessionsMod.RunningSessions {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: typingsSlinky.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions) = this()
  }
  object RunningSessions {
    
    /**
      * A VDomModel for the RunninSessions status item.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults", "RunningSessions.Model")
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabStatusbar.runningSessionsMod.RunningSessions.Model
  }
  
  /**
    * A namespace for LineColComponent.
    */
  object LineColComponent
}
