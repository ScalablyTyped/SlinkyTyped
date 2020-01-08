package typingsSlinky.ionic

import typingsSlinky.ionic.definitionsMod.ImageResource
import typingsSlinky.ionic.definitionsMod.ImageResourceTransformResult
import typingsSlinky.ionic.definitionsMod.ImageUploadResponse
import typingsSlinky.ionic.definitionsMod.IonicEnvironment
import typingsSlinky.ionic.definitionsMod.KnownPlatform
import typingsSlinky.ionic.definitionsMod.ResourcesConfig
import typingsSlinky.ionic.definitionsMod.SourceImage
import typingsSlinky.ionic.libIntegrationsCordovaConfigMod.CordovaConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/integrations/cordova/resources", JSImport.Namespace)
@js.native
object libIntegrationsCordovaResourcesMod extends js.Object {
  val RESOURCES: ResourcesConfig = js.native
  def addResourcesToConfigXml(conf: CordovaConfig, platformList: js.Array[KnownPlatform], resourceJson: ResourcesConfig): js.Promise[Unit] = js.native
  def createImgDestinationDirectories(imgResources: js.Array[ImageResource]): js.Promise[js.Array[Unit]] = js.native
  def findMostSpecificSourceImage(imageResource: ImageResource, srcImagesAvailable: js.Array[SourceImage]): js.UndefOr[SourceImage] = js.native
  def getImageResources(projectDir: String): js.Array[ImageResource] = js.native
  def getSourceImages(projectDir: String, buildPlatforms: js.Array[String], resourceTypes: js.Array[String]): js.Promise[js.Array[SourceImage]] = js.native
  def transformResourceImage(env: IonicEnvironment, resource: ImageResource): js.Promise[ImageResourceTransformResult] = js.native
  def uploadSourceImage(env: IonicEnvironment, srcImage: SourceImage): js.Promise[ImageUploadResponse] = js.native
}

