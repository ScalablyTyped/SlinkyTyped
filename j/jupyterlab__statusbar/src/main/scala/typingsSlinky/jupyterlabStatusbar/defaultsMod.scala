package typingsSlinky.jupyterlabStatusbar

import typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/statusbar/lib/defaults", JSImport.Namespace)
@js.native
object defaultsMod extends js.Object {
  
  @js.native
  class KernelStatus protected ()
    extends typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus {
    /**
      * Construct the kernel status widget.
      */
    def this(opts: IOptions) = this()
  }
  @js.native
  object KernelStatus extends js.Object {
    
    /**
      * A VDomModel for the kernel status indicator.
      */
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabStatusbar.kernelStatusMod.KernelStatus.Model
  }
  
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  class LineCol ()
    extends typingsSlinky.jupyterlabStatusbar.lineColMod.LineCol
  @js.native
  object LineCol extends js.Object {
    
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabStatusbar.lineColMod.LineCol.Model
  }
  
  /**
    * A namespace for LineColComponent.
    */
  @js.native
  object LineColComponent extends js.Object
  
  @js.native
  /**
    * Construct a new memory usage status item.
    */
  class MemoryUsage ()
    extends typingsSlinky.jupyterlabStatusbar.memoryUsageMod.MemoryUsage
  @js.native
  object MemoryUsage extends js.Object {
    
    /**
      * A VDomModel for the memory usage status item.
      */
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
    @js.native
    object Model extends js.Object
  }
  
  @js.native
  class RunningSessions protected ()
    extends typingsSlinky.jupyterlabStatusbar.runningSessionsMod.RunningSessions {
    /**
      * Create a new RunningSessions widget.
      */
    def this(opts: typingsSlinky.jupyterlabStatusbar.runningSessionsMod.RunningSessions.IOptions) = this()
  }
  @js.native
  object RunningSessions extends js.Object {
    
    /**
      * A VDomModel for the RunninSessions status item.
      */
    @js.native
    class Model ()
      extends typingsSlinky.jupyterlabStatusbar.runningSessionsMod.RunningSessions.Model
  }
}
