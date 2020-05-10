package typingsSlinky.openlayers.mod.olx.interaction

import org.scalablytyped.runtime.Instantiable0
import org.scalajs.dom.raw.Element
import typingsSlinky.openlayers.mod.ProjectionLike
import typingsSlinky.openlayers.mod.format.Feature
import typingsSlinky.openlayers.mod.source.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragAndDropOptions extends js.Object {
  var formatConstructors: js.UndefOr[js.Array[Instantiable0[Feature]]] = js.native
  var projection: ProjectionLike = js.native
  var source: js.UndefOr[Vector] = js.native
  var target: js.UndefOr[Element] = js.native
}

object DragAndDropOptions {
  @scala.inline
  def apply(): DragAndDropOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DragAndDropOptions]
  }
  @scala.inline
  implicit class DragAndDropOptionsOps[Self <: DragAndDropOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatConstructors(value: js.Array[Instantiable0[Feature]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatConstructors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatConstructors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatConstructors")(js.undefined)
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
  }
  
}

