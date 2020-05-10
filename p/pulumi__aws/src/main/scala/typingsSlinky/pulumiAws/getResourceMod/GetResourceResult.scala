package typingsSlinky.pulumiAws.getResourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourceResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Set to the ID of the parent Resource.
    */
  val parentId: String = js.native
  val path: String = js.native
  /**
    * Set to the path relative to the parent Resource.
    */
  val pathPart: String = js.native
  val restApiId: String = js.native
}

object GetResourceResult {
  @scala.inline
  def apply(id: String, parentId: String, path: String, pathPart: String, restApiId: String): GetResourceResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathPart = pathPart.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceResult]
  }
  @scala.inline
  implicit class GetResourceResultOps[Self <: GetResourceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPathPart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathPart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRestApiId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restApiId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

