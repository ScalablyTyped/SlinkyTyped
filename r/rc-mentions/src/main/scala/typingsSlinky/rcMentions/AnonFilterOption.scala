package typingsSlinky.rcMentions

import typingsSlinky.rcMentions.mentionsMod.MentionsProps
import typingsSlinky.rcMentions.optionMod.OptionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFilterOption extends js.Object {
  var filterOption: js.Function2[/* input */ String, /* hasValue */ OptionProps, Boolean] = js.native
  var notFoundContent: String = js.native
  var prefix: String = js.native
  var prefixCls: String = js.native
  var rows: Double = js.native
  var split: String = js.native
  var validateSearch: js.Function2[/* text */ String, /* props */ MentionsProps, Boolean] = js.native
}

object AnonFilterOption {
  @scala.inline
  def apply(
    filterOption: (/* input */ String, /* hasValue */ OptionProps) => Boolean,
    notFoundContent: String,
    prefix: String,
    prefixCls: String,
    rows: Double,
    split: String,
    validateSearch: (/* text */ String, /* props */ MentionsProps) => Boolean
  ): AnonFilterOption = {
    val __obj = js.Dynamic.literal(filterOption = js.Any.fromFunction2(filterOption), notFoundContent = notFoundContent.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any], validateSearch = js.Any.fromFunction2(validateSearch))
    __obj.asInstanceOf[AnonFilterOption]
  }
  @scala.inline
  implicit class AnonFilterOptionOps[Self <: AnonFilterOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFilterOption(value: (/* input */ String, /* hasValue */ OptionProps) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOption")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotFoundContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notFoundContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplit(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("split")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValidateSearch(value: (/* text */ String, /* props */ MentionsProps) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateSearch")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

