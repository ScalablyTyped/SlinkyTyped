package typingsSlinky.atJupyterlabNotebook.atJupyterlabNotebookMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.IOptions
import typingsSlinky.atPhosphorCoreutils.libJsonMod.JSONValue
import typingsSlinky.atPhosphorMessaging.atPhosphorMessagingMod.ConflatableMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/notebook", "NotebookTools")
@js.native
class NotebookTools protected ()
  extends typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools {
  /**
    * Construct a new NotebookTools object.
    */
  def this(options: IOptions) = this()
}

@JSImport("@jupyterlab/notebook", "NotebookTools")
@js.native
object NotebookTools extends js.Object {
  /**
    * A cell tool displaying the active cell contents.
    */
  @js.native
  /**
    * Construct a new active cell tool.
    */
  class ActiveCellTool ()
    extends typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.ActiveCellTool
  
  /**
    * A cell metadata editor
    */
  @js.native
  class CellMetadataEditorTool protected ()
    extends typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.CellMetadataEditorTool {
    def this(options: typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  }
  
  /**
    * A cell tool that provides a selection for a given metadata key.
    */
  @js.native
  class KeySelector protected ()
    extends typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.KeySelector {
    /**
      * Construct a new KeySelector.
      */
    def this(options: typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.KeySelector.IOptions) = this()
  }
  
  /**
    * A raw metadata editor.
    */
  @js.native
  class MetadataEditorTool protected ()
    extends typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool {
    /**
      * Construct a new raw metadata tool.
      */
    def this(options: typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  }
  
  /**
    * A notebook metadata editor
    */
  @js.native
  class NotebookMetadataEditorTool protected ()
    extends typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.NotebookMetadataEditorTool {
    def this(options: typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.MetadataEditorTool.IOptions) = this()
  }
  
  /**
    * The base notebook tool, meant to be subclassed.
    */
  @js.native
  class Tool ()
    extends typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.Tool
  
  /**
    * A singleton conflatable `'activecell-changed'` message.
    */
  val ActiveCellMessage: ConflatableMessage = js.native
  /**
    * A singleton conflatable `'activenotebookpanel-changed'` message.
    */
  val ActiveNotebookPanelMessage: ConflatableMessage = js.native
  /**
    * A singleton conflatable `'selection-changed'` message.
    */
  val SelectionMessage: ConflatableMessage = js.native
  /**
    * Create an nbconvert selector.
    */
  def createNBConvertSelector(optionsMap: StringDictionary[JSONValue]): typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.KeySelector = js.native
  /**
    * Create a slideshow selector.
    */
  def createSlideShowSelector(): typingsSlinky.atJupyterlabNotebook.libNotebooktoolsMod.NotebookTools.KeySelector = js.native
  /**
    * The namespace for `KeySelector` static data.
    */
  @js.native
  object KeySelector extends js.Object
  
  /**
    * The namespace for `MetadataEditorTool` static data.
    */
  @js.native
  object MetadataEditorTool extends js.Object
  
}

