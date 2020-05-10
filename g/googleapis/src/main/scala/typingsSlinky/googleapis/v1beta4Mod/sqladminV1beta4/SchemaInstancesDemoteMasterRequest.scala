package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database demote master request.
  */
@js.native
trait SchemaInstancesDemoteMasterRequest extends js.Object {
  /**
    * Contains details about the demoteMaster operation.
    */
  var demoteMasterContext: js.UndefOr[SchemaDemoteMasterContext] = js.native
}

object SchemaInstancesDemoteMasterRequest {
  @scala.inline
  def apply(): SchemaInstancesDemoteMasterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesDemoteMasterRequest]
  }
  @scala.inline
  implicit class SchemaInstancesDemoteMasterRequestOps[Self <: SchemaInstancesDemoteMasterRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDemoteMasterContext(value: SchemaDemoteMasterContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demoteMasterContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDemoteMasterContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("demoteMasterContext")(js.undefined)
        ret
    }
  }
  
}

