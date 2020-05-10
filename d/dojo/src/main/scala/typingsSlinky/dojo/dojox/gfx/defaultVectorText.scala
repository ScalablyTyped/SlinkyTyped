package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultVectorText.html
  *
  *
  */
@js.native
trait defaultVectorText extends js.Object {
  /**
    *
    */
  var align: String = js.native
  /**
    *
    */
  var decoration: String = js.native
  /**
    *
    */
  var fitting: Double = js.native
  /**
    *
    */
  var height: js.Object = js.native
  /**
    *
    */
  var leading: Double = js.native
  /**
    *
    */
  var text: String = js.native
  /**
    *
    */
  var `type`: String = js.native
  /**
    *
    */
  var width: js.Object = js.native
  /**
    *
    */
  var x: Double = js.native
  /**
    *
    */
  var y: Double = js.native
}

object defaultVectorText {
  @scala.inline
  def apply(
    align: String,
    decoration: String,
    fitting: Double,
    height: js.Object,
    leading: Double,
    text: String,
    `type`: String,
    width: js.Object,
    x: Double,
    y: Double
  ): defaultVectorText = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], decoration = decoration.asInstanceOf[js.Any], fitting = fitting.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultVectorText]
  }
  @scala.inline
  implicit class defaultVectorTextOps[Self <: defaultVectorText] (val x: Self) extends AnyVal {
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
    def withFitting(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fitting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeading(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leading")(value.asInstanceOf[js.Any])
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
    def withWidth(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
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

