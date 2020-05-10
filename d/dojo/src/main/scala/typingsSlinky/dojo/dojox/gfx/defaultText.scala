package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultText.html
  *
  * Defines the default Text prototype.
  *
  */
@js.native
trait defaultText extends js.Object {
  /**
    * The horizontal text alignment, one of 'start', 'end', 'center'. Default value 'start'.
    *
    */
  var align: String = js.native
  /**
    * The text decoration , one of 'none', ... . Default value 'none'.
    *
    */
  var decoration: String = js.native
  /**
    * Whether kerning is used on the text, boolean default value true.
    *
    */
  var kerning: Boolean = js.native
  /**
    * Whether the text is rotated, boolean default value false.
    *
    */
  var rotated: Boolean = js.native
  /**
    * The text to be displayed, default value empty string.
    *
    */
  var text: String = js.native
  /**
    * Specifies this is a Text shape, value 'text'.
    *
    */
  var `type`: String = js.native
  /**
    * The X coordinate of the text position, default value 0.
    *
    */
  var x: Double = js.native
  /**
    * The Y coordinate of the text position, default value 0.
    *
    */
  var y: Double = js.native
}

object defaultText {
  @scala.inline
  def apply(
    align: String,
    decoration: String,
    kerning: Boolean,
    rotated: Boolean,
    text: String,
    `type`: String,
    x: Double,
    y: Double
  ): defaultText = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], decoration = decoration.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], rotated = rotated.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultText]
  }
  @scala.inline
  implicit class defaultTextOps[Self <: defaultText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDecoration(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decoration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKerning(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kerning")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRotated(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

