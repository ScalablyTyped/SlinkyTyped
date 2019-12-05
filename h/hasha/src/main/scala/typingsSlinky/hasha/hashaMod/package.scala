package typingsSlinky.hasha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hashaMod {
  import typingsSlinky.hasha.hashaStrings.md5
  import typingsSlinky.hasha.hashaStrings.sha1
  import typingsSlinky.hasha.hashaStrings.sha256
  import typingsSlinky.hasha.hashaStrings.sha512
  import typingsSlinky.node.Buffer
  import typingsSlinky.typeDashFest.typeDashFestMod.LiteralUnion

  type AlgorithmName = LiteralUnion[md5 | sha1 | sha256 | sha512, String]
  type HashaInput = Buffer | String | (js.Array[Buffer | String])
}
