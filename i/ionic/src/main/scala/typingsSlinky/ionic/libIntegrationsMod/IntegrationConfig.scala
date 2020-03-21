package typingsSlinky.ionic.libIntegrationsMod

import typingsSlinky.ionic.PartialReadonlyProjectInt
import typingsSlinky.ionic.definitionsMod.ProjectIntegration
import typingsSlinky.ionicCliFramework.mod.BaseConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations", "IntegrationConfig")
@js.native
class IntegrationConfig () extends BaseConfig[ProjectIntegration] {
  def provideDefaults(c: PartialReadonlyProjectInt): ProjectIntegration = js.native
}

