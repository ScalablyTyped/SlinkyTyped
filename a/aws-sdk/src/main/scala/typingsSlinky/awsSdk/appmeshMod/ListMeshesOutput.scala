package typingsSlinky.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMeshesOutput extends js.Object {
  /**
    * The list of existing service meshes.
    */
  var meshes: MeshList = js.native
  /**
    * The nextToken value to include in a future ListMeshes request.
    When the results of a ListMeshes request exceed limit, you can
    use this value to retrieve the next page of results. This value is null when
    there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListMeshesOutput {
  @scala.inline
  def apply(meshes: MeshList): ListMeshesOutput = {
    val __obj = js.Dynamic.literal(meshes = meshes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMeshesOutput]
  }
  @scala.inline
  implicit class ListMeshesOutputOps[Self <: ListMeshesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMeshes(value: MeshList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meshes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
  }
  
}

