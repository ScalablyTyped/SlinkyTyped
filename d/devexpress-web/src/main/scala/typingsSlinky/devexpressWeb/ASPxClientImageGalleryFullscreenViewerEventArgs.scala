package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientImageGallery.FullscreenViewerActiveItemIndexChanged event.
  */
@js.native
trait ASPxClientImageGalleryFullscreenViewerEventArgs extends ASPxClientEventArgs {
  /**
    * Gets the index of the item related to the event.
    */
  var index: Double = js.native
  /**
    * Gets the unique identifier name of the item related to the event.
    */
  var name: String = js.native
}

object ASPxClientImageGalleryFullscreenViewerEventArgs {
  @scala.inline
  def apply(index: Double, name: String): ASPxClientImageGalleryFullscreenViewerEventArgs = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientImageGalleryFullscreenViewerEventArgs]
  }
  @scala.inline
  implicit class ASPxClientImageGalleryFullscreenViewerEventArgsOps[Self <: ASPxClientImageGalleryFullscreenViewerEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

