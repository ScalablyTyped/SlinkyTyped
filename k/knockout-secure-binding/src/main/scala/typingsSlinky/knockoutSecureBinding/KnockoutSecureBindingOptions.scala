package typingsSlinky.knockoutSecureBinding

import typingsSlinky.knockout.KnockoutBindingHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutSecureBindingOptions extends js.Object {
  var attribute: js.UndefOr[String] = js.native
  var bindings: js.UndefOr[KnockoutBindingHandlers] = js.native
  var globals: js.UndefOr[js.Any] = js.native
  var noVirtualElements: js.UndefOr[Boolean] = js.native
}

object KnockoutSecureBindingOptions {
  @scala.inline
  def apply(): KnockoutSecureBindingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnockoutSecureBindingOptions]
  }
  @scala.inline
  implicit class KnockoutSecureBindingOptionsOps[Self <: KnockoutSecureBindingOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttribute(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attribute")(js.undefined)
        ret
    }
    @scala.inline
    def withBindings(value: KnockoutBindingHandlers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBindings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bindings")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobals(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globals")(js.undefined)
        ret
    }
    @scala.inline
    def withNoVirtualElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noVirtualElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoVirtualElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noVirtualElements")(js.undefined)
        ret
    }
  }
  
}

