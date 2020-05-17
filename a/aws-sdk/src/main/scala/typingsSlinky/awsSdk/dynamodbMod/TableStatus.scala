package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.CREATING
  - typingsSlinky.awsSdk.awsSdkStrings.UPDATING
  - typingsSlinky.awsSdk.awsSdkStrings.DELETING
  - typingsSlinky.awsSdk.awsSdkStrings.ACTIVE
  - typingsSlinky.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS
  - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVING
  - typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED
  - java.lang.String
*/
trait TableStatus extends js.Object

object TableStatus {
  @scala.inline
  def CREATING: typingsSlinky.awsSdk.awsSdkStrings.CREATING = "CREATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.CREATING]
  @scala.inline
  def UPDATING: typingsSlinky.awsSdk.awsSdkStrings.UPDATING = "UPDATING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.UPDATING]
  @scala.inline
  def DELETING: typingsSlinky.awsSdk.awsSdkStrings.DELETING = "DELETING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETING]
  @scala.inline
  def ACTIVE: typingsSlinky.awsSdk.awsSdkStrings.ACTIVE = "ACTIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ACTIVE]
  @scala.inline
  def INACCESSIBLE_ENCRYPTION_CREDENTIALS: typingsSlinky.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS = "INACCESSIBLE_ENCRYPTION_CREDENTIALS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.INACCESSIBLE_ENCRYPTION_CREDENTIALS]
  @scala.inline
  def ARCHIVING: typingsSlinky.awsSdk.awsSdkStrings.ARCHIVING = "ARCHIVING".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ARCHIVING]
  @scala.inline
  def ARCHIVED: typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED = "ARCHIVED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ARCHIVED]
  @scala.inline
  implicit def apply(value: java.lang.String): TableStatus = value.asInstanceOf[TableStatus]
}

