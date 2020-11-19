package typingsSlinky.devcert

import typingsSlinky.devcert.anon.CaCertPath
import typingsSlinky.devcert.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devcert/dist/certificate-authority", JSImport.Namespace)
@js.native
object certificateAuthorityMod extends js.Object {
  
  def default(): js.Promise[Unit] = js.native
  def default(options: Options): js.Promise[Unit] = js.native
  
  def ensureCACertReadable(): js.Promise[Unit] = js.native
  def ensureCACertReadable(options: Options): js.Promise[Unit] = js.native
  
  def uninstall(): Unit = js.native
  
  def withCertificateAuthorityCredentials(cb: js.Function1[/* hasCaKeyPathCaCertPath */ CaCertPath, js.Promise[Unit] | Unit]): js.Promise[Unit] = js.native
}
