package typingsSlinky.ionic.anon

import typingsSlinky.ionic.definitionsMod.ProjectType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dir extends js.Object {
  var dir: String = js.native
  var srcDir: String = js.native
  var `type`: ProjectType = js.native
}

object Dir {
  @scala.inline
  def apply(dir: String, srcDir: String, `type`: ProjectType): Dir = {
    val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], srcDir = srcDir.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dir]
  }
  @scala.inline
  implicit class DirOps[Self <: Dir] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcDir")(value.asInstanceOf[js.Any])
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

