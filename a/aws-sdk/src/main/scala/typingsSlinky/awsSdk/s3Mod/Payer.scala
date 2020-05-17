package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.Requester
  - typingsSlinky.awsSdk.awsSdkStrings.BucketOwner
  - java.lang.String
*/
trait Payer extends js.Object

object Payer {
  @scala.inline
  def Requester: typingsSlinky.awsSdk.awsSdkStrings.Requester = "Requester".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.Requester]
  @scala.inline
  def BucketOwner: typingsSlinky.awsSdk.awsSdkStrings.BucketOwner = "BucketOwner".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BucketOwner]
  @scala.inline
  implicit def apply(value: String): Payer = value.asInstanceOf[Payer]
}

