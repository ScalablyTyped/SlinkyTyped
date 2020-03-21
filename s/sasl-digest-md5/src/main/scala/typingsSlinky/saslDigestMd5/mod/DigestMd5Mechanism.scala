package typingsSlinky.saslDigestMd5.mod

import typingsSlinky.saslDigestMd5.saslDigestMd5Booleans.`false`
import typingsSlinky.saslDigestMd5.saslDigestMd5Strings.`DIGEST-MD5`
import typingsSlinky.saslmechanisms.mod.Mechanism
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DigestMd5Mechanism extends Mechanism {
  var clientFirst: `false`
  @JSName("name")
  var name_DigestMd5Mechanism: `DIGEST-MD5`
  def response(cred: Credentials): String
}

object DigestMd5Mechanism {
  @scala.inline
  def apply(
    challenge: String => Unit,
    clientFirst: `false`,
    name: `DIGEST-MD5`,
    response: Credentials => String
  ): DigestMd5Mechanism = {
    val __obj = js.Dynamic.literal(challenge = js.Any.fromFunction1(challenge), clientFirst = clientFirst.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], response = js.Any.fromFunction1(response))
  
    __obj.asInstanceOf[DigestMd5Mechanism]
  }
}

