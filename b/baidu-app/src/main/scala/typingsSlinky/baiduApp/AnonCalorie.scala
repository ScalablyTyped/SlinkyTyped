package typingsSlinky.baiduApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCalorie extends js.Object {
   // 菜名，示例：鱼香肉丝。
  var calorie: Double = js.native
  // 菜品识别结果数组
  var name: String = js.native
   // 卡路里，每100g的卡路里含量。
  var probability: Double = js.native
}

object AnonCalorie {
  @scala.inline
  def apply(calorie: Double, name: String, probability: Double): AnonCalorie = {
    val __obj = js.Dynamic.literal(calorie = calorie.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCalorie]
  }
  @scala.inline
  implicit class AnonCalorieOps[Self <: AnonCalorie] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalorie(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calorie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProbability(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probability")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

