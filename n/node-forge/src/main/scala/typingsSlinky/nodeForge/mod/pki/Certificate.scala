package typingsSlinky.nodeForge.mod.pki

import typingsSlinky.nodeForge.anon.AddField
import typingsSlinky.nodeForge.anon.Id
import typingsSlinky.nodeForge.anon.Name
import typingsSlinky.nodeForge.anon.NotAfter
import typingsSlinky.nodeForge.mod.md.MessageDigest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certificate extends js.Object {
  
  var extensions: js.Array[_] = js.native
  
  /**
    * Gets an issuer or subject attribute from its name, type, or short name.
    *
    * @param options a short name string or an object with:
    *          shortName the short name for the attribute.
    *          name the name for the attribute.
    *          type the type for the attribute.
    *
    * @return the attribute.
    */
  def getAttribute(opts: String): Attribute | Null = js.native
  def getAttribute(opts: GetAttributeOpts): Attribute | Null = js.native
  
  /**
    * Gets an extension by its name or id.
    *
    * @param options the name to use or an object with:
    *          name the name to use.
    *          id the id to use.
    *
    * @return the extension or null if not found.
    */
  def getExtension(options: String): js.UndefOr[js.Object] = js.native
  def getExtension(options: Id): js.UndefOr[js.Object] = js.native
  def getExtension(options: Name): js.UndefOr[js.Object] = js.native
  
  var issuer: AddField = js.native
  
  var md: js.Any = js.native
  
  var privateKey: PrivateKey = js.native
  
  var publicKey: PublicKey = js.native
  
  var serialNumber: String = js.native
  
  /**
    * Sets the extensions of this certificate.
    *
    * @param exts the array of extensions to use.
    */
  def setExtensions(exts: js.Array[_]): Unit = js.native
  
  /**
    * Sets the issuer of this certificate.
    *
    * @param attrs the array of subject attributes to use.
    * @param uniqueId an optional a unique ID to use.
    */
  def setIssuer(attrs: js.Array[CertificateField]): Unit = js.native
  def setIssuer(attrs: js.Array[CertificateField], uniqueId: String): Unit = js.native
  
  /**
    * Sets the subject of this certificate.
    *
    * @param attrs the array of subject attributes to use.
    * @param uniqueId an optional a unique ID to use.
    */
  def setSubject(attrs: js.Array[CertificateField]): Unit = js.native
  def setSubject(attrs: js.Array[CertificateField], uniqueId: String): Unit = js.native
  
  var siginfo: js.Any = js.native
  
  /**
    * Signs this certificate using the given private key.
    *
    * @param key the private key to sign with.
    * @param md the message digest object to use (defaults to forge.md.sha1).
    */
  def sign(key: PrivateKey): Unit = js.native
  def sign(key: PrivateKey, md: MessageDigest): Unit = js.native
  
  var signature: js.Any = js.native
  
  var subject: AddField = js.native
  
  var validity: NotAfter = js.native
  
  /**
    * Attempts verify the signature on the passed certificate using this
    * certificate's public key.
    *
    * @param child the certificate to verify.
    *
    * @return true if verified, false if not.
    */
  def verify(child: Certificate): Boolean = js.native
  
  var version: Double = js.native
}
