package typingsSlinky.chessboardjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.chessboardjs.chessboardjsStrings.start
  - java.lang.String
  - typingsSlinky.chessboardjs.mod.BoardPositionType
*/
trait PositionType extends js.Object

object PositionType {
  @scala.inline
  def start: typingsSlinky.chessboardjs.chessboardjsStrings.start = "start".asInstanceOf[typingsSlinky.chessboardjs.chessboardjsStrings.start]
  @scala.inline
  implicit def apply(value: BoardPositionType): PositionType = value.asInstanceOf[PositionType]
  @scala.inline
  implicit def apply(value: String): PositionType = value.asInstanceOf[PositionType]
}

