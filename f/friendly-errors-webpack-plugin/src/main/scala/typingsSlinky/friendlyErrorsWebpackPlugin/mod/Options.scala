package typingsSlinky.friendlyErrorsWebpackPlugin.mod

import typingsSlinky.friendlyErrorsWebpackPlugin.anon.Messages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var additionalFormatters: js.UndefOr[
    js.Array[
      js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
    ]
  ] = js.native
  var additionalTransformers: js.UndefOr[js.Array[js.Function1[/* error */ _, _]]] = js.native
  var clearConsole: js.UndefOr[Boolean] = js.native
  var compilationSuccessInfo: js.UndefOr[Messages] = js.native
  var onErrors: js.UndefOr[js.Function2[/* severity */ Severity, /* errors */ String, Unit]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdditionalFormatters(
      value: js.Array[
          js.Function2[/* errors */ js.Array[WebpackError], /* type */ Severity, js.Array[String]]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalFormatters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalFormatters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalFormatters")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalTransformers(value: js.Array[js.Function1[/* error */ _, _]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalTransformers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalTransformers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalTransformers")(js.undefined)
        ret
    }
    @scala.inline
    def withClearConsole(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearConsole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearConsole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearConsole")(js.undefined)
        ret
    }
    @scala.inline
    def withCompilationSuccessInfo(value: Messages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilationSuccessInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompilationSuccessInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compilationSuccessInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withOnErrors(value: (/* severity */ Severity, /* errors */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrors")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onErrors")(js.undefined)
        ret
    }
  }
  
}

