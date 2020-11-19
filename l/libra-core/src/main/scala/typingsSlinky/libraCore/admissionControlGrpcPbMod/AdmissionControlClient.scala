package typingsSlinky.libraCore.admissionControlGrpcPbMod

import typingsSlinky.grpc.mod.ChannelCredentials
import typingsSlinky.grpc.mod.Client
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libra-core/lib/@/generated/admission_control_grpc_pb", "AdmissionControlClient")
@js.native
class AdmissionControlClient protected ()
  extends Client
     with IAdmissionControlClient {
  def this(address: String, credentials: ChannelCredentials) = this()
  def this(address: String, credentials: ChannelCredentials, options: js.Object) = this()
}
