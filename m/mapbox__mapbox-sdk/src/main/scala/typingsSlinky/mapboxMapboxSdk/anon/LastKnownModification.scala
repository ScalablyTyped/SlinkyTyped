package typingsSlinky.mapboxMapboxSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastKnownModification extends js.Object {
  var lastKnownModification: js.UndefOr[String | Double | js.Date] = js.native
  var ownerId: js.UndefOr[String] = js.native
  var style: typingsSlinky.mapboxMapboxSdk.stylesMod.Style = js.native
  var styleId: String = js.native
}

object LastKnownModification {
  @scala.inline
  def apply(style: typingsSlinky.mapboxMapboxSdk.stylesMod.Style, styleId: String): LastKnownModification = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], styleId = styleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastKnownModification]
  }
  @scala.inline
  implicit class LastKnownModificationOps[Self <: LastKnownModification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStyle(value: typingsSlinky.mapboxMapboxSdk.stylesMod.Style): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastKnownModificationDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastKnownModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastKnownModification(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastKnownModification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastKnownModification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastKnownModification")(js.undefined)
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

