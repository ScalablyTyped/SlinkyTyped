package typingsSlinky.baconjs

import typingsSlinky.baconjs.describeMod.Desc
import typingsSlinky.baconjs.observableMod.Property
import typingsSlinky.baconjs.typesMod.EventStreamDelay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs/types/internal/transformpropertychanges", JSImport.Namespace)
@js.native
object transformpropertychangesMod extends js.Object {
  def default[V](property: Property[V], f: EventStreamDelay[V], desc: Desc): Property[V] = js.native
}

