package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.LIVE
  - typingsSlinky.awsSdk.awsSdkStrings.VOD
  - java.lang.String
*/
trait HlsMode extends js.Object

object HlsMode {
  @scala.inline
  def LIVE: typingsSlinky.awsSdk.awsSdkStrings.LIVE = "LIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LIVE]
  @scala.inline
  def VOD: typingsSlinky.awsSdk.awsSdkStrings.VOD = "VOD".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VOD]
  @scala.inline
  implicit def apply(value: String): HlsMode = value.asInstanceOf[HlsMode]
}

