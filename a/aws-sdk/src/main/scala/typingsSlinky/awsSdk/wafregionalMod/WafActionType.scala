package typingsSlinky.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.BLOCK
  - typingsSlinky.awsSdk.awsSdkStrings.ALLOW
  - typingsSlinky.awsSdk.awsSdkStrings.COUNT
  - java.lang.String
*/
trait WafActionType extends js.Object

object WafActionType {
  @scala.inline
  def BLOCK: typingsSlinky.awsSdk.awsSdkStrings.BLOCK = "BLOCK".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.BLOCK]
  @scala.inline
  def ALLOW: typingsSlinky.awsSdk.awsSdkStrings.ALLOW = "ALLOW".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ALLOW]
  @scala.inline
  def COUNT: typingsSlinky.awsSdk.awsSdkStrings.COUNT = "COUNT".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.COUNT]
  @scala.inline
  implicit def apply(value: String): WafActionType = value.asInstanceOf[WafActionType]
}

