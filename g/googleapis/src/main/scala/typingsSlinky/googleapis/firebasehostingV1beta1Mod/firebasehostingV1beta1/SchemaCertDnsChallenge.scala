package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a DNS certificate challenge.
  */
@js.native
trait SchemaCertDnsChallenge extends js.Object {
  /**
    * The domain name upon which the DNS challenge must be satisfied.
    */
  var domainName: js.UndefOr[String] = js.native
  /**
    * The value that must be present as a TXT record on the domain name to
    * satisfy the challenge.
    */
  var token: js.UndefOr[String] = js.native
}

object SchemaCertDnsChallenge {
  @scala.inline
  def apply(): SchemaCertDnsChallenge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertDnsChallenge]
  }
  @scala.inline
  implicit class SchemaCertDnsChallengeOps[Self <: SchemaCertDnsChallenge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDomainName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomainName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domainName")(js.undefined)
        ret
    }
    @scala.inline
    def withToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("token")(js.undefined)
        ret
    }
  }
  
}

