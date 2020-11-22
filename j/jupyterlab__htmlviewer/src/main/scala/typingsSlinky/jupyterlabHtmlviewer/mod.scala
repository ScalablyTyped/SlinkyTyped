package typingsSlinky.jupyterlabHtmlviewer

import typingsSlinky.jupyterlabApputils.mod.IFrame
import typingsSlinky.jupyterlabApputils.widgettrackerMod.IWidgetTracker
import typingsSlinky.jupyterlabDocregistry.defaultMod.DocumentWidget.IOptionsOptionalContent
import typingsSlinky.jupyterlabDocregistry.mod.ABCWidgetFactory
import typingsSlinky.jupyterlabDocregistry.mod.DocumentWidget
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/htmlviewer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val IHTMLViewerTracker: Token[typingsSlinky.jupyterlabHtmlviewer.mod.IHTMLViewerTracker] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
  - typingsSlinky.luminoMessaging.mod.IMessageHandler because Already inherited
  - typingsSlinky.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typingsSlinky.luminoWidgets.widgetMod.Widget because Already inherited
  - typingsSlinky.luminoWidgets.mod.Widget because Already inherited
  - typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget because var conflicts: _disposed, _flags, _layout, _parent, content, id, layout, parent, revealed, toolbar. Inlined  */ @js.native
  class HTMLViewer protected () extends DocumentWidget[IFrame, IModel] {
    /**
      * Create a new widget for rendering HTML.
      */
    def this(options: IOptionsOptionalContent[Widget, IModel]) = this()
    
    var _monitor: js.Any = js.native
    
    var _objectUrl: js.Any = js.native
    
    var _parser: js.Any = js.native
    
    /**
      * Render HTML in IFrame into this widget's node.
      */
    var _renderModel: js.Any = js.native
    
    var _renderPending: js.Any = js.native
    
    /**
      * Set a <base> element in the HTML string so that the iframe
      * can correctly dereference relative links.
      */
    var _setBase: js.Any = js.native
    
    var _trustedChanged: js.Any = js.native
    
    /**
      * Handle and update request.
      */
    /* protected */ def onUpdateRequest(): Unit = js.native
    
    /**
      * Whether the HTML document is trusted. If trusted,
      * it can execute Javascript in the iframe sandbox.
      */
    def trusted: Boolean = js.native
    
    /**
      * Emitted when the trust state of the document changes.
      */
    def trustedChanged: ISignal[this.type, Boolean] = js.native
    
    def trusted_=(value: Boolean): Unit = js.native
  }
  
  @js.native
  class HTMLViewerFactory () extends ABCWidgetFactory[HTMLViewer, IModel]
  
  type IHTMLViewerTracker = IWidgetTracker[HTMLViewer]
}
