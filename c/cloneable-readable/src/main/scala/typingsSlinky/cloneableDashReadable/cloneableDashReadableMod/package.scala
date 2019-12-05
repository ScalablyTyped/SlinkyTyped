package typingsSlinky.cloneableDashReadable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cloneableDashReadableMod {
  import typingsSlinky.cloneableDashReadable.Anon_Clone
  import typingsSlinky.node.streamMod.Readable

  type Cloneable[T /* <: Readable */] = T with Anon_Clone
}
