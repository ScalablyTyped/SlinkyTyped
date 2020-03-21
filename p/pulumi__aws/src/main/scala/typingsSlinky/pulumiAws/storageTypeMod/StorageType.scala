package typingsSlinky.pulumiAws.storageTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.pulumiAwsStrings.standard
  - typingsSlinky.pulumiAws.pulumiAwsStrings.gp2
  - typingsSlinky.pulumiAws.pulumiAwsStrings.io1
*/
trait StorageType extends js.Object

object StorageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def gp2: typingsSlinky.pulumiAws.pulumiAwsStrings.gp2 = this.cast("gp2")
  @scala.inline
  def io1: typingsSlinky.pulumiAws.pulumiAwsStrings.io1 = this.cast("io1")
  @scala.inline
  def standard: typingsSlinky.pulumiAws.pulumiAwsStrings.standard = this.cast("standard")
}

