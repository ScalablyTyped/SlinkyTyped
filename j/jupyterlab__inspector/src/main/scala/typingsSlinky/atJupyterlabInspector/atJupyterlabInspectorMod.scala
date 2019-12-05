package typingsSlinky.atJupyterlabInspector

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atJupyterlabInspector.libHandlerMod.InspectionHandler.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/inspector", JSImport.Namespace)
@js.native
object atJupyterlabInspectorMod extends js.Object {
  @js.native
  class InspectionHandler protected ()
    extends typingsSlinky.atJupyterlabInspector.libHandlerMod.InspectionHandler {
    /**
      * Construct a new inspection handler for a widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  /**
    * Construct an inspector.
    */
  class InspectorPanel ()
    extends typingsSlinky.atJupyterlabInspector.libInspectorMod.InspectorPanel {
    def this(options: typingsSlinky.atJupyterlabInspector.libInspectorMod.InspectorPanel.IOptions) = this()
  }
  
  @js.native
  class KernelConnector protected ()
    extends typingsSlinky.atJupyterlabInspector.libKernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for inspection requests.
      *
      * @param options - The instatiation options for the kernel connector.
      */
    def this(options: typingsSlinky.atJupyterlabInspector.libKernelconnectorMod.KernelConnector.IOptions) = this()
  }
  
  @js.native
  object IInspector
    extends TopLevel[Token[typingsSlinky.atJupyterlabInspector.libTokensMod.IInspector]]
  
  /* static members */
  @js.native
  object InspectorPanel extends js.Object {
    /**
      * Generate content widget from string
      */
    var _generateContentWidget: js.Any = js.native
  }
  
}

