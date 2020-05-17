package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.HASH
  - typingsSlinky.awsSdk.awsSdkStrings.RANGE
  - java.lang.String
*/
trait KeyType extends js.Object

object KeyType {
  @scala.inline
  def HASH: typingsSlinky.awsSdk.awsSdkStrings.HASH = "HASH".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.HASH]
  @scala.inline
  def RANGE: typingsSlinky.awsSdk.awsSdkStrings.RANGE = "RANGE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RANGE]
  @scala.inline
  implicit def apply(value: java.lang.String): KeyType = value.asInstanceOf[KeyType]
}

