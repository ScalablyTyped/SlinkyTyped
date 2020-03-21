package typingsSlinky.firebaseInstallations

import typingsSlinky.firebaseInstallations.appConfigMod.AppConfig
import typingsSlinky.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
import typingsSlinky.firebaseInstallations.installationEntryMod.InstallationEntry
import typingsSlinky.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
import typingsSlinky.firebaseInstallations.installationEntryMod.UnregisteredInstallationEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/installations/dist/src/helpers/idb-manager", JSImport.Namespace)
@js.native
object idbManagerMod extends js.Object {
  def clear(): js.Promise[Unit] = js.native
  def get(appConfig: AppConfig): js.Promise[js.UndefOr[InstallationEntry]] = js.native
  def remove(appConfig: AppConfig): js.Promise[Unit] = js.native
  def set(appConfig: AppConfig, value: InProgressInstallationEntry): js.Promise[InProgressInstallationEntry] = js.native
  def set(appConfig: AppConfig, value: RegisteredInstallationEntry): js.Promise[RegisteredInstallationEntry] = js.native
  def set(appConfig: AppConfig, value: UnregisteredInstallationEntry): js.Promise[UnregisteredInstallationEntry] = js.native
  def update[ValueType /* <: js.UndefOr[InstallationEntry] */](
    appConfig: AppConfig,
    updateFn: js.Function1[/* previousValue */ js.UndefOr[InstallationEntry], ValueType]
  ): js.Promise[ValueType] = js.native
}

