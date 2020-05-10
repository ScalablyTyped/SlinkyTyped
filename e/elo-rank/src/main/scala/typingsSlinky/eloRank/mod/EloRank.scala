package typingsSlinky.eloRank.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EloRank extends js.Object {
  def getExpected(a: Double, b: Double): Double = js.native
  def getKFactor(): Double = js.native
  def setKFactor(kFactor: Double): Unit = js.native
  def updateRating(expected: Double, actual: Double, current: Double): Double = js.native
}

object EloRank {
  @scala.inline
  def apply(
    getExpected: (Double, Double) => Double,
    getKFactor: () => Double,
    setKFactor: Double => Unit,
    updateRating: (Double, Double, Double) => Double
  ): EloRank = {
    val __obj = js.Dynamic.literal(getExpected = js.Any.fromFunction2(getExpected), getKFactor = js.Any.fromFunction0(getKFactor), setKFactor = js.Any.fromFunction1(setKFactor), updateRating = js.Any.fromFunction3(updateRating))
    __obj.asInstanceOf[EloRank]
  }
  @scala.inline
  implicit class EloRankOps[Self <: EloRank] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetExpected(value: (Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getExpected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGetKFactor(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKFactor")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSetKFactor(value: Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setKFactor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withUpdateRating(value: (Double, Double, Double) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateRating")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

