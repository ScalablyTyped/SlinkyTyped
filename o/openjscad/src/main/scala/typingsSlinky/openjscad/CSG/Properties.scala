package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Properties extends js.Object {
  var center: js.Any = js.native
  var cube: Properties = js.native
  var cylinder: Properties = js.native
  var end: js.Any = js.native
  var facecenters: js.Array[_] = js.native
  var facepoint: js.Any = js.native
  var facepointH: js.Any = js.native
  var facepointH90: js.Any = js.native
  var roundedCube: Properties = js.native
  var roundedCylinder: js.Any = js.native
  var sphere: Properties = js.native
  var start: js.Any = js.native
  def _merge(otherproperties: Properties): Properties = js.native
  def _transform(matrix4x4: Matrix4x4): Properties = js.native
}

object Properties {
  @scala.inline
  def apply(
    _merge: Properties => Properties,
    _transform: Matrix4x4 => Properties,
    center: js.Any,
    cube: Properties,
    cylinder: Properties,
    end: js.Any,
    facecenters: js.Array[_],
    facepoint: js.Any,
    facepointH: js.Any,
    facepointH90: js.Any,
    roundedCube: Properties,
    roundedCylinder: js.Any,
    sphere: Properties,
    start: js.Any
  ): Properties = {
    val __obj = js.Dynamic.literal(_merge = js.Any.fromFunction1(_merge), _transform = js.Any.fromFunction1(_transform), center = center.asInstanceOf[js.Any], cube = cube.asInstanceOf[js.Any], cylinder = cylinder.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], facecenters = facecenters.asInstanceOf[js.Any], facepoint = facepoint.asInstanceOf[js.Any], facepointH = facepointH.asInstanceOf[js.Any], facepointH90 = facepointH90.asInstanceOf[js.Any], roundedCube = roundedCube.asInstanceOf[js.Any], roundedCylinder = roundedCylinder.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Properties]
  }
  @scala.inline
  implicit class PropertiesOps[Self <: Properties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_merge(value: Properties => Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_merge")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def with_transform(value: Matrix4x4 => Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCenter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCube(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCylinder(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cylinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacecenters(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facecenters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacepoint(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facepoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacepointH(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facepointH")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacepointH90(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("facepointH90")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundedCube(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedCube")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoundedCylinder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roundedCylinder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSphere(value: Properties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sphere")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

