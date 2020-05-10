package typingsSlinky.dojo.dojo.base.kernel

import typingsSlinky.dojo.dojo.base.fx.Animation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.fx.html
  *
  * Effects library on top of Base animations
  *
  */
@js.native
trait fx extends js.Object {
  /**
    * Collection of easing functions to use beyond the default
    * dojo._defaultEasing function.
    *
    */
  var easing: js.Object = js.native
  /**
    *
    */
  def Toggler(): Unit = js.native
  /**
    * Chain a list of dojo/_base/fx.Animations to run in sequence
    * Return a dojo/_base/fx.Animation which will play all passed
    * dojo/_base/fx.Animation instances in sequence, firing its own
    * synthesized events simulating a single animation. (eg:
    * onEnd of this animation means the end of the chain,
    * not the individual animations within)
    *
    * @param animations
    */
  def chain(animations: js.Array[Animation]): js.Any = js.native
  /**
    * Combine a list of dojo/_base/fx.Animations to run in parallel
    * Combine an array of dojo/_base/fx.Animations to run in parallel,
    * providing a new dojo/_base/fx.Animation instance encompasing each
    * animation, firing standard animation events.
    *
    * @param animations
    */
  def combine(animations: js.Array[Animation]): js.Any = js.native
  /**
    * Slide a node to a new top/left position
    * Returns an animation that will slide "node"
    * defined in args Object from its current position to
    * the position defined by (args.left, args.top).
    *
    * @param args A hash-map of standard dojo/_base/fx.Animation constructor properties(such as easing: node: duration: and so on). Special args membersare top and left, which indicate the new position to slide to.
    */
  def slideTo(args: js.Object): js.Any = js.native
  /**
    * Expand a node to it's natural height.
    * Returns an animation that will expand the
    * node defined in 'args' object from it's current height to
    * it's natural height (with no scrollbar).
    * Node must have no margin/border/padding.
    *
    * @param args A hash-map of standard dojo/_base/fx.Animation constructor properties(such as easing: node: duration: and so on)
    */
  def wipeIn(args: js.Object): js.Any = js.native
  /**
    * Shrink a node to nothing and hide it.
    * Returns an animation that will shrink node defined in "args"
    * from it's current height to 1px, and then hide it.
    *
    * @param args A hash-map of standard dojo/_base/fx.Animation constructor properties(such as easing: node: duration: and so on)
    */
  def wipeOut(args: js.Object): js.Any = js.native
}

object fx {
  @scala.inline
  def apply(
    Toggler: () => Unit,
    chain: js.Array[Animation] => js.Any,
    combine: js.Array[Animation] => js.Any,
    easing: js.Object,
    slideTo: js.Object => js.Any,
    wipeIn: js.Object => js.Any,
    wipeOut: js.Object => js.Any
  ): fx = {
    val __obj = js.Dynamic.literal(Toggler = js.Any.fromFunction0(Toggler), chain = js.Any.fromFunction1(chain), combine = js.Any.fromFunction1(combine), easing = easing.asInstanceOf[js.Any], slideTo = js.Any.fromFunction1(slideTo), wipeIn = js.Any.fromFunction1(wipeIn), wipeOut = js.Any.fromFunction1(wipeOut))
    __obj.asInstanceOf[fx]
  }
  @scala.inline
  implicit class fxOps[Self <: fx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withToggler(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Toggler")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withChain(value: js.Array[Animation] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chain")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCombine(value: js.Array[Animation] => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combine")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEasing(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSlideTo(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWipeIn(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wipeIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withWipeOut(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wipeOut")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

