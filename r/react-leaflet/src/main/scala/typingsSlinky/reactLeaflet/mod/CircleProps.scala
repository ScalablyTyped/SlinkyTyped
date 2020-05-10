package typingsSlinky.reactLeaflet.mod

import slinky.core.facade.ReactElement
import typingsSlinky.leaflet.mod.CircleMarkerOptions
import typingsSlinky.leaflet.mod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typingsSlinky.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children */ @js.native
trait CircleProps
  extends CircleMarkerOptions
     with PathEvents {
  var center: LatLngExpression = js.native
  var children: js.UndefOr[Children] = js.native
  var leaflet: js.UndefOr[LeafletContext] = js.native
  @JSName("radius")
  var radius_CircleProps: Double = js.native
}

object CircleProps {
  @scala.inline
  def apply(center: LatLngExpression, radius: Double): CircleProps = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleProps]
  }
  @scala.inline
  implicit class CirclePropsOps[Self <: CircleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCenter(value: LatLngExpression): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("center")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildrenReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildren(value: Children): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaflet(value: LeafletContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaflet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaflet")(js.undefined)
        ret
    }
  }
  
}

