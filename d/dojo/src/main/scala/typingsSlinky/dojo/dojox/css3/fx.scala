package typingsSlinky.dojo.dojox.css3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/css3/fx.html
  *
  * Utilities for animation effects.
  *
  */
@js.native
trait fx extends js.Object {
  /**
    * Returns an animation that does a "bounce" effect on args.node.
    * Vertical bounce animation. The scaleX, scaleY deformation and the
    * jump height (args.jumpHeight) can be specified.
    *
    * @param args
    */
  def bounce(args: js.Object): js.Any = js.native
  /**
    * Returns an animation that expands args.node.
    * Scales an element to args.endScale.
    *
    * @param args
    */
  def expand(args: js.Object): js.Any = js.native
  /**
    * Returns an animation that flips an element around its y axis.
    * Flips an element around its y axis. The default is a 360deg flip
    * but it is possible to run a partial flip using args.whichAnims.
    *
    * @param args
    */
  def flip(args: js.Object): js.Any = js.native
  /**
    * Returns an animation that will do a "puff" effect on the given node.
    * Fades out an element and scales it to args.endScale.
    *
    * @param args
    */
  def puff(args: js.Object): js.Any = js.native
  /**
    * Returns an animation that rotates an element.
    * Rotates an element from args.startAngle to args.endAngle.
    *
    * @param args
    */
  def rotate(args: js.Object): js.Any = js.native
  /**
    * Returns an animation that shrinks args.node.
    * Shrinks an element, same as expand({ node: node, endScale: .01 });
    *
    * @param args
    */
  def shrink(args: js.Object): js.Any = js.native
}

object fx {
  @scala.inline
  def apply(
    bounce: js.Object => js.Any,
    expand: js.Object => js.Any,
    flip: js.Object => js.Any,
    puff: js.Object => js.Any,
    rotate: js.Object => js.Any,
    shrink: js.Object => js.Any
  ): fx = {
    val __obj = js.Dynamic.literal(bounce = js.Any.fromFunction1(bounce), expand = js.Any.fromFunction1(expand), flip = js.Any.fromFunction1(flip), puff = js.Any.fromFunction1(puff), rotate = js.Any.fromFunction1(rotate), shrink = js.Any.fromFunction1(shrink))
    __obj.asInstanceOf[fx]
  }
  @scala.inline
  implicit class fxOps[Self <: fx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBounce(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpand(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expand")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFlip(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flip")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPuff(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("puff")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRotate(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rotate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShrink(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrink")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

