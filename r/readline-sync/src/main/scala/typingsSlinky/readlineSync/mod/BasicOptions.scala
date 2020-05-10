package typingsSlinky.readlineSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicOptions extends js.Object {
  var bufferSize: js.UndefOr[Double] = js.native
  var cancel: js.UndefOr[js.Any] = js.native
  var caseSensitive: js.UndefOr[Boolean] = js.native
  var cd: js.UndefOr[Boolean] = js.native
  var charlist: js.UndefOr[String] = js.native
  var confirmMessage: js.UndefOr[js.Any] = js.native
  var create: js.UndefOr[Boolean] = js.native
  var defaultInput: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var exists: js.UndefOr[js.Any] = js.native
  var falseValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.native
  var guide: js.UndefOr[Boolean] = js.native
  var hideEchoBack: js.UndefOr[Boolean] = js.native
  var history: js.UndefOr[Boolean] = js.native
  var isDirectory: js.UndefOr[Boolean] = js.native
  var isFile: js.UndefOr[Boolean] = js.native
  var keepWhitespace: js.UndefOr[Boolean] = js.native
  var limit: js.UndefOr[OptionType | js.Array[OptionType]] = js.native
  var limitMessage: js.UndefOr[String] = js.native
  var mask: js.UndefOr[String] = js.native
  var max: js.UndefOr[js.Any] = js.native
  var min: js.UndefOr[js.Any] = js.native
  var print: js.UndefOr[js.Function2[/* display */ String, /* encoding */ String, Unit]] = js.native
  var prompt: js.UndefOr[js.Any] = js.native
  var trueValue: js.UndefOr[OptionType | js.Array[OptionType]] = js.native
  var unmatchMessage: js.UndefOr[js.Any] = js.native
  var validate: js.UndefOr[js.Function1[/* path */ String, Boolean | String]] = js.native
}

object BasicOptions {
  @scala.inline
  def apply(): BasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicOptions]
  }
  @scala.inline
  implicit class BasicOptionsOps[Self <: BasicOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBufferSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBufferSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bufferSize")(js.undefined)
        ret
    }
    @scala.inline
    def withCancel(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.undefined)
        ret
    }
    @scala.inline
    def withCaseSensitive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaseSensitive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caseSensitive")(js.undefined)
        ret
    }
    @scala.inline
    def withCd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cd")(js.undefined)
        ret
    }
    @scala.inline
    def withCharlist(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charlist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCharlist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("charlist")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultInput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultInput")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withExists(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExists: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exists")(js.undefined)
        ret
    }
    @scala.inline
    def withFalseValueFunction1(value: /* input */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFalseValueRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFalseValue(value: OptionType | js.Array[OptionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalseValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGuide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guide")(js.undefined)
        ret
    }
    @scala.inline
    def withHideEchoBack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEchoBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideEchoBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideEchoBack")(js.undefined)
        ret
    }
    @scala.inline
    def withHistory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHistory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("history")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirectory(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDirectory: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFile(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepWhitespace(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWhitespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepWhitespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepWhitespace")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitFunction1(value: /* input */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLimitRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: OptionType | js.Array[OptionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mask")(js.undefined)
        ret
    }
    @scala.inline
    def withMax(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withPrint(value: (/* display */ String, /* encoding */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPrint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("print")(js.undefined)
        ret
    }
    @scala.inline
    def withPrompt(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prompt")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueValueFunction1(value: /* input */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTrueValueRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrueValue(value: OptionType | js.Array[OptionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueValue")(js.undefined)
        ret
    }
    @scala.inline
    def withUnmatchMessage(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmatchMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnmatchMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmatchMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: /* path */ String => Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

