package typingsSlinky.jointjs.mod.dia.Element

import typingsSlinky.jointjs.anon.Groups
import typingsSlinky.jointjs.mod.dia.MarkupJSON
import typingsSlinky.jointjs.mod.dia.Point
import typingsSlinky.jointjs.mod.dia.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenericAttributes[T]
  extends typingsSlinky.jointjs.mod.dia.Cell.GenericAttributes[T] {
  var angle: js.UndefOr[Double] = js.native
  var markup: js.UndefOr[String | MarkupJSON] = js.native
  var ports: js.UndefOr[Groups] = js.native
  var position: js.UndefOr[Point] = js.native
  var size: js.UndefOr[Size] = js.native
}

object GenericAttributes {
  @scala.inline
  def apply[T](): GenericAttributes[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenericAttributes[T]]
  }
  @scala.inline
  implicit class GenericAttributesOps[Self[t] <: GenericAttributes[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAngle(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAngle: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("angle")(js.undefined)
        ret
    }
    @scala.inline
    def withMarkup(value: String | MarkupJSON): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarkup: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("markup")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: Groups): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: Point): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Size): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

