package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreNumbers.`1`
import typingsSlinky.angularCore.angularCoreNumbers.`2`
import typingsSlinky.angularCore.angularCoreNumbers.`4`
import typingsSlinky.angularCore.angularCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Flags used to build up CssSelectors */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.angularCoreNumbers.`1`
  - typingsSlinky.angularCore.angularCoreNumbers.`2`
  - typingsSlinky.angularCore.angularCoreNumbers.`4`
  - typingsSlinky.angularCore.angularCoreNumbers.`8`
*/
trait SelectorFlags extends js.Object

object SelectorFlags {
  /** Mode for matching attributes */
  @scala.inline
  def ATTRIBUTE: `2` = this.cast(2)
  /** Mode for matching class names */
  @scala.inline
  def CLASS: `8` = this.cast(8)
  /** Mode for matching tag names */
  @scala.inline
  def ELEMENT: `4` = this.cast(4)
  /** Indicates this is the beginning of a new negative selector */
  @scala.inline
  def NOT: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

