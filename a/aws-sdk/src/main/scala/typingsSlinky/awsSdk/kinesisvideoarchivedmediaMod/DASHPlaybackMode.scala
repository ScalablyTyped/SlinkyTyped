package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdk.awsSdkStrings.LIVE
  - typingsSlinky.awsSdk.awsSdkStrings.LIVE_REPLAY
  - typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND
  - java.lang.String
*/
trait DASHPlaybackMode extends js.Object

object DASHPlaybackMode {
  @scala.inline
  def LIVE: typingsSlinky.awsSdk.awsSdkStrings.LIVE = "LIVE".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LIVE]
  @scala.inline
  def LIVE_REPLAY: typingsSlinky.awsSdk.awsSdkStrings.LIVE_REPLAY = "LIVE_REPLAY".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.LIVE_REPLAY]
  @scala.inline
  def ON_DEMAND: typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND = "ON_DEMAND".asInstanceOf[typingsSlinky.awsSdk.awsSdkStrings.ON_DEMAND]
  @scala.inline
  implicit def apply(value: java.lang.String): DASHPlaybackMode = value.asInstanceOf[DASHPlaybackMode]
}

