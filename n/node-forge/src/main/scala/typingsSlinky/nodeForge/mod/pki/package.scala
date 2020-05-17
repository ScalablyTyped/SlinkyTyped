package typingsSlinky.nodeForge.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pki {
  type PEM = java.lang.String
  type oids = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type setRsaPublicKey = js.Function2[
    /* n */ typingsSlinky.nodeForge.mod.jsbn.BigInteger, 
    /* e */ typingsSlinky.nodeForge.mod.jsbn.BigInteger, 
    typingsSlinky.nodeForge.mod.pki.rsa.PublicKey
  ]
}
