package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the image slider's ImageSliderItem object.
  */
@js.native
trait ASPxClientImageSliderItem extends js.Object {
  /**
    * Gets an image slider to which the current item belongs.
    */
  var imageSlider: ASPxClientImageSlider = js.native
  /**
    * Gets or sets the path to the image displayed within the ASPxClientImageSliderItem.
    */
  var imageUrl: String = js.native
  /**
    * Gets the item's index within an items collection.
    */
  var index: Double = js.native
  /**
    * Gets whether the image slider's item is loaded.
    */
  var loaded: Boolean = js.native
  /**
    * Gets the name that uniquely identifies the image slider item.
    */
  var name: String = js.native
  /**
    * Gets the item's display text.
    */
  var text: String = js.native
}

object ASPxClientImageSliderItem {
  @scala.inline
  def apply(
    imageSlider: ASPxClientImageSlider,
    imageUrl: String,
    index: Double,
    loaded: Boolean,
    name: String,
    text: String
  ): ASPxClientImageSliderItem = {
    val __obj = js.Dynamic.literal(imageSlider = imageSlider.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageSliderItem]
  }
  @scala.inline
  implicit class ASPxClientImageSliderItemOps[Self <: ASPxClientImageSliderItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageSlider(value: ASPxClientImageSlider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageSlider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

