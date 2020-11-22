package typingsSlinky.nodeRedRuntime.mod

import typingsSlinky.nodeRedRuntime.anon.Comment
import typingsSlinky.nodeRedRuntime.anon.IdReqUser
import typingsSlinky.nodeRedRuntime.anon.Settings
import typingsSlinky.nodeRedRuntime.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SettingsModule extends js.Object {
  
  /**
    * Generates a new ssh key pair
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.name - the id of the key to return
    * @param opts.password - (optional) the password for the key pair
    * @param opts.comment - (option) a comment to associate with the key pair
    * @param opts.size - (optional) the size of the key. Default: 2048
    * @param opts.req - the request to log (optional)
    * @returns the id of the generated key
    */
  def generateUserKey(opts: Comment): js.Promise[String] = js.native
  
  /**
    * Gets the runtime settings object
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.req - the request to log (optional)
    * @returns the runtime settings
    */
  def getRuntimeSettings(opts: `1`): js.Promise[js.Object] = js.native
  
  /**
    * Gets a user's ssh public key
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the key to return
    * @param opts.req - the request to log (optional)
    * @returns the user's ssh public key
    */
  def getUserKey(opts: IdReqUser): js.Promise[String] = js.native
  
  /**
    * Gets a list of a user's ssh keys
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.req - the request to log (optional)
    * @returns the user's ssh keys
    */
  def getUserKeys(opts: `1`): js.Promise[js.Object] = js.native
  
  /**
    * Gets an individual user's settings object
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.req - the request to log (optional)
    * @returns the user settings
    */
  def getUserSettings(opts: `1`): js.Promise[js.Object] = js.native
  
  /**
    * Deletes a user's ssh key pair
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.id - the id of the key to delete
    * @param opts.req - the request to log (optional)
    * @returns resolves when deleted
    */
  def removeUserKey(opts: IdReqUser): js.Promise[Unit] = js.native
  
  /**
    * Updates an individual user's settings object.
    * @param opts
    * @param opts.user - the user calling the api
    * @param opts.settings - the updates to the user settings
    * @param opts.req - the request to log (optional)
    * @returns the user settings
    */
  def updateUserSettings(opts: Settings): js.Promise[js.Object] = js.native
}
object SettingsModule {
  
  @scala.inline
  def apply(
    generateUserKey: Comment => js.Promise[String],
    getRuntimeSettings: `1` => js.Promise[js.Object],
    getUserKey: IdReqUser => js.Promise[String],
    getUserKeys: `1` => js.Promise[js.Object],
    getUserSettings: `1` => js.Promise[js.Object],
    removeUserKey: IdReqUser => js.Promise[Unit],
    updateUserSettings: Settings => js.Promise[js.Object]
  ): SettingsModule = {
    val __obj = js.Dynamic.literal(generateUserKey = js.Any.fromFunction1(generateUserKey), getRuntimeSettings = js.Any.fromFunction1(getRuntimeSettings), getUserKey = js.Any.fromFunction1(getUserKey), getUserKeys = js.Any.fromFunction1(getUserKeys), getUserSettings = js.Any.fromFunction1(getUserSettings), removeUserKey = js.Any.fromFunction1(removeUserKey), updateUserSettings = js.Any.fromFunction1(updateUserSettings))
    __obj.asInstanceOf[SettingsModule]
  }
  
  @scala.inline
  implicit class SettingsModuleOps[Self <: SettingsModule] (val x: Self) extends AnyVal {
    
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
    def setGenerateUserKey(value: Comment => js.Promise[String]): Self = this.set("generateUserKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRuntimeSettings(value: `1` => js.Promise[js.Object]): Self = this.set("getRuntimeSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUserKey(value: IdReqUser => js.Promise[String]): Self = this.set("getUserKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUserKeys(value: `1` => js.Promise[js.Object]): Self = this.set("getUserKeys", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetUserSettings(value: `1` => js.Promise[js.Object]): Self = this.set("getUserSettings", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveUserKey(value: IdReqUser => js.Promise[Unit]): Self = this.set("removeUserKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUpdateUserSettings(value: Settings => js.Promise[js.Object]): Self = this.set("updateUserSettings", js.Any.fromFunction1(value))
  }
}
