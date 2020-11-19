package typingsSlinky.firefoxWebextBrowser.global.browser

import typingsSlinky.firefoxWebextBrowser.anon.DataRemovalPermitted
import typingsSlinky.firefoxWebextBrowser.browser.browsingData.DataTypeSet
import typingsSlinky.firefoxWebextBrowser.browser.browsingData.RemovalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Use the `browser.browsingData` API to remove browsing data from a user's local profile.
  *
  * Permissions: `browsingData`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
@JSGlobal("browser.browsingData")
@js.native
object browsingData extends js.Object {
  
  /**
    * Clears various types of browsing data stored in a user's profile.
    * @param dataToRemove The set of data types to remove.
    */
  def remove(options: RemovalOptions, dataToRemove: DataTypeSet): js.Promise[Unit] = js.native
  
  /**
    * Clears websites' appcache data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeAppcache(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's cache. */
  def removeCache(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's cookies and server-bound certificates modified within a particular timeframe. */
  def removeCookies(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's list of downloaded files (_not_ the downloaded files themselves). */
  def removeDownloads(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /**
    * Clears websites' file system data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeFileSystems(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's stored form data (autofill). */
  def removeFormData(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's history. */
  def removeHistory(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /**
    * Clears websites' IndexedDB data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeIndexedDB(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears websites' local storage data. */
  def removeLocalStorage(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears the browser's stored passwords. */
  def removePasswords(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /** Clears plugins' data. */
  def removePluginData(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /**
    * Clears websites' WebSQL data.
    * @deprecated Unsupported on Firefox at this time.
    */
  def removeWebSQL(options: RemovalOptions): js.Promise[Unit] = js.native
  
  /* browsingData functions */
  /**
    * Reports which types of data are currently selected in the 'Clear browsing data' settings UI. Note: some of the
    * data types included in this API are not available in the settings UI, and some UI settings control more than one
    * data type listed here.
    */
  def settings(): js.Promise[DataRemovalPermitted] = js.native
}
