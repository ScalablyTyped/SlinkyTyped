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
trait MarginBottomProperty[TLength] extends js.Object

object MarginBottomProperty {
  @scala.inline
  def auto[TLength]: typingsSlinky.csstype.csstypeStrings.auto = "auto".asInstanceOf[typingsSlinky.csstype.csstypeStrings.auto]
  @scala.inline
  implicit def apply[TLength](value: Globals): MarginBottomProperty[TLength] = value.asInstanceOf[MarginBottomProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: String): MarginBottomProperty[TLength] = value.asInstanceOf[MarginBottomProperty[TLength]]
  @scala.inline
  implicit def apply[TLength](value: TLength): MarginBottomProperty[TLength] = value.asInstanceOf[MarginBottomProperty[TLength]]
}

