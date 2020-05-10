package typingsSlinky.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link extends js.Object {
  /**
    * If set, indicates this is a link to the specific page in this
    * presentation with this ID. A page with this ID may not exist.
    */
  var pageObjectId: js.UndefOr[String] = js.native
  /**
    * If set, indicates this is a link to a slide in this presentation,
    * addressed by its position.
    */
  var relativeLink: js.UndefOr[String] = js.native
  /**
    * If set, indicates this is a link to the slide at this zero-based index
    * in the presentation. There may not be a slide at this index.
    */
  var slideIndex: js.UndefOr[Double] = js.native
  /** If set, indicates this is a link to the external web page at this URL. */
  var url: js.UndefOr[String] = js.native
}

object Link {
  @scala.inline
  def apply(): Link = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Link]
  }
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageObjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeLink")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

