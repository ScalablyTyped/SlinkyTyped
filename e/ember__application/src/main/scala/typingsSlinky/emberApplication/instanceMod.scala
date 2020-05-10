package typingsSlinky.emberApplication

import typingsSlinky.emberEngine.instanceMod.EngineInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ember/application/instance", JSImport.Namespace)
@js.native
object instanceMod extends js.Object {
  @js.native
  class default () extends EngineInstance
  
  type ApplicationInstance = EngineInstance
}

