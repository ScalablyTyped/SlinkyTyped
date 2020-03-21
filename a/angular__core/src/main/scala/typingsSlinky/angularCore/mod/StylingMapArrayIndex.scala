package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreNumbers.`0`
import typingsSlinky.angularCore.angularCoreNumbers.`1`
import typingsSlinky.angularCore.angularCoreNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An index of position and offset points for any data stored within a `StylingMapArray` instance.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.angularCoreNumbers.`0`
  - typingsSlinky.angularCore.angularCoreNumbers.`1`
  - typingsSlinky.angularCore.angularCoreNumbers.`2`
*/
trait StylingMapArrayIndex extends js.Object

object StylingMapArrayIndex {
  /** The offset for the property entry in the tuple */
  @scala.inline
  def PropOffset: `0` = this.cast(0)
  /** The location of the raw key/value map instance used last to populate the array entries */
  @scala.inline
  def RawValuePosition: `0` = this.cast(0)
  /** The size of each property/value entry */
  @scala.inline
  def TupleSize: `2` = this.cast(2)
  /** The offset for the value entry in the tuple */
  @scala.inline
  def ValueOffset: `1` = this.cast(1)
  /** Where the values start in the array */
  @scala.inline
  def ValuesStartPosition: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

