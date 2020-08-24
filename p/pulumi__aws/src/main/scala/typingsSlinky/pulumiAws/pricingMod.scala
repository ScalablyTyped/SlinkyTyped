package typingsSlinky.pulumiAws

import typingsSlinky.pulumiAws.getProductMod.GetProductArgs
import typingsSlinky.pulumiAws.getProductMod.GetProductResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pricing", JSImport.Namespace)
@js.native
object pricingMod extends js.Object {
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] = js.native
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] = js.native
}

