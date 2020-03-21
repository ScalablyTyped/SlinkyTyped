package typingsSlinky.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleCloudStorage.googleCloudStorageStrings.authenticatedRead
  - typingsSlinky.googleCloudStorage.googleCloudStorageStrings.bucketOwnerFullControl
  - typingsSlinky.googleCloudStorage.googleCloudStorageStrings.bucketOwnerRead
  - typingsSlinky.googleCloudStorage.googleCloudStorageStrings.`private`
  - typingsSlinky.googleCloudStorage.googleCloudStorageStrings.projectPrivate
  - typingsSlinky.googleCloudStorage.googleCloudStorageStrings.publicRead
*/
trait PredefinedAcl extends js.Object

object PredefinedAcl {
  @scala.inline
  def authenticatedRead: typingsSlinky.googleCloudStorage.googleCloudStorageStrings.authenticatedRead = this.cast("authenticatedRead")
  @scala.inline
  def bucketOwnerFullControl: typingsSlinky.googleCloudStorage.googleCloudStorageStrings.bucketOwnerFullControl = this.cast("bucketOwnerFullControl")
  @scala.inline
  def bucketOwnerRead: typingsSlinky.googleCloudStorage.googleCloudStorageStrings.bucketOwnerRead = this.cast("bucketOwnerRead")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsSlinky.googleCloudStorage.googleCloudStorageStrings.`private` = this.cast("private")
  @scala.inline
  def projectPrivate: typingsSlinky.googleCloudStorage.googleCloudStorageStrings.projectPrivate = this.cast("projectPrivate")
  @scala.inline
  def publicRead: typingsSlinky.googleCloudStorage.googleCloudStorageStrings.publicRead = this.cast("publicRead")
}

