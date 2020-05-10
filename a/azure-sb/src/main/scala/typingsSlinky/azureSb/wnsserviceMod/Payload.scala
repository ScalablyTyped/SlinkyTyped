package typingsSlinky.azureSb.wnsserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  text1  :string,   text2  :string,   text3  :string,   text4  :string,   image1src  :string,   image1alt  :string,   image2src  :string,   image2alt  :string,   image3src  :string,   image3alt  :string,   image4src  :string,   image4alt  :string,   lang  :string,   type  :string}> */
@js.native
trait Payload extends js.Object {
  var image1alt: js.UndefOr[String] = js.native
  var image1src: js.UndefOr[String] = js.native
  var image2alt: js.UndefOr[String] = js.native
  var image2src: js.UndefOr[String] = js.native
  var image3alt: js.UndefOr[String] = js.native
  var image3src: js.UndefOr[String] = js.native
  var image4alt: js.UndefOr[String] = js.native
  var image4src: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var text1: js.UndefOr[String] = js.native
  var text2: js.UndefOr[String] = js.native
  var text3: js.UndefOr[String] = js.native
  var text4: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Payload {
  @scala.inline
  def apply(): Payload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload]
  }
  @scala.inline
  implicit class PayloadOps[Self <: Payload] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImage1alt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image1alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage1alt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image1alt")(js.undefined)
        ret
    }
    @scala.inline
    def withImage1src(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image1src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage1src: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image1src")(js.undefined)
        ret
    }
    @scala.inline
    def withImage2alt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage2alt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2alt")(js.undefined)
        ret
    }
    @scala.inline
    def withImage2src(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage2src: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image2src")(js.undefined)
        ret
    }
    @scala.inline
    def withImage3alt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image3alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage3alt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image3alt")(js.undefined)
        ret
    }
    @scala.inline
    def withImage3src(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image3src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage3src: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image3src")(js.undefined)
        ret
    }
    @scala.inline
    def withImage4alt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image4alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage4alt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image4alt")(js.undefined)
        ret
    }
    @scala.inline
    def withImage4src(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image4src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage4src: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image4src")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withText1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text1")(js.undefined)
        ret
    }
    @scala.inline
    def withText2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text2")(js.undefined)
        ret
    }
    @scala.inline
    def withText3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text3")(js.undefined)
        ret
    }
    @scala.inline
    def withText4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text4")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
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

