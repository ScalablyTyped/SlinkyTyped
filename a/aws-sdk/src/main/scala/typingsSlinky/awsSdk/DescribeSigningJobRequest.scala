package typingsSlinky.awsSdk

import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import typingsSlinky.awsSdk.signerMod.JobId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/signer.DescribeSigningJobRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeSigningJobRequest extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The ID of the signing job on input.
    */
  var jobId: JobId = js.native
}

