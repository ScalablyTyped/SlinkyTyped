package typingsSlinky.gcsResumableUpload.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.authenticatedRead
  - typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerFullControl
  - typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerRead
  - typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.`private`
  - typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.projectPrivate
  - typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.publicRead
*/
trait PredefinedAcl extends js.Object

object PredefinedAcl {
  @scala.inline
  def authenticatedRead: typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.authenticatedRead = this.cast("authenticatedRead")
  @scala.inline
  def bucketOwnerFullControl: typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerFullControl = this.cast("bucketOwnerFullControl")
  @scala.inline
  def bucketOwnerRead: typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.bucketOwnerRead = this.cast("bucketOwnerRead")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `private`: typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.`private` = this.cast("private")
  @scala.inline
  def projectPrivate: typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.projectPrivate = this.cast("projectPrivate")
  @scala.inline
  def publicRead: typingsSlinky.gcsResumableUpload.gcsResumableUploadStrings.publicRead = this.cast("publicRead")
}

