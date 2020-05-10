package typingsSlinky.hlsJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait manifestParsedData extends js.Object {
  var firstLevel: Double = js.native
  var levels: js.Array[Double] = js.native
}

object manifestParsedData {
  @scala.inline
  def apply(firstLevel: Double, levels: js.Array[Double]): manifestParsedData = {
    val __obj = js.Dynamic.literal(firstLevel = firstLevel.asInstanceOf[js.Any], levels = levels.asInstanceOf[js.Any])
    __obj.asInstanceOf[manifestParsedData]
  }
  @scala.inline
  implicit class manifestParsedDataOps[Self <: manifestParsedData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevels(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("levels")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

