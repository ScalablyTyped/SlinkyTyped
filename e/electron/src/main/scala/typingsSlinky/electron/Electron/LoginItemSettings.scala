package typingsSlinky.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginItemSettings extends js.Object {
  
  /**
    * `true` if app is set to open at login and its run key is not deactivated. This
    * differs from `openAtLogin` as it ignores the `args` option, this property will
    * be true if the given executable would be launched at login with **any**
    * arguments.
    *
    * @platform win32
    */
  var executableWillLaunchAtLogin: Boolean = js.native
  
  var launchItems: js.Array[LaunchItems] = js.native
  
  /**
    * `true` if the app is set to open as hidden at login. This setting is not
    * available on MAS builds.
    *
    * @platform darwin
    */
  var openAsHidden: Boolean = js.native
  
  /**
    * `true` if the app is set to open at login.
    */
  var openAtLogin: Boolean = js.native
  
  /**
    * `true` if the app was opened as a login item that should restore the state from
    * the previous session. This indicates that the app should restore the windows
    * that were open the last time the app was closed. This setting is not available
    * on MAS builds.
    *
    * @platform darwin
    */
  var restoreState: Boolean = js.native
  
  /**
    * `true` if the app was opened as a hidden login item. This indicates that the app
    * should not open any windows at startup. This setting is not available on MAS
    * builds.
    *
    * @platform darwin
    */
  var wasOpenedAsHidden: Boolean = js.native
  
  /**
    * `true` if the app was opened at login automatically. This setting is not
    * available on MAS builds.
    *
    * @platform darwin
    */
  var wasOpenedAtLogin: Boolean = js.native
}
object LoginItemSettings {
  
  @scala.inline
  def apply(
    executableWillLaunchAtLogin: Boolean,
    launchItems: js.Array[LaunchItems],
    openAsHidden: Boolean,
    openAtLogin: Boolean,
    restoreState: Boolean,
    wasOpenedAsHidden: Boolean,
    wasOpenedAtLogin: Boolean
  ): LoginItemSettings = {
    val __obj = js.Dynamic.literal(executableWillLaunchAtLogin = executableWillLaunchAtLogin.asInstanceOf[js.Any], launchItems = launchItems.asInstanceOf[js.Any], openAsHidden = openAsHidden.asInstanceOf[js.Any], openAtLogin = openAtLogin.asInstanceOf[js.Any], restoreState = restoreState.asInstanceOf[js.Any], wasOpenedAsHidden = wasOpenedAsHidden.asInstanceOf[js.Any], wasOpenedAtLogin = wasOpenedAtLogin.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginItemSettings]
  }
  
  @scala.inline
  implicit class LoginItemSettingsOps[Self <: LoginItemSettings] (val x: Self) extends AnyVal {
    
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
    def setExecutableWillLaunchAtLogin(value: Boolean): Self = this.set("executableWillLaunchAtLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchItemsVarargs(value: LaunchItems*): Self = this.set("launchItems", js.Array(value :_*))
    
    @scala.inline
    def setLaunchItems(value: js.Array[LaunchItems]): Self = this.set("launchItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAsHidden(value: Boolean): Self = this.set("openAsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAtLogin(value: Boolean): Self = this.set("openAtLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreState(value: Boolean): Self = this.set("restoreState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasOpenedAsHidden(value: Boolean): Self = this.set("wasOpenedAsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasOpenedAtLogin(value: Boolean): Self = this.set("wasOpenedAtLogin", value.asInstanceOf[js.Any])
  }
}
