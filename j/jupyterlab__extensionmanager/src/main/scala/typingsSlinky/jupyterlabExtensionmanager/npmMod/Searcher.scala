package typingsSlinky.jupyterlabExtensionmanager.npmMod

import typingsSlinky.jupyterlabExtensionmanager.companionsMod.IJupyterLabPackageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/extensionmanager/lib/npm", "Searcher")
@js.native
/**
  * Create a Searcher object.
  *
  * @param repoUri The URI of the NPM registry to use.
  * @param cdnUri The URI of the CDN to use for fetching full package data.
  */
class Searcher () extends js.Object {
  def this(repoUri: String) = this()
  def this(repoUri: js.UndefOr[scala.Nothing], cdnUri: String) = this()
  def this(repoUri: String, cdnUri: String) = this()
  
  /**
    * The URI of the CDN to use for fetching full package data.
    */
  var cdnUri: String = js.native
  
  /**
    * Fetch package.json of a package
    *
    * @param name The package name.
    * @param version The version of the package to fetch.
    */
  def fetchPackageData(name: String, version: String): js.Promise[IJupyterLabPackageData | Null] = js.native
  
  /**
    * The URI of the NPM registry to use.
    */
  var repoUri: String = js.native
  
  /**
    * Search for a jupyterlab extension.
    *
    * @param query The query to send. `keywords:"jupyterlab-extension"` will be appended to the query.
    * @param page The page of results to fetch.
    * @param pageination The pagination size to use. See registry API documentation for acceptable values.
    */
  def searchExtensions(query: String): js.Promise[ISearchResult] = js.native
  def searchExtensions(query: String, page: js.UndefOr[scala.Nothing], pageination: Double): js.Promise[ISearchResult] = js.native
  def searchExtensions(query: String, page: Double): js.Promise[ISearchResult] = js.native
  def searchExtensions(query: String, page: Double, pageination: Double): js.Promise[ISearchResult] = js.native
}
