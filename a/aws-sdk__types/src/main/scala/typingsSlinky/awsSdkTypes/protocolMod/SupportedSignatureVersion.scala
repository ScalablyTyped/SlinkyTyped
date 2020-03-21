package typingsSlinky.awsSdkTypes.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.v4
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.s3
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.s3v4
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.`v4-unsigned-body`
  - typingsSlinky.awsSdkTypes.awsSdkTypesStrings.none
*/
trait SupportedSignatureVersion extends js.Object

object SupportedSignatureVersion {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.none = this.cast("none")
  @scala.inline
  def s3: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.s3 = this.cast("s3")
  @scala.inline
  def s3v4: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.s3v4 = this.cast("s3v4")
  @scala.inline
  def v4: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.v4 = this.cast("v4")
  @scala.inline
  def `v4-unsigned-body`: typingsSlinky.awsSdkTypes.awsSdkTypesStrings.`v4-unsigned-body` = this.cast("v4-unsigned-body")
}

