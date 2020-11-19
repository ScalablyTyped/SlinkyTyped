package typingsSlinky.pulumiAws.ec2Mod

import typingsSlinky.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationArgs
import typingsSlinky.pulumiAws.getLaunchConfigurationMod.GetLaunchConfigurationResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/ec2", "getLaunchConfiguration")
@js.native
object getLaunchConfiguration extends js.Object {
  
  def apply(args: GetLaunchConfigurationArgs): js.Promise[GetLaunchConfigurationResult] = js.native
  def apply(args: GetLaunchConfigurationArgs, opts: InvokeOptions): js.Promise[GetLaunchConfigurationResult] = js.native
}
