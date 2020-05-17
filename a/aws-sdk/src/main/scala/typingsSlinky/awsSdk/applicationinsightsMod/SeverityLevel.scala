package typingsSlinky.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Low_
  - typingsSlinky.awsSdk.awsSdkStrings.Medium_
  - typingsSlinky.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
trait SeverityLevel extends js.Object

object SeverityLevel {
  @scala.inline
  def Low_ : typingsSlinky.awsSdk.awsSdkStrings.Low_ = "Low".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Low_]
  @scala.inline
  def Medium_ : typingsSlinky.awsSdk.awsSdkStrings.Medium_ = "Medium".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Medium_]
  @scala.inline
  def High_ : typingsSlinky.awsSdk.awsSdkStrings.High_ = "High".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.High_]
  @scala.inline
  implicit def apply(value: String): SeverityLevel = value.asInstanceOf[SeverityLevel]
}

