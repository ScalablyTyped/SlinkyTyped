package typingsSlinky.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryDescriptor[T /* <: Geometry[_] */] extends js.Object {
  var Geometry: GeometryConstructor[T] = js.native
  var schema: Schema_[js.Object] = js.native
}

object GeometryDescriptor {
  @scala.inline
  def apply[T](Geometry: GeometryConstructor[T], schema: Schema_[js.Object]): GeometryDescriptor[T] = {
    val __obj = js.Dynamic.literal(Geometry = Geometry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryDescriptor[T]]
  }
  @scala.inline
  implicit class GeometryDescriptorOps[Self[t] <: GeometryDescriptor[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withGeometry(value: GeometryConstructor[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geometry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSchema(value: Schema_[js.Object]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("schema")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

