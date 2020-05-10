package typingsSlinky.reactIntl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Opts[IntlPropName /* <: String */, ForwardRef /* <: Boolean */] extends js.Object {
  var enforceContext: js.UndefOr[Boolean] = js.native
  var forwardRef: js.UndefOr[ForwardRef] = js.native
  var intlPropName: js.UndefOr[IntlPropName] = js.native
}

object Opts {
  @scala.inline
  def apply[IntlPropName, ForwardRef](): Opts[IntlPropName, ForwardRef] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Opts[IntlPropName, ForwardRef]]
  }
  @scala.inline
  implicit class OptsOps[Self[intlpropname, forwardref] <: Opts[intlpropname, forwardref], IntlPropName, ForwardRef] (val x: Self[IntlPropName, ForwardRef]) extends AnyVal {
    @scala.inline
    def duplicate: Self[IntlPropName, ForwardRef] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[IntlPropName, ForwardRef]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[IntlPropName, ForwardRef]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[IntlPropName, ForwardRef]) with Other]
    @scala.inline
    def withEnforceContext(value: Boolean): Self[IntlPropName, ForwardRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnforceContext: Self[IntlPropName, ForwardRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enforceContext")(js.undefined)
        ret
    }
    @scala.inline
    def withForwardRef(value: ForwardRef): Self[IntlPropName, ForwardRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForwardRef: Self[IntlPropName, ForwardRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forwardRef")(js.undefined)
        ret
    }
    @scala.inline
    def withIntlPropName(value: IntlPropName): Self[IntlPropName, ForwardRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intlPropName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntlPropName: Self[IntlPropName, ForwardRef] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intlPropName")(js.undefined)
        ret
    }
  }
  
}

