package typingsSlinky.awsSdk.appconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.LINEAR
  - typingsSlinky.awsSdk.awsSdkStrings.EXPONENTIAL
  - java.lang.String
*/
trait GrowthType extends js.Object

object GrowthType {
  @scala.inline
  def LINEAR: typingsSlinky.awsSdk.awsSdkStrings.LINEAR = "LINEAR".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LINEAR]
  @scala.inline
  def EXPONENTIAL: typingsSlinky.awsSdk.awsSdkStrings.EXPONENTIAL = "EXPONENTIAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPONENTIAL]
  @scala.inline
  implicit def apply(value: java.lang.String): GrowthType = value.asInstanceOf[GrowthType]
}

