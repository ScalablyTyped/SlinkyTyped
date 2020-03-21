package typingsSlinky.microsoftLoadThemedStyles.mod

import typingsSlinky.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`1`
import typingsSlinky.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`2`
import typingsSlinky.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`1`
  - typingsSlinky.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`2`
  - typingsSlinky.microsoftLoadThemedStyles.microsoftLoadThemedStylesNumbers.`3`
*/
trait ClearStyleOptions extends js.Object

object ClearStyleOptions {
  /** both themable and non-themable styles will be cleared */
  @scala.inline
  def all: `3` = this.cast(3)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  /** only non-themable styles will be cleared */
  @scala.inline
  def onlyNonThemable: `2` = this.cast(2)
  /** only themable styles will be cleared */
  @scala.inline
  def onlyThemable: `1` = this.cast(1)
}

