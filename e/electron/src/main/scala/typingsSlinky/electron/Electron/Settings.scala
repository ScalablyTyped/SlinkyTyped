package typingsSlinky.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends StObject {
  
  /**
    * The command-line arguments to pass to the executable. Defaults to an empty
    * array. Take care to wrap paths in quotes.
    *
    * @platform win32
    */
  var args: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * `true` will change the startup approved registry key and `enable / disable` the
    * App in Task Manager and Windows Settings. Defaults to `true`.
    *
    * @platform win32
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * value name to write into registry. Defaults to the app's AppUserModelId(). Set
    * the app's login item settings.
    *
    * @platform win32
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * `true` to open the app as hidden. Defaults to `false`. The user can edit this
    * setting from the System Preferences so
    * `app.getLoginItemSettings().wasOpenedAsHidden` should be checked when the app is
    * opened to know the current value. This setting is not available on MAS builds.
    *
    * @platform darwin
    */
  var openAsHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * `true` to open the app at login, `false` to remove the app as a login item.
    * Defaults to `false`.
    */
  var openAtLogin: js.UndefOr[Boolean] = js.native
  
  /**
    * The executable to launch at login. Defaults to `process.execPath`.
    *
    * @platform win32
    */
  var path: js.UndefOr[String] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOpenAsHidden(value: Boolean): Self = StObject.set(x, "openAsHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAsHiddenUndefined: Self = StObject.set(x, "openAsHidden", js.undefined)
    
    @scala.inline
    def setOpenAtLogin(value: Boolean): Self = StObject.set(x, "openAtLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenAtLoginUndefined: Self = StObject.set(x, "openAtLogin", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
