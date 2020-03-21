package typingsSlinky.pulumiAws.engineTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.pulumiAwsStrings.aurora
  - typingsSlinky.pulumiAws.pulumiAwsStrings.`aurora-mysql`
  - typingsSlinky.pulumiAws.pulumiAwsStrings.`aurora-postgresql`
*/
trait EngineType extends js.Object

object EngineType {
  @scala.inline
  def aurora: typingsSlinky.pulumiAws.pulumiAwsStrings.aurora = this.cast("aurora")
  @scala.inline
  def `aurora-mysql`: typingsSlinky.pulumiAws.pulumiAwsStrings.`aurora-mysql` = this.cast("aurora-mysql")
  @scala.inline
  def `aurora-postgresql`: typingsSlinky.pulumiAws.pulumiAwsStrings.`aurora-postgresql` = this.cast("aurora-postgresql")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

