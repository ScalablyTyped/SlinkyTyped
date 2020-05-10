package typingsSlinky.extjs.Ext.form.field

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisplay extends IBase {
  /** [Method] Returns the raw value of the field without performing any normalization conversion or validation
  		* @returns String value The raw String value of the field
  		*/
  @JSName("getRawValue")
  var getRawValue_IDisplay: js.UndefOr[js.Function0[String]] = js.native
  /** [Config Option] (Boolean) */
  var htmlEncode: js.UndefOr[Boolean] = js.native
  /** [Method] Returns true if the value of this Field has been changed from its originalValue
  		* @returns Boolean True if this field has been changed from its original value (and is not disabled), false otherwise.
  		*/
  @JSName("isDirty")
  var isDirty_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the processed raw value of the field
  		* @returns Boolean True if the value is valid, else false
  		*/
  @JSName("isValid")
  var isValid_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.native
  /** [Config Option] (Function) */
  var renderer: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.native
  /** [Method] Returns whether or not the field value is currently valid by validating the field s current value and fires the vali
  		* @returns Boolean True if the value is valid, else false
  		*/
  @JSName("validate")
  var validate_IDisplay: js.UndefOr[js.Function0[Boolean]] = js.native
}

object IDisplay {
  @scala.inline
  def apply(): IDisplay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDisplay]
  }
  @scala.inline
  implicit class IDisplayOps[Self <: IDisplay] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetRawValue(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawValue")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getRawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHtmlEncode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEncode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtmlEncode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEncode")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDirty(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsDirty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirty")(js.undefined)
        ret
    }
    @scala.inline
    def withIsValid(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutIsValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isValid")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withValidate(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutValidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validate")(js.undefined)
        ret
    }
  }
  
}

