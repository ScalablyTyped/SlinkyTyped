package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MasteryDto extends js.Object {
  var description: js.Array[String] = js.native
  var id: Double = js.native
  var image: ImageDto = js.native
  var masteryTree: String = js.native
  var name: String = js.native
  var prereq: String = js.native
  var ranks: Double = js.native
  var sanitizedDescription: js.Array[String] = js.native
}

object MasteryDto {
  @scala.inline
  def apply(
    description: js.Array[String],
    id: Double,
    image: ImageDto,
    masteryTree: String,
    name: String,
    prereq: String,
    ranks: Double,
    sanitizedDescription: js.Array[String]
  ): MasteryDto = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], masteryTree = masteryTree.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prereq = prereq.asInstanceOf[js.Any], ranks = ranks.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryDto]
  }
  @scala.inline
  implicit class MasteryDtoOps[Self <: MasteryDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: ImageDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMasteryTree(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masteryTree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrereq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prereq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRanks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ranks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSanitizedDescription(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sanitizedDescription")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

