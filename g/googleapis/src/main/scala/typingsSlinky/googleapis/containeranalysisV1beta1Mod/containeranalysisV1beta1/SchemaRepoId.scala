package typingsSlinky.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A unique identifier for a Cloud Repo.
  */
@js.native
trait SchemaRepoId extends js.Object {
  /**
    * A combination of a project ID and a repo name.
    */
  var projectRepoId: js.UndefOr[SchemaProjectRepoId] = js.native
  /**
    * A server-assigned, globally unique identifier.
    */
  var uid: js.UndefOr[String] = js.native
}

object SchemaRepoId {
  @scala.inline
  def apply(): SchemaRepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRepoId]
  }
  @scala.inline
  implicit class SchemaRepoIdOps[Self <: SchemaRepoId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectRepoId(value: SchemaProjectRepoId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectRepoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectRepoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectRepoId")(js.undefined)
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(js.undefined)
        ret
    }
  }
  
}

