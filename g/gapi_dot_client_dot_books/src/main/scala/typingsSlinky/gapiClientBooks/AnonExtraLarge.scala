package typingsSlinky.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonExtraLarge extends js.Object {
  /** Image link for extra large size (width of ~1280 pixels). (In LITE projection) */
  var extraLarge: js.UndefOr[String] = js.native
  /** Image link for large size (width of ~800 pixels). (In LITE projection) */
  var large: js.UndefOr[String] = js.native
  /** Image link for medium size (width of ~575 pixels). (In LITE projection) */
  var medium: js.UndefOr[String] = js.native
  /** Image link for small size (width of ~300 pixels). (In LITE projection) */
  var small: js.UndefOr[String] = js.native
  /** Image link for small thumbnail size (width of ~80 pixels). (In LITE projection) */
  var smallThumbnail: js.UndefOr[String] = js.native
  /** Image link for thumbnail size (width of ~128 pixels). (In LITE projection) */
  var thumbnail: js.UndefOr[String] = js.native
}

object AnonExtraLarge {
  @scala.inline
  def apply(): AnonExtraLarge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonExtraLarge]
  }
  @scala.inline
  implicit class AnonExtraLargeOps[Self <: AnonExtraLarge] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtraLarge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraLarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtraLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extraLarge")(js.undefined)
        ret
    }
    @scala.inline
    def withLarge(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLarge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("large")(js.undefined)
        ret
    }
    @scala.inline
    def withMedium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("medium")(js.undefined)
        ret
    }
    @scala.inline
    def withSmall(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("small")(js.undefined)
        ret
    }
    @scala.inline
    def withSmallThumbnail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallThumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmallThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smallThumbnail")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbnail(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbnail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbnail")(js.undefined)
        ret
    }
  }
  
}

