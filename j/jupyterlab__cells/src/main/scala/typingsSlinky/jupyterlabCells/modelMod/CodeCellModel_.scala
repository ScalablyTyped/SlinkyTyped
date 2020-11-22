package typingsSlinky.jupyterlabCells.modelMod

import typingsSlinky.jupyterlabCells.jupyterlabCellsStrings.code
import typingsSlinky.jupyterlabCells.modelMod.CodeCellModel.IOptions
import typingsSlinky.jupyterlabNbformat.mod.ExecutionCount
import typingsSlinky.jupyterlabOutputarea.modelMod.IOutputAreaModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
- typingsSlinky.jupyterlabCodeeditor.editorMod.CodeEditor.IModel because Already inherited
- typingsSlinky.jupyterlabCells.modelMod.ICellModel because Already inherited
- typingsSlinky.jupyterlabCells.modelMod.ICodeCellModel because var conflicts: metadata, mimeType, mimeTypeChanged, trusted. Inlined executionCount, outputs, clearExecution */ @JSImport("@jupyterlab/cells/lib/model", "CodeCellModel")
@js.native
class CodeCellModel_ protected () extends CellModel {
  /**
    * Construct a new code cell with optional original cell content.
    */
  def this(options: IOptions) = this()
  
  /**
    * Handle a change to the execution count.
    */
  var _onExecutionCountChanged: js.Any = js.native
  
  var _outputs: js.Any = js.native
  
  /**
    * Clear execution, outputs, and related metadata
    */
  def clearExecution(): Unit = js.native
  
  /**
    * The execution count of the cell.
    */
  def executionCount: ExecutionCount = js.native
  def executionCount_=(newValue: ExecutionCount): Unit = js.native
  /**
    * The code cell's prompt number. Will be null if the cell has not been run.
    */
  @JSName("executionCount")
  var executionCount_FCodeCellModel_ : ExecutionCount = js.native
  
  /**
    * The cell outputs.
    */
  def outputs: IOutputAreaModel = js.native
  /**
    * The cell outputs.
    */
  @JSName("outputs")
  val outputs_FCodeCellModel_ : IOutputAreaModel = js.native
  
  /**
    * The type of the cell.
    */
  @JSName("type")
  def type_MCodeCellModel_ : code = js.native
}
