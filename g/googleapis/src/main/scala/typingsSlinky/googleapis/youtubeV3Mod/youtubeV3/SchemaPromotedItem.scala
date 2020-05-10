package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes a single promoted item.
  */
@js.native
trait SchemaPromotedItem extends js.Object {
  /**
    * A custom message to display for this promotion. This field is currently
    * ignored unless the promoted item is a website.
    */
  var customMessage: js.UndefOr[String] = js.native
  /**
    * Identifies the promoted item.
    */
  var id: js.UndefOr[SchemaPromotedItemId] = js.native
  /**
    * If true, the content owner&#39;s name will be used when displaying the
    * promotion. This field can only be set when the update is made on behalf
    * of the content owner.
    */
  var promotedByContentOwner: js.UndefOr[Boolean] = js.native
  /**
    * The temporal position within the video where the promoted item will be
    * displayed. If present, it overrides the default timing.
    */
  var timing: js.UndefOr[SchemaInvideoTiming] = js.native
}

object SchemaPromotedItem {
  @scala.inline
  def apply(): SchemaPromotedItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPromotedItem]
  }
  @scala.inline
  implicit class SchemaPromotedItemOps[Self <: SchemaPromotedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: SchemaPromotedItemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotedByContentOwner(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedByContentOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotedByContentOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotedByContentOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withTiming(value: SchemaInvideoTiming): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTiming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timing")(js.undefined)
        ret
    }
  }
  
}

