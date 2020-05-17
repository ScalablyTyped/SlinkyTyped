package typingsSlinky.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EQ
  - typingsSlinky.awsSdk.awsSdkStrings.REF_EQ
  - typingsSlinky.awsSdk.awsSdkStrings.LE
  - typingsSlinky.awsSdk.awsSdkStrings.GE
  - typingsSlinky.awsSdk.awsSdkStrings.BETWEEN
  - java.lang.String
*/
trait OperatorType extends js.Object

object OperatorType {
  @scala.inline
  def EQ: typingsSlinky.awsSdk.awsSdkStrings.EQ = "EQ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EQ]
  @scala.inline
  def REF_EQ: typingsSlinky.awsSdk.awsSdkStrings.REF_EQ = "REF_EQ".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REF_EQ]
  @scala.inline
  def LE: typingsSlinky.awsSdk.awsSdkStrings.LE = "LE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LE]
  @scala.inline
  def GE: typingsSlinky.awsSdk.awsSdkStrings.GE = "GE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.GE]
  @scala.inline
  def BETWEEN: typingsSlinky.awsSdk.awsSdkStrings.BETWEEN = "BETWEEN".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BETWEEN]
  @scala.inline
  implicit def apply(value: String): OperatorType = value.asInstanceOf[OperatorType]
}

