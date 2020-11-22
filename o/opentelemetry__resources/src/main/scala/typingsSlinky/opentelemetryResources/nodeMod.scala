package typingsSlinky.opentelemetryResources

import typingsSlinky.opentelemetryResources.configMod.ResourceDetectionConfig
import typingsSlinky.opentelemetryResources.envDetectorMod.EnvDetector_
import typingsSlinky.opentelemetryResources.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/resources/build/src/platform/node", JSImport.Namespace)
@js.native
object nodeMod extends js.Object {
  
  def detectResources(): js.Promise[Resource] = js.native
  def detectResources(config: ResourceDetectionConfig): js.Promise[Resource] = js.native
  
  val envDetector: EnvDetector_ = js.native
}
