package typingsSlinky.invariant

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.invariant.invariantBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("invariant", JSImport.Namespace)
  @js.native
  val ^ : InvariantStatic = js.native
  
  @js.native
  trait InvariantStatic extends StObject {
    
    def apply(testValue: js.Any, format: String, extra: js.Any*): /* asserts testValue */ Boolean = js.native
    def apply(testValue: `false`, format: String, extra: js.Any*): scala.Nothing = js.native
  }
  
  type _To = InvariantStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: InvariantStatic = ^
}
