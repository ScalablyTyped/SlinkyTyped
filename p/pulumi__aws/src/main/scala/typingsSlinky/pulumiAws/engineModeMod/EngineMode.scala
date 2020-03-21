package typingsSlinky.pulumiAws.engineModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.pulumiAwsStrings.provisioned
  - typingsSlinky.pulumiAws.pulumiAwsStrings.serverless
  - typingsSlinky.pulumiAws.pulumiAwsStrings.parallelquery
  - typingsSlinky.pulumiAws.pulumiAwsStrings.global
*/
trait EngineMode extends js.Object

object EngineMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def global: typingsSlinky.pulumiAws.pulumiAwsStrings.global = this.cast("global")
  @scala.inline
  def parallelquery: typingsSlinky.pulumiAws.pulumiAwsStrings.parallelquery = this.cast("parallelquery")
  @scala.inline
  def provisioned: typingsSlinky.pulumiAws.pulumiAwsStrings.provisioned = this.cast("provisioned")
  @scala.inline
  def serverless: typingsSlinky.pulumiAws.pulumiAwsStrings.serverless = this.cast("serverless")
}

