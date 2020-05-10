package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextEntry extends js.Object {
  /**
    * The full name of a condition context key, including the service prefix. For example, aws:SourceIp or s3:VersionId.
    */
  var ContextKeyName: js.UndefOr[ContextKeyNameType] = js.native
  /**
    * The data type of the value (or values) specified in the ContextKeyValues parameter.
    */
  var ContextKeyType: js.UndefOr[ContextKeyTypeEnum] = js.native
  /**
    * The value (or values, if the condition context key supports multiple values) to provide to the simulation when the key is referenced by a Condition element in an input policy.
    */
  var ContextKeyValues: js.UndefOr[ContextKeyValueListType] = js.native
}

object ContextEntry {
  @scala.inline
  def apply(): ContextEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextEntry]
  }
  @scala.inline
  implicit class ContextEntryOps[Self <: ContextEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContextKeyName(value: ContextKeyNameType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextKeyName")(js.undefined)
        ret
    }
    @scala.inline
    def withContextKeyType(value: ContextKeyTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextKeyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextKeyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextKeyType")(js.undefined)
        ret
    }
    @scala.inline
    def withContextKeyValues(value: ContextKeyValueListType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextKeyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContextKeyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ContextKeyValues")(js.undefined)
        ret
    }
  }
  
}

