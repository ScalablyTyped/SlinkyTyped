package typingsSlinky.opentelemetryResources

import typingsSlinky.opentelemetryResources.configMod.ResourceDetectionConfig
import typingsSlinky.opentelemetryResources.envDetectorMod.EnvDetector_
import typingsSlinky.opentelemetryResources.resourceMod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeMod {
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "detectResources")
  @js.native
  def detectResources(): js.Promise[Resource] = js.native
  @JSImport("@opentelemetry/resources/build/src/platform/node", "detectResources")
  @js.native
  def detectResources(config: ResourceDetectionConfig): js.Promise[Resource] = js.native
  
  @JSImport("@opentelemetry/resources/build/src/platform/node", "envDetector")
  @js.native
  val envDetector: EnvDetector_ = js.native
}
