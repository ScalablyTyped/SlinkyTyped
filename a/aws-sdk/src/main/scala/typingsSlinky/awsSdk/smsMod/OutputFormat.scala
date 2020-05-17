package typingsSlinky.awsSdk.smsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.JSON
  - typingsSlinky.awsSdk.awsSdkStrings.YAML
  - java.lang.String
*/
trait OutputFormat extends js.Object

object OutputFormat {
  @scala.inline
  def JSON: typingsSlinky.awsSdk.awsSdkStrings.JSON = "JSON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.JSON]
  @scala.inline
  def YAML: typingsSlinky.awsSdk.awsSdkStrings.YAML = "YAML".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.YAML]
  @scala.inline
  implicit def apply(value: String): OutputFormat = value.asInstanceOf[OutputFormat]
}

