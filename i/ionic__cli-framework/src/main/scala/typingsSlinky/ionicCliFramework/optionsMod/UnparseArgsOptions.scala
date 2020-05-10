package typingsSlinky.ionicCliFramework.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnparseArgsOptions extends js.Object {
  var allowCamelCase: js.UndefOr[Boolean] = js.native
  var ignoreFalse: js.UndefOr[Boolean] = js.native
  var useDoubleQuotes: js.UndefOr[Boolean] = js.native
  var useEquals: js.UndefOr[Boolean] = js.native
}

object UnparseArgsOptions {
  @scala.inline
  def apply(): UnparseArgsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnparseArgsOptions]
  }
  @scala.inline
  implicit class UnparseArgsOptionsOps[Self <: UnparseArgsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCamelCase(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCamelCase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCamelCase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCamelCase")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreFalse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFalse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreFalse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreFalse")(js.undefined)
        ret
    }
    @scala.inline
    def withUseDoubleQuotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDoubleQuotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseDoubleQuotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useDoubleQuotes")(js.undefined)
        ret
    }
    @scala.inline
    def withUseEquals(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEquals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseEquals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useEquals")(js.undefined)
        ret
    }
  }
  
}

