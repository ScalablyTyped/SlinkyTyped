package typingsSlinky.ionic.libIntegrationsMod

import typingsSlinky.ionic.definitionsMod.IIntegration
import typingsSlinky.ionic.definitionsMod.IntegrationName
import typingsSlinky.ionic.definitionsMod.ProjectIntegration
import typingsSlinky.ionic.integrationsCapacitorMod.Integration
import typingsSlinky.ionic.ionicStrings.capacitor
import typingsSlinky.ionic.ionicStrings.cordova
import typingsSlinky.ionic.ionicStrings.enterprise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations", "BaseIntegration")
@js.native
abstract class BaseIntegration[T /* <: ProjectIntegration */] protected () extends IIntegration[T] {
  def this(e: IntegrationDeps) = this()
  val e: IntegrationDeps = js.native
  def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("ionic/lib/integrations", "BaseIntegration")
@js.native
object BaseIntegration extends js.Object {
  def createFromName(deps: IntegrationDeps, name: IntegrationName): js.Promise[IIntegration[ProjectIntegration]] = js.native
  @JSName("createFromName")
  def createFromName_capacitor(deps: IntegrationDeps, name: capacitor): js.Promise[Integration] = js.native
  @JSName("createFromName")
  def createFromName_cordova(deps: IntegrationDeps, name: cordova): js.Promise[typingsSlinky.ionic.integrationsCordovaMod.Integration] = js.native
  @JSName("createFromName")
  def createFromName_enterprise(deps: IntegrationDeps, name: enterprise): js.Promise[typingsSlinky.ionic.integrationsEnterpriseMod.Integration] = js.native
}

