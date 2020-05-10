package typingsSlinky.koaJoiRouterDocs.mod.koaJoiRouterDocs

import typingsSlinky.koaJoiRouterDocs.AnonDescription
import typingsSlinky.koaJoiRouterDocs.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpecConfig extends js.Object {
  var basePath: String = js.native
  var info: AnonDescription = js.native
  var tags: js.Array[AnonName] = js.native
}

object SpecConfig {
  @scala.inline
  def apply(basePath: String, info: AnonDescription, tags: js.Array[AnonName]): SpecConfig = {
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
    def withInfo(value: AnonDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("info")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: js.Array[AnonName]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

