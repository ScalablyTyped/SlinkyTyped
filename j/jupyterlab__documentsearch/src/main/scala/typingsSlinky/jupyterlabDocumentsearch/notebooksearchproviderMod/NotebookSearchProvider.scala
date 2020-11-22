package typingsSlinky.jupyterlabDocumentsearch.notebooksearchproviderMod

import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchMatch
import typingsSlinky.jupyterlabDocumentsearch.interfacesMod.ISearchProvider
import typingsSlinky.jupyterlabNotebook.mod.NotebookPanel
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/documentsearch/lib/providers/notebooksearchprovider", "NotebookSearchProvider")
@js.native
class NotebookSearchProvider () extends ISearchProvider[NotebookPanel] {
  
  var _cellsWithMatches: js.Any = js.native
  
  var _changed: js.Any = js.native
  
  var _currentMatch: js.Any = js.native
  
  var _currentMatchIsSelected: js.Any = js.native
  
  var _currentProvider: js.Any = js.native
  
  var _filters: js.Any = js.native
  
  var _getMatchesFromCells: js.Any = js.native
  
  var _onSearchProviderChanged: js.Any = js.native
  
  /**
    * Gradually refresh cells in the background so that the user will not
    * experience frozen interface, `n` cells at a time.
    */
  var _refreshCellsEditorsInBackground: js.Any = js.native
  
  /**
    * Refresh the editor in the cell for the current match.
    */
  var _refreshCurrentCellEditor: js.Any = js.native
  
  var _searchProviders: js.Any = js.native
  
  var _searchTarget: js.Any = js.native
  
  var _stepNext: js.Any = js.native
  
  var _unRenderedMarkdownCells: js.Any = js.native
  
  var _updatedCurrentProvider: js.Any = js.native
  
  /**
    * Signal indicating that something in the search has changed, so the UI should update
    */
  @JSName("changed")
  def changed_MNotebookSearchProvider: ISignal[this.type, Unit] = js.native
  
  /**
    * The current index of the selected match.
    */
  @JSName("currentMatchIndex")
  def currentMatchIndex_MNotebookSearchProvider: Double | Null = js.native
  
  @JSName("hasOutputs")
  val hasOutputs_NotebookSearchProvider: /* true */ Boolean = js.native
  
  /**
    * The same list of matches provided by the startQuery promise resolution
    */
  @JSName("matches")
  def matches_MNotebookSearchProvider: js.Array[ISearchMatch] = js.native
  
  /**
    * Initialize the search using the provided options. Should update the UI
    * to highlight all matches and "select" whatever the first match should be.
    *
    * @param query A RegExp to be use to perform the search
    * @param searchTarget The widget to be searched
    * @param filters Filter parameters to pass to provider
    *
    * @returns A promise that resolves with a list of all matches
    */
  def startQuery(query: js.RegExp, searchTarget: NotebookPanel): js.Promise[js.Array[ISearchMatch]] = js.native
  def startQuery(query: js.RegExp, searchTarget: NotebookPanel, filters: INotebookFilters): js.Promise[js.Array[ISearchMatch]] = js.native
}
/* static members */
@JSImport("@jupyterlab/documentsearch/lib/providers/notebooksearchprovider", "NotebookSearchProvider")
@js.native
object NotebookSearchProvider extends js.Object {
  
  /**
    * Report whether or not this provider has the ability to search on the given object
    */
  def canSearchOn(domain: Widget): /* is @jupyterlab/notebook.@jupyterlab/notebook.NotebookPanel */ Boolean = js.native
}
