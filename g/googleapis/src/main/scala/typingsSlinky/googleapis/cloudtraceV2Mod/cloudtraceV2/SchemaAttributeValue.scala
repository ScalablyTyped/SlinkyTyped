package typingsSlinky.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The allowed types for [VALUE] in a `[KEY]:[VALUE]` attribute.
  */
@js.native
trait SchemaAttributeValue extends js.Object {
  /**
    * A Boolean value represented by `true` or `false`.
    */
  var boolValue: js.UndefOr[Boolean] = js.native
  /**
    * A 64-bit signed integer.
    */
  var intValue: js.UndefOr[String] = js.native
  /**
    * A string up to 256 bytes long.
    */
  var stringValue: js.UndefOr[SchemaTruncatableString] = js.native
}

object SchemaAttributeValue {
  @scala.inline
  def apply(): SchemaAttributeValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttributeValue]
  }
  @scala.inline
  implicit class SchemaAttributeValueOps[Self <: SchemaAttributeValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIntValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIntValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intValue")(js.undefined)
        ret
    }
    @scala.inline
    def withStringValue(value: SchemaTruncatableString): Self = {
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

