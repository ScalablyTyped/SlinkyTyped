package typingsSlinky.aureliaTemplating.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.aureliaBinding.mod.bindingMode
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.fromView
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.oneTime
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.oneWay
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.toView
import typingsSlinky.aureliaTemplating.aureliaTemplatingStrings.twoWay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBindablePropertyConfig
  extends // For compatibility and future extension
/* key */ StringDictionary[js.Any] {
  var attribute: js.UndefOr[String] = js.native
  /**
    * The name of a view model method to invoke when the property is updated.
    */
  var changeHandler: js.UndefOr[String] = js.native
  /**
    * The default binding mode of the property. If given string, will use to lookup
    */
  var defaultBindingMode: js.UndefOr[bindingMode | oneTime | oneWay | twoWay | fromView | toView] = js.native
  /**
    * A default value for the property.
    */
  var defaultValue: js.UndefOr[js.Any] = js.native
  /**
    * The name of the property.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Designates the property as the default bindable property among all the other bindable properties when used in a custom attribute with multiple bindable properties.
    */
  var primaryProperty: js.UndefOr[Boolean] = js.native
}

object IBindablePropertyConfig {
  @scala.inline
  def apply(): IBindablePropertyConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBindablePropertyConfig]
  }
  @scala.inline
  implicit class IBindablePropertyConfigOps[Self <: IBindablePropertyConfig] (val x: Self) extends AnyVal {
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
    def withChangeHandler(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChangeHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changeHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultBindingMode(value: bindingMode | oneTime | oneWay | twoWay | fromView | toView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBindingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultBindingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultBindingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryProperty(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryProperty")(js.undefined)
        ret
    }
  }
  
}

