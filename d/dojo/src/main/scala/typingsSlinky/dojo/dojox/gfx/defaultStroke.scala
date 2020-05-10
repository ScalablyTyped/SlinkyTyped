package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultStroke.html
  *
  * A stroke defines stylistic properties that are used when drawing a path.
  * This object defines the default Stroke prototype.
  *
  */
@js.native
trait defaultStroke extends js.Object {
  /**
    * The endcap style of the path. One of 'butt', 'round', ... . Default value 'butt'.
    *
    */
  var cap: String = js.native
  /**
    * The color of the stroke, default value 'black'.
    *
    */
  var color: String = js.native
  /**
    * The join style to use when combining path segments. Default value 4.
    *
    */
  var join: Double = js.native
  /**
    * The style of the stroke, one of 'solid', ... . Default value 'solid'.
    *
    */
  var style: String = js.native
  /**
    * Specifies this object is a type of Stroke, value 'stroke'.
    *
    */
  var `type`: String = js.native
  /**
    * The width of a stroke, default value 1.
    *
    */
  var width: Double = js.native
}

object defaultStroke {
  @scala.inline
  def apply(cap: String, color: String, join: Double, style: String, `type`: String, width: Double): defaultStroke = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], join = join.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultStroke]
  }
  @scala.inline
  implicit class defaultStrokeOps[Self <: defaultStroke] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJoin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("join")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

