package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2.Intent.Message.CarouselSelect.IItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a CarouselSelect. */
@js.native
trait ICarouselSelect extends js.Object {
  /** CarouselSelect items */
  var items: js.UndefOr[js.Array[IItem] | Null] = js.native
}

object ICarouselSelect {
  @scala.inline
  def apply(): ICarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICarouselSelect]
  }
  @scala.inline
  implicit class ICarouselSelectOps[Self <: ICarouselSelect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItems(value: js.Array[IItem]): Self = {
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
    def withItemsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(null)
        ret
    }
  }
  
}

