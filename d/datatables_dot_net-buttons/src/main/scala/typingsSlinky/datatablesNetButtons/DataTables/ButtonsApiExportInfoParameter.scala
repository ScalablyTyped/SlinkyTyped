package typingsSlinky.datatablesNetButtons.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonsApiExportInfoParameter extends js.Object {
  var extension: js.UndefOr[String | js.Function0[String]] = js.native
  var filename: js.UndefOr[String | js.Function0[String]] = js.native
  var messageBottom: js.UndefOr[Null | String | js.Function0[String]] = js.native
  var messageTop: js.UndefOr[Null | String | js.Function0[String]] = js.native
  var title: js.UndefOr[Null | String | js.Function0[String]] = js.native
}

object ButtonsApiExportInfoParameter {
  @scala.inline
  def apply(): ButtonsApiExportInfoParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonsApiExportInfoParameter]
  }
  @scala.inline
  implicit class ButtonsApiExportInfoParameterOps[Self <: ButtonsApiExportInfoParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExtensionFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtension(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
        ret
    }
    @scala.inline
    def withFilenameFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFilename(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilename: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filename")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageBottomFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBottom")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessageBottom(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageBottomNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageBottom")(null)
        ret
    }
    @scala.inline
    def withMessageTopFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMessageTop(value: String | js.Function0[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTop")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageTopNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messageTop")(null)
        ret
    }
    @scala.inline
    def withTitleFunction0(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withTitle(value: String | js.Function0[String]): Self = {
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
    @scala.inline
    def withTitleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(null)
        ret
    }
  }
  
}

