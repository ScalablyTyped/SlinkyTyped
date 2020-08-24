package typingsSlinky.inversify

import typingsSlinky.inversify.interfacesMod.interfaces.Context
import typingsSlinky.inversify.interfacesMod.interfaces.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/planning/plan", JSImport.Namespace)
@js.native
object planMod extends js.Object {
  @js.native
  class Plan protected ()
    extends typingsSlinky.inversify.interfacesMod.interfaces.Plan {
    def this(parentContext: Context, rootRequest: Request) = this()
  }
  
}

