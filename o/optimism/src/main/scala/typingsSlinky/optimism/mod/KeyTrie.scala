package typingsSlinky.optimism.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("optimism", "KeyTrie")
@js.native
class KeyTrie[K] protected ()
  extends typingsSlinky.optimism.keyTrieMod.KeyTrie[K] {
  def this(weakness: Boolean) = this()
  def this(weakness: Boolean, makeData: js.Function1[/* array */ js.Array[_], K]) = this()
}
