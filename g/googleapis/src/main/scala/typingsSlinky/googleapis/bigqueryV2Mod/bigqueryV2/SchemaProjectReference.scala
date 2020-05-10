package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProjectReference extends js.Object {
  /**
    * [Required] ID of the project. Can be either the numeric ID or the
    * assigned ID of the project.
    */
  var projectId: js.UndefOr[String] = js.native
}

object SchemaProjectReference {
  @scala.inline
  def apply(): SchemaProjectReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProjectReference]
  }
  @scala.inline
  implicit class SchemaProjectReferenceOps[Self <: SchemaProjectReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(js.undefined)
        ret
    }
  }
  
}

