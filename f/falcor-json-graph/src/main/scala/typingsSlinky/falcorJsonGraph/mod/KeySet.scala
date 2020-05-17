package typingsSlinky.falcorJsonGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A part of a {@link PathSet} that can be either a {@link Key}, {@link Range}, or Array of either.
  **/
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.falcorJsonGraph.mod.Key
  - typingsSlinky.falcorJsonGraph.mod.Range
  - js.Array[typingsSlinky.falcorJsonGraph.mod.Key | typingsSlinky.falcorJsonGraph.mod.Range]
*/
trait KeySet extends js.Object

object KeySet {
  @scala.inline
  implicit def apply(value: js.Array[Key | Range]): KeySet = value.asInstanceOf[KeySet]
  @scala.inline
  implicit def apply(value: Key): KeySet = value.asInstanceOf[KeySet]
  @scala.inline
  implicit def apply(value: Range): KeySet = value.asInstanceOf[KeySet]
}

