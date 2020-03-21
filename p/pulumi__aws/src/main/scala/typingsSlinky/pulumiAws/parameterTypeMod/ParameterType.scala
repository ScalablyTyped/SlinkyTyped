package typingsSlinky.pulumiAws.parameterTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.pulumiAws.pulumiAwsStrings.String
  - typingsSlinky.pulumiAws.pulumiAwsStrings.StringList
  - typingsSlinky.pulumiAws.pulumiAwsStrings.SecureString
*/
trait ParameterType extends js.Object

object ParameterType {
  @scala.inline
  def SecureString: typingsSlinky.pulumiAws.pulumiAwsStrings.SecureString = this.cast("SecureString")
  @scala.inline
  def String: typingsSlinky.pulumiAws.pulumiAwsStrings.String = this.cast("String")
  @scala.inline
  def StringList: typingsSlinky.pulumiAws.pulumiAwsStrings.StringList = this.cast("StringList")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

