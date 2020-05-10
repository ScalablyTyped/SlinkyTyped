package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingArgs
import typingsSlinky.pulumiAws.getInstanceTypeOfferingMod.GetInstanceTypeOfferingResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ec2.getInstanceTypeOffering")
@js.native
object getInstanceTypeOffering extends js.Object {
  def apply(): js.Promise[GetInstanceTypeOfferingResult] with GetInstanceTypeOfferingResult = js.native
  def apply(args: GetInstanceTypeOfferingArgs): js.Promise[GetInstanceTypeOfferingResult] with GetInstanceTypeOfferingResult = js.native
  def apply(args: GetInstanceTypeOfferingArgs, opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingResult] with GetInstanceTypeOfferingResult = js.native
}

