package typingsSlinky.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.COPY
  - typingsSlinky.awsSdk.awsSdkStrings.REPLACE
  - java.lang.String
*/
trait MetadataDirective extends js.Object

object MetadataDirective {
  @scala.inline
  def COPY: typingsSlinky.awsSdk.awsSdkStrings.COPY = "COPY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COPY]
  @scala.inline
  def REPLACE: typingsSlinky.awsSdk.awsSdkStrings.REPLACE = "REPLACE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.REPLACE]
  @scala.inline
  implicit def apply(value: String): MetadataDirective = value.asInstanceOf[MetadataDirective]
}

