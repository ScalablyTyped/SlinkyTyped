package typingsSlinky.babylonjs

import typingsSlinky.babylonjs.iofflineproviderMod.IOfflineProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object databaseMod {
  
  @JSImport("babylonjs/Offline/database", "Database")
  @js.native
  class Database protected () extends IOfflineProvider {
    /**
      * Creates a new Database
      * @param urlToScene defines the url to load the scene
      * @param callbackManifestChecked defines the callback to use when manifest is checked
      * @param disableManifestCheck defines a boolean indicating that we want to skip the manifest validation (it will be considered validated and up to date)
      */
    def this(urlToScene: String, callbackManifestChecked: js.Function1[/* checked */ Boolean, _]) = this()
    def this(
      urlToScene: String,
      callbackManifestChecked: js.Function1[/* checked */ Boolean, _],
      disableManifestCheck: Boolean
    ) = this()
    
    var _callbackManifestChecked: js.Any = js.native
    
    var _checkManifestFile: js.Any = js.native
    
    var _checkVersionFromDB: js.Any = js.native
    
    var _currentSceneUrl: js.Any = js.native
    
    var _db: js.Any = js.native
    
    var _enableSceneOffline: js.Any = js.native
    
    var _enableTexturesOffline: js.Any = js.native
    
    var _hasReachedQuota: js.Any = js.native
    
    var _idbFactory: js.Any = js.native
    
    var _isSupported: js.Any = js.native
    
    var _loadFileAsync: js.Any = js.native
    
    var _loadImageFromDBAsync: js.Any = js.native
    
    var _loadVersionFromDBAsync: js.Any = js.native
    
    var _manifestVersionFound: js.Any = js.native
    
    var _mustUpdateRessources: js.Any = js.native
    
    var _saveFileAsync: js.Any = js.native
    
    var _saveImageIntoDBAsync: js.Any = js.native
    
    var _saveVersionIntoDBAsync: js.Any = js.native
    
    /**
      * Gets a boolean indicating if scene must be saved in the database
      */
    @JSName("enableSceneOffline")
    def enableSceneOffline_MDatabase: Boolean = js.native
    
    /**
      * Gets a boolean indicating if textures must be saved in the database
      */
    @JSName("enableTexturesOffline")
    def enableTexturesOffline_MDatabase: Boolean = js.native
  }
  /* static members */
  object Database {
    
    @JSImport("babylonjs/Offline/database", "Database")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a boolean indicating if Database storate is enabled (off by default)
      */
    @JSImport("babylonjs/Offline/database", "Database.IDBStorageEnabled")
    @js.native
    def IDBStorageEnabled: Boolean = js.native
    @scala.inline
    def IDBStorageEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IDBStorageEnabled")(x.asInstanceOf[js.Any])
    
    /** Gets a boolean indicating if the user agent supports blob storage (this value will be updated after creating the first Database object) */
    @JSImport("babylonjs/Offline/database", "Database.IsUASupportingBlobStorage")
    @js.native
    def IsUASupportingBlobStorage: js.Any = js.native
    @scala.inline
    def IsUASupportingBlobStorage_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsUASupportingBlobStorage")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Offline/database", "Database._ParseURL")
    @js.native
    def _ParseURL: js.Any = js.native
    @scala.inline
    def _ParseURL_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ParseURL")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Offline/database", "Database._ReturnFullUrlLocation")
    @js.native
    def _ReturnFullUrlLocation: js.Any = js.native
    @scala.inline
    def _ReturnFullUrlLocation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ReturnFullUrlLocation")(x.asInstanceOf[js.Any])
    
    /**
      * Validates if xhr data is correct
      * @param xhr defines the request to validate
      * @param dataType defines the expected data type
      * @returns true if data is correct
      */
    @JSImport("babylonjs/Offline/database", "Database._ValidateXHRData")
    @js.native
    def _ValidateXHRData: js.Any = js.native
    @scala.inline
    def _ValidateXHRData_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ValidateXHRData")(x.asInstanceOf[js.Any])
  }
}
