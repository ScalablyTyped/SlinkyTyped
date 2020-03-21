package typingsSlinky.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.json
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.`rest-json`
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.`rest-xml`
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.query
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.ec2
*/
trait SupportedProtocol extends js.Object

object SupportedProtocol {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ec2: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.ec2 = this.cast("ec2")
  @scala.inline
  def json: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.json = this.cast("json")
  @scala.inline
  def query: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.query = this.cast("query")
  @scala.inline
  def `rest-json`: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.`rest-json` = this.cast("rest-json")
  @scala.inline
  def `rest-xml`: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.`rest-xml` = this.cast("rest-xml")
}

