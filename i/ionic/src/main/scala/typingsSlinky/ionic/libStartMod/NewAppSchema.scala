package typingsSlinky.ionic.libStartMod

import typingsSlinky.ionic.definitionsMod.ProjectType
import typingsSlinky.ionic.ionicBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewAppSchema
  extends BaseAppSchema
     with AppSchema {
  var cloned: `false` = js.native
  var name: String = js.native
  var template: String = js.native
  var `type`: ProjectType = js.native
}

object NewAppSchema {
  @scala.inline
  def apply(
    cloned: `false`,
    name: String,
    projectDir: String,
    projectId: String,
    template: String,
    `type`: ProjectType
  ): NewAppSchema = {
    val __obj = js.Dynamic.literal(cloned = cloned.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], projectDir = projectDir.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewAppSchema]
  }
  @scala.inline
  implicit class NewAppSchemaOps[Self <: NewAppSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloned(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cloned")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ProjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

