package typingsSlinky.rsocketTypes.reactiveSocketTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.CancelFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ErrorFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.KeepAliveFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.LeaseFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.PayloadFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestChannelFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestFnfFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestNFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestResponseFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.RequestStreamFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ResumeFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.ResumeOkFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.SetupFrame
  - typingsSlinky.rsocketTypes.reactiveSocketTypesMod.UnsupportedFrame
*/
trait Frame extends js.Object

object Frame {
  @scala.inline
  implicit def apply(value: CancelFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: ErrorFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: KeepAliveFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: LeaseFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: PayloadFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: RequestChannelFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: RequestFnfFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: RequestNFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: RequestResponseFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: RequestStreamFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: ResumeFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: ResumeOkFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: SetupFrame): Frame = value.asInstanceOf[Frame]
  @scala.inline
  implicit def apply(value: UnsupportedFrame): Frame = value.asInstanceOf[Frame]
}

