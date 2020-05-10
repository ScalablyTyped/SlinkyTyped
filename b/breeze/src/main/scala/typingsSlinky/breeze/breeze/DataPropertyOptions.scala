package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataPropertyOptions extends js.Object {
  var complexTypeName: js.UndefOr[String] = js.native
  var concurrencyMode: js.UndefOr[String] = js.native
  var custom: js.UndefOr[js.Any] = js.native
  var dataType: js.UndefOr[DataTypeSymbol] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var displayName: js.UndefOr[String] = js.native
  var isNullable: js.UndefOr[Boolean] = js.native
  var isPartOfKey: js.UndefOr[Boolean] = js.native
  var isScalar: js.UndefOr[Boolean] = js.native
  var isUnmapped: js.UndefOr[Boolean] = js.native
  var maxLength: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var nameOnServer: js.UndefOr[String] = js.native
  var validators: js.UndefOr[js.Array[Validator]] = js.native
}

object DataPropertyOptions {
  @scala.inline
  def apply(): DataPropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataPropertyOptions]
  }
  @scala.inline
  implicit class DataPropertyOptionsOps[Self <: DataPropertyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplexTypeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexTypeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplexTypeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complexTypeName")(js.undefined)
        ret
    }
    @scala.inline
    def withConcurrencyMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConcurrencyMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("concurrencyMode")(js.undefined)
        ret
    }
    @scala.inline
    def withCustom(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("custom")(js.undefined)
        ret
    }
    @scala.inline
    def withDataType(value: DataTypeSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
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
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNullable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNullable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNullable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNullable")(js.undefined)
        ret
    }
    @scala.inline
    def withIsPartOfKey(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPartOfKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsPartOfKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPartOfKey")(js.undefined)
        ret
    }
    @scala.inline
    def withIsScalar(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScalar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsScalar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isScalar")(js.undefined)
        ret
    }
    @scala.inline
    def withIsUnmapped(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnmapped")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsUnmapped: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isUnmapped")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
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
    def withNameOnServer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameOnServer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNameOnServer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameOnServer")(js.undefined)
        ret
    }
    @scala.inline
    def withValidators(value: js.Array[Validator]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidators: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validators")(js.undefined)
        ret
    }
  }
  
}

