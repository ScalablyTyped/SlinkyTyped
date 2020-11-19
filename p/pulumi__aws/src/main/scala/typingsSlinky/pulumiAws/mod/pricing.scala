package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getProductMod.GetProductArgs
import typingsSlinky.pulumiAws.getProductMod.GetProductResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "pricing")
@js.native
object pricing extends js.Object {
  
  def getProduct(args: GetProductArgs): js.Promise[GetProductResult] = js.native
  def getProduct(args: GetProductArgs, opts: InvokeOptions): js.Promise[GetProductResult] = js.native
}
