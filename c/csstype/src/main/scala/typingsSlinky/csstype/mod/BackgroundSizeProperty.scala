package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.BgSize[TLength]
  - java.lang.String
*/
trait BackgroundSizeProperty[TLength] extends js.Object

object BackgroundSizeProperty {
  @scala.inline
  implicit def apply[TLength](value: BgSize[TLength]): BackgroundSizeProperty[TLength] = value.asInstanceOf[BackgroundSizeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BackgroundSizeProperty[TLength] = value.asInstanceOf[BackgroundSizeProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BackgroundSizeProperty[TLength] = value.asInstanceOf[BackgroundSizeProperty[TLength]]
}

