package typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod

import typingsSlinky.googleDashProtobuf.googleDashProtobufMod.Message
import typingsSlinky.libraDashCore.libAtGeneratedAdmissionUnderscoreControlUnderscorePbMod.SubmitTransactionResponse.StatusCase
import typingsSlinky.libraDashCore.libAtGeneratedMempoolUnderscoreStatusUnderscorePbMod.MempoolAddTransactionStatus
import typingsSlinky.libraDashCore.libAtGeneratedVmUnderscoreErrorsUnderscorePbMod.VMStatus
import typingsSlinky.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("libra-core/lib/@/generated/admission_control_pb", "SubmitTransactionResponse")
@js.native
class SubmitTransactionResponse_ () extends Message {
  def clearAcStatus(): Unit = js.native
  def clearMempoolStatus(): Unit = js.native
  def clearVmStatus(): Unit = js.native
  def getAcStatus(): js.UndefOr[AdmissionControlStatus] = js.native
  def getMempoolStatus(): js.UndefOr[MempoolAddTransactionStatus] = js.native
  def getStatusCase(): StatusCase = js.native
  def getValidatorId(): scala.scalajs.js.typedarray.Uint8Array | String = js.native
  def getValidatorId_asB64(): String = js.native
  def getValidatorId_asU8(): scala.scalajs.js.typedarray.Uint8Array = js.native
  def getVmStatus(): js.UndefOr[VMStatus] = js.native
  def hasAcStatus(): Boolean = js.native
  def hasMempoolStatus(): Boolean = js.native
  def hasVmStatus(): Boolean = js.native
  def setAcStatus(): Unit = js.native
  def setAcStatus(value: AdmissionControlStatus): Unit = js.native
  def setMempoolStatus(): Unit = js.native
  def setMempoolStatus(value: MempoolAddTransactionStatus): Unit = js.native
  def setValidatorId(value: String): Unit = js.native
  def setValidatorId(value: Uint8Array): Unit = js.native
  def setVmStatus(): Unit = js.native
  def setVmStatus(value: VMStatus): Unit = js.native
}

