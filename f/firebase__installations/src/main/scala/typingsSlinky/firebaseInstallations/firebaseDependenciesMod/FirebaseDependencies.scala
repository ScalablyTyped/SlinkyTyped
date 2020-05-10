package typingsSlinky.firebaseInstallations.firebaseDependenciesMod

import typingsSlinky.firebaseComponent.mod.Provider
import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`platform-logger`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirebaseDependencies extends js.Object {
  val appConfig: AppConfig = js.native
  val platformLoggerProvider: Provider[`platform-logger`] = js.native
}

object FirebaseDependencies {
  @scala.inline
  def apply(appConfig: AppConfig, platformLoggerProvider: Provider[`platform-logger`]): FirebaseDependencies = {
    val __obj = js.Dynamic.literal(appConfig = appConfig.asInstanceOf[js.Any], platformLoggerProvider = platformLoggerProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirebaseDependencies]
  }
  @scala.inline
  implicit class FirebaseDependenciesOps[Self <: FirebaseDependencies] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppConfig(value: AppConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlatformLoggerProvider(value: Provider[`platform-logger`]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("platformLoggerProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

