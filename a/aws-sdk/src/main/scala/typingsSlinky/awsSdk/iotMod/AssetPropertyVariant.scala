package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssetPropertyVariant extends js.Object {
  /**
    * Optional. A string that contains the boolean value (true or false) of the value entry. Accepts substitution templates.
    */
  var booleanValue: js.UndefOr[AssetPropertyBooleanValue] = js.native
  /**
    * Optional. A string that contains the double value of the value entry. Accepts substitution templates.
    */
  var doubleValue: js.UndefOr[AssetPropertyDoubleValue] = js.native
  /**
    * Optional. A string that contains the integer value of the value entry. Accepts substitution templates.
    */
  var integerValue: js.UndefOr[AssetPropertyIntegerValue] = js.native
  /**
    * Optional. The string value of the value entry. Accepts substitution templates.
    */
  var stringValue: js.UndefOr[AssetPropertyStringValue] = js.native
}

object AssetPropertyVariant {
  @scala.inline
  def apply(): AssetPropertyVariant = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetPropertyVariant]
  }
  @scala.inline
  implicit class AssetPropertyVariantOps[Self <: AssetPropertyVariant] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBooleanValue(value: AssetPropertyBooleanValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBooleanValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("booleanValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDoubleValue(value: AssetPropertyDoubleValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoubleValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doubleValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIntegerValue(value: AssetPropertyIntegerValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntegerValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("integerValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: AssetPropertyStringValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStringValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stringValue")(js.undefined)
        ret
    }
  }
  
}

