package typingsSlinky.googleapis.chatV1Mod.chatV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCardHeader extends js.Object {
  /**
    * The image&#39;s type (e.g. square border or circular border).
    */
  var imageStyle: js.UndefOr[String] = js.native
  /**
    * The URL of the image in the card header.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * The subtitle of the card header.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * The title must be specified. The header has a fixed height: if both a
    * title and subtitle is specified, each will take up 1 line. If only the
    * title is specified, it will take up both lines.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaCardHeader {
  @scala.inline
  def apply(): SchemaCardHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCardHeader]
  }
  @scala.inline
  implicit class SchemaCardHeaderOps[Self <: SchemaCardHeader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImageStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
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

