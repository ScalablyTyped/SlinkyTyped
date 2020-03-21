package typingsSlinky.ionic

import typingsSlinky.ionic.capacitorConfigMod.CapacitorConfig
import typingsSlinky.ionic.definitionsMod.ProjectIntegration
import typingsSlinky.ionic.ionicStrings.`Target native iOS and Android with CapacitorComma IonicApostrophes new native layer`
import typingsSlinky.ionic.libIntegrationsMod.BaseIntegration
import typingsSlinky.ionic.libIntegrationsMod.IntegationUnion
import typingsSlinky.ionic.libIntegrationsMod.IntegrationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/capacitor", JSImport.Namespace)
@js.native
object integrationsCapacitorMod extends js.Object {
  @js.native
  class Integration ()
    extends BaseIntegration[ProjectIntegration]
       with IntegationUnion {
    @JSName("archiveUrl")
    val archiveUrl_Integration: js.UndefOr[scala.Nothing] = js.native
    @JSName("summary")
    val summary_Integration: `Target native iOS and Android with CapacitorComma IonicApostrophes new native layer` = js.native
    @JSName("config")
    def config_MIntegration(): IntegrationConfig = js.native
    /* InferMemberOverrides */
    override def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
    def getCapacitorCLIVersion(): js.Promise[js.UndefOr[String]] = js.native
    def getConfig(): js.Promise[CapacitorConfig] = js.native
    def installCapacitorCLI(): js.Promise[Unit] = js.native
    def installCapacitorCore(): js.Promise[Unit] = js.native
  }
  
}

