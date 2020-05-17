package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.FullyReplicated
  - typingsSlinky.awsSdk.awsSdkStrings.ShardedByS3Key
  - java.lang.String
*/
trait S3DataDistribution extends js.Object

object S3DataDistribution {
  @scala.inline
  def FullyReplicated: typingsSlinky.awsSdk.awsSdkStrings.FullyReplicated = "FullyReplicated".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.FullyReplicated]
  @scala.inline
  def ShardedByS3Key: typingsSlinky.awsSdk.awsSdkStrings.ShardedByS3Key = "ShardedByS3Key".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ShardedByS3Key]
  @scala.inline
  implicit def apply(value: java.lang.String): S3DataDistribution = value.asInstanceOf[S3DataDistribution]
}

