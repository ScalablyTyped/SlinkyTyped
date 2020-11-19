package typingsSlinky.baconjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("baconjs/types/skipduplicates", JSImport.Namespace)
@js.native
object skipduplicatesMod extends js.Object {
  
  def default[A](src: typingsSlinky.baconjs.observableMod.default[A]): typingsSlinky.baconjs.observableMod.default[A] = js.native
  def default[A](src: typingsSlinky.baconjs.observableMod.default[A], isEqual: Equals_[A]): typingsSlinky.baconjs.observableMod.default[A] = js.native
  
  def equals[A](a: A, b: A): Boolean = js.native
  
  type Equals_[A] = js.Function2[/* left */ A, /* right */ A, Boolean]
}
