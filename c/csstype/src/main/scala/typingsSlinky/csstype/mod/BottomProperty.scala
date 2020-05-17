package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.csstype.mod.Globals
  - TLength
  - typingsSlinky.csstype.csstypeStrings.auto
  - java.lang.String
*/
trait BottomProperty[TLength] extends js.Object

object BottomProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): BottomProperty[TLength] = value.asInstanceOf[BottomProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): BottomProperty[TLength] = value.asInstanceOf[BottomProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): BottomProperty[TLength] = value.asInstanceOf[BottomProperty[TLength]]
}

