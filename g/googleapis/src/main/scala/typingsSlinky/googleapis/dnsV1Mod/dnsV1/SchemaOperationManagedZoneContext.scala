package typingsSlinky.googleapis.dnsV1Mod.dnsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOperationManagedZoneContext extends js.Object {
  var newValue: js.UndefOr[SchemaManagedZone] = js.native
  var oldValue: js.UndefOr[SchemaManagedZone] = js.native
}

object SchemaOperationManagedZoneContext {
  @scala.inline
  def apply(): SchemaOperationManagedZoneContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationManagedZoneContext]
  }
  @scala.inline
  implicit class SchemaOperationManagedZoneContextOps[Self <: SchemaOperationManagedZoneContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNewValue(value: SchemaManagedZone): Self = {
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
    def withOldValue(value: SchemaManagedZone): Self = {
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

