package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.immediate
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.diskSpaceThreshold
  - typingsSlinky.microsoftGraph.microsoftGraphStrings.diskSpaceThresholdOrInactiveThreshold
*/
trait SharedPCAccountDeletionPolicyType extends js.Object

object SharedPCAccountDeletionPolicyType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def diskSpaceThreshold: typingsSlinky.microsoftGraph.microsoftGraphStrings.diskSpaceThreshold = this.cast("diskSpaceThreshold")
  @scala.inline
  def diskSpaceThresholdOrInactiveThreshold: typingsSlinky.microsoftGraph.microsoftGraphStrings.diskSpaceThresholdOrInactiveThreshold = this.cast("diskSpaceThresholdOrInactiveThreshold")
  @scala.inline
  def immediate: typingsSlinky.microsoftGraph.microsoftGraphStrings.immediate = this.cast("immediate")
}

