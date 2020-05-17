package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ADD
  - typingsSlinky.awsSdk.awsSdkStrings.REMOVE
  - typingsSlinky.awsSdk.awsSdkStrings.NOT_EQUAL
  - java.lang.String
*/
trait DifferenceType extends js.Object

object DifferenceType {
  @scala.inline
  def ADD: typingsSlinky.awsSdk.awsSdkStrings.ADD = "ADD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ADD]
  @scala.inline
  def REMOVE: typingsSlinky.awsSdk.awsSdkStrings.REMOVE = "REMOVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REMOVE]
  @scala.inline
  def NOT_EQUAL: typingsSlinky.awsSdk.awsSdkStrings.NOT_EQUAL = "NOT_EQUAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NOT_EQUAL]
  @scala.inline
  implicit def apply(value: String): DifferenceType = value.asInstanceOf[DifferenceType]
}

