package typingsSlinky.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasteHTMLOptions extends js.Object {
  var cleanAttrs: js.UndefOr[js.Array[String]] = js.native
  var cleanTags: js.UndefOr[js.Array[String]] = js.native
  var unwrapTags: js.UndefOr[js.Array[String]] = js.native
}

object PasteHTMLOptions {
  @scala.inline
  def apply(): PasteHTMLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteHTMLOptions]
  }
  @scala.inline
  implicit class PasteHTMLOptionsOps[Self <: PasteHTMLOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCleanAttrs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanAttrs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanAttrs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanAttrs")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanTags")(js.undefined)
        ret
    }
    @scala.inline
    def withUnwrapTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrapTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnwrapTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unwrapTags")(js.undefined)
        ret
    }
  }
  
}

