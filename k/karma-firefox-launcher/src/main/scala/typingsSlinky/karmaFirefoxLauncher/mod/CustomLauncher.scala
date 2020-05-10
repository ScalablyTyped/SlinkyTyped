package typingsSlinky.karmaFirefoxLauncher.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomLauncher extends js.Object {
  /**
    * extensions that you want loaded into the browser on startup
    */
  var extensions: js.UndefOr[js.Array[String]] = js.native
  /**
    * configure preferences for the Firefox instance that is loaded
    */
  var prefs: js.UndefOr[StringDictionary[js.Any]] = js.native
}

object CustomLauncher {
  @scala.inline
  def apply(): CustomLauncher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomLauncher]
  }
  @scala.inline
  implicit class CustomLauncherOps[Self <: CustomLauncher] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extensions")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefs(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefs")(js.undefined)
        ret
    }
  }
  
}

