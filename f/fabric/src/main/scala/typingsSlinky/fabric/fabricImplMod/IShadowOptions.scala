package typingsSlinky.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShadowOptions extends js.Object {
  /**
  	 * Whether the shadow should affect stroke operations
  	 */
  var affectStroke: js.UndefOr[Boolean] = js.native
  /**
  	 * Shadow blur
  	 */
  var blur: js.UndefOr[Double] = js.native
  /**
  	 * Shadow color
  	 */
  var color: js.UndefOr[String] = js.native
  /**
  	 * Indicates whether toObject should include default values
  	 */
  var includeDefaultValues: js.UndefOr[Boolean] = js.native
  /**
  	 * When `false`, the shadow will scale with the object.
  	 * When `true`, the shadow's offsetX, offsetY, and blur will not be affected by the object's scale.
  	 * default to false
  	 * @type Boolean
  	 * @default
  	 */
  var nonScaling: js.UndefOr[Boolean] = js.native
  /**
  	 * Shadow horizontal offset
  	 */
  var offsetX: js.UndefOr[Double] = js.native
  /**
  	 * Shadow vertical offset
  	 */
  var offsetY: js.UndefOr[Double] = js.native
}

object IShadowOptions {
  @scala.inline
  def apply(): IShadowOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShadowOptions]
  }
  @scala.inline
  implicit class IShadowOptionsOps[Self <: IShadowOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAffectStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAffectStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("affectStroke")(js.undefined)
        ret
    }
    @scala.inline
    def withBlur(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blur")(js.undefined)
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
    def withIncludeDefaultValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeDefaultValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeDefaultValues")(js.undefined)
        ret
    }
    @scala.inline
    def withNonScaling(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonScaling")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonScaling: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonScaling")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetX: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetX")(js.undefined)
        ret
    }
    @scala.inline
    def withOffsetY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffsetY: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offsetY")(js.undefined)
        ret
    }
  }
  
}

