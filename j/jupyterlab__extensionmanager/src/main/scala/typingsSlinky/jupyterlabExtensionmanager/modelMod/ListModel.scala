package typingsSlinky.jupyterlabExtensionmanager.modelMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.jupyterlabApputils.vdomMod.VDomModel
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.black
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.default
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.invalid
import typingsSlinky.jupyterlabExtensionmanager.jupyterlabExtensionmanagerStrings.white
import typingsSlinky.jupyterlabExtensionmanager.listingsMod.Lister
import typingsSlinky.jupyterlabExtensionmanager.npmMod.ISearchResult
import typingsSlinky.jupyterlabExtensionmanager.npmMod.Searcher
import typingsSlinky.jupyterlabServices.mod.ServiceManager
import typingsSlinky.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/extensionmanager/lib/model", "ListModel")
@js.native
class ListModel protected () extends VDomModel {
  def this(serviceManager: ServiceManager, settings: ISettings) = this()
  
  /**
    * Add a pending action.
    *
    * @param pending A promise that resolves when the action is completed.
    */
  /* protected */ def _addPendingAction(pending: js.Promise[_]): Unit = js.native
  
  var _blacklistArray: js.Any = js.native
  
  var _debouncedUpdate: js.Any = js.native
  
  var _installed: js.Any = js.native
  
  var _listMode: js.Any = js.native
  
  var _listingIsLoaded: js.Any = js.native
  
  var _page: js.Any = js.native
  
  var _pagination: js.Any = js.native
  
  var _pendingActions: js.Any = js.native
  
  /**
    * Send a request to the server to perform an action on an extension.
    *
    * @param action A valid action to perform.
    * @param entry The extension to perform the action on.
    */
  /* protected */ def _performAction(action: String, entry: IEntry): js.Promise[IActionReply] = js.native
  
  var _query: js.Any = js.native
  
  var _searchResult: js.Any = js.native
  
  var _totalBlacklistedFound: js.Any = js.native
  
  var _totalEntries: js.Any = js.native
  
  var _totalWhitelistedFound: js.Any = js.native
  
  var _whitelistArray: js.Any = js.native
  
  /**
    * Contains an error message if an error occurred when searching for lists.
    */
  var blacklistError: String | Null = js.native
  
  /**
    * Check for companion packages in kernels or server.
    *
    * @param entry An entry indicating which extension to check.
    */
  def checkCompanionPackages(entry: IEntry): js.Promise[Boolean] = js.native
  
  /**
    * Disable an extension.
    *
    * @param entry An entry indicating which extension to disable.
    */
  def disable(entry: IEntry): js.Promise[Unit] = js.native
  
  /**
    * Enable an extension.
    *
    * @param entry An entry indicating which extension to enable.
    */
  def enable(entry: IEntry): js.Promise[Unit] = js.native
  
  /**
    * Make a request to the server for info about its installed extensions.
    */
  /* protected */ def fetchInstalled(): js.Promise[js.Array[IInstalledEntry]] = js.native
  /* protected */ def fetchInstalled(refreshInstalled: Boolean): js.Promise[js.Array[IInstalledEntry]] = js.native
  
  /**
    * Whether there are currently any actions pending.
    */
  def hasPendingActions(): Boolean = js.native
  
  /**
    * Ignore a build recommendation
    */
  def ignoreBuildRecommendation(): Unit = js.native
  
  /**
    * Initialize the model.
    */
  def initialize(): js.Promise[Unit] = js.native
  
  /**
    * Whether the model has finished async initialization.
    */
  var initialized: Boolean = js.native
  
  /**
    * Install an extension.
    *
    * @param entry An entry indicating which extension to install.
    */
  def install(entry: IEntry): js.Promise[Unit] = js.native
  
  /**
    * A readonly array of the installed extensions.
    */
  def installed: js.Array[IEntry] = js.native
  
  /**
    * Contains an error message if an error occurred when querying installed extensions.
    */
  var installedError: String | Null = js.native
  
  var isListed: js.Any = js.native
  
  /**
    * The list mode.
    */
  def listMode: black | white | default | invalid = js.native
  
  var lister: Lister = js.native
  
  /**
    * The current NPM repository search page.
    *
    * The npm repository search is paginated by the `pagination` attribute.
    * The `page` value selects which page is used.
    *
    * Setting its value triggers a new search.
    */
  def page: Double = js.native
  def page_=(value: Double): Unit = js.native
  
  /**
    * The NPM repository search pagination.
    *
    * The npm repository search is paginated by the `pagination` attribute.
    * The `page` value selects which page is used.
    *
    * Setting its value triggers a new search.
    */
  def pagination: Double = js.native
  def pagination_=(value: Double): Unit = js.native
  
  /**
    * Perform a build on the server
    */
  def performBuild(): Unit = js.native
  
  /**
    * Search with current query.
    *
    * Sets searchError and totalEntries as appropriate.
    *
    * @returns {Promise<{ [key: string]: IEntry; }>} The search result as a map of entries.
    */
  /* protected */ def performSearch(): js.Promise[StringDictionary[IEntry]] = js.native
  
  /**
    * Whether a fresh build should be considered due to actions taken.
    */
  var promptBuild: Boolean = js.native
  
  /**
    * The current NPM repository search query.
    *
    * Setting its value triggers a new search.
    */
  def query: String | Null = js.native
  
  /**
    * Query the installed extensions.
    *
    * Sets installedError as appropriate.
    *
    * @returns {Promise<{ [key: string]: IEntry; }>} A map of installed extensions.
    */
  /* protected */ def queryInstalled(refreshInstalled: Boolean): js.Promise[StringDictionary[IEntry]] = js.native
  
  def query_=(value: String | Null): Unit = js.native
  
  /**
    * Ignore a build recommendation
    */
  def refreshInstalled(): Unit = js.native
  
  /**
    * Contains an error message if an error occurred when searching for extensions.
    */
  var searchError: String | Null = js.native
  
  /**
    * A readonly array containing the latest search result
    */
  def searchResult: js.Array[IEntry] = js.native
  
  /**
    * A helper for performing searches of jupyterlab extensions on the NPM repository.
    */
  var searcher: Searcher = js.native
  
  /**
    * Contains an error message if an error occurred when querying the server extension.
    */
  var serverConnectionError: String | Null = js.native
  
  /**
    * Settings for connecting to the notebook server.
    */
  var serverConnectionSettings: typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings = js.native
  
  /**
    * Contains an error message if the server has unfulfilled requirements.
    */
  var serverRequirementsError: String | Null = js.native
  
  /**
    * The service manager to use for building.
    */
  var serviceManager: ServiceManager = js.native
  
  /**
    * The total number of blacklisted results in the current search.
    */
  def totalBlacklistedFound: Double = js.native
  
  /**
    * The total number of results in the current search.
    */
  def totalEntries: Double = js.native
  
  /**
    * The total number of whitelisted results in the current search.
    */
  def totalWhitelistedFound: Double = js.native
  
  /**
    * Translate installed extensions information from the server into entries.
    *
    * @param res Promise to the server reply data.
    */
  /* protected */ def translateInstalled(res: js.Promise[js.Array[IInstalledEntry]]): js.Promise[StringDictionary[IEntry]] = js.native
  
  /**
    * Translate search results from an npm repository query into entries
    * and remove entries with 'deprecated' in the keyword list
    *
    * @param res Promise to an npm query result.
    */
  /* protected */ def translateSearchResult(res: js.Promise[ISearchResult]): js.Promise[StringDictionary[IEntry]] = js.native
  
  /**
    * Trigger a build check to incorporate actions taken.
    */
  def triggerBuildCheck(): Unit = js.native
  
  /**
    * Uninstall an extension.
    *
    * @param entry An entry indicating which extension to uninstall.
    */
  def uninstall(entry: IEntry): js.Promise[Unit] = js.native
  
  /**
    * Update the current model.
    *
    * This will query the NPM repository, and the notebook server.
    *
    * Emits the `stateChanged` signal on successful completion.
    */
  /* protected */ def update(): js.Promise[Unit] = js.native
  /* protected */ def update(refreshInstalled: Boolean): js.Promise[Unit] = js.native
}
@JSImport("@jupyterlab/extensionmanager/lib/model", "ListModel")
@js.native
object ListModel extends js.Object {
  
  /**
    * Utility function to check whether an entry can be updated.
    *
    * @param entry The entry to check.
    */
  def entryHasUpdate(entry: IEntry): Boolean = js.native
  
  def isDisclaimed(): Boolean = js.native
  
  def toogleDisclaimed(): Unit = js.native
}
