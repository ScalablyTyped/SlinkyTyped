package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getSpotPriceMod.GetSpotPriceArgs
import typingsSlinky.pulumiAws.getSpotPriceMod.GetSpotPriceResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getSpotPrice")
@js.native
object getSpotPrice extends js.Object {
  
  def apply(): js.Promise[GetSpotPriceResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSpotPriceResult] = js.native
  def apply(args: GetSpotPriceArgs): js.Promise[GetSpotPriceResult] = js.native
  def apply(args: GetSpotPriceArgs, opts: InvokeOptions): js.Promise[GetSpotPriceResult] = js.native
}
