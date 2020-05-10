package typingsSlinky.riotGamesApi.RiotGamesAPI.LolStaticData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapDetailsDto extends js.Object {
  var image: ImageDto = js.native
  var mapId: Double = js.native
  var mapName: String = js.native
  var unpurchasableItemList: js.Array[Double] = js.native
}

object MapDetailsDto {
  @scala.inline
  def apply(image: ImageDto, mapId: Double, mapName: String, unpurchasableItemList: js.Array[Double]): MapDetailsDto = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], mapName = mapName.asInstanceOf[js.Any], unpurchasableItemList = unpurchasableItemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDetailsDto]
  }
  @scala.inline
  implicit class MapDetailsDtoOps[Self <: MapDetailsDto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage(value: ImageDto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnpurchasableItemList(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unpurchasableItemList")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

