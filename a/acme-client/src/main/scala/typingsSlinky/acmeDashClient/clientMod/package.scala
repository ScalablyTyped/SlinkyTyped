package typingsSlinky.acmeDashClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientMod {
  import typingsSlinky.acmeDashClient.cryptoForgeMod.PrivateKey
  import typingsSlinky.node.Buffer

  type AccountKey = PrivateKey
  type Certificate = String | Buffer
  type CertificateChain = String
  type ChallengeKey = String
  type UpdateAccountRequest = AccountRequest
}
