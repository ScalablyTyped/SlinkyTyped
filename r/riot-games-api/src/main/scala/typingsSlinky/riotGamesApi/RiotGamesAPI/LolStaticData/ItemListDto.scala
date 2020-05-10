package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemListDto extends js.Object {
  var basic: BasicDataDto = js.native
  var data: js.Array[StringDictionary[ItemDto]] = js.native
  var groups: js.Array[GroupDto] = js.native
  var tree: js.Array[ItemTreeDto] = js.native
  var `type`: String = js.native
  var version: String = js.native
}

object ItemListDto {
  @scala.inline
  def apply(
    basic: BasicDataDto,
    data: js.Array[StringDictionary[ItemDto]],
    groups: js.Array[GroupDto],
    tree: js.Array[ItemTreeDto],
    `type`: String,
    version: String
  ): ItemListDto = {
    val __obj = js.Dynamic.literal(basic = basic.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemListDto]
  }
  @scala.inline
  implicit class ItemListDtoOps[Self <: ItemListDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasic(value: BasicDataDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withData(value: js.Array[StringDictionary[ItemDto]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[GroupDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTree(value: js.Array[ItemTreeDto]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

