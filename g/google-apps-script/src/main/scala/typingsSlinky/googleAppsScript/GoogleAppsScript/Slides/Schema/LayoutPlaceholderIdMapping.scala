package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutPlaceholderIdMapping extends js.Object {
  var layoutPlaceholder: js.UndefOr[Placeholder] = js.native
  var layoutPlaceholderObjectId: js.UndefOr[String] = js.native
  var objectId: js.UndefOr[String] = js.native
}

object LayoutPlaceholderIdMapping {
  @scala.inline
  def apply(): LayoutPlaceholderIdMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutPlaceholderIdMapping]
  }
  @scala.inline
  implicit class LayoutPlaceholderIdMappingOps[Self <: LayoutPlaceholderIdMapping] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutPlaceholder(value: Placeholder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPlaceholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPlaceholder")(js.undefined)
        ret
    }
    @scala.inline
    def withLayoutPlaceholderObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPlaceholderObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutPlaceholderObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutPlaceholderObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
  }
  
}

