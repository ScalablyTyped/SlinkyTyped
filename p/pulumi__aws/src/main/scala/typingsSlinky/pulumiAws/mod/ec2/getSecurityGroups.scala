package typingsSlinky.pulumiAws.mod.ec2

import typingsSlinky.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsArgs
import typingsSlinky.pulumiAws.getSecurityGroupsMod.GetSecurityGroupsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "ec2.getSecurityGroups")
@js.native
object getSecurityGroups extends js.Object {
  
  def apply(): js.Promise[GetSecurityGroupsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetSecurityGroupsResult] = js.native
  def apply(args: GetSecurityGroupsArgs): js.Promise[GetSecurityGroupsResult] = js.native
  def apply(args: GetSecurityGroupsArgs, opts: InvokeOptions): js.Promise[GetSecurityGroupsResult] = js.native
}
