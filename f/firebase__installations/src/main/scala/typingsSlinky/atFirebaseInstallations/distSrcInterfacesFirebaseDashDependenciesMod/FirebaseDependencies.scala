package typingsSlinky.atFirebaseInstallations.distSrcInterfacesFirebaseDashDependenciesMod

import typingsSlinky.atFirebaseComponent.atFirebaseComponentMod.Provider
import typingsSlinky.atFirebaseInstallations.atFirebaseInstallationsStrings.`platform-logger`
import typingsSlinky.atFirebaseInstallations.distSrcInterfacesAppDashConfigMod.AppConfig
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

