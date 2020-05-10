package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OptionValueSpec extends js.Object {
  /**
    * A select with a card carousel GUI, use collection_select instead.
    */
  var carouselSelect: js.UndefOr[GoogleActionsV2UiElementsCarouselSelect] = js.native
  /**
    * A select with a card collection GUI
    */
  var collectionSelect: js.UndefOr[GoogleActionsV2UiElementsCollectionSelect] = js.native
  /**
    * A select with a list card GUI
    */
  var listSelect: js.UndefOr[GoogleActionsV2UiElementsListSelect] = js.native
  /**
    * A simple select with no associated GUI
    */
  var simpleSelect: js.UndefOr[GoogleActionsV2SimpleSelect] = js.native
}

object GoogleActionsV2OptionValueSpec {
  @scala.inline
  def apply(): GoogleActionsV2OptionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OptionValueSpec]
  }
  @scala.inline
  implicit class GoogleActionsV2OptionValueSpecOps[Self <: GoogleActionsV2OptionValueSpec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCarouselSelect(value: GoogleActionsV2UiElementsCarouselSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCarouselSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("carouselSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionSelect(value: GoogleActionsV2UiElementsCollectionSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withListSelect(value: GoogleActionsV2UiElementsListSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withSimpleSelect(value: GoogleActionsV2SimpleSelect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSelect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSimpleSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("simpleSelect")(js.undefined)
        ret
    }
  }
  
}

