package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getSubnetIdsMod.GetSubnetIdsArgs
import typingsSlinky.pulumiAws.getSubnetIdsMod.GetSubnetIdsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getSubnetIds")
@js.native
object getSubnetIds extends js.Object {
  
  def apply(args: GetSubnetIdsArgs): js.Promise[GetSubnetIdsResult] = js.native
  def apply(args: GetSubnetIdsArgs, opts: InvokeOptions): js.Promise[GetSubnetIdsResult] = js.native
}
