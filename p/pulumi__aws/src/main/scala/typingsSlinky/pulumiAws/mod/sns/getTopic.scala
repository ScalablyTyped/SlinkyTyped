package typingsSlinky.pulumiAws.mod.sns

import typingsSlinky.pulumiAws.getTopicMod.GetTopicArgs
import typingsSlinky.pulumiAws.getTopicMod.GetTopicResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "sns.getTopic")
@js.native
object getTopic extends js.Object {
  def apply(args: GetTopicArgs): js.Promise[GetTopicResult] = js.native
  def apply(args: GetTopicArgs, opts: InvokeOptions): js.Promise[GetTopicResult] = js.native
}

