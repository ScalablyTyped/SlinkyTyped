package typingsSlinky.pulumiAws.mod

import typingsSlinky.pulumiAws.getAmiIdsMod.GetAmiIdsArgs
import typingsSlinky.pulumiAws.getAmiIdsMod.GetAmiIdsResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "getAmiIds")
@js.native
object getAmiIds extends js.Object {
  def apply(args: GetAmiIdsArgs): js.Promise[GetAmiIdsResult] with GetAmiIdsResult = js.native
  def apply(args: GetAmiIdsArgs, opts: InvokeOptions): js.Promise[GetAmiIdsResult] with GetAmiIdsResult = js.native
}

