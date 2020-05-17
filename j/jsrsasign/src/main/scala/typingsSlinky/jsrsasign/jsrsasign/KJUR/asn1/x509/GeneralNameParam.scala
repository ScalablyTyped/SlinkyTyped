package typingsSlinky.jsrsasign.jsrsasign.KJUR.asn1.x509

import typingsSlinky.jsrsasign.anon.CertissuerString
import typingsSlinky.jsrsasign.anon.Certsubj
import typingsSlinky.jsrsasign.anon.Dn
import typingsSlinky.jsrsasign.anon.Dns
import typingsSlinky.jsrsasign.anon.Ldapdn
import typingsSlinky.jsrsasign.anon.Rfc822
import typingsSlinky.jsrsasign.anon.UriString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jsrsasign.anon.Rfc822
  - typingsSlinky.jsrsasign.anon.Dns
  - typingsSlinky.jsrsasign.anon.UriString
  - typingsSlinky.jsrsasign.anon.Dn
  - typingsSlinky.jsrsasign.anon.Ldapdn
  - typingsSlinky.jsrsasign.anon.CertissuerString
  - typingsSlinky.jsrsasign.anon.Certsubj
*/
trait GeneralNameParam extends js.Object

object GeneralNameParam {
  @scala.inline
  implicit def apply(value: CertissuerString): GeneralNameParam = value.asInstanceOf[GeneralNameParam]
  @scala.inline
  implicit def apply(value: Certsubj): GeneralNameParam = value.asInstanceOf[GeneralNameParam]
  @scala.inline
  implicit def apply(value: Dn): GeneralNameParam = value.asInstanceOf[GeneralNameParam]
  @scala.inline
  implicit def apply(value: Dns): GeneralNameParam = value.asInstanceOf[GeneralNameParam]
  @scala.inline
  implicit def apply(value: Ldapdn): GeneralNameParam = value.asInstanceOf[GeneralNameParam]
  @scala.inline
  implicit def apply(value: Rfc822): GeneralNameParam = value.asInstanceOf[GeneralNameParam]
  @scala.inline
  implicit def apply(value: UriString): GeneralNameParam = value.asInstanceOf[GeneralNameParam]
}

