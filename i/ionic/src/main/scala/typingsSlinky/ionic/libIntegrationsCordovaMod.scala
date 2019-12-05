package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.ProjectIntegration
import typingsSlinky.ionic.definitionsMod.ProjectType
import typingsSlinky.ionic.ionicStrings.`Target native iOS and Android with Apache Cordova`
import typingsSlinky.ionic.ionicStrings.`https://d2ql0qc7j8u4b2DOTcloudfrontDOTnet/integration-cordovaDOTtarDOTgz`
import typingsSlinky.ionic.libIntegrationsMod.BaseIntegration
import typingsSlinky.ionic.libIntegrationsMod.IntegationUnion
import typingsSlinky.ionic.libIntegrationsMod.IntegrationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova", JSImport.Namespace)
@js.native
object libIntegrationsCordovaMod extends js.Object {
  @js.native
  class Integration ()
    extends BaseIntegration[ProjectIntegration]
       with IntegationUnion {
    @JSName("archiveUrl")
    val archiveUrl_Integration: `https://d2ql0qc7j8u4b2DOTcloudfrontDOTnet/integration-cordovaDOTtarDOTgz` = js.native
    @JSName("config")
    val config_Integration: IntegrationConfig = js.native
    @JSName("summary")
    val summary_Integration: `Target native iOS and Android with Apache Cordova` = js.native
    /* InferMemberOverrides */
    override def enable(config: ProjectIntegration): js.Promise[Unit] = js.native
    def getCordovaPlatformVersions(): js.Promise[String] = js.native
    def getCordovaPluginVersions(): js.Promise[String] = js.native
    def getCordovaVersion(): js.Promise[js.UndefOr[String]] = js.native
    def getIOSDeployVersion(): js.Promise[js.UndefOr[String]] = js.native
    def getIOSSimVersion(): js.Promise[js.UndefOr[String]] = js.native
    def getXcodebuildVersion(): js.Promise[js.UndefOr[String]] = js.native
  }
  
  val SUPPORTED_PROJECT_TYPES: js.Array[ProjectType] = js.native
}

