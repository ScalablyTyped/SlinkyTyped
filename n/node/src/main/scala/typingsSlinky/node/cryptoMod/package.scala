package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type BinaryLike = java.lang.String | typingsSlinky.node.NodeJS.ArrayBufferView
  type CipherKey = typingsSlinky.node.cryptoMod.BinaryLike | typingsSlinky.node.cryptoMod.KeyObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.node.Buffer
    - typingsSlinky.node.cryptoMod.KeyObject
  */
  type KeyLike = typingsSlinky.node.cryptoMod._KeyLike | java.lang.String
}
