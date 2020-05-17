package typingsSlinky.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.LambdaInvoke
  - typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectCopy
  - typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectAcl
  - typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectTagging
  - typingsSlinky.awsSdk.awsSdkStrings.S3InitiateRestoreObject
  - java.lang.String
*/
trait OperationName extends js.Object

object OperationName {
  @scala.inline
  def LambdaInvoke: typingsSlinky.awsSdk.awsSdkStrings.LambdaInvoke = "LambdaInvoke".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LambdaInvoke]
  @scala.inline
  def S3PutObjectCopy: typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectCopy = "S3PutObjectCopy".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectCopy]
  @scala.inline
  def S3PutObjectAcl: typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectAcl = "S3PutObjectAcl".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectAcl]
  @scala.inline
  def S3PutObjectTagging: typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectTagging = "S3PutObjectTagging".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.S3PutObjectTagging]
  @scala.inline
  def S3InitiateRestoreObject: typingsSlinky.awsSdk.awsSdkStrings.S3InitiateRestoreObject = "S3InitiateRestoreObject".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.S3InitiateRestoreObject]
  @scala.inline
  implicit def apply(value: String): OperationName = value.asInstanceOf[OperationName]
}

