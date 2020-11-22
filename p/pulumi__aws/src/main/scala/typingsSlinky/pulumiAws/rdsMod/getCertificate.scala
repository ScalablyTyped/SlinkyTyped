package typingsSlinky.pulumiAws.rdsMod

import typingsSlinky.pulumiAws.rdsGetCertificateMod.GetCertificateArgs
import typingsSlinky.pulumiAws.rdsGetCertificateMod.GetCertificateResult
import typingsSlinky.pulumiPulumi.invokeMod.InvokeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/rds", "getCertificate")
@js.native
object getCertificate extends js.Object {
  
  def apply(): js.Promise[GetCertificateResult] = js.native
  def apply(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetCertificateResult] = js.native
  def apply(args: GetCertificateArgs): js.Promise[GetCertificateResult] = js.native
  def apply(args: GetCertificateArgs, opts: InvokeOptions): js.Promise[GetCertificateResult] = js.native
}
