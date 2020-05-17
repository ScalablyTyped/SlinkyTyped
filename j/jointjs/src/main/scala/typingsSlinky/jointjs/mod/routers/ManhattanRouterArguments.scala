package typingsSlinky.jointjs.mod.routers

import typingsSlinky.jointjs.mod.dia.LinkEnd
import typingsSlinky.jointjs.mod.dia.OrthogonalDirection
import typingsSlinky.jointjs.mod.dia.Sides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManhattanRouterArguments extends js.Object {
  var endDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.native
  var excludeEnds: js.UndefOr[js.Array[LinkEnd]] = js.native
  var excludeTypes: js.UndefOr[js.Array[String]] = js.native
  var maxAllowedDirectionChange: js.UndefOr[Double] = js.native
  var maximumLoops: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[Sides] = js.native
  var perpendicular: js.UndefOr[Boolean] = js.native
  var startDirections: js.UndefOr[js.Array[OrthogonalDirection]] = js.native
  var step: js.UndefOr[Double] = js.native
}

object ManhattanRouterArguments {
  @scala.inline
  def apply(): ManhattanRouterArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManhattanRouterArguments]
  }
  @scala.inline
  implicit class ManhattanRouterArgumentsOps[Self <: ManhattanRouterArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDirections(value: js.Array[OrthogonalDirection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDirections")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeEnds(value: js.Array[LinkEnd]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEnds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeEnds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeEnds")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeTypes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxAllowedDirectionChange(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllowedDirectionChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAllowedDirectionChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAllowedDirectionChange")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumLoops(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLoops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumLoops: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maximumLoops")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Sides): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padding")(js.undefined)
        ret
    }
    @scala.inline
    def withPerpendicular(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perpendicular")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerpendicular: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("perpendicular")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDirections(value: js.Array[OrthogonalDirection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDirections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDirections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDirections")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
  }
  
}

