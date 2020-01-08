package typingsSlinky.forgeDashDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("forge-di/dist/framework/Context", JSImport.Namespace)
@js.native
object distFrameworkContextMod extends js.Object {
  @js.native
  trait Context extends js.Object {
    var bindings: js.Array[typingsSlinky.forgeDashDi.distFrameworkBindingMod.default] = js.native
    def has(binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default): Boolean = js.native
    def pop(): typingsSlinky.forgeDashDi.distFrameworkBindingMod.default = js.native
    def push(binding: typingsSlinky.forgeDashDi.distFrameworkBindingMod.default): Double = js.native
    def toString(indent: Double): String = js.native
  }
  
  @js.native
  class default () extends Context
  
}

