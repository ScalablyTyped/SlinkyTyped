package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsCollectionSelect extends js.Object {
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCollectionSelectImageDisplayOptions] = js.native
  /**
    * min: 2 max: 10
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCollectionSelectCollectionItem]] = js.native
  /**
    * Subtitle of the collection. Optional.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Title of the collection. Optional.
    */
  var title: js.UndefOr[String] = js.native
}

object GoogleActionsV2UiElementsCollectionSelect {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsCollectionSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCollectionSelect]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsCollectionSelectOps[Self <: GoogleActionsV2UiElementsCollectionSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageDisplayOptions(value: GoogleActionsV2UiElementsCollectionSelectImageDisplayOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDisplayOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageDisplayOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageDisplayOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(value: js.Array[GoogleActionsV2UiElementsCollectionSelectCollectionItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

