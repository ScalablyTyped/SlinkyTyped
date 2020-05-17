package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FullyReplicated
  - typingsSlinky.awsSdk.awsSdkStrings.ShardedByS3Key
  - java.lang.String
*/
trait ProcessingS3DataDistributionType extends js.Object

object ProcessingS3DataDistributionType {
  @scala.inline
  def FullyReplicated: typingsSlinky.awsSdk.awsSdkStrings.FullyReplicated = "FullyReplicated".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FullyReplicated]
  @scala.inline
  def ShardedByS3Key: typingsSlinky.awsSdk.awsSdkStrings.ShardedByS3Key = "ShardedByS3Key".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ShardedByS3Key]
  @scala.inline
  implicit def apply(value: java.lang.String): ProcessingS3DataDistributionType = value.asInstanceOf[ProcessingS3DataDistributionType]
}

