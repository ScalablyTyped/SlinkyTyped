package typingsSlinky.atom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowLoadSettings extends js.Object {
  val appVersion: String = js.native
  val atomHome: String = js.native
  val devMode: Boolean = js.native
  val env: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.native
  val profileStartup: js.UndefOr[Boolean] = js.native
  val resourcePath: String = js.native
  val safeMode: Boolean = js.native
}

object WindowLoadSettings {
  @scala.inline
  def apply(appVersion: String, atomHome: String, devMode: Boolean, resourcePath: String, safeMode: Boolean): WindowLoadSettings = {
    val __obj = js.Dynamic.literal(appVersion = appVersion.asInstanceOf[js.Any], atomHome = atomHome.asInstanceOf[js.Any], devMode = devMode.asInstanceOf[js.Any], resourcePath = resourcePath.asInstanceOf[js.Any], safeMode = safeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowLoadSettings]
  }
  @scala.inline
  implicit class WindowLoadSettingsOps[Self <: WindowLoadSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtomHome(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atomHome")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDevMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("devMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResourcePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourcePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSafeMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safeMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnv(value: StringDictionary[js.UndefOr[String]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnv: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("env")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileStartup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileStartup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileStartup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileStartup")(js.undefined)
        ret
    }
  }
  
}

