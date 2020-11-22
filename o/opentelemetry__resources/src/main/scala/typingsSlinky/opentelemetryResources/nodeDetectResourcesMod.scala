package typingsSlinky.opentelemetryResources

import typingsSlinky.opentelemetryResources.configMod.ResourceDetectionConfig
import typingsSlinky.opentelemetryResources.resourceMod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/resources/build/src/platform/node/detect-resources", JSImport.Namespace)
@js.native
object nodeDetectResourcesMod extends js.Object {
  
  def detectResources(): js.Promise[Resource] = js.native
  def detectResources(config: ResourceDetectionConfig): js.Promise[Resource] = js.native
}
