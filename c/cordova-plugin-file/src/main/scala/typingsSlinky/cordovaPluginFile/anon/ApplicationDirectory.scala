package typingsSlinky.cordovaPluginFile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationDirectory extends js.Object {
  /* Read-only directory where the application is installed. */
  var applicationDirectory: String = js.native
  /* Root of app's private writable storage */
  var applicationStorageDirectory: String = js.native
  /* Cached files that should survive app restarts. Apps should not rely on the OS to delete files in here. */
  var cacheDirectory: String = js.native
  /* Where to put app-specific data files. */
  var dataDirectory: String = js.native
  /* iOS: Files private to the app, but that are meaningful to other applciations (e.g. Office files) */
  var documentsDirectory: String = js.native
  /* Android: the application space on external storage. */
  var externalApplicationStorageDirectory: String = js.native
  /* Android: the application cache on external storage. */
  var externalCacheDirectory: String = js.native
  /* Android: Where to put app-specific data files on external storage. */
  var externalDataDirectory: String = js.native
  /* Android: the external storage (SD card) root. */
  var externalRootDirectory: String = js.native
  /* BlackBerry10: Files globally available to all apps */
  var sharedDirectory: String = js.native
  /* iOS: Holds app-specific files that should be synced (e.g. to iCloud). */
  var syncedDataDirectory: String = js.native
  /* iOS: Temp directory that the OS can clear at will. */
  var tempDirectory: String = js.native
}

object ApplicationDirectory {
  @scala.inline
  def apply(
    applicationDirectory: String,
    applicationStorageDirectory: String,
    cacheDirectory: String,
    dataDirectory: String,
    documentsDirectory: String,
    externalApplicationStorageDirectory: String,
    externalCacheDirectory: String,
    externalDataDirectory: String,
    externalRootDirectory: String,
    sharedDirectory: String,
    syncedDataDirectory: String,
    tempDirectory: String
  ): ApplicationDirectory = {
    val __obj = js.Dynamic.literal(applicationDirectory = applicationDirectory.asInstanceOf[js.Any], applicationStorageDirectory = applicationStorageDirectory.asInstanceOf[js.Any], cacheDirectory = cacheDirectory.asInstanceOf[js.Any], dataDirectory = dataDirectory.asInstanceOf[js.Any], documentsDirectory = documentsDirectory.asInstanceOf[js.Any], externalApplicationStorageDirectory = externalApplicationStorageDirectory.asInstanceOf[js.Any], externalCacheDirectory = externalCacheDirectory.asInstanceOf[js.Any], externalDataDirectory = externalDataDirectory.asInstanceOf[js.Any], externalRootDirectory = externalRootDirectory.asInstanceOf[js.Any], sharedDirectory = sharedDirectory.asInstanceOf[js.Any], syncedDataDirectory = syncedDataDirectory.asInstanceOf[js.Any], tempDirectory = tempDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationDirectory]
  }
  @scala.inline
  implicit class ApplicationDirectoryOps[Self <: ApplicationDirectory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicationDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApplicationStorageDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicationStorageDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCacheDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDocumentsDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("documentsDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalApplicationStorageDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalApplicationStorageDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalCacheDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalCacheDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalDataDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalDataDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExternalRootDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalRootDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSharedDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSyncedDataDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("syncedDataDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTempDirectory(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempDirectory")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

