package typingsSlinky.instagramPrivateApi.musicRepositoryGenresResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MusicRepositoryGenresResponseRootObject extends js.Object {
  var items: js.Array[MusicRepositoryGenresResponseItemsItem] = js.native
  var status: String = js.native
}

object MusicRepositoryGenresResponseRootObject {
  @scala.inline
  def apply(items: js.Array[MusicRepositoryGenresResponseItemsItem], status: String): MusicRepositoryGenresResponseRootObject = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MusicRepositoryGenresResponseRootObject]
  }
  @scala.inline
  implicit class MusicRepositoryGenresResponseRootObjectOps[Self <: MusicRepositoryGenresResponseRootObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[MusicRepositoryGenresResponseItemsItem]): Self = {
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

