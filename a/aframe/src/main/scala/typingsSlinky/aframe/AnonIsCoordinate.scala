package typingsSlinky.aframe

import typingsSlinky.aframe.mod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIsCoordinate extends js.Object {
  def isCoordinate(value: String): Boolean = js.native
  def parse(value: String): Coordinate = js.native
  def stringify(coord: Coordinate): String = js.native
}

object AnonIsCoordinate {
  @scala.inline
  def apply(isCoordinate: String => Boolean, parse: String => Coordinate, stringify: Coordinate => String): AnonIsCoordinate = {
    val __obj = js.Dynamic.literal(isCoordinate = js.Any.fromFunction1(isCoordinate), parse = js.Any.fromFunction1(parse), stringify = js.Any.fromFunction1(stringify))
    __obj.asInstanceOf[AnonIsCoordinate]
  }
  @scala.inline
  implicit class AnonIsCoordinateOps[Self <: AnonIsCoordinate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsCoordinate(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCoordinate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withParse(value: String => Coordinate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStringify(value: Coordinate => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringify")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

