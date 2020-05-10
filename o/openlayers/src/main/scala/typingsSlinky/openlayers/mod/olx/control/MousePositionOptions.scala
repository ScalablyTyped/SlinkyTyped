package typingsSlinky.openlayers.mod.olx.control

import org.scalajs.dom.raw.Element
import typingsSlinky.openlayers.mod.CoordinateFormatType
import typingsSlinky.openlayers.mod.Coordinate_
import typingsSlinky.openlayers.mod.MapEvent
import typingsSlinky.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousePositionOptions extends js.Object {
  var className: js.UndefOr[String] = js.native
  var coordinateFormat: js.UndefOr[CoordinateFormatType] = js.native
  var projection: ProjectionLike = js.native
  var render: js.UndefOr[js.Function1[/* event */ MapEvent, _]] = js.native
  var target: js.UndefOr[Element] = js.native
  var undefinedHTML: js.UndefOr[String] = js.native
}

object MousePositionOptions {
  @scala.inline
  def apply(): MousePositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousePositionOptions]
  }
  @scala.inline
  implicit class MousePositionOptionsOps[Self <: MousePositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withCoordinateFormat(value: /* coords */ js.UndefOr[Coordinate_] => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCoordinateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(value: /* event */ MapEvent => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRender: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withUndefinedHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndefinedHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefinedHTML")(js.undefined)
        ret
    }
  }
  
}

