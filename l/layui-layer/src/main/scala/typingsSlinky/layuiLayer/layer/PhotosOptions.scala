package typingsSlinky.layuiLayer.layer

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.jquery.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhotosOptions extends Options {
  var photos: PhotosData | Selector = js.native
  /**
    * 切换图片时触发
    * @param pic
    * @param layero
    */
  var tab: js.UndefOr[js.Function2[/* pic */ PhotosDataItem, /* layero */ JQuery[HTMLElement], Unit]] = js.native
}

object PhotosOptions {
  @scala.inline
  def apply(photos: PhotosData | Selector): PhotosOptions = {
    val __obj = js.Dynamic.literal(photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhotosOptions]
  }
  @scala.inline
  implicit class PhotosOptionsOps[Self <: PhotosOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPhotos(value: PhotosData | Selector): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("photos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTab(value: (/* pic */ PhotosDataItem, /* layero */ JQuery[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTab: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tab")(js.undefined)
        ret
    }
  }
  
}

