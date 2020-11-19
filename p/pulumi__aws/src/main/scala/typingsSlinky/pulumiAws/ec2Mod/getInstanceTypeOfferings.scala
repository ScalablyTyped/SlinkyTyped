package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsArgs
import typingsSlinky.pulumiAws.getInstanceTypeOfferingsMod.GetInstanceTypeOfferingsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getInstanceTypeOfferings")
@js.native
object getInstanceTypeOfferings extends js.Object {
  
  def apply(): js.Promise[GetInstanceTypeOfferingsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingsResult] = js.native
  def apply(args: GetInstanceTypeOfferingsArgs): js.Promise[GetInstanceTypeOfferingsResult] = js.native
  def apply(args: GetInstanceTypeOfferingsArgs, opts: InvokeOptions): js.Promise[GetInstanceTypeOfferingsResult] = js.native
}
