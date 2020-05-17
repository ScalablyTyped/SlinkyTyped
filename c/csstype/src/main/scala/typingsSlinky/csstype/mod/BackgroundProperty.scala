package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - typingsSlinky.csstype.mod.FinalBgLayer[TLength]
  - java.lang.String
*/
trait BackgroundProperty[TLength] extends js.Object

object BackgroundProperty {
  @scala.inline
  implicit def apply[TLength](value: FinalBgLayer[TLength]): BackgroundProperty[TLength] = value.asInstanceOf[BackgroundProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: Globals): BackgroundProperty[TLength] = value.asInstanceOf[BackgroundProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BackgroundProperty[TLength] = value.asInstanceOf[BackgroundProperty[TLength]]
}

