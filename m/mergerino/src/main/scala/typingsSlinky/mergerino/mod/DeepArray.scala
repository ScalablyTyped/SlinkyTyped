package typingsSlinky.mergerino.mod

import typingsSlinky.std.ReadonlyArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepArray[T]
  extends ReadonlyArray[T | DeepArray[T]]
     with MultipleTopLevelPatch[js.Any]

