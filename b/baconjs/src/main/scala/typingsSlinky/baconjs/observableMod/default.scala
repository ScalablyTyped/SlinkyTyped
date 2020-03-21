package typingsSlinky.baconjs.observableMod

import typingsSlinky.baconjs.describeMod.Desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/observable", JSImport.Default)
@js.native
abstract class default[V] protected () extends Observable[V] {
  def this(desc: Desc) = this()
}

