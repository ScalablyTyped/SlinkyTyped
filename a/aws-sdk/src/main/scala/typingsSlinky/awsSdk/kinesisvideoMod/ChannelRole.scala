package typingsSlinky.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.MASTER
  - typingsSlinky.awsSdk.awsSdkStrings.VIEWER
  - java.lang.String
*/
trait ChannelRole extends js.Object

object ChannelRole {
  @scala.inline
  def MASTER: typingsSlinky.awsSdk.awsSdkStrings.MASTER = "MASTER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.MASTER]
  @scala.inline
  def VIEWER: typingsSlinky.awsSdk.awsSdkStrings.VIEWER = "VIEWER".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.VIEWER]
  @scala.inline
  implicit def apply(value: String): ChannelRole = value.asInstanceOf[ChannelRole]
}

