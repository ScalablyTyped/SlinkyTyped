package typingsSlinky.basiclightbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicLightBoxOptions extends js.Object {
  /*
    * One or more space separated classes to be added to the basicLightbox element.
    */
  var className: js.UndefOr[String] = js.native
  /*
    * Prevents the lightbox from closing when clicking its background.
    */
  var closable: js.UndefOr[Boolean] = js.native
  /*
    * Function that gets executed before the lightbox closes.
    * Returning false will prevent the lightbox from closing.
    */
  var onClose: js.UndefOr[js.Function1[/* instance */ BasicLightBox, Boolean]] = js.native
  /*
    * Function that gets executed before the lightbox will be shown.
    * Returning false will prevent the lightbox from showing.
    */
  var onShow: js.UndefOr[js.Function1[/* instance */ BasicLightBox, Boolean]] = js.native
}

object BasicLightBoxOptions {
  @scala.inline
  def apply(): BasicLightBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicLightBoxOptions]
  }
  @scala.inline
  implicit class BasicLightBoxOptionsOps[Self <: BasicLightBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClosable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClosable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closable")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: /* instance */ BasicLightBox => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShow(value: /* instance */ BasicLightBox => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShow")(js.undefined)
        ret
    }
  }
  
}

