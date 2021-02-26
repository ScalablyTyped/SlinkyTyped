package typingsSlinky.jupyterlabCells

import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext
import typingsSlinky.jupyterlabCells.celldragutilsMod.CellDragUtils.ICellTargetArea
import typingsSlinky.jupyterlabCells.modelMod.ICellModel
import typingsSlinky.jupyterlabCells.widgetMod.Cell.IOptions
import typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.Factory
import typingsSlinky.jupyterlabNbformat.mod.ICell
import typingsSlinky.jupyterlabServices.messagesMod.IExecuteReplyMsg
import typingsSlinky.luminoAlgorithm.iterMod.IterableOrArrayLike
import typingsSlinky.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/cells", "AttachmentsCell")
  @js.native
  abstract class AttachmentsCell protected ()
    extends typingsSlinky.jupyterlabCells.widgetMod.AttachmentsCell {
    /**
      * Construct a new base cell widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells", "AttachmentsCellModel")
  @js.native
  class AttachmentsCellModel protected ()
    extends typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel.IOptions) = this()
  }
  object AttachmentsCellModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/cells", "AttachmentsCellModel.ContentFactory")
    @js.native
    class ContentFactory ()
      extends typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel.ContentFactory
    
    /**
      * The shared `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells", "AttachmentsCellModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/cells", "Cell")
  @js.native
  class Cell protected ()
    extends typingsSlinky.jupyterlabCells.widgetMod.Cell {
    /**
      * Construct a new base cell widget.
      */
    def this(options: IOptions) = this()
  }
  object Cell {
    
    /**
      * The default implementation of an `IContentFactory`.
      *
      * This includes a CodeMirror editor factory to make it easy to use out of the box.
      */
    @JSImport("@jupyterlab/cells", "Cell.ContentFactory")
    @js.native
    /**
      * Create a content factory for a cell.
      */
    class ContentFactory ()
      extends typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory {
      def this(options: typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory.IOptions) = this()
    }
    /**
      * A namespace for cell content factory.
      */
    object ContentFactory
    
    /**
      * The default content factory for cells.
      */
    @JSImport("@jupyterlab/cells", "Cell.defaultContentFactory")
    @js.native
    val defaultContentFactory: typingsSlinky.jupyterlabCells.widgetMod.Cell.ContentFactory = js.native
  }
  
  object CellDragUtils {
    
    /**
      * Create an image for the cell(s) to be dragged
      *
      * @param activeCell - The cell from where the drag event is triggered
      * @param selectedCells - The cells to be dragged
      */
    @JSImport("@jupyterlab/cells", "CellDragUtils.createCellDragImage")
    @js.native
    def createCellDragImage(activeCell: typingsSlinky.jupyterlabCells.widgetMod.Cell, selectedCells: js.Array[ICell]): HTMLElement = js.native
    
    /**
      * Detect which part of the cell triggered the MouseEvent
      *
      * @param cell - The cell which contains the MouseEvent's target
      * @param target - The DOM node which triggered the MouseEvent
      */
    @JSImport("@jupyterlab/cells", "CellDragUtils.detectTargetArea")
    @js.native
    def detectTargetArea(cell: typingsSlinky.jupyterlabCells.widgetMod.Cell, target: HTMLElement): ICellTargetArea = js.native
    
    /**
      * Find the cell index containing the target html element.
      * This function traces up the DOM hierarchy to find the root cell
      * node. Then find the corresponding child and select it.
      *
      * @param node - the cell node or a child of the cell node.
      * @param cells - an iterable of Cells
      * @param isCellNode - a function that takes in a node and checks if
      * it is a cell node.
      *
      * @returns index of the cell we're looking for. Returns -1 if
      * the cell is not founds
      */
    @JSImport("@jupyterlab/cells", "CellDragUtils.findCell")
    @js.native
    def findCell(
      node: HTMLElement,
      cells: IterableOrArrayLike[typingsSlinky.jupyterlabCells.widgetMod.Cell],
      isCellNode: js.Function1[/* node */ HTMLElement, Boolean]
    ): Double = js.native
    
    /**
      * Detect if a drag event should be started. This is down if the
      * mouse is moved beyond a certain distance (DRAG_THRESHOLD).
      *
      * @param prevX - X Coordinate of the mouse pointer during the mousedown event
      * @param prevY - Y Coordinate of the mouse pointer during the mousedown event
      * @param nextX - Current X Coordinate of the mouse pointer
      * @param nextY - Current Y Coordinate of the mouse pointer
      */
    @JSImport("@jupyterlab/cells", "CellDragUtils.shouldStartDrag")
    @js.native
    def shouldStartDrag(prevX: Double, prevY: Double, nextX: Double, nextY: Double): Boolean = js.native
  }
  
  @JSImport("@jupyterlab/cells", "CellFooter")
  @js.native
  /**
    * Construct a new cell footer.
    */
  class CellFooter ()
    extends typingsSlinky.jupyterlabCells.headerfooterMod.CellFooter
  
  @JSImport("@jupyterlab/cells", "CellHeader")
  @js.native
  /**
    * Construct a new cell header.
    */
  class CellHeader ()
    extends typingsSlinky.jupyterlabCells.headerfooterMod.CellHeader
  
  @JSImport("@jupyterlab/cells", "CellModel")
  @js.native
  class CellModel protected ()
    extends typingsSlinky.jupyterlabCells.modelMod.CellModel {
    /**
      * Construct a cell model from optional cell content.
      */
    def this(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells", "CodeCell")
  @js.native
  class CodeCell protected ()
    extends typingsSlinky.jupyterlabCells.widgetMod.CodeCell {
    /**
      * Construct a code cell widget.
      */
    def this(options: typingsSlinky.jupyterlabCells.widgetMod.CodeCell.IOptions) = this()
  }
  object CodeCell {
    
    /**
      * Execute a cell given a client session.
      */
    @JSImport("@jupyterlab/cells", "CodeCell.execute")
    @js.native
    def execute(cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell, sessionContext: ISessionContext): js.Promise[IExecuteReplyMsg | Unit] = js.native
    @JSImport("@jupyterlab/cells", "CodeCell.execute")
    @js.native
    def execute(
      cell: typingsSlinky.jupyterlabCells.widgetMod.CodeCell,
      sessionContext: ISessionContext,
      metadata: JSONObject
    ): js.Promise[IExecuteReplyMsg | Unit] = js.native
  }
  
  @JSImport("@jupyterlab/cells", "CodeCellModel")
  @js.native
  class CodeCellModel protected ()
    extends typingsSlinky.jupyterlabCells.modelMod.CodeCellModel {
    /**
      * Construct a new code cell with optional original cell content.
      */
    def this(options: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions) = this()
  }
  object CodeCellModel {
    
    /**
      * The default implementation of an `IContentFactory`.
      */
    @JSImport("@jupyterlab/cells", "CodeCellModel.ContentFactory")
    @js.native
    class ContentFactory ()
      extends typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.ContentFactory
    
    /**
      * The shared `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells", "CodeCellModel.defaultContentFactory")
    @js.native
    val defaultContentFactory: typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.ContentFactory = js.native
  }
  
  @JSImport("@jupyterlab/cells", "Collapser")
  @js.native
  /**
    * Construct a new collapser.
    */
  abstract class Collapser ()
    extends typingsSlinky.jupyterlabCells.collapserMod.Collapser
  
  @JSImport("@jupyterlab/cells", "InputArea")
  @js.native
  class InputArea protected ()
    extends typingsSlinky.jupyterlabCells.inputareaMod.InputArea {
    /**
      * Construct an input area widget.
      */
    def this(options: typingsSlinky.jupyterlabCells.inputareaMod.InputArea.IOptions) = this()
  }
  object InputArea {
    
    /**
      * Default implementation of `IContentFactory`.
      *
      * This defaults to using an `editorFactory` based on CodeMirror.
      */
    @JSImport("@jupyterlab/cells", "InputArea.ContentFactory")
    @js.native
    /**
      * Construct a `ContentFactory`.
      */
    class ContentFactory ()
      extends typingsSlinky.jupyterlabCells.inputareaMod.InputArea.ContentFactory {
      def this(options: typingsSlinky.jupyterlabCells.inputareaMod.InputArea.ContentFactory.IOptions) = this()
    }
    /**
      * A namespace for the input area content factory.
      */
    object ContentFactory
    
    /**
      * The default `ContentFactory` instance.
      */
    @JSImport("@jupyterlab/cells", "InputArea.defaultContentFactory")
    @js.native
    val defaultContentFactory: typingsSlinky.jupyterlabCells.inputareaMod.InputArea.ContentFactory = js.native
    
    /**
      * The default editor factory singleton based on CodeMirror.
      */
    @JSImport("@jupyterlab/cells", "InputArea.defaultEditorFactory")
    @js.native
    val defaultEditorFactory: Factory = js.native
  }
  
  @JSImport("@jupyterlab/cells", "InputCollapser")
  @js.native
  /**
    * Construct a new input collapser.
    */
  class InputCollapser ()
    extends typingsSlinky.jupyterlabCells.collapserMod.InputCollapser
  
  @JSImport("@jupyterlab/cells", "InputPlaceholder")
  @js.native
  class InputPlaceholder protected ()
    extends typingsSlinky.jupyterlabCells.placeholderMod.InputPlaceholder {
    /**
      * Construct a new input placeholder.
      */
    def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
  }
  
  @JSImport("@jupyterlab/cells", "InputPrompt")
  @js.native
  class InputPrompt ()
    extends typingsSlinky.jupyterlabCells.inputareaMod.InputPrompt
  
  @JSImport("@jupyterlab/cells", "MarkdownCell")
  @js.native
  class MarkdownCell protected ()
    extends typingsSlinky.jupyterlabCells.widgetMod.MarkdownCell {
    /**
      * Construct a Markdown cell widget.
      */
    def this(options: typingsSlinky.jupyterlabCells.widgetMod.MarkdownCell.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells", "MarkdownCellModel")
  @js.native
  class MarkdownCellModel protected ()
    extends typingsSlinky.jupyterlabCells.modelMod.MarkdownCellModel {
    /**
      * Construct a markdown cell model from optional cell content.
      */
    def this(options: typingsSlinky.jupyterlabCells.modelMod.CellModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells", "OutputCollapser")
  @js.native
  /**
    * Construct a new output collapser.
    */
  class OutputCollapser ()
    extends typingsSlinky.jupyterlabCells.collapserMod.OutputCollapser
  
  @JSImport("@jupyterlab/cells", "OutputPlaceholder")
  @js.native
  class OutputPlaceholder protected ()
    extends typingsSlinky.jupyterlabCells.placeholderMod.OutputPlaceholder {
    /**
      * Construct a new output placeholder.
      */
    def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
  }
  
  @JSImport("@jupyterlab/cells", "Placeholder")
  @js.native
  abstract class Placeholder protected ()
    extends typingsSlinky.jupyterlabCells.placeholderMod.Placeholder {
    /**
      * Construct a new placeholder.
      */
    def this(callback: js.Function1[/* e */ SyntheticMouseEvent[HTMLDivElement], Unit]) = this()
  }
  
  @JSImport("@jupyterlab/cells", "RawCell")
  @js.native
  class RawCell protected ()
    extends typingsSlinky.jupyterlabCells.widgetMod.RawCell {
    /**
      * Construct a raw cell widget.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells", "RawCellModel")
  @js.native
  class RawCellModel protected ()
    extends typingsSlinky.jupyterlabCells.modelMod.RawCellModel {
    /**
      * Construct a new cell with optional attachments.
      */
    def this(options: typingsSlinky.jupyterlabCells.modelMod.AttachmentsCellModel.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/cells", "isCodeCellModel")
  @js.native
  def isCodeCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.ICodeCellModel */ Boolean = js.native
  
  @JSImport("@jupyterlab/cells", "isMarkdownCellModel")
  @js.native
  def isMarkdownCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IMarkdownCellModel */ Boolean = js.native
  
  @JSImport("@jupyterlab/cells", "isRawCellModel")
  @js.native
  def isRawCellModel(model: ICellModel): /* is @jupyterlab/cells.@jupyterlab/cells/lib/model.IRawCellModel */ Boolean = js.native
}
