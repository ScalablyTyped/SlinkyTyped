package typingsSlinky.googleapis.cloudresourcemanagerV1beta1Mod.cloudresourcemanagerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from the GetAncestry method.
  */
@js.native
trait SchemaGetAncestryResponse extends js.Object {
  /**
    * Ancestors are ordered from bottom to top of the resource hierarchy. The
    * first ancestor is the project itself, followed by the project&#39;s
    * parent, etc.
    */
  var ancestor: js.UndefOr[js.Array[SchemaAncestor]] = js.native
}

object SchemaGetAncestryResponse {
  @scala.inline
  def apply(): SchemaGetAncestryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetAncestryResponse]
  }
  @scala.inline
  implicit class SchemaGetAncestryResponseOps[Self <: SchemaGetAncestryResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAncestor(value: js.Array[SchemaAncestor]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAncestor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ancestor")(js.undefined)
        ret
    }
  }
  
}

