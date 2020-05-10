package typingsSlinky.hashset

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.hashtable.IHashtableOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("HashSet")
@js.native
class HashSet[TValue] () extends IHashSet[TValue] {
  def this(hashCode: js.Function1[/* value */ TValue, _]) = this()
  def this(options: IHashtableOptions[TValue]) = this()
  def this(
    hashCode: js.Function1[/* value */ TValue, _],
    equals: js.Function2[/* value1 */ TValue, /* value2 */ TValue, Boolean]
  ) = this()
}

@JSGlobal("HashSet")
@js.native
object HashSet extends TopLevel[IHashSetStatic]

