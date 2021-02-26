package typingsSlinky.jupyterlabCodeeditor

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLSpanElement
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel
import typingsSlinky.jupyterlabCodeeditor.jsoneditorMod.JSONEditor.IOptions
import typingsSlinky.jupyterlabObservables.observablejsonMod.IObservableJSON
import typingsSlinky.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsoneditorMod {
  
  @JSImport("@jupyterlab/codeeditor/lib/jsoneditor", "JSONEditor")
  @js.native
  class JSONEditor protected () extends Widget {
    /**
      * Construct a new JSON editor.
      */
    def this(options: IOptions) = this()
    
    var _changeGuard: js.Any = js.native
    
    var _dataDirty: js.Any = js.native
    
    /**
      * Handle blur events for the text area.
      */
    var _evtBlur: js.Any = js.native
    
    /**
      * Handle click events for the buttons.
      */
    var _evtClick: js.Any = js.native
    
    var _inputDirty: js.Any = js.native
    
    /**
      * Merge the user content.
      */
    var _mergeContent: js.Any = js.native
    
    /**
      * Handle a change to the metadata of the source.
      */
    var _onSourceChanged: js.Any = js.native
    
    /**
      * Handle change events.
      */
    var _onValueChanged: js.Any = js.native
    
    var _originalValue: js.Any = js.native
    
    /**
      * Set the value given the owner contents.
      */
    var _setValue: js.Any = js.native
    
    var _source: js.Any = js.native
    
    /**
      * The commit button used by the JSON editor.
      */
    val commitButtonNode: HTMLSpanElement = js.native
    
    /**
      * The code editor used by the editor.
      */
    val editor: IEditor = js.native
    
    /**
      * The editor host node used by the JSON editor.
      */
    val editorHostNode: HTMLDivElement = js.native
    
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
      * The editor host node used by the JSON editor.
      */
    val headerNode: HTMLDivElement = js.native
    
    /**
      * Get whether the editor is dirty.
      */
    def isDirty: Boolean = js.native
    
    /**
      * The code editor model used by the editor.
      */
    val model: IModel = js.native
    
    /**
      * The revert button used by the JSON editor.
      */
    val revertButtonNode: HTMLSpanElement = js.native
    
    /**
      * The observable source.
      */
    def source: IObservableJSON | Null = js.native
    def source_=(value: IObservableJSON | Null): Unit = js.native
  }
  object JSONEditor {
    
    /**
      * The options used to initialize a json editor.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The editor factory used by the editor.
        */
      var editorFactory: Factory = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(
        editorFactory: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor
      ): IOptions = {
        val __obj = js.Dynamic.literal(editorFactory = js.Any.fromFunction1(editorFactory))
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEditorFactory(value: /* options */ typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IOptions => IEditor): Self = StObject.set(x, "editorFactory", js.Any.fromFunction1(value))
      }
    }
  }
}
