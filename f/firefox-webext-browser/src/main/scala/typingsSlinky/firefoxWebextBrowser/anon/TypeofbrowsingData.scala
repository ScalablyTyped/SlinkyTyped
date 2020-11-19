package typingsSlinky.firefoxWebextBrowser.anon

import typingsSlinky.firefoxWebextBrowser.browser.browsingData.DataTypeSet
import typingsSlinky.firefoxWebextBrowser.browser.browsingData.RemovalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofbrowsingData extends js.Object {
  
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
object TypeofbrowsingData {
  
  @scala.inline
  def apply(
    remove: (RemovalOptions, DataTypeSet) => js.Promise[Unit],
    removeAppcache: RemovalOptions => js.Promise[Unit],
    removeCache: RemovalOptions => js.Promise[Unit],
    removeCookies: RemovalOptions => js.Promise[Unit],
    removeDownloads: RemovalOptions => js.Promise[Unit],
    removeFileSystems: RemovalOptions => js.Promise[Unit],
    removeFormData: RemovalOptions => js.Promise[Unit],
    removeHistory: RemovalOptions => js.Promise[Unit],
    removeIndexedDB: RemovalOptions => js.Promise[Unit],
    removeLocalStorage: RemovalOptions => js.Promise[Unit],
    removePasswords: RemovalOptions => js.Promise[Unit],
    removePluginData: RemovalOptions => js.Promise[Unit],
    removeWebSQL: RemovalOptions => js.Promise[Unit],
    settings: () => js.Promise[DataRemovalPermitted]
  ): TypeofbrowsingData = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), removeAppcache = js.Any.fromFunction1(removeAppcache), removeCache = js.Any.fromFunction1(removeCache), removeCookies = js.Any.fromFunction1(removeCookies), removeDownloads = js.Any.fromFunction1(removeDownloads), removeFileSystems = js.Any.fromFunction1(removeFileSystems), removeFormData = js.Any.fromFunction1(removeFormData), removeHistory = js.Any.fromFunction1(removeHistory), removeIndexedDB = js.Any.fromFunction1(removeIndexedDB), removeLocalStorage = js.Any.fromFunction1(removeLocalStorage), removePasswords = js.Any.fromFunction1(removePasswords), removePluginData = js.Any.fromFunction1(removePluginData), removeWebSQL = js.Any.fromFunction1(removeWebSQL), settings = js.Any.fromFunction0(settings))
    __obj.asInstanceOf[TypeofbrowsingData]
  }
  
  @scala.inline
  implicit class TypeofbrowsingDataOps[Self <: TypeofbrowsingData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRemove(value: (RemovalOptions, DataTypeSet) => js.Promise[Unit]): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemoveAppcache(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeAppcache", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveCache(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveCookies(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeCookies", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveDownloads(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeDownloads", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFileSystems(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeFileSystems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveFormData(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeFormData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveHistory(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeHistory", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveIndexedDB(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeIndexedDB", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveLocalStorage(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeLocalStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovePasswords(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removePasswords", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemovePluginData(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removePluginData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveWebSQL(value: RemovalOptions => js.Promise[Unit]): Self = this.set("removeWebSQL", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSettings(value: () => js.Promise[DataRemovalPermitted]): Self = this.set("settings", js.Any.fromFunction0(value))
  }
}
