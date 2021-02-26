package typingsSlinky.coreJs

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.std.SetConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fnSetMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("core-js/fn/set", JSImport.Namespace)
  @js.native
  class ^[T] ()
    extends typingsSlinky.std.Set[T] {
    def this(values: js.Array[T]) = this()
  }
  @JSImport("core-js/fn/set", JSImport.Namespace)
  @js.native
  val ^ : SetConstructor = js.native
  
  type _To = SetConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fnSetMod.foo` */
  override def _to: SetConstructor = ^
}
