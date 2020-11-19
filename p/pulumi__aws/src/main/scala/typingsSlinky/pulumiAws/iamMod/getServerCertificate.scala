package typingsSlinky.pulumiAws.iamMod

import typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateArgs
import typingsSlinky.pulumiAws.getServerCertificateMod.GetServerCertificateResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/iam", "getServerCertificate")
@js.native
object getServerCertificate extends js.Object {
  
  def apply(): js.Promise[GetServerCertificateResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServerCertificateResult] = js.native
  def apply(args: GetServerCertificateArgs): js.Promise[GetServerCertificateResult] = js.native
  def apply(args: GetServerCertificateArgs, opts: InvokeOptions): js.Promise[GetServerCertificateResult] = js.native
}
