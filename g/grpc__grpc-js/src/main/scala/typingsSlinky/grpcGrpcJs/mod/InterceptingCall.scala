package typingsSlinky.grpcGrpcJs.mod

import typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptingCallInterface
import typingsSlinky.grpcGrpcJs.clientInterceptorsMod.Requester
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@grpc/grpc-js", "InterceptingCall")
@js.native
class InterceptingCall protected ()
  extends typingsSlinky.grpcGrpcJs.clientInterceptorsMod.InterceptingCall {
  def this(nextCall: InterceptingCallInterface) = this()
  def this(nextCall: InterceptingCallInterface, requester: Requester) = this()
}
