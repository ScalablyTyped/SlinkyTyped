package typingsSlinky.googleapis.customsearchV1Mod.customsearchV1

import typingsSlinky.googleapis.AnonHeightSource
import typingsSlinky.googleapis.AnonHtmlTitle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPromotion extends js.Object {
  var bodyLines: js.UndefOr[js.Array[AnonHtmlTitle]] = js.native
  var displayLink: js.UndefOr[String] = js.native
  var htmlTitle: js.UndefOr[String] = js.native
  var image: js.UndefOr[AnonHeightSource] = js.native
  var link: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object SchemaPromotion {
  @scala.inline
  def apply(): SchemaPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPromotion]
  }
  @scala.inline
  implicit class SchemaPromotionOps[Self <: SchemaPromotion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBodyLines(value: js.Array[AnonHtmlTitle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBodyLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bodyLines")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayLink")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withImage(value: AnonHeightSource): Self = {
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
    def withLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

