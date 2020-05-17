package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CSV
  - typingsSlinky.awsSdk.awsSdkStrings.JSON
  - java.lang.String
*/
trait Format extends js.Object

object Format {
  @scala.inline
  def CSV: typingsSlinky.awsSdk.awsSdkStrings.CSV = "CSV".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CSV]
  @scala.inline
  def JSON: typingsSlinky.awsSdk.awsSdkStrings.JSON = "JSON".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.JSON]
  @scala.inline
  implicit def apply(value: String): Format = value.asInstanceOf[Format]
}

