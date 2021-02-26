package typingsSlinky.ionic

import typingsSlinky.ionic.cordovaConfigMod.CordovaConfig
import typingsSlinky.ionic.definitionsMod.ImageResource
import typingsSlinky.ionic.definitionsMod.ImageResourceTransformResult
import typingsSlinky.ionic.definitionsMod.ImageUploadResponse
import typingsSlinky.ionic.definitionsMod.IonicEnvironment
import typingsSlinky.ionic.definitionsMod.KnownPlatform
import typingsSlinky.ionic.definitionsMod.ResourcesConfig
import typingsSlinky.ionic.definitionsMod.SourceImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cordovaResourcesMod {
  
  @JSImport("ionic/lib/integrations/cordova/resources", "RESOURCES")
  @js.native
  val RESOURCES: ResourcesConfig = js.native
  
  @JSImport("ionic/lib/integrations/cordova/resources", "addResourcesToConfigXml")
  @js.native
  def addResourcesToConfigXml(conf: CordovaConfig, platformList: js.Array[KnownPlatform], resourceJson: ResourcesConfig): js.Promise[Unit] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/resources", "createImgDestinationDirectories")
  @js.native
  def createImgDestinationDirectories(imgResources: js.Array[ImageResource]): js.Promise[js.Array[Unit]] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/resources", "findMostSpecificSourceImage")
  @js.native
  def findMostSpecificSourceImage(imageResource: ImageResource, srcImagesAvailable: js.Array[SourceImage]): js.UndefOr[SourceImage] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/resources", "getImageResources")
  @js.native
  def getImageResources(projectDir: String): js.Array[ImageResource] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/resources", "getSourceImages")
  @js.native
  def getSourceImages(projectDir: String, buildPlatforms: js.Array[String], resourceTypes: js.Array[String]): js.Promise[js.Array[SourceImage]] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/resources", "transformResourceImage")
  @js.native
  def transformResourceImage(env: IonicEnvironment, resource: ImageResource): js.Promise[ImageResourceTransformResult] = js.native
  
  @JSImport("ionic/lib/integrations/cordova/resources", "uploadSourceImage")
  @js.native
  def uploadSourceImage(env: IonicEnvironment, srcImage: SourceImage): js.Promise[ImageUploadResponse] = js.native
}
