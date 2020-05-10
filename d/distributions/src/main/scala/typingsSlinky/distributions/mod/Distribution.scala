package typingsSlinky.distributions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  def cdf(x: Double): Double = js.native
  def inv(p: Double): Double = js.native
  def mean(): Double = js.native
  def median(): Double = js.native
  def pdf(x: Double): Double = js.native
  def variance(): Double = js.native
}

object Distribution {
  @scala.inline
  def apply(
    cdf: Double => Double,
    inv: Double => Double,
    mean: () => Double,
    median: () => Double,
    pdf: Double => Double,
    variance: () => Double
  ): Distribution = {
    val __obj = js.Dynamic.literal(cdf = js.Any.fromFunction1(cdf), inv = js.Any.fromFunction1(inv), mean = js.Any.fromFunction0(mean), median = js.Any.fromFunction0(median), pdf = js.Any.fromFunction1(pdf), variance = js.Any.fromFunction0(variance))
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCdf(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withInv(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inv")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMean(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMedian(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("median")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withPdf(value: Double => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pdf")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVariance(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variance")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

