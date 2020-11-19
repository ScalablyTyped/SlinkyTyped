package typingsSlinky.forgeDi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-di/dist/framework/Context", JSImport.Namespace)
@js.native
object contextMod extends js.Object {
  
  @js.native
  trait Context extends js.Object {
    
    var bindings: js.Array[typingsSlinky.forgeDi.bindingMod.default] = js.native
    
    def has(binding: typingsSlinky.forgeDi.bindingMod.default): Boolean = js.native
    
    def pop(): typingsSlinky.forgeDi.bindingMod.default = js.native
    
    def push(binding: typingsSlinky.forgeDi.bindingMod.default): Double = js.native
    
    def toString(indent: Double): String = js.native
  }
  
  @js.native
  class default () extends Context
}
