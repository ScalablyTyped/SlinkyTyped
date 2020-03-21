package typingsSlinky.imagemin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Plugin = js.Function1[/* input */ typingsSlinky.node.Buffer, js.Promise[typingsSlinky.node.Buffer]]
}
