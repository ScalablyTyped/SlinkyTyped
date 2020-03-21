package typingsSlinky.firebaseInstallations.firebaseDependenciesMod

import typingsSlinky.firebaseComponent.mod.Provider
import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.firebaseInstallationsStrings.`platform-logger`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirebaseDependencies extends js.Object {
  val appConfig: AppConfig
  val platformLoggerProvider: Provider[`platform-logger`]
}

object FirebaseDependencies {
  @scala.inline
  def apply(appConfig: AppConfig, platformLoggerProvider: Provider[`platform-logger`]): FirebaseDependencies = {
    val __obj = js.Dynamic.literal(appConfig = appConfig.asInstanceOf[js.Any], platformLoggerProvider = platformLoggerProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirebaseDependencies]
  }
}

