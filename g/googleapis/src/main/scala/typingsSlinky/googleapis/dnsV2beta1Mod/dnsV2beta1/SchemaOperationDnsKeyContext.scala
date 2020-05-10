package typingsSlinky.googleapis.dnsV2beta1Mod.dnsV2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOperationDnsKeyContext extends js.Object {
  var newValue: js.UndefOr[SchemaDnsKey] = js.native
  var oldValue: js.UndefOr[SchemaDnsKey] = js.native
}

object SchemaOperationDnsKeyContext {
  @scala.inline
  def apply(): SchemaOperationDnsKeyContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationDnsKeyContext]
  }
  @scala.inline
  implicit class SchemaOperationDnsKeyContextOps[Self <: SchemaOperationDnsKeyContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewValue(value: SchemaDnsKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newValue")(js.undefined)
        ret
    }
    @scala.inline
    def withOldValue(value: SchemaDnsKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldValue")(js.undefined)
        ret
    }
  }
  
}

