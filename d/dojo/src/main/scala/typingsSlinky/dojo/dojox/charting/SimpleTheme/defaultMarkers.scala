package typingsSlinky.dojo.dojox.charting.SimpleTheme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/SimpleTheme.defaultMarkers.html
  *
  *
  */
@js.native
trait defaultMarkers extends js.Object {
  /**
    *
    */
  var CIRCLE: String = js.native
  /**
    *
    */
  var CROSS: String = js.native
  /**
    *
    */
  var DIAMOND: String = js.native
  /**
    *
    */
  var SQUARE: String = js.native
  /**
    *
    */
  var TRIANGLE: String = js.native
  /**
    *
    */
  var TRIANGLE_INVERTED: String = js.native
  /**
    *
    */
  var X: String = js.native
}

object defaultMarkers {
  @scala.inline
  def apply(
    CIRCLE: String,
    CROSS: String,
    DIAMOND: String,
    SQUARE: String,
    TRIANGLE: String,
    TRIANGLE_INVERTED: String,
    X: String
  ): defaultMarkers = {
    val __obj = js.Dynamic.literal(CIRCLE = CIRCLE.asInstanceOf[js.Any], CROSS = CROSS.asInstanceOf[js.Any], DIAMOND = DIAMOND.asInstanceOf[js.Any], SQUARE = SQUARE.asInstanceOf[js.Any], TRIANGLE = TRIANGLE.asInstanceOf[js.Any], TRIANGLE_INVERTED = TRIANGLE_INVERTED.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultMarkers]
  }
  @scala.inline
  implicit class defaultMarkersOps[Self <: defaultMarkers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCIRCLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CIRCLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCROSS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CROSS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDIAMOND(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIAMOND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSQUARE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SQUARE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRIANGLE(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRIANGLE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTRIANGLE_INVERTED(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRIANGLE_INVERTED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

