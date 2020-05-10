package typingsSlinky.cytoscape.mod.Css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Core
  * These properties affect UI global to the graph, and apply only to the core.
  * You can use the special core selector string to set these properties.
  * http://js.cytoscape.org/#style/core
  */
@js.native
trait Core extends js.Object {
  /**
    * Indicator:
    */
  /**
    * The colour of the indicator shown when the background is grabbed by the user.
    */
  var `active-bg-color`: PropertyValueCore[Colour] = js.native
  /**
    * The opacity of the active background indicator.
    */
  var `active-bg-opacity`: PropertyValueCore[Double] = js.native
  /**
    * The size of the active background indicator.
    */
  var `active-bg-size`: PropertyValueCore[Double] = js.native
  /**
    * Texture during viewport gestures:
    */
  /**
    * The colour of the area outside the viewport texture when initOptions.textureOnViewport === true.
    */
  var `outside-texture-bg-color`: PropertyValueCore[Colour] = js.native
  /**
    * The opacity of the area outside the viewport texture.
    */
  var `outside-texture-bg-opacity`: PropertyValueCore[Double] = js.native
  /**
    * The colour of the border on the selection box.
    */
  var `selection-box-border-color`: PropertyValueCore[Colour] = js.native
  /**
    * The size of the border on the selection box.
    */
  var `selection-box-border-width`: PropertyValueCore[Double] = js.native
  /**
    * Selection box:
    */
  /**
    * The background colour of the selection box used for drag selection.
    */
  var `selection-box-color`: PropertyValueCore[Colour] = js.native
  /**
    * The opacity of the selection box.
    */
  var `selection-box-opacity`: PropertyValueCore[Double] = js.native
}

object Core {
  @scala.inline
  def apply(
    `active-bg-color`: PropertyValueCore[Colour],
    `active-bg-opacity`: PropertyValueCore[Double],
    `active-bg-size`: PropertyValueCore[Double],
    `outside-texture-bg-color`: PropertyValueCore[Colour],
    `outside-texture-bg-opacity`: PropertyValueCore[Double],
    `selection-box-border-color`: PropertyValueCore[Colour],
    `selection-box-border-width`: PropertyValueCore[Double],
    `selection-box-color`: PropertyValueCore[Colour],
    `selection-box-opacity`: PropertyValueCore[Double]
  ): Core = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active-bg-color")(`active-bg-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("active-bg-opacity")(`active-bg-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("active-bg-size")(`active-bg-size`.asInstanceOf[js.Any])
    __obj.updateDynamic("outside-texture-bg-color")(`outside-texture-bg-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("outside-texture-bg-opacity")(`outside-texture-bg-opacity`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-box-border-color")(`selection-box-border-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-box-border-width")(`selection-box-border-width`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-box-color")(`selection-box-color`.asInstanceOf[js.Any])
    __obj.updateDynamic("selection-box-opacity")(`selection-box-opacity`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Core]
  }
  @scala.inline
  implicit class CoreOps[Self <: Core] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withActive-bg-colorFunction1`(value: Core => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active-bg-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withActive-bg-color`(value: PropertyValueCore[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active-bg-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActive-bg-opacityFunction1`(value: Core => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active-bg-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withActive-bg-opacity`(value: PropertyValueCore[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active-bg-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withActive-bg-sizeFunction1`(value: Core => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active-bg-size")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withActive-bg-size`(value: PropertyValueCore[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active-bg-size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutside-texture-bg-colorFunction1`(value: Core => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside-texture-bg-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOutside-texture-bg-color`(value: PropertyValueCore[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside-texture-bg-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withOutside-texture-bg-opacityFunction1`(value: Core => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside-texture-bg-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withOutside-texture-bg-opacity`(value: PropertyValueCore[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outside-texture-bg-opacity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSelection-box-border-colorFunction1`(value: Core => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection-box-border-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSelection-box-border-color`(value: PropertyValueCore[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection-box-border-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSelection-box-border-widthFunction1`(value: Core => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection-box-border-width")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSelection-box-border-width`(value: PropertyValueCore[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection-box-border-width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSelection-box-colorFunction1`(value: Core => Colour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection-box-color")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSelection-box-color`(value: PropertyValueCore[Colour]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection-box-color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSelection-box-opacityFunction1`(value: Core => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection-box-opacity")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def `withSelection-box-opacity`(value: PropertyValueCore[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection-box-opacity")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

