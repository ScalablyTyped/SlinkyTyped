package typingsSlinky.jupyterlabInspector

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabInspector.handlerMod.InspectionHandler.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/inspector", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object IInspector
    extends TopLevel[Token[typingsSlinky.jupyterlabInspector.tokensMod.IInspector]]
  
  @js.native
  class InspectionHandler protected ()
    extends typingsSlinky.jupyterlabInspector.handlerMod.InspectionHandler {
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
    extends typingsSlinky.jupyterlabInspector.inspectorMod.InspectorPanel {
    def this(options: typingsSlinky.jupyterlabInspector.inspectorMod.InspectorPanel.IOptions) = this()
  }
  /* static members */
  @js.native
  object InspectorPanel extends js.Object {
    
    /**
      * Generate content widget from string
      */
    var _generateContentWidget: js.Any = js.native
  }
  
  @js.native
  class KernelConnector protected ()
    extends typingsSlinky.jupyterlabInspector.kernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for inspection requests.
      *
      * @param options - The instatiation options for the kernel connector.
      */
    def this(options: typingsSlinky.jupyterlabInspector.kernelconnectorMod.KernelConnector.IOptions) = this()
  }
}
