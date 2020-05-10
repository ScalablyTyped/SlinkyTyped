package typingsSlinky.hashset.mod

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.hashset.IHashSet
import typingsSlinky.hashset.IHashSetStatic
import typingsSlinky.hashtable.IHashtableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("hashset", JSImport.Namespace)
@js.native
class ^[TValue] () extends IHashSet[TValue] {
  def this(hashCode: js.Function1[/* value */ TValue, _]) = this()
  def this(options: IHashtableOptions[TValue]) = this()
  def this(
    hashCode: js.Function1[/* value */ TValue, _],
    equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
  ) = this()
}

@JSImport("hashset", JSImport.Namespace)
@js.native
object ^ extends TopLevel[IHashSetStatic]

