package typingsSlinky.koaJoiRouterDocs.mod.koaJoiRouterDocs

import typingsSlinky.koaJoiRouterDocs.anon.Description
import typingsSlinky.koaJoiRouterDocs.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecConfig extends js.Object {
  var basePath: String = js.native
  var info: Description = js.native
  var tags: js.Array[Name] = js.native
}

object SpecConfig {
  @scala.inline
  def apply(basePath: String, info: Description, tags: js.Array[Name]): SpecConfig = {
    val __obj = js.Dynamic.literal(basePath = basePath.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecConfig]
  }
  @scala.inline
  implicit class SpecConfigOps[Self <: SpecConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBasePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("basePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInfo(value: Description): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[Name]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

