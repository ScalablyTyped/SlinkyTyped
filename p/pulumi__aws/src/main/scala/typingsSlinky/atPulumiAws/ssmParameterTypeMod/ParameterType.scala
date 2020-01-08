package typingsSlinky.atPulumiAws.ssmParameterTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atPulumiAws.atPulumiAwsStrings.String
  - typings.atPulumiAws.atPulumiAwsStrings.StringList
  - typings.atPulumiAws.atPulumiAwsStrings.SecureString
*/
trait ParameterType extends js.Object

object ParameterType {
  @scala.inline
  def SecureString: typingsSlinky.atPulumiAws.atPulumiAwsStrings.SecureString = this.cast("SecureString")
  @scala.inline
  def String: typingsSlinky.atPulumiAws.atPulumiAwsStrings.String = this.cast("String")
  @scala.inline
  def StringList: typingsSlinky.atPulumiAws.atPulumiAwsStrings.StringList = this.cast("StringList")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

