package typingsSlinky.jsqrcode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinderPattern extends js.Object {
  val Count: Double = js.native
  val EstimatedModuleSize: Double = js.native
  val X: Double = js.native
  val Y: Double = js.native
  var count: Double = js.native
  var estimatedModuleSize: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def aboutEquals(moduleSize: Double, i: Double, j: Double): Boolean = js.native
  def incrementCount(): Unit = js.native
}

object FinderPattern {
  @scala.inline
  def apply(
    Count: Double,
    EstimatedModuleSize: Double,
    X: Double,
    Y: Double,
    aboutEquals: (Double, Double, Double) => Boolean,
    count: Double,
    estimatedModuleSize: Double,
    incrementCount: () => Unit,
    x: Double,
    y: Double
  ): FinderPattern = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], EstimatedModuleSize = EstimatedModuleSize.asInstanceOf[js.Any], X = X.asInstanceOf[js.Any], Y = Y.asInstanceOf[js.Any], aboutEquals = js.Any.fromFunction3(aboutEquals), count = count.asInstanceOf[js.Any], estimatedModuleSize = estimatedModuleSize.asInstanceOf[js.Any], incrementCount = js.Any.fromFunction0(incrementCount), x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinderPattern]
  }
  @scala.inline
  implicit class FinderPatternOps[Self <: FinderPattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEstimatedModuleSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedModuleSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("X")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAboutEquals(value: (Double, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("aboutEquals")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withIncrementCount(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("incrementCount")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

