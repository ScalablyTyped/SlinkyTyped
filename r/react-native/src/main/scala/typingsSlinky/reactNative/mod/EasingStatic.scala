package typingsSlinky.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EasingStatic extends js.Object {
  var bounce: EasingFunction = js.native
  var circle: EasingFunction = js.native
  var cubic: EasingFunction = js.native
  var ease: EasingFunction = js.native
  var exp: EasingFunction = js.native
  var linear: EasingFunction = js.native
  var quad: EasingFunction = js.native
  var sin: EasingFunction = js.native
  var step0: EasingFunction = js.native
  var step1: EasingFunction = js.native
  def back(s: Double): EasingFunction = js.native
  def bezier(x1: Double, y1: Double, x2: Double, y2: Double): EasingFunction = js.native
  def elastic(bounciness: Double): EasingFunction = js.native
  def in(easing: EasingFunction): EasingFunction = js.native
  def inOut(easing: EasingFunction): EasingFunction = js.native
  def out(easing: EasingFunction): EasingFunction = js.native
  def poly(n: Double): EasingFunction = js.native
}

object EasingStatic {
  @scala.inline
  def apply(
    back: Double => EasingFunction,
    bezier: (Double, Double, Double, Double) => EasingFunction,
    bounce: /* value */ Double => Double,
    circle: /* value */ Double => Double,
    cubic: /* value */ Double => Double,
    ease: /* value */ Double => Double,
    elastic: Double => EasingFunction,
    exp: /* value */ Double => Double,
    in: EasingFunction => EasingFunction,
    inOut: EasingFunction => EasingFunction,
    linear: /* value */ Double => Double,
    out: EasingFunction => EasingFunction,
    poly: Double => EasingFunction,
    quad: /* value */ Double => Double,
    sin: /* value */ Double => Double,
    step0: /* value */ Double => Double,
    step1: /* value */ Double => Double
  ): EasingStatic = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction1(back), bezier = js.Any.fromFunction4(bezier), bounce = js.Any.fromFunction1(bounce), circle = js.Any.fromFunction1(circle), cubic = js.Any.fromFunction1(cubic), ease = js.Any.fromFunction1(ease), elastic = js.Any.fromFunction1(elastic), exp = js.Any.fromFunction1(exp), in = js.Any.fromFunction1(in), inOut = js.Any.fromFunction1(inOut), linear = js.Any.fromFunction1(linear), out = js.Any.fromFunction1(out), poly = js.Any.fromFunction1(poly), quad = js.Any.fromFunction1(quad), sin = js.Any.fromFunction1(sin), step0 = js.Any.fromFunction1(step0), step1 = js.Any.fromFunction1(step1))
    __obj.asInstanceOf[EasingStatic]
  }
  @scala.inline
  implicit class EasingStaticOps[Self <: EasingStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBack(value: Double => EasingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("back")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBezier(value: (Double, Double, Double, Double) => EasingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bezier")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withBounce(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounce")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircle(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circle")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCubic(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEase(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ease")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElastic(value: Double => EasingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elastic")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExp(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exp")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIn(value: EasingFunction => EasingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("in")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInOut(value: EasingFunction => EasingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLinear(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOut(value: EasingFunction => EasingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("out")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPoly(value: Double => EasingFunction): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("poly")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuad(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quad")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSin(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStep0(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step0")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStep1(value: /* value */ Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step1")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

