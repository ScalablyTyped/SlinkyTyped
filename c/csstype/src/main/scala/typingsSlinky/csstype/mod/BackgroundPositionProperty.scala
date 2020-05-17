package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.BgPosition[TLength]
  - java.lang.String
*/
trait BackgroundPositionProperty[TLength] extends js.Object

object BackgroundPositionProperty {
  @scala.inline
  implicit def apply[TLength](value: BgPosition[TLength]): BackgroundPositionProperty[TLength] = value.asInstanceOf[BackgroundPositionProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BackgroundPositionProperty[TLength] = value.asInstanceOf[BackgroundPositionProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BackgroundPositionProperty[TLength] = value.asInstanceOf[BackgroundPositionProperty[TLength]]
}

