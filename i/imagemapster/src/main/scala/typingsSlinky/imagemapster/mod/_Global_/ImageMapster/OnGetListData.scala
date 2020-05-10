package typingsSlinky.imagemapster.mod._Global_.ImageMapster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGetListData extends js.Object {
  /**
    * array of areas that make up this group
    */
  var area: js.Array[_] = js.native
  /**
    * primary mapKey for this area or area group
    */
  var key: String = js.native
  var options: AreaRenderingOptions = js.native
  /**
    * mapValue for this area or group
    */
  var value: String = js.native
}

object OnGetListData {
  @scala.inline
  def apply(area: js.Array[_], key: String, options: AreaRenderingOptions, value: String): OnGetListData = {
    val __obj = js.Dynamic.literal(area = area.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGetListData]
  }
  @scala.inline
  implicit class OnGetListDataOps[Self <: OnGetListData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArea(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("area")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: AreaRenderingOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

