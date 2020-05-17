package typingsSlinky.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.DRAFT
  - typingsSlinky.awsSdk.awsSdkStrings.PUBLISHED
  - typingsSlinky.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
trait CommentStatusType extends js.Object

object CommentStatusType {
  @scala.inline
  def DRAFT: typingsSlinky.awsSdk.awsSdkStrings.DRAFT = "DRAFT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DRAFT]
  @scala.inline
  def PUBLISHED: typingsSlinky.awsSdk.awsSdkStrings.PUBLISHED = "PUBLISHED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.PUBLISHED]
  @scala.inline
  def DELETED: typingsSlinky.awsSdk.awsSdkStrings.DELETED = "DELETED".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.DELETED]
  @scala.inline
  implicit def apply(value: String): CommentStatusType = value.asInstanceOf[CommentStatusType]
}

