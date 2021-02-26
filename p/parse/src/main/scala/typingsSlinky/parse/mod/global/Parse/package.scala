package typingsSlinky.parse.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Parse {
  
  type Attributes = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type AuthData = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  @scala.inline
  def Installation: typingsSlinky.parse.mod.global.Parse.InstallationConstructor = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("Installation").asInstanceOf[typingsSlinky.parse.mod.global.Parse.InstallationConstructor]
  
  @scala.inline
  def Role: typingsSlinky.parse.mod.global.Parse.RoleConstructor = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("Role").asInstanceOf[typingsSlinky.parse.mod.global.Parse.RoleConstructor]
  
  @scala.inline
  def Session: typingsSlinky.parse.mod.global.Parse.SessionConstructor = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("Session").asInstanceOf[typingsSlinky.parse.mod.global.Parse.SessionConstructor]
  
  @scala.inline
  def User: typingsSlinky.parse.mod.global.Parse.UserConstructor = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("User").asInstanceOf[typingsSlinky.parse.mod.global.Parse.UserConstructor]
  
  @scala.inline
  def applicationId: java.lang.String = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("applicationId").asInstanceOf[java.lang.String]
  @scala.inline
  def applicationId_=(x: java.lang.String): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].updateDynamic("applicationId")(x.asInstanceOf[js.Any])
  
  /**
    * Gets all contents from Local Datastore.
    */
  @scala.inline
  def dumpLocalDatastore(): js.Promise[org.scalablytyped.runtime.StringDictionary[_]] = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("dumpLocalDatastore")().asInstanceOf[js.Promise[org.scalablytyped.runtime.StringDictionary[_]]]
  
  /**
    * Enable the current user encryption.
    * This must be called before login any user.
    */
  @scala.inline
  def enableEncryptedUser(): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("enableEncryptedUser")().asInstanceOf[scala.Unit]
  
  /**
    * Enable pinning in your application.
    * This must be called before your application can use pinning.
    */
  @scala.inline
  def enableLocalDatastore(): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("enableLocalDatastore")().asInstanceOf[scala.Unit]
  
  @scala.inline
  def encryptedUser: scala.Boolean = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("encryptedUser").asInstanceOf[scala.Boolean]
  @scala.inline
  def encryptedUser_=(x: scala.Boolean): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].updateDynamic("encryptedUser")(x.asInstanceOf[js.Any])
  
  /**
    * Call this method first to set up your authentication tokens for Parse.
    * You can get your keys from the Data Browser on parse.com.
    * @param applicationId Your Parse Application ID.
    * @param javaScriptKey (optional) Your Parse JavaScript Key (Not needed for parse-server)
    * @param masterKey (optional) Your Parse Master Key. (Node.js only!)
    */
  @scala.inline
  def initialize(applicationId: java.lang.String): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  @scala.inline
  def initialize(
    applicationId: java.lang.String,
    javaScriptKey: js.UndefOr[scala.Nothing],
    masterKey: java.lang.String
  ): scala.Unit = (typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def initialize(applicationId: java.lang.String, javaScriptKey: java.lang.String): scala.Unit = (typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  @scala.inline
  def initialize(applicationId: java.lang.String, javaScriptKey: java.lang.String, masterKey: java.lang.String): scala.Unit = (typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(applicationId.asInstanceOf[js.Any], javaScriptKey.asInstanceOf[js.Any], masterKey.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
  
  /**
    * Flag that indicates whether Encrypted User is enabled.
    */
  @scala.inline
  def isEncryptedUserEnabled(): scala.Boolean = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("isEncryptedUserEnabled")().asInstanceOf[scala.Boolean]
  
  /**
    * Flag that indicates whether Local Datastore is enabled.
    */
  @scala.inline
  def isLocalDatastoreEnabled(): scala.Boolean = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("isLocalDatastoreEnabled")().asInstanceOf[scala.Boolean]
  
  @scala.inline
  def javaScriptKey: js.UndefOr[java.lang.String] = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("javaScriptKey").asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def javaScriptKey_=(x: js.UndefOr[java.lang.String]): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].updateDynamic("javaScriptKey")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def liveQueryServerURL: java.lang.String = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("liveQueryServerURL").asInstanceOf[java.lang.String]
  @scala.inline
  def liveQueryServerURL_=(x: java.lang.String): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].updateDynamic("liveQueryServerURL")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def masterKey: js.UndefOr[java.lang.String] = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("masterKey").asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def masterKey_=(x: js.UndefOr[java.lang.String]): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].updateDynamic("masterKey")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def secret: java.lang.String = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("secret").asInstanceOf[java.lang.String]
  @scala.inline
  def secret_=(x: java.lang.String): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].updateDynamic("secret")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serverAuthToken: js.UndefOr[java.lang.String] = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("serverAuthToken").asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def serverAuthToken_=(x: js.UndefOr[java.lang.String]): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthToken")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serverAuthType: js.UndefOr[java.lang.String] = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("serverAuthType").asInstanceOf[js.UndefOr[java.lang.String]]
  @scala.inline
  def serverAuthType_=(x: js.UndefOr[java.lang.String]): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].updateDynamic("serverAuthType")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def serverURL: java.lang.String = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].selectDynamic("serverURL").asInstanceOf[java.lang.String]
  @scala.inline
  def serverURL_=(x: java.lang.String): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].updateDynamic("serverURL")(x.asInstanceOf[js.Any])
  
  /**
    * Additionally on React-Native / Expo environments, add AsyncStorage from 'react-native' package
    * @param AsyncStorage AsyncStorage from 'react-native' package
    */
  @scala.inline
  def setAsyncStorage(AsyncStorage: js.Any): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("setAsyncStorage")(AsyncStorage.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
  
  @scala.inline
  def setLocalDatastoreController(controller: js.Any): scala.Unit = typingsSlinky.parse.mod.global.Parse.^.asInstanceOf[js.Dynamic].applyDynamic("setLocalDatastoreController")(controller.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
}
