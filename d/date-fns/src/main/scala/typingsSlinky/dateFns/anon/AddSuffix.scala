package typingsSlinky.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddSuffix extends js.Object {
  var addSuffix: js.UndefOr[Boolean] = js.native
  var includeSeconds: js.UndefOr[Boolean] = js.native
  var locale: js.UndefOr[typingsSlinky.dateFns.mod.Locale] = js.native
}

object AddSuffix {
  @scala.inline
  def apply(): AddSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddSuffix]
  }
  @scala.inline
  implicit class AddSuffixOps[Self <: AddSuffix] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSuffix(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: typingsSlinky.dateFns.mod.Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
  }
  
}

