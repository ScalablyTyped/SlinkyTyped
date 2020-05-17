package typingsSlinky.googleGax.apitypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.googleGax.apitypesMod.UnaryCall
  - typingsSlinky.googleGax.apitypesMod.ServerStreamingCall
  - typingsSlinky.googleGax.apitypesMod.ClientStreamingCall
  - typingsSlinky.googleGax.apitypesMod.BiDiStreamingCall
*/
trait GRPCCall extends js.Object

object GRPCCall {
  @scala.inline
  implicit def apply(value: ClientStreamingCall | ServerStreamingCall): GRPCCall = value.asInstanceOf[GRPCCall]
  @scala.inline
  implicit def apply(value: BiDiStreamingCall): GRPCCall = value.asInstanceOf[GRPCCall]
  @scala.inline
  implicit def apply(value: UnaryCall): GRPCCall = value.asInstanceOf[GRPCCall]
}

