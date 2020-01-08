package typingsSlinky.atPulumiAws.atPulumiAwsMod

import typingsSlinky.atPulumiAws.pricingGetProductMod.GetProductArgs
import typingsSlinky.atPulumiAws.pricingGetProductMod.GetProductResult
import typingsSlinky.atPulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "pricing")
@js.native
object pricing extends js.Object {
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] with GetProductResult = js.native
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] with GetProductResult = js.native
}

