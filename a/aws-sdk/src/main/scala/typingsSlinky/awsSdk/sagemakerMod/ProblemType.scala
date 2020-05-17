package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.BinaryClassification
  - typingsSlinky.awsSdk.awsSdkStrings.MulticlassClassification
  - typingsSlinky.awsSdk.awsSdkStrings.Regression_
  - java.lang.String
*/
trait ProblemType extends js.Object

object ProblemType {
  @scala.inline
  def BinaryClassification: typingsSlinky.awsSdk.awsSdkStrings.BinaryClassification = "BinaryClassification".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BinaryClassification]
  @scala.inline
  def MulticlassClassification: typingsSlinky.awsSdk.awsSdkStrings.MulticlassClassification = "MulticlassClassification".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MulticlassClassification]
  @scala.inline
  def Regression_ : typingsSlinky.awsSdk.awsSdkStrings.Regression_ = "Regression".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Regression_]
  @scala.inline
  implicit def apply(value: java.lang.String): ProblemType = value.asInstanceOf[ProblemType]
}

