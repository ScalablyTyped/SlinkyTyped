package typingsSlinky.postcssModulesLocalByDefault.mod

import typingsSlinky.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.global
import typingsSlinky.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.local
import typingsSlinky.postcssModulesLocalByDefault.postcssModulesLocalByDefaultStrings.pure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var mode: js.UndefOr[global | local | pure] = js.native
  var rewriteUrl: js.UndefOr[js.Function2[/* global */ Boolean, /* url */ String, String]] = js.native
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
    def withMode(value: global | local | pure): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withRewriteUrl(value: (/* global */ Boolean, /* url */ String) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteUrl")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutRewriteUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rewriteUrl")(js.undefined)
        ret
    }
  }
  
}

