package typingsSlinky.openlayers.mod.olx.interaction

import typingsSlinky.openlayers.mod.Collection
import typingsSlinky.openlayers.mod.Feature
import typingsSlinky.openlayers.mod.source.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for snap
  */
@js.native
trait SnapOptions extends js.Object {
  var edge: js.UndefOr[Boolean] = js.native
  var features: js.UndefOr[Collection[Feature]] = js.native
  var pixelTolerance: js.UndefOr[Double] = js.native
  var source: js.UndefOr[Vector] = js.native
  var vertex: js.UndefOr[Boolean] = js.native
}

object SnapOptions {
  @scala.inline
  def apply(): SnapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapOptions]
  }
  @scala.inline
  implicit class SnapOptionsOps[Self <: SnapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEdge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEdge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("edge")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatures(value: Collection[Feature]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("features")(js.undefined)
        ret
    }
    @scala.inline
    def withPixelTolerance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelTolerance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPixelTolerance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelTolerance")(js.undefined)
        ret
    }
    @scala.inline
    def withSource(value: Vector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(js.undefined)
        ret
    }
    @scala.inline
    def withVertex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertex")(js.undefined)
        ret
    }
  }
  
}

