package typingsSlinky.gitlab.projectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectSchema extends js.Object {
  var archived: Boolean = js.native
  var http_url_to_repo: String = js.native
  var id: Double = js.native
  var name: String = js.native
  var name_with_namespace: String = js.native
  var namespace: NamespaceInfoSchema = js.native
  var path: String = js.native
  var path_with_namespace: String = js.native
  var ssh_url_to_repo: String = js.native
}

object ProjectSchema {
  @scala.inline
  def apply(
    archived: Boolean,
    http_url_to_repo: String,
    id: Double,
    name: String,
    name_with_namespace: String,
    namespace: NamespaceInfoSchema,
    path: String,
    path_with_namespace: String,
    ssh_url_to_repo: String
  ): ProjectSchema = {
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], http_url_to_repo = http_url_to_repo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_with_namespace = name_with_namespace.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], path_with_namespace = path_with_namespace.asInstanceOf[js.Any], ssh_url_to_repo = ssh_url_to_repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSchema]
  }
  @scala.inline
  implicit class ProjectSchemaOps[Self <: ProjectSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchived(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("archived")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHttp_url_to_repo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("http_url_to_repo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName_with_namespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name_with_namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNamespace(value: NamespaceInfoSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath_with_namespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path_with_namespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSsh_url_to_repo(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ssh_url_to_repo")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

