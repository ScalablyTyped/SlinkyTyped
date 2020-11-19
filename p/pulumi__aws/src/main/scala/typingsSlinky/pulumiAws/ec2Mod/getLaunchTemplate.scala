package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateArgs
import typingsSlinky.pulumiAws.getLaunchTemplateMod.GetLaunchTemplateResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getLaunchTemplate")
@js.native
object getLaunchTemplate extends js.Object {
  
  def apply(): js.Promise[GetLaunchTemplateResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetLaunchTemplateResult] = js.native
  def apply(args: GetLaunchTemplateArgs): js.Promise[GetLaunchTemplateResult] = js.native
  def apply(args: GetLaunchTemplateArgs, opts: InvokeOptions): js.Promise[GetLaunchTemplateResult] = js.native
}
