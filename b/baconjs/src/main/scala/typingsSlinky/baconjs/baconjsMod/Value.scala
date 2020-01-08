package typingsSlinky.baconjs.baconjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "Value")
@js.native
abstract class Value[V] protected ()
  extends typingsSlinky.baconjs.typesEventMod.Value[V] {
  def this(value: V) = this()
}

