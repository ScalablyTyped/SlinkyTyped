package typingsSlinky.instagramPrivateApi.musicRepositoryMoodsResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicRepositoryMoodsResponseRootObject extends js.Object {
  var items: js.Array[MusicRepositoryMoodsResponseItemsItem] = js.native
  var status: String = js.native
}

object MusicRepositoryMoodsResponseRootObject {
  @scala.inline
  def apply(items: js.Array[MusicRepositoryMoodsResponseItemsItem], status: String): MusicRepositoryMoodsResponseRootObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryMoodsResponseRootObject]
  }
  @scala.inline
  implicit class MusicRepositoryMoodsResponseRootObjectOps[Self <: MusicRepositoryMoodsResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[MusicRepositoryMoodsResponseItemsItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

