package typingsSlinky.atPulumiAws.rdsEngineModeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.provisioned
  - typings.atPulumiAws.atPulumiAwsStrings.serverless
  - typings.atPulumiAws.atPulumiAwsStrings.parallelquery
  - typings.atPulumiAws.atPulumiAwsStrings.global
*/
trait EngineMode extends js.Object

object EngineMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def global: typingsSlinky.atPulumiAws.atPulumiAwsStrings.global = this.cast("global")
  @scala.inline
  def parallelquery: typingsSlinky.atPulumiAws.atPulumiAwsStrings.parallelquery = this.cast("parallelquery")
  @scala.inline
  def provisioned: typingsSlinky.atPulumiAws.atPulumiAwsStrings.provisioned = this.cast("provisioned")
  @scala.inline
  def serverless: typingsSlinky.atPulumiAws.atPulumiAwsStrings.serverless = this.cast("serverless")
}

