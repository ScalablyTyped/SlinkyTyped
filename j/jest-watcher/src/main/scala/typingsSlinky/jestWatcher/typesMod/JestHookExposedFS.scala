package typingsSlinky.jestWatcher.typesMod

import typingsSlinky.jestWatcher.AnonConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JestHookExposedFS extends js.Object {
  var projects: js.Array[AnonConfig] = js.native
}

object JestHookExposedFS {
  @scala.inline
  def apply(projects: js.Array[AnonConfig]): JestHookExposedFS = {
    val __obj = js.Dynamic.literal(projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[JestHookExposedFS]
  }
  @scala.inline
  implicit class JestHookExposedFSOps[Self <: JestHookExposedFS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjects(value: js.Array[AnonConfig]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projects")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

