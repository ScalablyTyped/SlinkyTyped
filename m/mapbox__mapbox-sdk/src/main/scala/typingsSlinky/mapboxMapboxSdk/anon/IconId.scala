package typingsSlinky.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconId extends js.Object {
  var iconId: String = js.native
  var ownerId: js.UndefOr[String] = js.native
  var styleId: String = js.native
}

object IconId {
  @scala.inline
  def apply(iconId: String, styleId: String): IconId = {
    val __obj = js.Dynamic.literal(iconId = iconId.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconId]
  }
  @scala.inline
  implicit class IconIdOps[Self <: IconId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIconId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(js.undefined)
        ret
    }
  }
  
}

