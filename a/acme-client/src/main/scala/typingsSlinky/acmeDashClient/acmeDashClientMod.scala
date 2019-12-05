package typingsSlinky.acmeDashClient

import typingsSlinky.acmeDashClient.clientMod.Options
import typingsSlinky.acmeDashClient.clientMod.default
import typingsSlinky.acmeDashClient.cryptoForgeMod.Csr
import typingsSlinky.acmeDashClient.cryptoForgeMod.CsrOptions
import typingsSlinky.acmeDashClient.cryptoForgeMod.PrivateKey
import typingsSlinky.axios.axiosMod.AxiosInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("acme-client", JSImport.Namespace)
@js.native
object acmeDashClientMod extends js.Object {
  @js.native
  class Client protected () extends default {
    def this(opts: Options) = this()
  }
  
  val axios: AxiosInstance = js.native
  @js.native
  object RevocationReason extends js.Object {
    /* 10 */ val AACompromise: typingsSlinky.acmeDashClient.clientMod.RevocationReason.AACompromise with Double = js.native
    /* 3 */ val AffiliationChanged: typingsSlinky.acmeDashClient.clientMod.RevocationReason.AffiliationChanged with Double = js.native
    /* 2 */ val CACompromise: typingsSlinky.acmeDashClient.clientMod.RevocationReason.CACompromise with Double = js.native
    /* 6 */ val CertificateHold: typingsSlinky.acmeDashClient.clientMod.RevocationReason.CertificateHold with Double = js.native
    /* 5 */ val CessationOfOperation: typingsSlinky.acmeDashClient.clientMod.RevocationReason.CessationOfOperation with Double = js.native
    /* 1 */ val KeyCompromise: typingsSlinky.acmeDashClient.clientMod.RevocationReason.KeyCompromise with Double = js.native
    /* 9 */ val PrivilegeWithdrawn: typingsSlinky.acmeDashClient.clientMod.RevocationReason.PrivilegeWithdrawn with Double = js.native
    /* 8 */ val RemoveFromCRL: typingsSlinky.acmeDashClient.clientMod.RevocationReason.RemoveFromCRL with Double = js.native
    /* 4 */ val Supersedeed: typingsSlinky.acmeDashClient.clientMod.RevocationReason.Supersedeed with Double = js.native
    /* 0 */ val Unspecified: typingsSlinky.acmeDashClient.clientMod.RevocationReason.Unspecified with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.acmeDashClient.clientMod.RevocationReason with Double] = js.native
  }
  
  @js.native
  object directory extends js.Object {
    var letsencrypt: Anon_Production = js.native
  }
  
  @js.native
  object forge extends js.Object {
    def createCsr(data: CsrOptions): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
    def createCsr(data: CsrOptions, key: PrivateKey): js.Promise[js.Tuple2[PrivateKey, Csr]] = js.native
    def createPrivateKey(): js.Promise[PrivateKey] = js.native
    def createPrivateKey(size: Double): js.Promise[PrivateKey] = js.native
  }
  
}

