package typingsSlinky.pulumiAws.mod.iam

import typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentArgs
import typingsSlinky.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "iam.getPolicyDocument")
@js.native
object getPolicyDocument extends js.Object {
  def apply(): js.Promise[GetPolicyDocumentResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetPolicyDocumentResult] = js.native
  def apply(args: GetPolicyDocumentArgs): js.Promise[GetPolicyDocumentResult] = js.native
  def apply(args: GetPolicyDocumentArgs, opts: InvokeOptions): js.Promise[GetPolicyDocumentResult] = js.native
}

