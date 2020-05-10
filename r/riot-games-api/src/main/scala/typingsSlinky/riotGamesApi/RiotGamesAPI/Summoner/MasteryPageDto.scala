package typingsSlinky.riotGamesApi.RiotGamesAPI.Summoner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasteryPageDto extends js.Object {
  var current: Boolean = js.native
  var id: Double = js.native
  var masteries: js.Array[MasteryDto] = js.native
  var name: String = js.native
}

object MasteryPageDto {
  @scala.inline
  def apply(current: Boolean, id: Double, masteries: js.Array[MasteryDto], name: String): MasteryPageDto = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], masteries = masteries.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryPageDto]
  }
  @scala.inline
  implicit class MasteryPageDtoOps[Self <: MasteryPageDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasteries(value: js.Array[MasteryDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masteries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

