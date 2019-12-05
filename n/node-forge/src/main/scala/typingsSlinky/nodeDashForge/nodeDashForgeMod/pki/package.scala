package typingsSlinky.nodeDashForge.nodeDashForgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pki {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.nodeDashForge.nodeDashForgeMod.jsbn.BigInteger
  import typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.ed25519.Key

  type PEM = String
  type PrivateKey = typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.PrivateKey | Key
  type PublicKey = typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.PublicKey | Key
  type oids = StringDictionary[String]
  type setRsaPublicKey = js.Function2[
    /* n */ BigInteger, 
    /* e */ BigInteger, 
    typingsSlinky.nodeDashForge.nodeDashForgeMod.pki.rsa.PublicKey
  ]
}
