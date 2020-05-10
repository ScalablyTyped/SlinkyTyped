package typingsSlinky.eases.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Eases extends js.Object {
  def backIn(t: Double): Double = js.native
  def backInOut(t: Double): Double = js.native
  def backOut(t: Double): Double = js.native
  def bounceIn(t: Double): Double = js.native
  def bounceInOut(t: Double): Double = js.native
  def bounceOut(t: Double): Double = js.native
  def circIn(t: Double): Double = js.native
  def circInOut(t: Double): Double = js.native
  def circOut(t: Double): Double = js.native
  def cubicIn(t: Double): Double = js.native
  def cubicInOut(t: Double): Double = js.native
  def cubicOut(t: Double): Double = js.native
  def elasticIn(t: Double): Double = js.native
  def elasticInOut(t: Double): Double = js.native
  def elasticOut(t: Double): Double = js.native
  def expoIn(t: Double): Double = js.native
  def expoInOut(t: Double): Double = js.native
  def expoOut(t: Double): Double = js.native
  def linear(t: Double): Double = js.native
  def quadIn(t: Double): Double = js.native
  def quadInOut(t: Double): Double = js.native
  def quadOut(t: Double): Double = js.native
  def quartIn(t: Double): Double = js.native
  def quartInOut(t: Double): Double = js.native
  def quartOut(t: Double): Double = js.native
  def quintIn(t: Double): Double = js.native
  def quintInOut(t: Double): Double = js.native
  def quintOut(t: Double): Double = js.native
  def sineIn(t: Double): Double = js.native
  def sineInOut(t: Double): Double = js.native
  def sineOut(t: Double): Double = js.native
}

object Eases {
  @scala.inline
  def apply(
    backIn: Double => Double,
    backInOut: Double => Double,
    backOut: Double => Double,
    bounceIn: Double => Double,
    bounceInOut: Double => Double,
    bounceOut: Double => Double,
    circIn: Double => Double,
    circInOut: Double => Double,
    circOut: Double => Double,
    cubicIn: Double => Double,
    cubicInOut: Double => Double,
    cubicOut: Double => Double,
    elasticIn: Double => Double,
    elasticInOut: Double => Double,
    elasticOut: Double => Double,
    expoIn: Double => Double,
    expoInOut: Double => Double,
    expoOut: Double => Double,
    linear: Double => Double,
    quadIn: Double => Double,
    quadInOut: Double => Double,
    quadOut: Double => Double,
    quartIn: Double => Double,
    quartInOut: Double => Double,
    quartOut: Double => Double,
    quintIn: Double => Double,
    quintInOut: Double => Double,
    quintOut: Double => Double,
    sineIn: Double => Double,
    sineInOut: Double => Double,
    sineOut: Double => Double
  ): Eases = {
    val __obj = js.Dynamic.literal(backIn = js.Any.fromFunction1(backIn), backInOut = js.Any.fromFunction1(backInOut), backOut = js.Any.fromFunction1(backOut), bounceIn = js.Any.fromFunction1(bounceIn), bounceInOut = js.Any.fromFunction1(bounceInOut), bounceOut = js.Any.fromFunction1(bounceOut), circIn = js.Any.fromFunction1(circIn), circInOut = js.Any.fromFunction1(circInOut), circOut = js.Any.fromFunction1(circOut), cubicIn = js.Any.fromFunction1(cubicIn), cubicInOut = js.Any.fromFunction1(cubicInOut), cubicOut = js.Any.fromFunction1(cubicOut), elasticIn = js.Any.fromFunction1(elasticIn), elasticInOut = js.Any.fromFunction1(elasticInOut), elasticOut = js.Any.fromFunction1(elasticOut), expoIn = js.Any.fromFunction1(expoIn), expoInOut = js.Any.fromFunction1(expoInOut), expoOut = js.Any.fromFunction1(expoOut), linear = js.Any.fromFunction1(linear), quadIn = js.Any.fromFunction1(quadIn), quadInOut = js.Any.fromFunction1(quadInOut), quadOut = js.Any.fromFunction1(quadOut), quartIn = js.Any.fromFunction1(quartIn), quartInOut = js.Any.fromFunction1(quartInOut), quartOut = js.Any.fromFunction1(quartOut), quintIn = js.Any.fromFunction1(quintIn), quintInOut = js.Any.fromFunction1(quintInOut), quintOut = js.Any.fromFunction1(quintOut), sineIn = js.Any.fromFunction1(sineIn), sineInOut = js.Any.fromFunction1(sineInOut), sineOut = js.Any.fromFunction1(sineOut))
    __obj.asInstanceOf[Eases]
  }
  @scala.inline
  implicit class EasesOps[Self <: Eases] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBackInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBackOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBounceIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBounceInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBounceOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCircOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("circOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCubicIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubicIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCubicInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubicInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCubicOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cubicOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElasticIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElasticInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withElasticOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elasticOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpoIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expoIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpoInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expoInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExpoOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expoOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLinear(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuadIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuadInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuadOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quadOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuartIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quartIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuartInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quartInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuartOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quartOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuintIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quintIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuintInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quintInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuintOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quintOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSineIn(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sineIn")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSineInOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sineInOut")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSineOut(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sineOut")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

