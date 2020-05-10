package typingsSlinky.ionic.libProjectMod

import typingsSlinky.ionic.definitionsMod.ProjectType
import typingsSlinky.ionicCliFramework.configMod.BaseConfigOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectConfigOptions extends BaseConfigOptions {
  val `type`: js.UndefOr[ProjectType] = js.native
}

object ProjectConfigOptions {
  @scala.inline
  def apply(): ProjectConfigOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectConfigOptions]
  }
  @scala.inline
  implicit class ProjectConfigOptionsOps[Self <: ProjectConfigOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: ProjectType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

