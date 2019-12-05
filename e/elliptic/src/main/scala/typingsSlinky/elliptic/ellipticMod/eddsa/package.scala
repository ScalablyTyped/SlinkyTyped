package typingsSlinky.elliptic.ellipticMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object eddsa {
  import typingsSlinky.elliptic.ellipticMod.curve.base.BasePoint
  import typingsSlinky.node.Buffer

  type Bytes = String | Buffer
  type Point = BasePoint
}
