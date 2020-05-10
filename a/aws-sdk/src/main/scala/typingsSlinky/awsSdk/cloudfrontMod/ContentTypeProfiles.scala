package typingsSlinky.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentTypeProfiles extends js.Object {
  /**
    * Items in a field-level encryption content type-profile mapping. 
    */
  var Items: js.UndefOr[ContentTypeProfileList] = js.native
  /**
    * The number of field-level encryption content type-profile mappings. 
    */
  var Quantity: integer = js.native
}

object ContentTypeProfiles {
  @scala.inline
  def apply(Quantity: integer): ContentTypeProfiles = {
    val __obj = js.Dynamic.literal(Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentTypeProfiles]
  }
  @scala.inline
  implicit class ContentTypeProfilesOps[Self <: ContentTypeProfiles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuantity(value: integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: ContentTypeProfileList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(js.undefined)
        ret
    }
  }
  
}

