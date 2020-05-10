package typingsSlinky.mediumEditor.MediumEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PasteOptions extends js.Object {
  var cleanAttrs: js.UndefOr[js.Array[String]] = js.native
  var cleanPastedHTML: js.UndefOr[Boolean] = js.native
  var cleanReplacements: js.UndefOr[js.Array[_]] = js.native
  var cleanTags: js.UndefOr[js.Array[String]] = js.native
  var forcePlainText: js.UndefOr[Boolean] = js.native
  var preCleanReplacements: js.UndefOr[js.Array[_]] = js.native
  var unwrapTags: js.UndefOr[js.Array[String]] = js.native
}

object PasteOptions {
  @scala.inline
  def apply(): PasteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasteOptions]
  }
  @scala.inline
  implicit class PasteOptionsOps[Self <: PasteOptions] (val x: Self) extends AnyVal {
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
    def withCleanPastedHTML(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanPastedHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanPastedHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanPastedHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withCleanReplacements(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanReplacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCleanReplacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cleanReplacements")(js.undefined)
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
    def withForcePlainText(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePlainText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForcePlainText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forcePlainText")(js.undefined)
        ret
    }
    @scala.inline
    def withPreCleanReplacements(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preCleanReplacements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreCleanReplacements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preCleanReplacements")(js.undefined)
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

