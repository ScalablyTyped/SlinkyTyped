package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/fx.html
  *
  *
  */
@js.native
trait fx extends js.Object {
  /**
    * Returns an animation which will change fill color over time.
    * Only solid fill color is supported at the moment
    *
    * @param args an object defining the animation setting.
    */
  def animateFill(args: js.Object): js.Any = js.native
  /**
    * Returns an animation which will change font properties over time.
    *
    * @param args an object defining the animation setting.
    */
  def animateFont(args: js.Object): Unit = js.native
  /**
    * Returns an animation which will change stroke properties over time.
    *
    * @param args an object defining the animation setting.
    */
  def animateStroke(args: js.Object): Unit = js.native
  /**
    * Returns an animation which will change transformation over time.
    *
    * @param args an object defining the animation setting.
    */
  def animateTransform(args: js.Object): js.Any = js.native
}

object fx {
  @scala.inline
  def apply(
    animateFill: js.Object => js.Any,
    animateFont: js.Object => Unit,
    animateStroke: js.Object => Unit,
    animateTransform: js.Object => js.Any
  ): fx = {
    val __obj = js.Dynamic.literal(animateFill = js.Any.fromFunction1(animateFill), animateFont = js.Any.fromFunction1(animateFont), animateStroke = js.Any.fromFunction1(animateStroke), animateTransform = js.Any.fromFunction1(animateTransform))
    __obj.asInstanceOf[fx]
  }
  @scala.inline
  implicit class fxOps[Self <: fx] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimateFill(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateFill")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimateFont(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateFont")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimateStroke(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateStroke")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAnimateTransform(value: js.Object => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animateTransform")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

