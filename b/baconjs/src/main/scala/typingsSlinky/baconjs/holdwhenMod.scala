package typingsSlinky.baconjs

import typingsSlinky.baconjs.observableMod.EventStream
import typingsSlinky.baconjs.observableMod.Property
import typingsSlinky.baconjs.observableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/holdwhen", JSImport.Namespace)
@js.native
object holdwhenMod extends js.Object {
  def holdWhen[V](src: default[V], valve: Property[Boolean]): EventStream[V] = js.native
}

