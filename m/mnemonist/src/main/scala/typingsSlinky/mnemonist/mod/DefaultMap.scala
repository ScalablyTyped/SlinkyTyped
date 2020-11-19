package typingsSlinky.mnemonist.mod

import typingsSlinky.mnemonist.defaultMapMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "DefaultMap")
@js.native
class DefaultMap[K, V] protected () extends default[K, V] {
  // Constructor
  def this(factory: js.Function2[/* key */ js.UndefOr[K], /* index */ js.UndefOr[Double], V]) = this()
}
/* static members */
@JSImport("mnemonist", "DefaultMap")
@js.native
object DefaultMap extends js.Object {
  
  // Statics
  def autoIncrement(): Double = js.native
}
