package typingsSlinky.googleapis.cloudresourcemanagerV1Mod.cloudresourcemanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Identifying information for a single ancestor of a project.
  */
@js.native
trait SchemaAncestor extends js.Object {
  /**
    * Resource id of the ancestor.
    */
  var resourceId: js.UndefOr[SchemaResourceId] = js.native
}

object SchemaAncestor {
  @scala.inline
  def apply(): SchemaAncestor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAncestor]
  }
  @scala.inline
  implicit class SchemaAncestorOps[Self <: SchemaAncestor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceId(value: SchemaResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceId")(js.undefined)
        ret
    }
  }
  
}

