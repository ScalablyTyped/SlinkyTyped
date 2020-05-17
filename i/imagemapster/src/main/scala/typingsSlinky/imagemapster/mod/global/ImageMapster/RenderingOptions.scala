package typingsSlinky.imagemapster.mod.global.ImageMapster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderingOptions extends js.Object {
  /**
    * Use an alternate image of the same size as the imagemap as the
    * source for highlight or select effects.
    *
    * When specified, the mapster will highlight areas using the image
    * data obtained from the same area in an alternate image, instead of
    * using a fill effect to highlight or select the area. This feature is
    * currently available in browsers with HTML5 canvas support. In
    * practical terms, this means it will work in all commonly used
    * browsers except IE 8 or lower.
    *
    * If this feature is enabled when an unsupported browser is used, it
    * will fall back to the normal highlight method.
    *
    * The fill, stroke and opacity effects can be specified independently
    * from those used for the normal higlight effect. This ensures that
    * when your page is viewed with a non-supported browser, you can still
    * control the rendering as would be appropriate for a normal
    * fill/stroke effect, which may be different from when you're using an
    * alternate image.
    */
  var altImage: js.UndefOr[String] = js.native
  var altImageFill: js.UndefOr[Boolean] = js.native
  var altImageOpacity: js.UndefOr[Double] = js.native
  var altImageStroke: js.UndefOr[Boolean] = js.native
  /**
    * fade effect - can only be applied to "render_highlight".
    *
    * Use a fade effect when highlighting areas on mouseover.
    */
  var fade: js.UndefOr[Boolean] = js.native
  /**
    * The duration of the fade-in effect, in milliseconds.
    */
  var fadeDuration: js.UndefOr[Double] = js.native
  /**
    * Areas should be flood-filled when moused over or highlighted.
    */
  var fill: js.UndefOr[Boolean] = js.native
  /**
    * The color used for flood fill.
    */
  var fillColor: js.UndefOr[String] = js.native
  var fillColorMask: js.UndefOr[String] = js.native
  /**
    * The opacity of the fill. This is a number from 0 to 1.
    */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * highlight areas on mouseover. When null (default), the behavior is
    * disabled for mobile browsers. You can explicitly enable or disable
    * it by setting this option to a boolean value.
    */
  var highlight: js.UndefOr[Boolean] = js.native
  /**
    * the map or area on the map can be deselected.
    *
    * Normally true, this option can be used to prevent users from
    * unselecting items once they have been selected. When combined with
    * singleSelect, the effect is that one and only one option can be
    * selected at any given time. Users cannot deselect the active option.
    * This provides a menu-like functionality. It is possible for zero
    * items to be selected if this is the default state (or the only
    * selected item is deselected programatically).
    */
  var isDeselectable: js.UndefOr[Boolean] = js.native
  /**
    * the map or an area on the map can be selected (or deselected).
    *
    * When true, the image map will function like a multiple-select menu.
    * Users can click any area to select or deselect it. When applied to
    * the entire map, it determines whether or not the click-selection
    * functionality is enabled. When applied to an area, it determines
    * whether that individual area (or group) can be selected. By default,
    * the map and all areas are selectable.
    */
  var isSelectable: js.UndefOr[Boolean] = js.native
  /**
    * The options below control the way highlighted areas are rendered.
    * Each can be applied globally to the map, or to each element, using
    * the areas option to pass area-specific options. These options apply
    * to either highlighted or selected areas. Highlighting occurs when
    * the mouse enters an area on the image map. Selection occurs when an
    * area is clicked, and selection is enabled. These options will be
    * applied to both situations if present in the root of the options
    * object. They can also be applied to one or the other situations
    * specifically using the render_highlight and render_select options.
    */
  var render_highlight: js.UndefOr[String | RenderingOptions] = js.native
  var render_select: js.UndefOr[String | RenderingOptions] = js.native
  /**
    * initial selection state of an area.
    *
    * The area in question is selected. To set default selections when
    * creating a new mapster, use this option for a specific area (see
    * above).
    */
  var selected: js.UndefOr[Boolean] = js.native
  /**
    * only one area can be selected at a time
    *
    * When true, only one or zero areas can be selected at any given time.
    * If an area is selected and the user selects another area, the
    * previously selected area will become deselected. Unlike
    * "staticState", this property cannot be overridden by setting areas
    * programatically, only one (or zero) areas can ever be selected when
    * this option is true.
    */
  var singleSelect: js.UndefOr[Boolean] = js.native
  /**
    * the map or area is permanently in a selected or deselected state.
    *
    * When true or false, the map or area to which this option applies
    * will be permanently selected or deselected. Typically this is more
    * useful applied to individual areas that you want to exclude from the
    * interactive part of the map.
    *
    * staticState forces an area to be always selected or deselected. If
    * set, this will supercede isSelectable. Something with a staticState
    * will always be in that state and it cannot be changed by the user.
    * Note that when setting states programatically, this option will not
    * be honored; it only affects user interaction.
    */
  var staticState: js.UndefOr[Boolean] = js.native
  /**
    * Areas should be outlined when moused over or highlighted.
    */
  var stroke: js.UndefOr[Boolean] = js.native
  /**
    * The color of the outline.
    */
  var strokeColor: js.UndefOr[String] = js.native
  /**
    * The opacity of the outline.
    */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /**
    * The width of the outline.
    */
  var strokeWidth: js.UndefOr[Double] = js.native
}

object RenderingOptions {
  @scala.inline
  def apply(): RenderingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderingOptions]
  }
  @scala.inline
  implicit class RenderingOptionsOps[Self <: RenderingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altImage")(js.undefined)
        ret
    }
    @scala.inline
    def withAltImageFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altImageFill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltImageFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altImageFill")(js.undefined)
        ret
    }
    @scala.inline
    def withAltImageOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altImageOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltImageOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altImageOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withAltImageStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altImageStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltImageStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altImageStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withFade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fade")(js.undefined)
        ret
    }
    @scala.inline
    def withFadeDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFadeDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fadeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withFillColorMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColorMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillColorMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillColorMask")(js.undefined)
        ret
    }
    @scala.inline
    def withFillOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFillOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fillOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDeselectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeselectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDeselectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDeselectable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSelectable")(js.undefined)
        ret
    }
    @scala.inline
    def withRender_highlight(value: String | RenderingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_highlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender_highlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_highlight")(js.undefined)
        ret
    }
    @scala.inline
    def withRender_select(value: String | RenderingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_select")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender_select: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render_select")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleSelect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withStaticState(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStaticState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staticState")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeOpacity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeOpacity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeOpacity")(js.undefined)
        ret
    }
    @scala.inline
    def withStrokeWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStrokeWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("strokeWidth")(js.undefined)
        ret
    }
  }
  
}

