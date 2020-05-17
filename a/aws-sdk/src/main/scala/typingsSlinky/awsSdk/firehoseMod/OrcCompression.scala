package typingsSlinky.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.NONE
  - typingsSlinky.awsSdk.awsSdkStrings.ZLIB
  - typingsSlinky.awsSdk.awsSdkStrings.SNAPPY
  - java.lang.String
*/
trait OrcCompression extends js.Object

object OrcCompression {
  @scala.inline
  def NONE: typingsSlinky.awsSdk.awsSdkStrings.NONE = "NONE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NONE]
  @scala.inline
  def ZLIB: typingsSlinky.awsSdk.awsSdkStrings.ZLIB = "ZLIB".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ZLIB]
  @scala.inline
  def SNAPPY: typingsSlinky.awsSdk.awsSdkStrings.SNAPPY = "SNAPPY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.SNAPPY]
  @scala.inline
  implicit def apply(value: String): OrcCompression = value.asInstanceOf[OrcCompression]
}

