package typingsSlinky.appBuilderLib.macCodeSignMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("app-builder-lib/out/codeSign/macCodeSign", "findIdentity")
@js.native
object findIdentity extends js.Object {
  
  def apply(certType: CertType): js.Promise[Identity | Null] = js.native
  def apply(certType: CertType, qualifier: js.UndefOr[scala.Nothing], keychain: String): js.Promise[Identity | Null] = js.native
  def apply(certType: CertType, qualifier: String): js.Promise[Identity | Null] = js.native
  def apply(certType: CertType, qualifier: String, keychain: String): js.Promise[Identity | Null] = js.native
  def apply(certType: CertType, qualifier: Null, keychain: String): js.Promise[Identity | Null] = js.native
}
