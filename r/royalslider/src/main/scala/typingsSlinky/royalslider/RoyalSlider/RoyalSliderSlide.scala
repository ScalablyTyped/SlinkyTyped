package typingsSlinky.royalslider.RoyalSlider

import typingsSlinky.royalslider.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoyalSliderSlide extends js.Object {
  /**
    * TODO
    */
  var appendOnLoaded: Boolean = js.native
  /**
    * slide element
    */
  var content: JQuery = js.native
  /**
    * TODO
    */
  var contentAdded: Boolean = js.native
  /**
    * slide element wrapper
    */
  var holder: JQuery = js.native
  /**
    * slide index
    */
  var id: Double = js.native
  /**
    * TODO
    */
  var images: Null = js.native
  /**
    * TODO
    */
  var isAdded: Boolean = js.native
  /**
    * TODO
    */
  var isAppended: Boolean = js.native
  /**
    * TODO
    */
  var isBig: Boolean = js.native
  /**
    * TODO
    */
  var isLoaded: Boolean = js.native
  /**
    * TODO
    */
  var isLoading: Boolean = js.native
  /**
    * TODO
    */
  var isRendered: Boolean = js.native
  /**
    * TODO
    */
  var loadedTriggered: Boolean = js.native
  /**
    * TODO
    */
  var positionSet: Boolean = js.native
  /**
    * TODO
    */
  var sizeReady: Boolean = js.native
  /**
    * TODO
    */
  var thumbnail: String = js.native
}

object RoyalSliderSlide {
  @scala.inline
  def apply(
    appendOnLoaded: Boolean,
    content: JQuery,
    contentAdded: Boolean,
    holder: JQuery,
    id: Double,
    images: Null,
    isAdded: Boolean,
    isAppended: Boolean,
    isBig: Boolean,
    isLoaded: Boolean,
    isLoading: Boolean,
    isRendered: Boolean,
    loadedTriggered: Boolean,
    positionSet: Boolean,
    sizeReady: Boolean,
    thumbnail: String
  ): RoyalSliderSlide = {
    val __obj = js.Dynamic.literal(appendOnLoaded = appendOnLoaded.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentAdded = contentAdded.asInstanceOf[js.Any], holder = holder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], isAdded = isAdded.asInstanceOf[js.Any], isAppended = isAppended.asInstanceOf[js.Any], isBig = isBig.asInstanceOf[js.Any], isLoaded = isLoaded.asInstanceOf[js.Any], isLoading = isLoading.asInstanceOf[js.Any], isRendered = isRendered.asInstanceOf[js.Any], loadedTriggered = loadedTriggered.asInstanceOf[js.Any], positionSet = positionSet.asInstanceOf[js.Any], sizeReady = sizeReady.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoyalSliderSlide]
  }
  @scala.inline
  implicit class RoyalSliderSlideOps[Self <: RoyalSliderSlide] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendOnLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendOnLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentAdded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHolder(value: JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("holder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: Null): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAdded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAdded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAppended(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAppended")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBig(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoaded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoaded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLoading(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLoading")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRendered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadedTriggered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadedTriggered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositionSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positionSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSizeReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sizeReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThumbnail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

