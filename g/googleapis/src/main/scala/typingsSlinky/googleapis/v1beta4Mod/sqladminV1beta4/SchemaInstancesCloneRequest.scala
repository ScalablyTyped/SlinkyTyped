package typingsSlinky.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Database instance clone request.
  */
@js.native
trait SchemaInstancesCloneRequest extends js.Object {
  /**
    * Contains details about the clone operation.
    */
  var cloneContext: js.UndefOr[SchemaCloneContext] = js.native
}

object SchemaInstancesCloneRequest {
  @scala.inline
  def apply(): SchemaInstancesCloneRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesCloneRequest]
  }
  @scala.inline
  implicit class SchemaInstancesCloneRequestOps[Self <: SchemaInstancesCloneRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloneContext(value: SchemaCloneContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloneContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloneContext")(js.undefined)
        ret
    }
  }
  
}

