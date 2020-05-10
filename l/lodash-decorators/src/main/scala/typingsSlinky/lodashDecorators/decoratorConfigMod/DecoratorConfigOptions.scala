package typingsSlinky.lodashDecorators.decoratorConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecoratorConfigOptions extends js.Object {
  var bound: js.UndefOr[Boolean] = js.native
  var getter: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[Boolean] = js.native
  var optionalParams: js.UndefOr[Boolean] = js.native
  var property: js.UndefOr[Boolean] = js.native
  var setter: js.UndefOr[Boolean] = js.native
}

object DecoratorConfigOptions {
  @scala.inline
  def apply(): DecoratorConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecoratorConfigOptions]
  }
  @scala.inline
  implicit class DecoratorConfigOptionsOps[Self <: DecoratorConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bound")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bound")(js.undefined)
        ret
    }
    @scala.inline
    def withGetter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getter")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalParams")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property")(js.undefined)
        ret
    }
    @scala.inline
    def withSetter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSetter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setter")(js.undefined)
        ret
    }
  }
  
}

