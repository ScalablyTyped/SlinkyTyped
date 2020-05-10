package typingsSlinky.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityDetails extends js.Object {
  /** A string with the name of issuer of the certificate. (e.g. "Let's Encrypt Authority X3"). */
  def issuer(): String = js.native
  /** String with the security protocol (e.g. TLS 1.2). */
  def protocol(): String = js.native
  /** Name of the subject to which the certificate was issued to (e.g. "www.example.com"). */
  def subjectName(): String = js.native
  /** Timestamp stating the start of validity of the certificate. */
  def validFrom(): Double = js.native
  /** Timestamp stating the end of validity of the certificate. */
  def validTo(): Double = js.native
}

object SecurityDetails {
  @scala.inline
  def apply(
    issuer: () => String,
    protocol: () => String,
    subjectName: () => String,
    validFrom: () => Double,
    validTo: () => Double
  ): SecurityDetails = {
    val __obj = js.Dynamic.literal(issuer = js.Any.fromFunction0(issuer), protocol = js.Any.fromFunction0(protocol), subjectName = js.Any.fromFunction0(subjectName), validFrom = js.Any.fromFunction0(validFrom), validTo = js.Any.fromFunction0(validTo))
    __obj.asInstanceOf[SecurityDetails]
  }
  @scala.inline
  implicit class SecurityDetailsOps[Self <: SecurityDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIssuer(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProtocol(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSubjectName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidFrom(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validFrom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withValidTo(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validTo")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

