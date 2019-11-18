package typingsSlinky.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  import typingsSlinky.node.NodeJS.ArrayBufferView

  type BinaryLike = java.lang.String | ArrayBufferView
  type CipherKey = BinaryLike | KeyObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.node.cryptoMod.KeyObject
  */
  type KeyLike = _KeyLike | java.lang.String
}
