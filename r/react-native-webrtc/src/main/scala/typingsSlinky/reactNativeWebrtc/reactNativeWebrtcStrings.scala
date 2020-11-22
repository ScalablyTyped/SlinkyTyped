package typingsSlinky.reactNativeWebrtc

import typingsSlinky.reactNativeWebrtc.mod.MediaStreamTrackState
import typingsSlinky.reactNativeWebrtc.mod.RTCIceConnectionState
import typingsSlinky.reactNativeWebrtc.mod.RTCIceGatheringState
import typingsSlinky.reactNativeWebrtc.mod.RTCPeerConnectionState
import typingsSlinky.reactNativeWebrtc.mod.RTCSignalingState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactNativeWebrtcStrings {
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def checking: checking = "checking".asInstanceOf[checking]
  
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @scala.inline
  def complete: complete = "complete".asInstanceOf[complete]
  
  @scala.inline
  def completed: completed = "completed".asInstanceOf[completed]
  
  @scala.inline
  def connected: connected = "connected".asInstanceOf[connected]
  
  @scala.inline
  def connecting: connecting = "connecting".asInstanceOf[connecting]
  
  @scala.inline
  def contain: contain = "contain".asInstanceOf[contain]
  
  @scala.inline
  def cover: cover = "cover".asInstanceOf[cover]
  
  @scala.inline
  def disconnected: disconnected = "disconnected".asInstanceOf[disconnected]
  
  @scala.inline
  def ended: ended = "ended".asInstanceOf[ended]
  
  @scala.inline
  def environment: environment = "environment".asInstanceOf[environment]
  
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @scala.inline
  def gathering: gathering = "gathering".asInstanceOf[gathering]
  
  @scala.inline
  def `have-local-offer`: `have-local-offer` = "have-local-offer".asInstanceOf[`have-local-offer`]
  
  @scala.inline
  def `have-local-pranswer`: `have-local-pranswer` = "have-local-pranswer".asInstanceOf[`have-local-pranswer`]
  
  @scala.inline
  def `have-remote-offer`: `have-remote-offer` = "have-remote-offer".asInstanceOf[`have-remote-offer`]
  
  @scala.inline
  def `have-remote-pranswer`: `have-remote-pranswer` = "have-remote-pranswer".asInstanceOf[`have-remote-pranswer`]
  
  @scala.inline
  def live: live = "live".asInstanceOf[live]
  
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @scala.inline
  def public: public = "public".asInstanceOf[public]
  
  @scala.inline
  def relay: relay = "relay".asInstanceOf[relay]
  
  @scala.inline
  def stable: stable = "stable".asInstanceOf[stable]
  
  @scala.inline
  def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait checking extends RTCIceConnectionState
  
  @js.native
  sealed trait closed
    extends RTCIceConnectionState
       with RTCPeerConnectionState
       with RTCSignalingState
  
  @js.native
  sealed trait complete extends RTCIceGatheringState
  
  @js.native
  sealed trait completed extends RTCIceConnectionState
  
  @js.native
  sealed trait connected
    extends RTCIceConnectionState
       with RTCPeerConnectionState
  
  @js.native
  sealed trait connecting extends RTCPeerConnectionState
  
  @js.native
  sealed trait contain extends js.Object
  
  @js.native
  sealed trait cover extends js.Object
  
  @js.native
  sealed trait disconnected
    extends RTCIceConnectionState
       with RTCPeerConnectionState
  
  @js.native
  sealed trait ended extends MediaStreamTrackState
  
  @js.native
  sealed trait environment extends js.Object
  
  @js.native
  sealed trait failed
    extends RTCIceConnectionState
       with RTCPeerConnectionState
  
  @js.native
  sealed trait gathering extends RTCIceGatheringState
  
  @js.native
  sealed trait `have-local-offer` extends RTCSignalingState
  
  @js.native
  sealed trait `have-local-pranswer` extends RTCSignalingState
  
  @js.native
  sealed trait `have-remote-offer` extends RTCSignalingState
  
  @js.native
  sealed trait `have-remote-pranswer` extends RTCSignalingState
  
  @js.native
  sealed trait live extends MediaStreamTrackState
  
  @js.native
  sealed trait `new`
    extends RTCIceConnectionState
       with RTCIceGatheringState
       with RTCPeerConnectionState
  
  @js.native
  sealed trait public extends js.Object
  
  @js.native
  sealed trait relay extends js.Object
  
  @js.native
  sealed trait stable extends RTCSignalingState
  
  @js.native
  sealed trait user extends js.Object
}
