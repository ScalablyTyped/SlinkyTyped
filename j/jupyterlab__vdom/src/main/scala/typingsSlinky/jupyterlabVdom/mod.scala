package typingsSlinky.jupyterlabVdom

import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabDocregistry.mod.MimeDocument
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IContext
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRenderer
import typingsSlinky.jupyterlabRendermimeInterfaces.mod.IRenderMime.IRendererOptions
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.nteractTransformVdom.eventToObjectMod.SerializedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/vdom", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val IVDOMTracker: Token[typingsSlinky.jupyterlabVdom.mod.IVDOMTracker] = js.native
  
  @js.native
  class RenderedVDOM protected () extends IRenderer {
    /**
      * Create a new widget for rendering DOM.
      */
    def this(options: IRendererOptions) = this()
    def this(options: IRendererOptions, context: IContext[IModel]) = this()
    
    var _comms: js.Any = js.native
    
    var _mimeType: js.Any = js.native
    
    var _sessionContext: js.Any = js.native
    
    var _timer: js.Any = js.native
    
    /**
      * Handle events for VDOM element.
      */
    def handleVDOMEvent(targetName: String, event: SerializedEvent[_]): Unit = js.native
  }
  
  type IVDOMTracker = IWidgetTracker[MimeDocument]
}
