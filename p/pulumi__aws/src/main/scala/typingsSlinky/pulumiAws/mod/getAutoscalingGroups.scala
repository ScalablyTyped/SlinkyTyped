package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsArgs
import typingsSlinky.pulumiAws.getAutoscalingGroupsMod.GetAutoscalingGroupsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws", "getAutoscalingGroups")
@js.native
object getAutoscalingGroups extends js.Object {
  
  def apply(): js.Promise[GetAutoscalingGroupsResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] = js.native
  def apply(args: GetAutoscalingGroupsArgs): js.Promise[GetAutoscalingGroupsResult] = js.native
  def apply(args: GetAutoscalingGroupsArgs, opts: InvokeOptions): js.Promise[GetAutoscalingGroupsResult] = js.native
}
