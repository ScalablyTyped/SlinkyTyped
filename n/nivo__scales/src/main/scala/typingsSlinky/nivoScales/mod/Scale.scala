package typingsSlinky.nivoScales.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nivoScales.mod.LinearScale
  - typingsSlinky.nivoScales.mod.PointScale
  - typingsSlinky.nivoScales.mod.TimeScale
  - typingsSlinky.nivoScales.mod.LogScale
*/
trait Scale extends js.Object

object Scale {
  @scala.inline
  implicit def apply(value: LinearScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: LogScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: PointScale): Scale = value.asInstanceOf[Scale]
  @scala.inline
  implicit def apply(value: TimeScale): Scale = value.asInstanceOf[Scale]
}

