package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.EVALUATION
  - typingsSlinky.awsSdk.awsSdkStrings.LABELING_SET_GENERATION
  - typingsSlinky.awsSdk.awsSdkStrings.IMPORT_LABELS
  - typingsSlinky.awsSdk.awsSdkStrings.EXPORT_LABELS
  - typingsSlinky.awsSdk.awsSdkStrings.FIND_MATCHES
  - java.lang.String
*/
trait TaskType extends js.Object

object TaskType {
  @scala.inline
  def EVALUATION: typingsSlinky.awsSdk.awsSdkStrings.EVALUATION = "EVALUATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EVALUATION]
  @scala.inline
  def LABELING_SET_GENERATION: typingsSlinky.awsSdk.awsSdkStrings.LABELING_SET_GENERATION = "LABELING_SET_GENERATION".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LABELING_SET_GENERATION]
  @scala.inline
  def IMPORT_LABELS: typingsSlinky.awsSdk.awsSdkStrings.IMPORT_LABELS = "IMPORT_LABELS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.IMPORT_LABELS]
  @scala.inline
  def EXPORT_LABELS: typingsSlinky.awsSdk.awsSdkStrings.EXPORT_LABELS = "EXPORT_LABELS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.EXPORT_LABELS]
  @scala.inline
  def FIND_MATCHES: typingsSlinky.awsSdk.awsSdkStrings.FIND_MATCHES = "FIND_MATCHES".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FIND_MATCHES]
  @scala.inline
  implicit def apply(value: String): TaskType = value.asInstanceOf[TaskType]
}

