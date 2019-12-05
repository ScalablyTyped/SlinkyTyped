package typingsSlinky.baconjs

import typingsSlinky.baconjs.typesObservableMod.EventStream
import typingsSlinky.baconjs.typesObservableMod.Property
import typingsSlinky.baconjs.typesObservableMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/holdwhen", JSImport.Namespace)
@js.native
object typesHoldwhenMod extends js.Object {
  def holdWhen[V](src: default[V], valve: Property[Boolean]): EventStream[V] = js.native
}

