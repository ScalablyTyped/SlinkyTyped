package typingsSlinky.idyll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object idyllMod {
  import typingsSlinky.std.Record

  type Paths = (Record[PredefinedFile, String]) with (Record[ComponentFiles, js.Array[String]])
}
