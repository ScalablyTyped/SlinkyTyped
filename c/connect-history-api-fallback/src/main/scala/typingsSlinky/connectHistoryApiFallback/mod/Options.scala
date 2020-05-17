package typingsSlinky.connectHistoryApiFallback.mod

import typingsSlinky.connectHistoryApiFallback.anon.FnCall
import typingsSlinky.connectHistoryApiFallback.connectHistoryApiFallbackBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var disableDotRule: js.UndefOr[`true`] = js.native
  var htmlAcceptHeaders: js.UndefOr[js.Array[String]] = js.native
  var index: js.UndefOr[String] = js.native
  var logger: js.UndefOr[FnCall] = js.native
  var rewrites: js.UndefOr[js.Array[Rewrite]] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
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
    def withDisableDotRule(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDotRule")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableDotRule: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableDotRule")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlAcceptHeaders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAcceptHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlAcceptHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlAcceptHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withLogger(value: FnCall): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logger")(js.undefined)
        ret
    }
    @scala.inline
    def withRewrites(value: js.Array[Rewrite]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrites")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRewrites: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewrites")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
  }
  
}

