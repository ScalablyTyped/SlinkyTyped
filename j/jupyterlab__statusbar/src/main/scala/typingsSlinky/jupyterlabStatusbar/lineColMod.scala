package typingsSlinky.jupyterlabStatusbar

import typingsSlinky.jupyterlabApputils.mod.VDomModel
import typingsSlinky.jupyterlabApputils.mod.VDomRenderer
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IEditor
import typingsSlinky.jupyterlabStatusbar.lineColMod.LineCol.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineColMod {
  
  @JSImport("@jupyterlab/statusbar/lib/defaults/lineCol", "LineCol")
  @js.native
  /**
    * Construct a new LineCol status item.
    */
  class LineCol () extends VDomRenderer[Model] {
    
    /**
      * A click handler for the widget.
      */
    var _handleClick: js.Any = js.native
    
    /**
      * Handle submission for the widget.
      */
    var _handleSubmit: js.Any = js.native
    
    var _popup: js.Any = js.native
  }
  object LineCol {
    
    /**
      * A VDom model for a status item tracking the line/column of an editor.
      */
    @JSImport("@jupyterlab/statusbar/lib/defaults/lineCol", "LineCol.Model")
    @js.native
    class Model () extends VDomModel {
      
      var _column: js.Any = js.native
      
      var _editor: js.Any = js.native
      
      var _getAllState: js.Any = js.native
      
      var _line: js.Any = js.native
      
      /**
        * React to a change in the cursors of the current editor.
        */
      var _onSelectionChanged: js.Any = js.native
      
      var _triggerChange: js.Any = js.native
      
      /**
        * The current column of the model.
        */
      def column: Double = js.native
      
      /**
        * The current editor of the model.
        */
      def editor: IEditor | Null = js.native
      def editor_=(editor: IEditor | Null): Unit = js.native
      
      /**
        * The current line of the model.
        */
      def line: Double = js.native
    }
  }
  
  /**
    * A namespace for LineColComponent.
    */
  object LineColComponent {
    
    /**
      * Props for LineColComponent.
      */
    @js.native
    trait IProps extends StObject {
      
      /**
        * The current column number.
        */
      var column: Double = js.native
      
      /**
        * A click handler for the LineColComponent, which
        * we use to launch the LineFormComponent.
        */
      def handleClick(): Unit = js.native
      
      /**
        * The current line number.
        */
      var line: Double = js.native
    }
    object IProps {
      
      @scala.inline
      def apply(column: Double, handleClick: () => Unit, line: Double): IProps = {
        val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], handleClick = js.Any.fromFunction0(handleClick), line = line.asInstanceOf[js.Any])
        __obj.asInstanceOf[IProps]
      }
      
      @scala.inline
      implicit class IPropsMutableBuilder[Self <: IProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandleClick(value: () => Unit): Self = StObject.set(x, "handleClick", js.Any.fromFunction0(value))
        
        @scala.inline
        def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      }
    }
  }
}
