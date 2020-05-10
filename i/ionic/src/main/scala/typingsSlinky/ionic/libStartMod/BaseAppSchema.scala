package typingsSlinky.ionic.libStartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAppSchema extends js.Object {
  var appflowId: js.UndefOr[String] = js.native
  var packageId: js.UndefOr[String] = js.native
  var projectDir: String = js.native
  var projectId: String = js.native
}

object BaseAppSchema {
  @scala.inline
  def apply(projectDir: String, projectId: String): BaseAppSchema = {
    val __obj = js.Dynamic.literal(projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseAppSchema]
  }
  @scala.inline
  implicit class BaseAppSchemaOps[Self <: BaseAppSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppflowId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appflowId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppflowId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appflowId")(js.undefined)
        ret
    }
    @scala.inline
    def withPackageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPackageId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("packageId")(js.undefined)
        ret
    }
  }
  
}

