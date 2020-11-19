package typingsSlinky.mnemonist.mod

import typingsSlinky.mnemonist.hashedArrayTreeMod.HashedArrayTreeOptions
import typingsSlinky.mnemonist.hashedArrayTreeMod.default
import typingsSlinky.mnemonist.typesMod.IArrayLikeConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "HashedArrayTree")
@js.native
class HashedArrayTree[T] protected () extends default[T] {
  // Constructor
  def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
  def this(ArrayClass: IArrayLikeConstructor, options: HashedArrayTreeOptions) = this()
}
