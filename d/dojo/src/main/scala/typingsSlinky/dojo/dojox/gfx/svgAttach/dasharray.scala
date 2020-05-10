package typingsSlinky.dojo.dojox.gfx.svgAttach

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/svg_attach.dasharray.html
  *
  *
  */
@js.native
trait dasharray extends js.Object {
  /**
    *
    */
  var dash: js.Array[_] = js.native
  /**
    *
    */
  var dashdot: js.Array[_] = js.native
  /**
    *
    */
  var dot: js.Array[_] = js.native
  /**
    *
    */
  var longdash: js.Array[_] = js.native
  /**
    *
    */
  var longdashdot: js.Array[_] = js.native
  /**
    *
    */
  var longdashdotdot: js.Array[_] = js.native
  /**
    *
    */
  var shortdash: js.Array[_] = js.native
  /**
    *
    */
  var shortdashdot: js.Array[_] = js.native
  /**
    *
    */
  var shortdashdotdot: js.Array[_] = js.native
  /**
    *
    */
  var shortdot: js.Array[_] = js.native
  /**
    *
    */
  var solid: String = js.native
}

object dasharray {
  @scala.inline
  def apply(
    dash: js.Array[_],
    dashdot: js.Array[_],
    dot: js.Array[_],
    longdash: js.Array[_],
    longdashdot: js.Array[_],
    longdashdotdot: js.Array[_],
    shortdash: js.Array[_],
    shortdashdot: js.Array[_],
    shortdashdotdot: js.Array[_],
    shortdot: js.Array[_],
    solid: String
  ): dasharray = {
    val __obj = js.Dynamic.literal(dash = dash.asInstanceOf[js.Any], dashdot = dashdot.asInstanceOf[js.Any], dot = dot.asInstanceOf[js.Any], longdash = longdash.asInstanceOf[js.Any], longdashdot = longdashdot.asInstanceOf[js.Any], longdashdotdot = longdashdotdot.asInstanceOf[js.Any], shortdash = shortdash.asInstanceOf[js.Any], shortdashdot = shortdashdot.asInstanceOf[js.Any], shortdashdotdot = shortdashdotdot.asInstanceOf[js.Any], shortdot = shortdot.asInstanceOf[js.Any], solid = solid.asInstanceOf[js.Any])
    __obj.asInstanceOf[dasharray]
  }
  @scala.inline
  implicit class dasharrayOps[Self <: dasharray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDash(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDashdot(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dashdot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDot(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongdash(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longdash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongdashdot(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longdashdot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongdashdotdot(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longdashdotdot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortdash(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortdash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortdashdot(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortdashdot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortdashdotdot(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortdashdotdot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortdot(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortdot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSolid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("solid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

