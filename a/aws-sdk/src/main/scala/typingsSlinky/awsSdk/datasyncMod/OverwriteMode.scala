package typingsSlinky.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.ALWAYS
  - typingsSlinky.awsSdk.awsSdkStrings.NEVER
  - java.lang.String
*/
trait OverwriteMode extends js.Object

object OverwriteMode {
  @scala.inline
  def ALWAYS: typingsSlinky.awsSdk.awsSdkStrings.ALWAYS = "ALWAYS".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALWAYS]
  @scala.inline
  def NEVER: typingsSlinky.awsSdk.awsSdkStrings.NEVER = "NEVER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.NEVER]
  @scala.inline
  implicit def apply(value: String): OverwriteMode = value.asInstanceOf[OverwriteMode]
}

