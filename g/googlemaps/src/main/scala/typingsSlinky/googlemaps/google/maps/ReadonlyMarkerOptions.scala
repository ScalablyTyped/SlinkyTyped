package typingsSlinky.googlemaps.google.maps

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @see {@link MarkerOptions} */
@js.native
trait ReadonlyMarkerOptions extends js.Object {
  /** @see {@link MarkerOptions#anchorPoint} */
  val anchorPoint: js.UndefOr[Point] = js.native
  /** @see {@link MarkerOptions#animation} */
  val animation: js.UndefOr[Animation] = js.native
  /** @see {@link MarkerOptions#clickable} */
  val clickable: js.UndefOr[Boolean] = js.native
  /** @see {@link MarkerOptions#crossOnDrag} */
  val crossOnDrag: js.UndefOr[Boolean] = js.native
  /** @see {@link MarkerOptions#cursor} */
  val cursor: js.UndefOr[String] = js.native
  /** @see {@link MarkerOptions#draggable} */
  val draggable: js.UndefOr[Boolean] = js.native
  /** @see {@link MarkerOptions#icon} */
  val icon: js.UndefOr[String | ReadonlyIcon | ReadonlySymbol] = js.native
  /** @see {@link MarkerOptions#label} */
  val label: js.UndefOr[String | ReadonlyMarkerLabel] = js.native
  /** @see {@link MarkerOptions#map} */
  val map: js.UndefOr[Map[Element] | StreetViewPanorama] = js.native
  /** @see {@link MarkerOptions#opacity} */
  val opacity: js.UndefOr[Double] = js.native
  /** @see {@link MarkerOptions#optimized} */
  val optimized: js.UndefOr[Boolean] = js.native
  /** @see {@link MarkerOptions#place} */
  val place: js.UndefOr[Place] = js.native
  /** @see {@link MarkerOptions#position} */
  val position: js.UndefOr[LatLng | ReadonlyLatLngLiteral] = js.native
  /** @see {@link MarkerOptions#shape} */
  val shape: js.UndefOr[MarkerShape] = js.native
  /** @see {@link MarkerOptions#title} */
  val title: js.UndefOr[String] = js.native
  /** @see {@link MarkerOptions#visible} */
  val visible: js.UndefOr[Boolean] = js.native
  /** @see {@link MarkerOptions#zIndex} */
  val zIndex: js.UndefOr[Double] = js.native
}

object ReadonlyMarkerOptions {
  @scala.inline
  def apply(): ReadonlyMarkerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadonlyMarkerOptions]
  }
  @scala.inline
  implicit class ReadonlyMarkerOptionsOps[Self <: ReadonlyMarkerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnchorPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnchorPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("anchorPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimation(value: Animation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animation")(js.undefined)
        ret
    }
    @scala.inline
    def withClickable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClickable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clickable")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossOnDrag(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOnDrag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossOnDrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossOnDrag")(js.undefined)
        ret
    }
    @scala.inline
    def withCursor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCursor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cursor")(js.undefined)
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
    def withIcon(value: String | ReadonlyIcon | ReadonlySymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: String | ReadonlyMarkerLabel): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withMap(value: Map[Element] | StreetViewPanorama): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("map")(js.undefined)
        ret
    }
    @scala.inline
    def withOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opacity")(js.undefined)
        ret
    }
    @scala.inline
    def withOptimized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimized")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptimized: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optimized")(js.undefined)
        ret
    }
    @scala.inline
    def withPlace(value: Place): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("place")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: LatLng | ReadonlyLatLngLiteral): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withShape(value: MarkerShape): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shape")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndex")(js.undefined)
        ret
    }
  }
  
}

