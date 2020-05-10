package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List Containers Response.
  */
@js.native
trait SchemaListContainersResponse extends js.Object {
  /**
    * All Containers of a GTM Account.
    */
  var containers: js.UndefOr[js.Array[SchemaContainer]] = js.native
}

object SchemaListContainersResponse {
  @scala.inline
  def apply(): SchemaListContainersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListContainersResponse]
  }
  @scala.inline
  implicit class SchemaListContainersResponseOps[Self <: SchemaListContainersResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContainers(value: js.Array[SchemaContainer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containers")(js.undefined)
        ret
    }
  }
  
}

