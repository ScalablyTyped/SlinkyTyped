package typingsSlinky.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED
  - typingsSlinky.awsSdk.awsSdkStrings.RESOLVED
  - java.lang.String
*/
trait FindingStatus extends js.Object

object FindingStatus {
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def ARCHIVED: typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED = "ARCHIVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED]
  @scala.inline
  def RESOLVED: typingsSlinky.awsSdk.awsSdkStrings.RESOLVED = "RESOLVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.RESOLVED]
  @scala.inline
  implicit def apply(value: java.lang.String): FindingStatus = value.asInstanceOf[FindingStatus]
}

