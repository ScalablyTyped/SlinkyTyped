package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerOptions extends js.Object {
  /** A string indicating the part of the Marker that should be positioned closest to the coordinate set via Marker.setLngLat.
    * Options are `'center'`, `'top'`, `'bottom'`, `'left'`, `'right'`, `'top-left'`, `'top-right'`, `'bottom-left'`, and `'bottom-right'`.
    * The default value os `'center'`
    */
  var anchor: js.UndefOr[Anchor] = js.native
  /** The color to use for the default marker if options.element is not provided. The default is light blue (#3FB1CE). */
  var color: js.UndefOr[String] = js.native
  /** A boolean indicating whether or not a marker is able to be dragged to a new position on the map. The default value is false */
  var draggable: js.UndefOr[Boolean] = js.native
  /** DOM element to use as a marker. The default is a light blue, droplet-shaped SVG marker */
  var element: js.UndefOr[HTMLElement] = js.native
  /** The offset in pixels as a PointLike object to apply relative to the element's center. Negatives indicate left and up. */
  var offset: js.UndefOr[PointLike] = js.native
  /** `map` aligns the `Marker` to the plane of the map.
    * `viewport` aligns the `Marker` to the plane of the viewport.
    * `auto` automatically matches the value of `rotationAlignment`.
    * The default value is `auto`.
    */
  var pitchAlignment: js.UndefOr[Alignment] = js.native
  /** The rotation angle of the marker in degrees, relative to its `rotationAlignment` setting. A positive value will rotate the marker clockwise.
    * The default value is 0.
    */
  var rotation: js.UndefOr[Double] = js.native
  /** `map` aligns the `Marker`'s rotation relative to the map, maintaining a bearing as the map rotates.
    * `viewport` aligns the `Marker`'s rotation relative to the viewport, agnostic to map rotations.
    * `auto` is equivalent to `viewport`.
    * The default value is `auto`
    */
  var rotationAlignment: js.UndefOr[Alignment] = js.native
}

object MarkerOptions {
  @scala.inline
  def apply(): MarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerOptions]
  }
  @scala.inline
  implicit class MarkerOptionsOps[Self <: MarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchor(value: Anchor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchor")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withElement(value: HTMLElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: PointLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPitchAlignment(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPitchAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pitchAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withRotation(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotation")(js.undefined)
        ret
    }
    @scala.inline
    def withRotationAlignment(value: Alignment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRotationAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotationAlignment")(js.undefined)
        ret
    }
  }
  
}

