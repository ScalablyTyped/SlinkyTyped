package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getSecurityGroupMod.GetSecurityGroupArgs
import typingsSlinky.pulumiAws.getSecurityGroupMod.GetSecurityGroupResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2", "getSecurityGroup")
@js.native
object getSecurityGroup extends js.Object {
  def apply(): js.Promise[GetSecurityGroupResult] with GetSecurityGroupResult = js.native
  def apply(args: GetSecurityGroupArgs): js.Promise[GetSecurityGroupResult] with GetSecurityGroupResult = js.native
  def apply(args: GetSecurityGroupArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupResult] with GetSecurityGroupResult = js.native
}

