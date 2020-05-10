package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A card is a UI element that can contain UI widgets such as texts, images.
  */
@js.native
trait SchemaCard extends js.Object {
  /**
    * The actions of this card.
    */
  var cardActions: js.UndefOr[js.Array[SchemaCardAction]] = js.native
  /**
    * The header of the card. A header usually contains a title and an image.
    */
  var header: js.UndefOr[SchemaCardHeader] = js.native
  /**
    * Name of the card.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Sections are separated by a line divider.
    */
  var sections: js.UndefOr[js.Array[SchemaSection]] = js.native
}

object SchemaCard {
  @scala.inline
  def apply(): SchemaCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCard]
  }
  @scala.inline
  implicit class SchemaCardOps[Self <: SchemaCard] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCardActions(value: js.Array[SchemaCardAction]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCardActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cardActions")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: SchemaCardHeader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withSections(value: js.Array[SchemaSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(js.undefined)
        ret
    }
  }
  
}

