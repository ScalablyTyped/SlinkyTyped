package typingsSlinky.emojiMart.dataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkinVariation extends js.Object {
  var added_in: String = js.native
  var has_img_apple: Boolean = js.native
  var has_img_emojione: Boolean = js.native
  var has_img_facebook: Boolean = js.native
  var has_img_google: Boolean = js.native
  var has_img_messenger: Boolean = js.native
  var has_img_twitter: Boolean = js.native
  var image: String = js.native
  var non_qualified: Null | String = js.native
  var obsoleted_by: js.UndefOr[String] = js.native
  var obsoletes: js.UndefOr[String] = js.native
  var sheet_x: Double = js.native
  var sheet_y: Double = js.native
  var unified: String = js.native
}

object SkinVariation {
  @scala.inline
  def apply(
    added_in: String,
    has_img_apple: Boolean,
    has_img_emojione: Boolean,
    has_img_facebook: Boolean,
    has_img_google: Boolean,
    has_img_messenger: Boolean,
    has_img_twitter: Boolean,
    image: String,
    sheet_x: Double,
    sheet_y: Double,
    unified: String
  ): SkinVariation = {
    val __obj = js.Dynamic.literal(added_in = added_in.asInstanceOf[js.Any], has_img_apple = has_img_apple.asInstanceOf[js.Any], has_img_emojione = has_img_emojione.asInstanceOf[js.Any], has_img_facebook = has_img_facebook.asInstanceOf[js.Any], has_img_google = has_img_google.asInstanceOf[js.Any], has_img_messenger = has_img_messenger.asInstanceOf[js.Any], has_img_twitter = has_img_twitter.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], sheet_x = sheet_x.asInstanceOf[js.Any], sheet_y = sheet_y.asInstanceOf[js.Any], unified = unified.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkinVariation]
  }
  @scala.inline
  implicit class SkinVariationOps[Self <: SkinVariation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdded_in(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("added_in")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_img_apple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_apple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_img_emojione(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_emojione")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_img_facebook(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_facebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_img_google(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_img_messenger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_messenger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHas_img_twitter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("has_img_twitter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet_x(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet_x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSheet_y(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sheet_y")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUnified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNon_qualified(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("non_qualified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNon_qualifiedNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("non_qualified")(null)
        ret
    }
    @scala.inline
    def withObsoleted_by(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obsoleted_by")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObsoleted_by: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obsoleted_by")(js.undefined)
        ret
    }
    @scala.inline
    def withObsoletes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obsoletes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObsoletes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("obsoletes")(js.undefined)
        ret
    }
  }
  
}

