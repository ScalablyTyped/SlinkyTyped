package typingsSlinky.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreationDataStorage extends js.Object {
  var arc: Double = js.native
  var cap: Double = js.native
  var closeArray: js.UndefOr[Boolean] = js.native
  var closePath: js.UndefOr[Boolean] = js.native
  var dashSize: Double = js.native
  var gapSize: Double = js.native
  var idx: js.Array[Double] = js.native
  var path3D: Path3D = js.native
  var pathArray: js.Array[js.Array[Vector3]] = js.native
  var radius: Double = js.native
  var tessellation: Double = js.native
}

object CreationDataStorage {
  @scala.inline
  def apply(
    arc: Double,
    cap: Double,
    dashSize: Double,
    gapSize: Double,
    idx: js.Array[Double],
    path3D: Path3D,
    pathArray: js.Array[js.Array[Vector3]],
    radius: Double,
    tessellation: Double
  ): CreationDataStorage = {
    val __obj = js.Dynamic.literal(arc = arc.asInstanceOf[js.Any], cap = cap.asInstanceOf[js.Any], dashSize = dashSize.asInstanceOf[js.Any], gapSize = gapSize.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], path3D = path3D.asInstanceOf[js.Any], pathArray = pathArray.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], tessellation = tessellation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreationDataStorage]
  }
  @scala.inline
  implicit class CreationDataStorageOps[Self <: CreationDataStorage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArc(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGapSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gapSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIdx(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath3D(value: Path3D): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path3D")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathArray(value: js.Array[js.Array[Vector3]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTessellation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tessellation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCloseArray(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeArray")(js.undefined)
        ret
    }
    @scala.inline
    def withClosePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosePath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(js.undefined)
        ret
    }
  }
  
}

