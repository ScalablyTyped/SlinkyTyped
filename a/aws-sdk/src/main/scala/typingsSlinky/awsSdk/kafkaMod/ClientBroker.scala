package typingsSlinky.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.TLS
  - typingsSlinky.awsSdk.awsSdkStrings.TLS_PLAINTEXT
  - typingsSlinky.awsSdk.awsSdkStrings.PLAINTEXT
  - java.lang.String
*/
trait ClientBroker extends js.Object

object ClientBroker {
  @scala.inline
  def TLS: typingsSlinky.awsSdk.awsSdkStrings.TLS = "TLS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TLS]
  @scala.inline
  def TLS_PLAINTEXT: typingsSlinky.awsSdk.awsSdkStrings.TLS_PLAINTEXT = "TLS_PLAINTEXT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.TLS_PLAINTEXT]
  @scala.inline
  def PLAINTEXT: typingsSlinky.awsSdk.awsSdkStrings.PLAINTEXT = "PLAINTEXT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PLAINTEXT]
  @scala.inline
  implicit def apply(value: String): ClientBroker = value.asInstanceOf[ClientBroker]
}

