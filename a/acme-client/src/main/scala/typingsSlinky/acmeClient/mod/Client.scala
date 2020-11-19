package typingsSlinky.acmeClient.mod

import typingsSlinky.acmeClient.rfc8555Mod.Account
import typingsSlinky.acmeClient.rfc8555Mod.AccountCreateRequest
import typingsSlinky.acmeClient.rfc8555Mod.AccountUpdateRequest
import typingsSlinky.acmeClient.rfc8555Mod.CertificateRevocationRequest
import typingsSlinky.acmeClient.rfc8555Mod.Challenge
import typingsSlinky.acmeClient.rfc8555Mod.OrderCreateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("acme-client", "Client")
@js.native
class Client protected () extends js.Object {
  def this(opts: ClientOptions) = this()
  
  def auto(opts: ClientAutoOptions): js.Promise[String] = js.native
  
  def completeChallenge(challenge: Challenge): js.Promise[Challenge] = js.native
  
  def createAccount(): js.Promise[Account] = js.native
  def createAccount(data: AccountCreateRequest): js.Promise[Account] = js.native
  
  def createOrder(data: OrderCreateRequest): js.Promise[Order] = js.native
  
  def deactivateAuthorization(authz: Authorization): js.Promise[Authorization] = js.native
  
  def finalizeOrder(order: Order, csr: CsrBuffer): js.Promise[Order] = js.native
  def finalizeOrder(order: Order, csr: CsrString): js.Promise[Order] = js.native
  
  def getAccountUrl(): String = js.native
  
  def getAuthorizations(order: Order): js.Promise[js.Array[Authorization]] = js.native
  
  def getCertificate(order: Order): js.Promise[String] = js.native
  
  def getChallengeKeyAuthorization(challenge: Challenge): js.Promise[String] = js.native
  
  def getTermsOfServiceUrl(): js.Promise[String] = js.native
  
  def revokeCertificate(cert: CertificateBuffer): js.Promise[Unit] = js.native
  def revokeCertificate(cert: CertificateBuffer, data: CertificateRevocationRequest): js.Promise[Unit] = js.native
  def revokeCertificate(cert: CertificateString): js.Promise[Unit] = js.native
  def revokeCertificate(cert: CertificateString, data: CertificateRevocationRequest): js.Promise[Unit] = js.native
  
  def updateAccount(): js.Promise[Account] = js.native
  def updateAccount(data: AccountUpdateRequest): js.Promise[Account] = js.native
  
  def updateAccountKey(newAccountKey: PrivateKeyBuffer): js.Promise[Account] = js.native
  def updateAccountKey(newAccountKey: PrivateKeyBuffer, data: js.Object): js.Promise[Account] = js.native
  def updateAccountKey(newAccountKey: PrivateKeyString): js.Promise[Account] = js.native
  def updateAccountKey(newAccountKey: PrivateKeyString, data: js.Object): js.Promise[Account] = js.native
  
  def verifyChallenge(authz: Authorization, challenge: Challenge): js.Promise[Boolean] = js.native
  
  def waitForValidStatus[T](item: T): js.Promise[T] = js.native
}
