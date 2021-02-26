package typingsSlinky.jupyterlabCodeeditor

import org.scalajs.dom.raw.Event
import typingsSlinky.jupyterlabCodeeditor.anon.PartialIConfig
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.ISelectionStyle
import typingsSlinky.jupyterlabCodeeditor.widgetMod.CodeEditorWrapper.IOptions
import typingsSlinky.luminoWidgets.mod.Widget
import typingsSlinky.luminoWidgets.mod.Widget.ResizeMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgetMod {
  
  @JSImport("@jupyterlab/codeeditor/lib/widget", "CodeEditorWrapper")
  @js.native
  class CodeEditorWrapper protected () extends Widget {
    /**
      * Construct a new code editor widget.
      */
    def this(options: IOptions) = this()
    
    /**
      * Handle the `'lm-dragenter'` event for the widget.
      */
    var _evtDragEnter: js.Any = js.native
    
    /**
      * Handle the `'lm-dragleave'` event for the widget.
      */
    var _evtDragLeave: js.Any = js.native
    
    /**
      * Handle the `'lm-dragover'` event for the widget.
      */
    var _evtDragOver: js.Any = js.native
    
    /**
      * Handle the `'lm-drop'` event for the widget.
      */
    var _evtDrop: js.Any = js.native
    
    var _hasRefreshedSinceAttach: js.Any = js.native
    
    /**
      * Handle a change in model selections.
      */
    var _onSelectionsChanged: js.Any = js.native
    
    var _updateOnShow: js.Any = js.native
    
    /**
      * Get the editor wrapped by the widget.
      */
    val editor: IEditor = js.native
    
    /**
      * Handle the DOM events for the widget.
      *
      * @param event - The DOM event sent to the widget.
      *
      * #### Notes
      * This method implements the DOM `EventListener` interface and is
      * called in response to events on the notebook panel's node. It should
      * not be called directly by user code.
      */
    def handleEvent(event: Event): Unit = js.native
    
    /**
      * Get the model used by the widget.
      */
    def model: IModel = js.native
    
    /**
      * A message handler invoked on a `'resize'` message.
      */
    /* protected */ def onResize(msg: ResizeMessage): Unit = js.native
  }
  object CodeEditorWrapper {
    
    /**
      * The options used to initialize a code editor widget.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The configuration options for the editor.
        */
      var config: js.UndefOr[PartialIConfig] = js.native
      
      /**
        * A code editor factory.
        *
        * #### Notes
        * The widget needs a factory and a model instead of a `CodeEditor.IEditor`
        * object because it needs to provide its own node as the host.
        */
      var factory: Factory = js.native
      
      /**
        * The model used to initialize the code editor.
        */
      var model: IModel = js.native
      
      /**
        * The default selection style for the editor.
        */
      var selectionStyle: js.UndefOr[ISelectionStyle] = js.native
      
      /**
        * Whether to send an update request to the editor when it is shown.
        */
      var updateOnShow: js.UndefOr[Boolean] = js.native
      
      /**
        * The desired uuid for the editor.
        */
      var uuid: js.UndefOr[String] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        factory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor,
        model: IModel
      ): IOptions = {
        val __obj = js.Dynamic.literal(factory = js.Any.fromFunction1(factory), model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConfig(value: PartialIConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
        
        @scala.inline
        def setFactory(value: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "factory", js.Any.fromFunction1(value))
        
        @scala.inline
        def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectionStyle(value: ISelectionStyle): Self = StObject.set(x, "selectionStyle", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelectionStyleUndefined: Self = StObject.set(x, "selectionStyle", js.undefined)
        
        @scala.inline
        def setUpdateOnShow(value: Boolean): Self = StObject.set(x, "updateOnShow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdateOnShowUndefined: Self = StObject.set(x, "updateOnShow", js.undefined)
        
        @scala.inline
        def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
      }
    }
  }
}
