package typingsSlinky.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/layout
  */
@js.native
trait LayoutPositionOptions extends js.Object {
  // whether to animate changes to the layout
  var animate: js.UndefOr[Boolean] = js.native
  // duration of animation in ms, if enabled
  var animationDuration: js.UndefOr[Double] = js.native
  // easing of animation, if enabled
  var animationEasing: js.UndefOr[Double] = js.native
  // collection of elements involved in the layout; set by cy.layout() or eles.layout(s)
  var eles: CollectionArgument = js.native
  // whether to fit the viewport to the graph
  var fit: js.UndefOr[Boolean] = js.native
  // padding to leave between graph and viewport
  var padding: js.UndefOr[Double] = js.native
  // pan the graph to the provided position, given as { x, y }
  var pan: js.UndefOr[Position] = js.native
  // callback for the layoutready event
  var ready: js.UndefOr[scala.Nothing] = js.native
  // a positive value which adjusts spacing between nodes (>1 means greater than usual spacing)
  var spacingFactor: js.UndefOr[Double] = js.native
  // callback for the layoutstop event
  var stop: js.UndefOr[scala.Nothing] = js.native
  // zoom level as a positive number to set after animation
  var zoom: js.UndefOr[Double] = js.native
}

object LayoutPositionOptions {
  @scala.inline
  def apply(eles: CollectionArgument): LayoutPositionOptions = {
    val __obj = js.Dynamic.literal(eles = eles.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutPositionOptions]
  }
  @scala.inline
  implicit class LayoutPositionOptionsOps[Self <: LayoutPositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEles(value: CollectionArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimationEasing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimationEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animationEasing")(js.undefined)
        ret
    }
    @scala.inline
    def withFit(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fit")(js.undefined)
        ret
    }
    @scala.inline
    def withPadding(value: Double): Self = {
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
    def withPan(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pan")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacingFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacingFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacingFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withZoom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zoom")(js.undefined)
        ret
    }
  }
  
}

