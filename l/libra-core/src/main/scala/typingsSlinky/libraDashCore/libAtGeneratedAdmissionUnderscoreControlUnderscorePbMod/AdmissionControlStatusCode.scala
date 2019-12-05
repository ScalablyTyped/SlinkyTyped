package typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AdmissionControlStatusCode extends js.Object

@JSImport("libra-core/lib/@/generated/admission_control_pb", "AdmissionControlStatusCode")
@js.native
object AdmissionControlStatusCode extends js.Object {
  @js.native
  sealed trait ACCEPTED extends AdmissionControlStatusCode
  
  @js.native
  sealed trait BLACKLISTED extends AdmissionControlStatusCode
  
  @js.native
  sealed trait REJECTED extends AdmissionControlStatusCode
  
  /* 0 */ val ACCEPTED: typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatusCode.ACCEPTED with Double = js.native
  /* 1 */ val BLACKLISTED: typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatusCode.BLACKLISTED with Double = js.native
  /* 2 */ val REJECTED: typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.AdmissionControlStatusCode.REJECTED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AdmissionControlStatusCode with Double] = js.native
}

