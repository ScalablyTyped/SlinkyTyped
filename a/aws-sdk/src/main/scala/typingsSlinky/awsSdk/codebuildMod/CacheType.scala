package typingsSlinky.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NO_CACHE
  - typingsSlinky.awsSdk.awsSdkStrings.S3
  - typingsSlinky.awsSdk.awsSdkStrings.LOCAL
  - java.lang.String
*/
trait CacheType extends js.Object

object CacheType {
  @scala.inline
  def NO_CACHE: typingsSlinky.awsSdk.awsSdkStrings.NO_CACHE = "NO_CACHE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NO_CACHE]
  @scala.inline
  def S3: typingsSlinky.awsSdk.awsSdkStrings.S3 = "S3".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.S3]
  @scala.inline
  def LOCAL: typingsSlinky.awsSdk.awsSdkStrings.LOCAL = "LOCAL".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LOCAL]
  @scala.inline
  implicit def apply(value: java.lang.String): CacheType = value.asInstanceOf[CacheType]
}

