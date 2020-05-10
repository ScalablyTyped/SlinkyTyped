package typingsSlinky.jxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigOptions extends js.Object {
  var attrKey: js.UndefOr[String] = js.native
  var attrPrefix: js.UndefOr[String] = js.native
  var autoDate: js.UndefOr[Boolean] = js.native
  var ignorePrefixedNodes: js.UndefOr[Boolean] = js.native
  var lowerCaseTags: js.UndefOr[Boolean] = js.native
  var parseValues: js.UndefOr[Boolean] = js.native
  var trueIsEmpty: js.UndefOr[Boolean] = js.native
  var valueKey: js.UndefOr[String] = js.native
}

object ConfigOptions {
  @scala.inline
  def apply(): ConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigOptions]
  }
  @scala.inline
  implicit class ConfigOptionsOps[Self <: ConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttrKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAttrPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttrPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attrPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnorePrefixedNodes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePrefixedNodes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnorePrefixedNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignorePrefixedNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withLowerCaseTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLowerCaseTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowerCaseTags")(js.undefined)
        ret
    }
    @scala.inline
    def withParseValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseValues")(js.undefined)
        ret
    }
    @scala.inline
    def withTrueIsEmpty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueIsEmpty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueIsEmpty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueIsEmpty")(js.undefined)
        ret
    }
    @scala.inline
    def withValueKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueKey")(js.undefined)
        ret
    }
  }
  
}

