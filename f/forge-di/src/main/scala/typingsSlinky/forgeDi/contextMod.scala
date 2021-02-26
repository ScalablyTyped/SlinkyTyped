package typingsSlinky.forgeDi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  @JSImport("forge-di/dist/framework/Context", JSImport.Default)
  @js.native
  class default () extends Context
  
  @js.native
  trait Context extends StObject {
    
    var bindings: js.Array[typingsSlinky.forgeDi.bindingMod.default] = js.native
    
    def has(binding: typingsSlinky.forgeDi.bindingMod.default): Boolean = js.native
    
    def pop(): typingsSlinky.forgeDi.bindingMod.default = js.native
    
    def push(binding: typingsSlinky.forgeDi.bindingMod.default): Double = js.native
    
    def toString(indent: Double): String = js.native
  }
}
