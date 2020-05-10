package typingsSlinky.officeJs.OneNote.Interfaces

import typingsSlinky.officeJs.OneNote.PageContentType
import typingsSlinky.officeJs.officeJsStrings.Image
import typingsSlinky.officeJs.officeJsStrings.Ink
import typingsSlinky.officeJs.officeJsStrings.Other
import typingsSlinky.officeJs.officeJsStrings.Outline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "pageContent.toJSON()". */
@js.native
trait PageContentData extends js.Object {
  /**
    *
    * Gets the ID of the PageContent object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageData] = js.native
  /**
    *
    * Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var ink: js.UndefOr[FloatingInkData] = js.native
  /**
    *
    * Gets or sets the left (X-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var outline: js.UndefOr[OutlineData] = js.native
  /**
    *
    * Gets or sets the top (Y-axis) position of the PageContent object.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var top: js.UndefOr[Double] = js.native
  /**
    *
    * Gets the type of the PageContent object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[PageContentType | Outline | Image | Ink | Other] = js.native
}

object PageContentData {
  @scala.inline
  def apply(): PageContentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContentData]
  }
  @scala.inline
  implicit class PageContentDataOps[Self <: PageContentData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
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
    def withImage(value: ImageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withInk(value: FloatingInkData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ink")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withOutline(value: OutlineData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outline")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: PageContentType | Outline | Image | Ink | Other): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

