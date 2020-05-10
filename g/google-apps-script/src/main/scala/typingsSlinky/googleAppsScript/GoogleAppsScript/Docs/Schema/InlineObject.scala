package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineObject extends js.Object {
  var inlineObjectProperties: js.UndefOr[InlineObjectProperties] = js.native
  var objectId: js.UndefOr[String] = js.native
  var suggestedDeletionIds: js.UndefOr[js.Array[String]] = js.native
  var suggestedInlineObjectPropertiesChanges: js.UndefOr[js.Object] = js.native
  var suggestedInsertionId: js.UndefOr[String] = js.native
}

object InlineObject {
  @scala.inline
  def apply(): InlineObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineObject]
  }
  @scala.inline
  implicit class InlineObjectOps[Self <: InlineObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInlineObjectProperties(value: InlineObjectProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjectProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineObjectProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineObjectProperties")(js.undefined)
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
    @scala.inline
    def withSuggestedDeletionIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDeletionIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedDeletionIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDeletionIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedInlineObjectPropertiesChanges(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInlineObjectPropertiesChanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedInlineObjectPropertiesChanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInlineObjectPropertiesChanges")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedInsertionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInsertionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedInsertionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedInsertionId")(js.undefined)
        ret
    }
  }
  
}

