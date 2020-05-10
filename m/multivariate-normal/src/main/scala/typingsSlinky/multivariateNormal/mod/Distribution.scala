package typingsSlinky.multivariateNormal.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Distribution extends js.Object {
  def getCov(): js.Array[js.Array[Double]] = js.native
  def getMean(): js.Array[Double] = js.native
  def sample(): js.Array[Double] = js.native
  def setCov(newCov: js.Array[js.Array[Double]]): Distribution = js.native
  def setMean(newMean: js.Array[Double]): Distribution = js.native
}

object Distribution {
  @scala.inline
  def apply(
    getCov: () => js.Array[js.Array[Double]],
    getMean: () => js.Array[Double],
    sample: () => js.Array[Double],
    setCov: js.Array[js.Array[Double]] => Distribution,
    setMean: js.Array[Double] => Distribution
  ): Distribution = {
    val __obj = js.Dynamic.literal(getCov = js.Any.fromFunction0(getCov), getMean = js.Any.fromFunction0(getMean), sample = js.Any.fromFunction0(sample), setCov = js.Any.fromFunction1(setCov), setMean = js.Any.fromFunction1(setMean))
    __obj.asInstanceOf[Distribution]
  }
  @scala.inline
  implicit class DistributionOps[Self <: Distribution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetCov(value: () => js.Array[js.Array[Double]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getCov")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMean(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getMean")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSample(value: () => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sample")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetCov(value: js.Array[js.Array[Double]] => Distribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setCov")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMean(value: js.Array[Double] => Distribution): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setMean")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

