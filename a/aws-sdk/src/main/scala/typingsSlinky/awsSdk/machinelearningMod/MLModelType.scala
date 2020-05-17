package typingsSlinky.awsSdk.machinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.REGRESSION
  - typingsSlinky.awsSdk.awsSdkStrings.BINARY
  - typingsSlinky.awsSdk.awsSdkStrings.MULTICLASS
  - java.lang.String
*/
trait MLModelType extends js.Object

object MLModelType {
  @scala.inline
  def REGRESSION: typingsSlinky.awsSdk.awsSdkStrings.REGRESSION = "REGRESSION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REGRESSION]
  @scala.inline
  def BINARY: typingsSlinky.awsSdk.awsSdkStrings.BINARY = "BINARY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BINARY]
  @scala.inline
  def MULTICLASS: typingsSlinky.awsSdk.awsSdkStrings.MULTICLASS = "MULTICLASS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MULTICLASS]
  @scala.inline
  implicit def apply(value: String): MLModelType = value.asInstanceOf[MLModelType]
}

