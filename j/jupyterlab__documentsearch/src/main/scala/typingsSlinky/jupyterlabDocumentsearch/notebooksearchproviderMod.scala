package typingsSlinky.jupyterlabDocumentsearch

import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.jupyterlabNotebook.mod.NotebookPanel
import typingsSlinky.phosphorSignaling.mod.ISignal
import typingsSlinky.phosphorWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/documentsearch/lib/providers/notebooksearchprovider", JSImport.Namespace)
@js.native
object notebooksearchproviderMod extends js.Object {
  @js.native
  class NotebookSearchProvider () extends ISearchProvider[NotebookPanel] {
    var _cellsWithMatches: js.Any = js.native
    var _changed: js.Any = js.native
    var _cmSearchProviders: js.Any = js.native
    var _currentMatch: js.Any = js.native
    var _currentMatchIsSelected: js.Any = js.native
    var _getMatchesFromCells: js.Any = js.native
    var _onCmSearchProviderChanged: js.Any = js.native
    var _query: js.Any = js.native
    /**
      * Gradually refresh cells in the background so that the user will not
      * experience frozen interface, `n` cells at a time.
      */
    var _refreshCellsEditorsInBackground: js.Any = js.native
    /**
      * Refresh the editor in the cell for the current match.
      */
    var _refreshCurrentCellEditor: js.Any = js.native
    var _restartQuery: js.Any = js.native
    var _searchTarget: js.Any = js.native
    var _stepNext: js.Any = js.native
    var _unRenderedMarkdownCells: js.Any = js.native
    /**
      * Signal indicating that something in the search has changed, so the UI should update
      */
    @JSName("changed")
    val changed_NotebookSearchProvider: ISignal[this.type, Unit] = js.native
    /**
      * The current index of the selected match.
      */
    @JSName("currentMatchIndex")
    val currentMatchIndex_NotebookSearchProvider: Double = js.native
  }
  
  /* static members */
  @js.native
  object NotebookSearchProvider extends js.Object {
    /**
      * Report whether or not this provider has the ability to search on the given object
      */
    def canSearchOn(domain: Widget): /* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean = js.native
  }
  
}

