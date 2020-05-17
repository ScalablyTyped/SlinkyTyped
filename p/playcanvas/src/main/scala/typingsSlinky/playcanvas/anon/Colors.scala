package typingsSlinky.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colors extends js.Object {
  var colors: js.UndefOr[js.Array[Double]] = js.native
  var indices: js.UndefOr[js.Array[Double]] = js.native
  var normals: js.UndefOr[js.Array[Double]] = js.native
  var tangents: js.UndefOr[js.Array[Double]] = js.native
  var uvs: js.UndefOr[js.Array[Double]] = js.native
  var uvs1: js.UndefOr[js.Array[Double]] = js.native
}

object Colors {
  @scala.inline
  def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(js.undefined)
        ret
    }
    @scala.inline
    def withIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indices")(js.undefined)
        ret
    }
    @scala.inline
    def withNormals(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normals")(js.undefined)
        ret
    }
    @scala.inline
    def withTangents(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTangents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tangents")(js.undefined)
        ret
    }
    @scala.inline
    def withUvs(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUvs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvs")(js.undefined)
        ret
    }
    @scala.inline
    def withUvs1(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvs1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUvs1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uvs1")(js.undefined)
        ret
    }
  }
  
}

